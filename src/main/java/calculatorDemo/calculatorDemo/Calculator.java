package calculatorDemo.calculatorDemo;

public class Calculator {

    private int result;

    public void add(int arg1, int arg2) {
        result = arg1 + arg2;
    }
    
    public void substract(int arg1, int arg2) {
        result = arg2 - arg1;
    }

    public void multiply(int arg1, int arg2) {
        result = arg1 * arg2;
    }
    
    public void division(int arg1, int arg2) {
        result = arg1 / arg2;
    }
    
    public int getResult() {
        return result;
    }
}
