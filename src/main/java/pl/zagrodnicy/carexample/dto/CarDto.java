package pl.zagrodnicy.carexample.dto;

public class CarDto {
    private Long id;
    private String model;
    private String name;


    public CarDto() {
    }

    public CarDto(Long id, String model, String name) {
        this.id = id;
        this.model = model;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
