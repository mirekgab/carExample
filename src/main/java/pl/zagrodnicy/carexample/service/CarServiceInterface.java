package pl.zagrodnicy.carexample.service;

import pl.zagrodnicy.carexample.dto.CarDto;

import java.util.List;

public interface CarServiceInterface {
    List<CarDto> findAll();
    CarDto findById(Long id);
}
