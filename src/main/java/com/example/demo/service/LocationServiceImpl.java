package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationRepository Locationrepo;
    @Override
    public LocationEntity createLocation(LocationEntity le){
        return Locationrepo.save(le);
    }
    @Override
    public List<LocationEntity> getalllocation(){
        return Locationrepo.findAll();
    }
}
