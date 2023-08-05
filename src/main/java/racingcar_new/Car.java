package racingcar_new;

import java.util.Objects;
import java.util.Random;


public class Car {

    public static final int MOVE_STANDARD_NUMBER = 4;
    public static final int MAX_BOUND = 10;
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

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position;
    }

    public void move(int randomNumber) {
        if(randomNumber >= MOVE_STANDARD_NUMBER)
            this.position++;
    }

    public void move(){
        if(makeRandomNumber() >= MOVE_STANDARD_NUMBER)
            this.position++;
    }

    public int makeRandomNumber(){
        Random random = new Random();
        return random.nextInt(MAX_BOUND);
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

    public boolean isWinnerCar(int maxPosition) {
        return this.position == maxPosition;
    }
}
