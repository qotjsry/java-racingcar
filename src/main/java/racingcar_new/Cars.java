package racingcar_new;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Cars {

    private final List<Car> cars;

    public Cars(String carNames) {
        this.cars = getCarNames(carNames);
    }

    public Cars(List<Car> carList){
        this.cars = carList;
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
            ResultView resultView = new ResultView(car);
            car.move();
            resultView.resultView();
        }
    }
    public int getMaxPosition(){
        int maxPosition = 0;
        for(Car car : cars){
            maxPosition = compareMaxPosition(car,maxPosition);
        }
        return maxPosition;
    }

    public int compareMaxPosition(Car car,int maxPosition){
        if(car.getPosition() > maxPosition){
            maxPosition = car.getPosition();
        }
        return maxPosition;
    }
    public List<String> winner() {
        List<String> winner = new ArrayList<>();
        for (Car car : cars) {
            getWinnerName(car,winner);
        }
        return winner;
    }

    public void getWinnerName(Car car,List<String> winners){
        int maxPosition = getMaxPosition();
        if(car.isWinnerCar(maxPosition)){
            winners.add(car.getName());
        }
    }
}
