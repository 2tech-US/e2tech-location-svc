package tech2.microservice.service;

import tech2.microservice.model.*;

import java.util.List;

public interface AddressLocationService {
    Boolean isExist(AddressKey addressKey);
    Address getAddress(AddressKey addressKey);
    List<String> getListAddress(String searchAddress , int page, int limit);
    Address createAddress(AddressKey addressKey);
    Location createLocation(LocationKey locationKey);
    Location updateLocation(LocationKey locationKey);
    Address updateAddressGps(AddressKey addressKey, LocationKey locationKey);
}
