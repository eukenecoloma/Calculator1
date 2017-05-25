package innova4b.com.calculator;


public class Calculator {

    private Integer firstValue;
    private Integer secondValue;
    private String operation;

    public Calculator() {
    }

    public Integer getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(Integer firstValue) {
        this.firstValue = firstValue;
    }

    public Integer getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(Integer secondValue) {
        this.secondValue = secondValue;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer doOperation() {
        Integer result = 0;
        switch (operation) {
            case "*": result = firstValue * secondValue; break;
            case "+": result = firstValue + secondValue; break;
        }
        return result;
    }
}
