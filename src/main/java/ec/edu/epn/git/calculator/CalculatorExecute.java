package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("-- Calculator Execute --");

        /*Creación de la instancia de calculadora*/
        Calculator c = new Calculator();
        /*Incorporación del método addition*/
        int addition = c.addition(4,7);

        /*Se muestra la respuesta de la operación addition de calculadora*/
        System.out.println("c.addition(4,7) = "+ addition);

        /*Incorporación del método subtraction*/
        int subtraction = c.subtraction(4,7);

        /*Se muestra la respuesta de la operación addition de calculadora*/
        System.out.println("c.subtraction(4,7) = "+ subtraction);
    }
}
