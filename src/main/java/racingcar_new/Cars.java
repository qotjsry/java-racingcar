package racingcar_new;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Cars {

    private final List<Car> cars;

    public Cars(String carNames) {
        this.cars = getCarNames(carNames);
    }

    public List<Car> getCarNames(String carNames) {
        String[] carNameArray = carNames.split(",");
        for (String carName : carNameArray) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public void move(){
        for(Car car : cars) {
            car.move();
        }
    }
    public int getMaxPosition(){
        int maxPosition = 0;
        for(Car car : cars){
            if(car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }
    public List<Car> winner() {
        List<Car> winner = new ArrayList<>();
        int maxPosition = getMaxPosition();
        for (Car car : cars) {
            if (car.isWinnerCar(maxPosition)) {
                winner.add(car);
            }
        }
        return winner;
    }
}
