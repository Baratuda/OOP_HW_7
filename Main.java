
import CalculatorModelPac.CalculatorModel;
import CalculatorViewPac.CalculatorView;
import CalculatorPresenter.CalculatorPresenter;
public class Main {
    public static void main(String[] args) {
    CalculatorModel model = new CalculatorModel();
    CalculatorView view = new CalculatorView();
    CalculatorPresenter presenter = new CalculatorPresenter(model, view);
        presenter.buttonClicked();
    }
}