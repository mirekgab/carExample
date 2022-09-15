package pl.zagrodnicy.carexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private final CarRepository repository;

    @Autowired
    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<CarDto> findAll() {
        List<Car> cars = repository.findAll();
        if (cars.isEmpty()) {
            throw new CarException("no cars in database");
        }
        return cars.stream().map(car -> mapCarToCarDto(car)).collect(Collectors.toList());
    }

    public CarDto findById(Long id) {
        return mapCarToCarDto(repository.findById(id).orElseThrow(
                () -> new CarException("car not found")));
    }

    private CarDto mapCarToCarDto(Car car) {
        return new CarDto(car.getId(), car.getModel(), car.getName());
    }

    public String test1() {
        throw new RuntimeException("exception from test1");
        //return "hi from test1";
    }
}
