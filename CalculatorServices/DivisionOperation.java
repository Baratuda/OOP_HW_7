package CalculatorServices;
public class DivisionOperation implements CalculatorOperationInterface{
   private int number1;
   private int number2;

   public DivisionOperation(int number1, int number2){
      this.number1 = number1;
      this.number2 = number2;
   } 
   @Override
   public int operation() {
      return this.number1/this.number2;
   }
   
}
