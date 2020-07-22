package xo;
import xo.model.Board;
import xo.view.SecondView;
import xo.view.ThirdView;
import xo.view.View;
public class Main {
    public static void main(String[] args) {
        View view = new View();
        SecondView secondView = new SecondView();
        ThirdView thirdView = new ThirdView();

        callMethod(view);
        callMethod(secondView);
        callMethod(thirdView);

        System.out.println(new Board().toString());
    }
    private static void callMethod(View someView) {
        someView.show();
    }
}
