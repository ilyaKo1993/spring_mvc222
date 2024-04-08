package Model;

public class Car {

    private String model;
    private int series;
    private int age;


    public Car() {
    }

    public Car(String model, int series, int age) {
        this.model = model;
        this.series = series;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", age=" + age +
                '}';
    }
}
