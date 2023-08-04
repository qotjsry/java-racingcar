package racingcar_new;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RacingGame {
    private List<Car> cars;

    public RacingGame(String... carNames) {
        this(Arrays.stream(carNames)
            .map(Car::new)
            .collect(Collectors.toList()));
    }
    public RacingGame(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RacingGame that = (RacingGame) o;
        return Objects.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
