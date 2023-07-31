package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

    @Test
    public void setRacingCarName() throws Exception {
        RacingCar racingCar = new RacingCar("car1");
        assertThat(racingCar.getCarName().getName()).isEqualTo("car1");
    }

    @Test
    public void checkRacingCarName() throws Exception {
        assertThatThrownBy(() -> new RacingCar("carName")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void positionMove() throws Exception {
        //given
        RacingCar racingCar = new RacingCar("car1");
        //when
        racingCar.move(4);
        //then
        assertThat(racingCar.getPosition()).isEqualTo(1);
    }

}
