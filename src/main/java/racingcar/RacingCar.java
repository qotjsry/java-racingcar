package racingcar;

public class RacingCar {
    private CarName carName;
    private int position = 0;

    public RacingCar(String name) {
        this.carName = new CarName(name);
    }

    public CarName getCarName() {
        return carName;
    }

    public int move(int randomNumber){
        if(randomNumber >= 4){
            position++;
        }
        return position;
    }

    public int getPosition() {
        return position;
    }
}
