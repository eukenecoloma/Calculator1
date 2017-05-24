package innova4b.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView screenTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screenTextView = (TextView)findViewById(R.id.screen);

    }


    public void numericButtonClicked(View view){
        Button numericButton = (Button) view;
        String numberStr = numericButton.getText().toString();
        screenTextView.setText(screenTextView.getText() + numberStr);

    }




}
