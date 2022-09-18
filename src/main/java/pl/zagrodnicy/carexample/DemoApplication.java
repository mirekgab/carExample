package pl.zagrodnicy.carexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.zagrodnicy.carexample.model.Car;
import pl.zagrodnicy.carexample.repository.CarRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public void run(String[] args) {
        repository.save(new Car(1L, "name1", "model1"));
        repository.save(new Car(2L, "name1", "model2"));
        repository.save(new Car(3L, "name2", "model21"));
        repository.save(new Car(4L, "name2", "model22"));

    }

}
