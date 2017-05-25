package innova4b.com.calculator;


public class Calculator {

    private Float firstValue;
    private Float secondValue;
    private String operation;

    public Calculator() {
    }

    public Float getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(Float firstValue) {
        this.firstValue = firstValue;
    }

    public Float getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Float secondValue) {
        this.secondValue = secondValue;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public float doOperation() {
        float result = 0;
        switch (operation) {
            case "*": result = firstValue * secondValue; break;
            case "+": result = firstValue + secondValue; break;
            case "/": result = firstValue / secondValue; break;
        }
        return result;
    }
}
