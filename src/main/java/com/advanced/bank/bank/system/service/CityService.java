package com.advanced.bank.bank.system.service;

import com.advanced.bank.bank.system.model.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
public void createCity(City city);
public void updateCity(City city);
List<City> getAllCities();
City getCityById(Long cityId);
void deleteCityById(Long cityId);

}
