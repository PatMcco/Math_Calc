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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        solutionView = findViewById(R.id.result.tv);
    }

    void assignId(MaterialButton btn, int id){

    }


    @Override
    public void onClick(View view) {

    }
}