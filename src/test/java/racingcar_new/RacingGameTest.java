package racingcar_new;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

public class RacingGameTest {

    @Test
    public void racingGameTest() throws Exception {
        RacingGame racingGame = new RacingGame("car1", "car2", "car3");
        assertThat(new RacingGame("car1", "car2", "car3")).isEqualTo(racingGame);
    }

    @Test
    public void racingGameTest2() throws Exception {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1", 1));
        cars.add(new Car("car2", 2));
        cars.add(new Car("car3", 2));
        RacingGame racingGame = new RacingGame(cars);
        assertThat(racingGame.winner()).isEqualTo("car2","car3");
    }

}
