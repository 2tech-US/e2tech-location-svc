package tech2.microservice.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech2.microservice.exception.NotFoundException;
import tech2.microservice.model.Address;
import tech2.microservice.model.AddressKey;
import tech2.microservice.model.Location;
import tech2.microservice.model.LocationKey;
import tech2.microservice.repository.AddressRepository;
import tech2.microservice.repository.LocationRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class AddressLocationServiceImp implements AddressLocationService {

    private final AddressRepository addressRepository;
    private final LocationRepository locationRepository;

    private Address findAddress(AddressKey addressKey) {
        return addressRepository.findByCityAndDistrictAndWardAndStreetAndHome(
                addressKey.getCity(),
                addressKey.getDistrict(),
                addressKey.getWard(),
                addressKey.getStreet(),
                addressKey.getHome()
        );
    }

    @Override
    public Boolean isExist(AddressKey addressKey) {
        return addressRepository.existsByCityAndDistrictAndWardAndStreetAndHome(
                addressKey.getCity(),
                addressKey.getDistrict(),
                addressKey.getWard(),
                addressKey.getStreet(),
                addressKey.getHome()
        );
    }

    @Override
    public Address getAddress(AddressKey addressKey) {
        Address address = this.findAddress(addressKey);
        if (address == null) {
            throw new NotFoundException("This Address: " + addressKey + " Don't exist");
        }
        return address;
    }

    @Override
    public List<String> getListAddress(String searchAddress,
                                       int page,
                                       int limit) {
        SearchAddress searchAddressKey = SearchAddress.parseSearchAddressFromString(searchAddress);
        Pageable pageable = PageRequest.of(page - 1, limit);
        return searchAddressKey.getSearchResult(addressRepository, pageable);
    }

    @Override
    public Address createAddress(AddressKey addressKey) {
        Address address = this.findAddress(addressKey);
        if (address != null) {
            return address;
        }
        address = Address.builder()
                .city(addressKey.getCity())
                .district(addressKey.getDistrict())
                .ward(addressKey.getWard())
                .street(addressKey.getStreet())
                .home(addressKey.getHome())
                .build();
        return addressRepository.save(address);
    }

    @Override
    public Location createLocation(LocationKey locationKey) {
        Optional<Location> optional = locationRepository.findById(locationKey);
        return optional.orElseGet(() -> locationRepository.save(new Location(locationKey, 0)));
    }

    @Override
    public Location updateLocation(LocationKey locationKey) {
        Optional<Location> locationOptional = locationRepository.findById(locationKey);
        if (locationOptional.isPresent()) {
            Location location = locationOptional.get();
            location.setCount(location.getCount() + 1);
            return locationRepository.save(location);
        } else {
            return locationRepository.save(new Location(locationKey, 0));
        }
    }

    @Override
    public Address updateAddressGps(AddressKey addressKey,
                                    LocationKey locationKey) {
        Address address = this.getAddress(addressKey);
        Location location = this.createLocation(locationKey);
        address.setLocation(location);
        return addressRepository.save(address);
    }

}

@Data
@Slf4j
class SearchAddress {
    private AddressKey addressKey;
    private SearchAddressStrategy strategy;

    public List<String> getSearchResult(AddressRepository repository,
                                        Pageable pageable) {
        log.info(addressKey.toString());
        return strategy.search(repository, pageable, addressKey);
    }

    public static SearchAddress parseSearchAddressFromString(String address) {
        SearchAddress searchAddress = new SearchAddress();
        AddressKey addressKey = new AddressKey();
        String[] strArray = address.split(",");

        for (int i = 0; i <= SearchAddressStrategy.STREET.ordinal(); i++) {
            if (i >= strArray.length || strArray[i].isEmpty()) break;
            else {
                searchAddress.setStrategy(SearchAddressStrategy.values()[i]);
                searchAddress.getStrategy().setProperty(addressKey, strArray[i]);
            }
        }
        searchAddress.setAddressKey(addressKey);
        return searchAddress;
    }

    public enum SearchAddressStrategy {
        CITY {
            @Override
            public void setProperty(AddressKey addressKey,
                                    String value) {
                addressKey.setCity(value);
            }

            @Override
            public List<String> search(AddressRepository repository,
                                       Pageable pageable,
                                       AddressKey addressKey) {
                return repository.findDistinctDistrictByCity(addressKey.getCity(), pageable);

            }
        },
        DISTRICT {
            @Override
            public void setProperty(AddressKey addressKey,
                                    String value) {
                addressKey.setDistrict(value);
            }

            @Override
            public List<String> search(AddressRepository repository,
                                       Pageable pageable,
                                       AddressKey addressKey) {
                return repository.findDistinctWardByCityAndByDistrict(addressKey.getCity(),
                                                                      addressKey.getDistrict(),
                                                                      pageable);
            }
        },
        WARD {
            @Override
            public void setProperty(AddressKey addressKey,
                                    String value) {
                addressKey.setWard(value);
            }

            @Override
            public List<String> search(AddressRepository repository,
                                       Pageable pageable,
                                       AddressKey addressKey) {
                return repository.findDistinctStreetByCityAndByDistrictAndWard(addressKey.getCity(),
                                                                               addressKey.getDistrict(),
                                                                               addressKey.getWard(),
                                                                               pageable);
            }
        },
        STREET {
            @Override
            public void setProperty(AddressKey addressKey,
                                    String value) {
                addressKey.setStreet(value);
            }

            @Override
            public List<String> search(AddressRepository repository,
                                       Pageable pageable,
                                       AddressKey addressKey) {
                return repository.findDistinctHomeByCityAndByDistrictAndWardAndStreet(addressKey.getCity(),
                                                                                      addressKey.getDistrict(),
                                                                                      addressKey.getWard(),
                                                                                      addressKey.getStreet(),
                                                                                      pageable);
            }
        };

        public abstract void setProperty(AddressKey addressKey,
                                         String value);

        public abstract List<String> search(AddressRepository repository,
                                            Pageable pageable,
                                            AddressKey addressKey);
    }
}
