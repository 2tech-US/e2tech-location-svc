package tech2.microservice.service;

import tech2.microservice.model.*;

import java.util.List;

public interface AddressLocationService {
    Address getAddress(AddressKey addressKey);
    Address getAddressFromString(String strAddress);
    List<String> getListAddress(String searchAddress , int page, int limit);
    Address createAddress(Address address);
    Address createAddressFromString (String strAddress);
    Location getLocationByGps(LocationKey locationKey);
    Location createLocation(LocationKey locationKey);
    Location updateLocation(LocationKey locationKey);
    Address updateAddressGps(AddressKey addressKey, LocationKey locationKey);
}
