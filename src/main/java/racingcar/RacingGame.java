package racingcar;

import java.util.Scanner;

public class RacingGame {

    public void RacingGameStart() {
        System.out.println("경주 할 자동차 이름을 입력해 주세요.(이름은 ,를 기준 으로 구분)");
        Scanner carNameSc = new Scanner(System.in);
        String input = carNameSc.nextLine();
        System.out.println("시도할 횟수를 입력해 주세요.");
        Scanner countSc = new Scanner(System.in);
        int count = countSc.nextInt();
        RacingCars racingCars = new RacingCars(input);
        for (int i = 0; i < count; i++) {
            racingCars.nextRound();
        }
        System.out.println("우승자는 = " + racingCars.getWinners());
    }

}
