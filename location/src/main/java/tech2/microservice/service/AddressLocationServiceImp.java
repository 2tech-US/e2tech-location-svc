package tech2.microservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech2.microservice.exception.DuplicateResourceException;
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

    @Override
    public Address getAddress(AddressKey addressKey) {
        Optional<Address> address = addressRepository.findById(addressKey);
        if(address.isPresent()) {
            return address.get();
        } else {
            throw new NotFoundException("Not Found Address:" + addressKey);
        }
    }

    @Override
    public List<Address> getListAddress(AddressKey addressKey,
                                        int offset,
                                        int limit) {
        return null;
    }

    @Override
    public Address createAddress(Address address) {
        if(addressRepository.existsById(address.getId())) {
            throw new DuplicateResourceException("This Address Already Exist");
        }
        return addressRepository.save(address);
    }

    @Override
    public Location getLocationByGps(LocationKey locationKey) {
        Optional<Location> locationOptional = locationRepository.findById(locationKey);
        if(locationOptional.isPresent()) {
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
    public void updateLocation(LocationKey locationKey) {
        Optional<Location> locationOptional = locationRepository.findById(locationKey);
        if(locationOptional.isPresent()) {
            Location location = locationOptional.get();
            location.setCount(location.getCount()+1);
            locationRepository.save(location);
        } else {
         locationRepository.save(new Location(locationKey,0));
        }
    }

    @Override
    public Address updateAddressGps(AddressKey addressKey,
                                    LocationKey locationKey) {
        Address address = this.getAddress(addressKey);
        Optional<Location> optional = locationRepository.findById(locationKey);
        if(optional.isPresent()) {
            address.setLocation(optional.get());
        } else {
            Location location = this.createLocation(locationKey);
            address.setLocation(location);
        }
        return addressRepository.save(address);
    }
}
