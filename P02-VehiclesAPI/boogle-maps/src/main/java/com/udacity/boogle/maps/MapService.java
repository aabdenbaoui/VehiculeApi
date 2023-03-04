package com.udacity.boogle.maps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapService {

    public Address getAddress(){
        return MockAddressRepository.getRandom();
    }

}
