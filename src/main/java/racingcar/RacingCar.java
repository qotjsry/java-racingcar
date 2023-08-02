package racingcar;

public class RacingCar {

    public static final int CHECK_NUMBER = 4;
    private CarName carName;
    private int position = 0;

    public RacingCar(String name) {
        this.carName = new CarName(name);
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public CarName getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    public String getPositionString() {
        String positionString = "";
        for (int i = 0; i < position; i++) {
            positionString += "-";
        }
        return positionString;
    }

    public int move(int randomNumber){
        if(randomNumber >= CHECK_NUMBER){
            position++;
        }
        return position;
    }


}
