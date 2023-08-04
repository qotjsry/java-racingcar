package racingcar_new;

import java.util.Objects;


public class Car {
    private CarName name;
    private int position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = 0;
    }

    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = position;
    }

    public void move(int randomNumber) {
        if(randomNumber >= 4)
            this.position++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
