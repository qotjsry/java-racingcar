package racingcar_new;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class WinnerTest {

    @Test
    public void getWinner() throws Exception {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("car1");
        car1.move(4);
        Car car2 = new Car("car2");
        car2.move(3);
        cars.add(car1);
        cars.add(car2);
        Cars cars1 = new Cars(cars);
        Assertions.assertThat(cars1.winner()).isEqualTo(new ArrayList<String>(){{add("car1");}});

    }

}
