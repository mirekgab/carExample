package pl.zagrodnicy.carexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.zagrodnicy.carexample.dto.CarDto;
import pl.zagrodnicy.carexample.service.CarServiceImpl;

import java.util.List;

@RestController
public class CarController {
    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public List<CarDto> allCars() {
        return carService.findAll();
    }

    @GetMapping("/car/{id}")
    public CarDto car(@PathVariable Long id) {
        return carService.findById(id);
    }
}
