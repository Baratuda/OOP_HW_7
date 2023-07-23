package CalculatorServices;
public class CalculatorFactory{
    public static CalculatorOperationInterface calculatorFactory(int number1,int number2, String operation){
      switch (operation) {
         case "+":
             return new AdditionOperation(number1,number2);
         case "-":
             return new SubtractionOperation(number1,number2);
         case "*":
             return new MultiplicationOperation(number1,number2);
         case "/":
             return new DivisionOperation(number1,number2); 
         default:
           throw new NullPointerException();             
     }
    }
}