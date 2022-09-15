package pl.zagrodnicy.carexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
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

    @GetMapping("/test1")
    public String test1() {
        return carService.test1();
    }
}
