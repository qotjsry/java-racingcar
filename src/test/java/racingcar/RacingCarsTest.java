package racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar_new.Car;

public class RacingCarsTest {

    @Test
    public void racingCarsMove() throws Exception {
        RacingCars racingCars = new RacingCars("car1,car2,car3");

        racingCars.getRacingCars().get(0).move(4);
        assertThat(racingCars.getRacingCars().get(0).getPosition()).isEqualTo(1);
    }

    @Test
    public void getWinnerTest(){
        RacingCars racingCars = new RacingCars("car1,car2,car3");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", 1));
        cars.add(new Car("car1", 2));
        cars.add(new Car("car1", 3));
        assertThat(racingCars.getWinners()).isEqualTo(Arrays.asList("car3"));
    }



}
