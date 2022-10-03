package com.example.mathcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView solutionView;

    MaterialButton  buttonClear, buttonDel, buttonOp,
                    buttonDiv, buttonMult, buttonSub,
                    buttonAdd, buttonSum, buttonDec,
                    buttonOne, buttonTwo, buttonThree,
                    buttonFour, buttonFive, buttonSix,
                    buttonSeven, buttonEight, buttonNine, buttonZero;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solutionView = findViewById(R.id.solution_view);


        assignId(buttonClear,R.id.button_c);assignId(buttonDel,R.id.button_del);
        assignId(buttonOp,R.id.button_operator);assignId(buttonDiv,R.id.button_divide);
        assignId(buttonMult,R.id.button_multiply);assignId(buttonSub,R.id.button_subtract);
        assignId(buttonAdd,R.id.button_add);assignId(buttonSum,R.id.button_sum);
        assignId(buttonDec,R.id.button_decimal);assignId(buttonOne,R.id.button_1);
        assignId(buttonTwo,R.id.button_2);assignId(buttonThree,R.id.button_3);
        assignId(buttonFour,R.id.button_4);assignId(buttonFive,R.id.button_5);
        assignId(buttonSix,R.id.button_6);assignId(buttonSeven,R.id.button_7);
        assignId(buttonEight,R.id.button_8);assignId(buttonNine,R.id.button_9);
        assignId(buttonZero,R.id.button_0);
    }

    public void assignId(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    };


    @Override
    public void onClick(View view) {
        Logic log = new Logic();//insantiate logic class

        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalc = solutionView.getText().toString();

        dataToCalc = dataToCalc + buttonText;
        solutionView.setText(dataToCalc);


        switch (buttonText) {

            //backspace
            case ("\\u232b"):
                dataToCalc = dataToCalc.substring(0,dataToCalc.length()-1);
                solutionView.setText(dataToCalc);
                break;
            case ("C"): {
                solutionView.setText("0");
                break;
            }

        }
    }
}
