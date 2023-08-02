package racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

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
        racingCars.getRacingCars().get(0).setPosition(1);
        racingCars.getRacingCars().get(1).setPosition(2);
        racingCars.getRacingCars().get(2).setPosition(3);
        assertThat(racingCars.getWinners()).isEqualTo(Arrays.asList("car3"));
    }



}
