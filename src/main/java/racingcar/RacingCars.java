package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RacingCars {

    private List<RacingCar> racingCars;

    public RacingCars(String carNames) {
        this.racingCars = getRacingCars(carNames);
    }

    public static List<RacingCar> getRacingCars(String carNames) {
        List<RacingCar> racingCars = new ArrayList<>();
        String[] arrayCarName = carNames.split(",");
        for (String carName : arrayCarName) {
            racingCars.add(new RacingCar(carName));
        }
        return racingCars;

    }

    public void nextRound() {
        for (RacingCar racingCar : racingCars) {
            int randomNumber = (int) (Math.random() * 10);
            racingCar.move(randomNumber);
        }
    }
}
