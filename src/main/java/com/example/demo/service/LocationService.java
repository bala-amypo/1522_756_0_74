package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.LocationEntity;
@Service
public interface LocationService {
    LocationEntity createLocation (LocationEntity location);
    List<LocationEntity> getalllocation();
}