package racingcar_new;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void setCarName() throws Exception {
        Car car = new Car("car1");
        assertThat(new Car("car1")).isEqualTo(car);
    }

    @Test
    public void setCarNameException() throws Exception {
        assertThatThrownBy(() -> new Car("carName")).isInstanceOf(IllegalArgumentException.class);
    }

}
