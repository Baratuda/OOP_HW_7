package CalculatorServices;
public class MultiplicationOperation implements CalculatorOperationInterface{
   private int number1;
   private int number2;

   public MultiplicationOperation(int number1, int number2){
      this.number1 = number1;
      this.number2 = number2;
   }
   @Override
   public int operation() {
      return this.number1*this.number2;
   }
   
}
