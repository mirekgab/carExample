package pl.zagrodnicy.carexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.zagrodnicy.carexample.mapper.CarMapper;
import pl.zagrodnicy.carexample.dto.CarDto;
import pl.zagrodnicy.carexample.exception.CarException;
import pl.zagrodnicy.carexample.model.Car;
import pl.zagrodnicy.carexample.repository.CarRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarServiceInterface {
    private final CarRepository repository;

    @Autowired
    public CarServiceImpl(CarRepository repository) {
        this.repository = repository;
    }

    public List<CarDto> findAll() {
        List<Car> cars = repository.findAll();
        if (cars != null && !cars.isEmpty()) {
            List<CarDto> carDtos = cars
                    .stream()
                    .map(CarMapper.INSTANCE::carToCarDto)
                    .collect(Collectors.toList());
            return carDtos;
        }
        throw new CarException("no cars in database");
    }

    public CarDto findById(Long id) {
        Car car = repository
                .findById(id)
                .orElseThrow(
                        () -> new CarException("car not found"));
        return CarMapper.INSTANCE.carToCarDto(car);
    }

}
