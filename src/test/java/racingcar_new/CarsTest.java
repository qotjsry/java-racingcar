package racingcar_new;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    public void getWinnerTest() throws Exception {
        Car car = new Car("pobi");
        car.move(4);
        List<Car> cars = new ArrayList<>();
        cars.add(car);
        Cars cars1 = new Cars(cars);
        cars1.winner();
        Assertions.assertThat(cars1.winner()).isEqualTo(new ArrayList<String>(){{add("pobi");}});

    }
}
