package tech2.microservice.service;

import tech2.microservice.model.Address;
import tech2.microservice.model.AddressKey;
import tech2.microservice.model.Location;
import tech2.microservice.model.LocationKey;

import java.util.List;

public interface AddressLocationService {
    Address getAddress(AddressKey addressKey);
    List<Address> getListAddress(AddressKey addressKey , int offset, int limit);
    Address createAddress(Address address);
    Location getLocationByGps(LocationKey locationKey);
    Location createLocation(LocationKey locationKey);
    void updateLocation(LocationKey locationKey);
    Address updateAddressGps(AddressKey addressKey, LocationKey locationKey);
}
