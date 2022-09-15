package pl.zagrodnicy.carexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.zagrodnicy.carexample.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
