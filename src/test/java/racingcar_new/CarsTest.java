package racingcar_new;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    public void carNameSet() throws Exception {
        Cars cars  = new Cars("car1,car2,car3");
        List<Car> carList = new ArrayList<>();
        carList.add(Car)
        Assertions.assertThat(cars.getCarNames("car1,car2,car3")).isInstanceOf(cars.getClass());
    }
}
