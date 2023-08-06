package racingcar_new;

import java.util.ArrayList;
import java.util.List;

public class ResultView {

    private String carName;
    private int position;

    public ResultView(Car car){
        carName = car.getName();
        position = car.getPosition();
    }

    public void carView(){

    }

    public void resultView() {
        System.out.println(resultAppender(position));
    }

    public String resultAppender(int position) {
        StringBuilder sb = new StringBuilder();
        sb.append(carName);
        sb.append(" : ");
        sb.append(gameResultView(position));
        return sb.toString();
    }
    public String gameResultView(int position){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < position;i++){
            sb.append("-");
        }
        return sb.toString();
    }
}
