package innova4b.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView screenTextView;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screenTextView = (TextView)findViewById(R.id.screen);
        calculator = new Calculator();

    }


    public void numericButtonClicked(View view){
        Button numericButton = (Button) view;
        String numberStr = numericButton.getText().toString();

        String textToSet = screenTextView.getText() + numberStr;
        if (screenTextView.getText().equals("0")){
            textToSet = numberStr;
        }
        screenTextView.setText(textToSet);
    }

    public void clearButtonClicked(View view) {
        screenTextView.setText("0");
    }


    public void operationButtonClicked(View view) {

        Button operationButton = (Button) view;
        String operationSymbol = operationButton.getText().toString();

        String screenText = screenTextView.getText().toString();

        if (calculator.getOperation() == null) {
            Integer valueFromScreen = Integer.parseInt(screenText);
            calculator.setFirstValue(valueFromScreen);
            calculator.setOperation(operationSymbol);
            screenTextView.setText (screenTextView.getText() + operationSymbol);
        } else {
            // Do the calc
            String secondNumberStr =  screenText.substring(screenText.indexOf(operationSymbol)+1,screenText.length());
            Integer secondNumber = Integer.parseInt(secondNumberStr);
            calculator.setSecondValue(secondNumber);
            Integer result = calculator.doOperation();
            screenTextView.setText (result);
        }



    }
}
