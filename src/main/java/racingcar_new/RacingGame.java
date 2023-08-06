package racingcar_new;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars;
    private int racingCount;

    public RacingGame (String cars, int racingCount){
        this.cars = getCars(cars);
        this.racingCount = racingCount;
    }

    public List<Car> getCars(String carsName){
        String[] carArray = carsName.split(",");
        List<Car> carList = new ArrayList<>();
        for(String carName : carArray){
            carList.add(new Car(carName));
        }
        return carList;
    }

    public void game(){
        Cars cars = new Cars(this.cars);
        for(int i=0;i<racingCount;i++){
            cars.move();
            System.out.println();
        }
        System.out.println("최종 승리 차동차는 : "+cars.winner());
    }

}
