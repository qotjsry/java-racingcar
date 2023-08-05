package racingcar_new;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import racingcar.RacingCar;

public class RacingGame {
    private Cars cars;
    private int racingCount;

    public RacingGame (Cars cars, int racingCount){
        this.cars = cars;
        this.racingCount = racingCount;
    }

    public void game(){
        for(int i=0;i<racingCount;i++){
            cars.move();
        }
        cars.winner();
    }

    public int getMaxPosition(List<Car> cars){
        int maxPosition = 0;
        for (Car car : cars) {
            if(car.getPosition() > maxPosition){
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RacingGame that = (RacingGame) o;
        return Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
