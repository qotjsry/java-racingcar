package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RacingCars {

    private List<RacingCar> racingCars;

    public RacingCars(String carNames) {
        this.racingCars = getRacingCars(carNames);
    }

    public List<RacingCar> getRacingCars() {
        return racingCars;
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
            System.out.println(racingCar.getCarName().getName() + " : " + racingCar.getPositionString());
        }
        System.out.println();
    }

    public List<String> getWinners(){
        List<String> winners = new ArrayList<>();
        for (RacingCar racingCar : racingCars) {
            getWinnerName(racingCar,winners);
        }
        return winners;
    }

    public void getWinnerName(RacingCar racingCar,List<String> winners){
        int maxPosition = getMaxPosition();
        if(racingCar.getPosition() == maxPosition){
            winners.add(racingCar.getCarName().getName());
        }
    }


    public int getMaxPosition(){
        int maxPosition = 0;
        for (RacingCar racingCar : racingCars) {
            if(racingCar.getPosition() > maxPosition){
                maxPosition = racingCar.getPosition();
            }
        }
        return maxPosition;
    }
}
