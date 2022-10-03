package com.example.mathcalc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView solutionView;
    boolean decimalFlag = false;
    String tempNum = "";
    double numSolution = 0;
    double calcNum1 = 0;
    double calcNum2 = 0;
    String workings = "";
    String Operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        solutionView = findViewById(R.id.solution_view);
    }

    public String getSolutionView(){
        String valueOnScreen = solutionView.getText().toString();
        return valueOnScreen;
    }

    public void divideByZeroCheck(){
        if ((Operator == "/") && (calcNum1 == 0) && (calcNum2 == 0)) {
            clearAll();
            solutionView.setText("NaN");
            }
    }
    public String removeTrailingZeroes(String solution){
        solution = (solution.replaceFirst("\\.0*$|(\\.\\d*?)0+$", ""));
        return solution;
    }

    public void clearAll(){
        workings = "";
        decimalFlag = false;
        tempNum = "";
        calcNum1 = 0;
        calcNum2 = 0;
        numSolution = 0;
        Operator = "";
    }

    public void vClear(View view){
        workings = "";
        decimalFlag = false;
        tempNum = "";
        calcNum1 = 0;
        calcNum2 = 0;
        numSolution = 0;
        Operator = "";
        solutionView.setText("");
    }

    public void vDel(View view) {
        String valueOnScreen = solutionView.getText().toString();
        if (valueOnScreen.equals(Operator)){
            Operator = "";
            solutionView.setText("");
        }
        else if(!valueOnScreen.equals("")){
        valueOnScreen = valueOnScreen.substring(0,valueOnScreen.length() - 1);
        solutionView.setText(valueOnScreen);
        tempNum = valueOnScreen;}
    }


    //decimal button- checks if decimal flag is true, if not sets to true.
    public void vDecimal(View view) {
            String getScreen = getSolutionView();
            if(getScreen.contains("//.")){
                return;
            }
            else
            getScreen = getScreen + ".";
            solutionView.setText(getScreen);
            tempNum = getScreen;
    }

    //equals button - locks in number 2 and completes equation depending on operator
    //clears all variables after for new equation
    public void vEquals(View view){
        calcNum2 = Double.parseDouble(tempNum);
        divideByZeroCheck();

        switch(Operator){
            case("+"):
                numSolution = calcNum1 + calcNum2;
                workings = Double.toString(numSolution);
                solutionView.setText(removeTrailingZeroes(workings));
                break;
            case("-"):
                numSolution = calcNum1 - calcNum2;
                workings = Double.toString(numSolution);
                solutionView.setText(removeTrailingZeroes(workings));
                break;
            case("*"):
                numSolution = calcNum1 * calcNum2;
                workings = Double.toString(numSolution);
                solutionView.setText(removeTrailingZeroes(workings));
                break;
            case("/"):
                numSolution = calcNum1 / calcNum2;
                workings = Double.toString(numSolution);
                solutionView.setText(removeTrailingZeroes(workings));
                break;
        }
        clearAll();
    }
    // finds if negative symbol is in string already and appends it if possible
    public void vPosNeg(View view){
        String screen = getSolutionView();
        if((screen != Operator) && (screen != "") && (calcNum2 == 0)){
            screen = screen.replace("-","");
            String addSymbol = "-";
            screen = addSymbol + screen;
            solutionView.setText(screen);
            tempNum = screen;
        }
    }

    //operator buttons - locks in the first number in the equation and sets the operator var
    //resets decimal flag and displays op
    public void vDivide(View view){
        Operator = "/";
        solutionView.setText("/");
        if(tempNum != ""){
        calcNum1 = Double.parseDouble(tempNum);
        tempNum = "";
        }
    }

    public void vMultiply(View view){
        Operator = "*";
        solutionView.setText("*");
        if(tempNum != ""){
        calcNum1 = Double.parseDouble(tempNum);
        tempNum = "";}
    }

    public void vMinus(View view){
        Operator = "-";
        solutionView.setText("-");
        if(tempNum != ""){
        calcNum1 = Double.parseDouble(tempNum);
        tempNum = "";}
    }

    public void vPlus(View view){
        Operator = "+";
        solutionView.setText("+");
        if(tempNum != ""){
        calcNum1 = Double.parseDouble(tempNum);
        tempNum = "";}
    }

    //NUMBER BUTTONS DOWN HERE

    public void vZero(View view) {
        tempNum += "0";
        solutionView.setText(tempNum);
    }

    public void vOne(View view){
        tempNum += "1";
        solutionView.setText(tempNum);
    }

    public void vTwo(View view){
        tempNum += "2";
        solutionView.setText(tempNum);
        }

    public void vThree(View view){
        tempNum += "3";
        solutionView.setText(tempNum);
    }

    public void vFour(View view){
        tempNum += "4";
        solutionView.setText(tempNum);
    }

    public void vFive(View view){
        tempNum += "5";
        solutionView.setText(tempNum);
    }

    public void vSix(View view){
        tempNum += "6";
        solutionView.setText(tempNum);
    }

    public void vSeven(View view){
        tempNum += "7";
        solutionView.setText(tempNum);
    }

    public void vEight(View view){
        tempNum += "8";
        solutionView.setText(tempNum);
    }

    public void vNine(View view){
        tempNum += "9";
        solutionView.setText(tempNum);
    }
}
