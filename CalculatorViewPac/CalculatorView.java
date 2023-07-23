package CalculatorViewPac;
import java.util.Scanner;

import CalculatorModelPac.CalculatorModel;

public class CalculatorView{

    public void displayResult(int result, CalculatorModel model) {
        String resultString = String.format("%d %s %d = %d", model.getNumber1(), model.getParameter(), model.getNumber2(),result);
        model.logger(resultString, "C:\\Users\\User\\Desktop\\\u041D\u043E\u0432\u0430\u044F \u043F\u0430\u043F\u043A\u0430\\log.txt");
        System.out.printf(resultString);
    }

    public static String getUserInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }
}


