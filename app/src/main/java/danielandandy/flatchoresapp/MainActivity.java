package danielandandy.flatchoresapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean pressed = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button calcbtn = (Button) findViewById(R.id.calcbtn);
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secontNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
<<<<<<< HEAD
                RadioButton addbtn = (RadioButton) findViewById(R.id.addbtn);
                RadioButton subbtn = (RadioButton) findViewById(R.id.subbtn);
                RadioButton multbtn = (RadioButton) findViewById(R.id.multbtn);
                RadioButton divbtn = (RadioButton) findViewById(R.id.divbtn);


=======
//your a dick
>>>>>>> 70f7a2e2da6eef712b8f8907dfed22a6e140d81a
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());

                if (addbtn.isChecked()){
                    int result = num1+num2;
                    resultTextView.setText(result+ "");
                } else if (subbtn.isChecked()){
                    int result = num1-num2;
                    resultTextView.setText(result+ "");
                }

            }
        });


       /* Button calcbtn = (Button) findViewById(R.id.calcbtn);
        RadioButton addbtn = (RadioButton) findViewById(R.id.calcbtn);
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secontNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());

                int result = num1-num2;
                resultTextView.setText(result+ "");
            }
        });*/

        Button andy = (Button) findViewById(R.id.andy);
        andy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
                resultTextView.setText("Yes he is");
            }
        });
    }

}
