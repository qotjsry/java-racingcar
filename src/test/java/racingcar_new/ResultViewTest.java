package racingcar_new;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResultViewTest {

    @Test
    public void position_1_result() throws Exception {
        Car car = new Car("pobi");
        ResultView resultView = new ResultView(car);
        Assertions.assertThat(resultView.resultAppender(1)).isEqualTo("pobi : -");
    }

}
