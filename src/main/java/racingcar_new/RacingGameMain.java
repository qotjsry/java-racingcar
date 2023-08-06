package racingcar_new;

import java.util.Scanner;

public class RacingGameMain {
    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        System.out.println("경주 할 자동차 이름을 입력해 주세요.(이름은 ,를 기준 으로 구분)");
        Scanner carNameSc = new Scanner(System.in);
        String input = carNameSc.nextLine();
        System.out.println("시도할 횟수를 입력해 주세요.");
        Scanner countSc = new Scanner(System.in);
        int count = countSc.nextInt();
        RacingGame racingGame = new RacingGame(input,count);
        racingGame.game();
    }
}
