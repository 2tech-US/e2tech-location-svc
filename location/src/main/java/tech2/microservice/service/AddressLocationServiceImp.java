package tech2.microservice.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech2.microservice.exception.DuplicateResourceException;
import tech2.microservice.exception.NotFoundException;
import tech2.microservice.model.*;
import tech2.microservice.repository.AddressRepository;
import tech2.microservice.repository.LocationRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class AddressLocationServiceImp implements AddressLocationService {

    private final AddressRepository addressRepository;
    private final LocationRepository locationRepository;

    @Override
    public Address getAddress(AddressKey addressKey) {
        Optional<Address> address = addressRepository.findById(addressKey);
        if (address.isPresent()) {
            return address.get();
        } else {
            throw new NotFoundException("Not Found Address:" + addressKey);
        }
    }

    @Override
    public List<String> getListAddress(String searchAddress,
                                       int page,
                                       int limit) {
        SearchAddress searchAddressKey = SearchAddress.parseSearchAddressFromString(searchAddress);
        return searchAddressKey.getSearchResult(addressRepository, limit, page);
    }

    @Override
    public Address createAddress(Address address) {
        if (addressRepository.existsById(address.getId())) {
            throw new DuplicateResourceException("This Address Already Exist");
        }
        return addressRepository.save(address);
    }

    @Override
    public Location getLocationByGps(LocationKey locationKey) {
        Optional<Location> locationOptional = locationRepository.findById(locationKey);
        if (locationOptional.isPresent()) {
            return locationOptional.get();
        }
        throw new NotFoundException("Not Found Location " + locationKey);
    }


    @Override
    public Location createLocation(LocationKey locationKey) {
        Optional<Location> optional = locationRepository.findById(locationKey);
        return optional.orElseGet(() -> locationRepository.save(new Location(locationKey, 0)));
    }

    @Override
    public Location updateLocation(LocationKey locationKey) {
        Optional<Location> locationOptional = locationRepository.findById(locationKey);
        Location location;
        if (locationOptional.isPresent()) {
            location = locationOptional.get();
            location.setCount(location.getCount() + 1);
            locationRepository.save(location);
        } else {
            location = locationRepository.save(new Location(locationKey, 0));
        }
        return location;
    }

    @Override
    public Address updateAddressGps(AddressKey addressKey,
                                    LocationKey locationKey) {
        Address address = this.getAddress(addressKey);
        Optional<Location> optional = locationRepository.findById(locationKey);
        if (optional.isPresent()) {
            Location location = optional.get();
            location.setCount(location.getCount() + 1);
            address.setLocation(location);
            locationRepository.save(location);
        } else {
            Location location = this.createLocation(locationKey);
            address.setLocation(location);
        }
        return addressRepository.save(address);
    }


}

@Data
@Slf4j
class SearchAddress {
    private AddressKey addressKey;
    private SearchAddressStrategy strategy;

    public List<String> getSearchResult(AddressRepository repository,
                                        int limit,
                                        int offset) {
        Pageable pageable = PageRequest.of(offset, limit);
        log.info(addressKey.toString());
        return strategy.search(repository, pageable, addressKey);
    }

    public static SearchAddress parseSearchAddressFromString(String address) {
        SearchAddress searchAddress = new SearchAddress();
        AddressKey addressKey = new AddressKey();
        String[] strArray = address.split(";");

        for (int i = 0; i < SearchAddressStrategy.STREET.ordinal(); i++) {
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
                List<Address> addressList = repository.findAllByIdCity(addressKey.getCity(), pageable);
                return addressList.stream().map(Address::getId).map(AddressKey::getDistrict).collect(
                        Collectors.toList());

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
                List<Address> addressList = repository.findAllByIdCityAndIdDistrict(addressKey.getCity(),
                                                                                    addressKey.getDistrict(), pageable);
                return addressList.stream().map(Address::getId).map(AddressKey::getWard).collect(Collectors.toList());
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
                List<Address> addressList = repository.findAllByIdCityAndIdDistrictAndIdWard(addressKey.getCity(),
                                                                                             addressKey.getDistrict(),
                                                                                             addressKey.getWard(),
                                                                                             pageable);
                return addressList.stream().map(Address::getId).map(AddressKey::getStreet).collect(Collectors.toList());
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
                List<Address> addressList = repository.findAllByIdCityAndIdDistrictAndIdWardAndIdStreet(
                        addressKey.getCity(),
                        addressKey.getDistrict(),
                        addressKey.getWard(),
                        addressKey.getStreet(),
                        pageable);
                return addressList.stream().map(Address::getId).map(AddressKey::getHome).collect(Collectors.toList());
            }
        };

        public abstract void setProperty(AddressKey addressKey,
                                         String value);

        public abstract List<String> search(AddressRepository repository,
                                            Pageable pageable,
                                            AddressKey addressKey);

    }
}
