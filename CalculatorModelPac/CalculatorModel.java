package CalculatorModelPac;
import java.io.FileWriter;
import java.io.IOException;

import CalculatorServices.CalculatorFactory;
import CalculatorViewPac.CalculatorView;

public class CalculatorModel implements CalculatorModelInterface{
    private int number1;
    private int number2;
    private String parameter;

    public CalculatorModel() {
        try{
            this.number1 = Integer.valueOf(CalculatorView.getUserInput("Plese input first number: "));
            this.parameter = CalculatorView.getUserInput("Plese input parameter: ");
            this.number2 = Integer.valueOf(CalculatorView.getUserInput("Plese input second number: ")); 
        }catch(NumberFormatException ex){
            System.out.println("Please input valid numbers.");
            return;
        }
    }

    public int getNumber1() {
        return this.number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return this.number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getParameter() {
        return this.parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public void logger(String str , String path){
      try(FileWriter fw = new FileWriter(path,true)) {
         fw.write(str);
         fw.write("\n");
      } catch (IOException e) {
         System.out.println(e);
      }
   }
    //Реализован паттерн Фабрики 
    //Метод вычисляет результат двух чисел исходя их оператора. И бросает 
    //nullPointerException есди был задан невырный оператор.
    @Override
    public int calculate() {
        return CalculatorFactory.calculatorFactory(this.number1, this.number2, this.parameter).operation();    
    }
}
