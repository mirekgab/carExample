package pl.zagrodnicy.carexample.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.zagrodnicy.carexample.dto.CarDto;
import pl.zagrodnicy.carexample.model.Car;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDto carToCarDto(Car car);

    Car carDtoToCar(CarDto carDto);
}
