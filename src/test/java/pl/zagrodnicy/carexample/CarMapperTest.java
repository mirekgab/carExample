package pl.zagrodnicy.carexample;

import org.junit.jupiter.api.Test;
import pl.zagrodnicy.carexample.dto.CarDto;
import pl.zagrodnicy.carexample.mapper.CarMapper;
import pl.zagrodnicy.carexample.model.Car;

import static org.assertj.core.api.Assertions.assertThat;

class CarMapperTest {

    @Test
    public void shouldMapCarToCarDto() {
        //given
        Car car = new Car(1L, "model1", "name1");

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        //then
        System.out.println(carDto);
        assertThat(carDto).isNotNull();
        assertThat(carDto.getName()).isEqualTo("name1");
        assertThat(carDto.getModel()).isEqualTo("model1");
    }

    @Test
    public void shouldMapCarDtoToCar() {
        //given
        CarDto carDto = new CarDto(1L, "model1", "name1");

        //when
        Car car = CarMapper.INSTANCE.carDtoToCar(carDto);

        //then
        System.out.println(car);
    }
}