package com.example.mycalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.atomic.AtomicBoolean;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPoint,btnEqual,btnCollection,btnSubtract,btnMultiple,btnDivision,
    btnSquare,btnPercent,btnC,btnAc,btnMC,btnMR,btnM_minus,btnM_plus,btnPlus_Minus;
    TextView memory,outPut,showMemory;
    double one,two;
    boolean subtract,percent,collection,multiple,division,square,plus_minus,point=false;
    boolean calc=false;
    double memoryResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=findViewById(R.id.zero_button);
        btn1=findViewById(R.id.one_button);
        btn2=findViewById(R.id.two_button);
        btn3=findViewById(R.id.tree_button);
        btn4=findViewById(R.id.four_button);
        btn5=findViewById(R.id.five_button);
        btn6=findViewById(R.id.six_button);
        btn7=findViewById(R.id.seven_button);
        btn8=findViewById(R.id.eight_button);
        btn9=findViewById(R.id.nine_button);

        btnPoint=findViewById(R.id.point_button);
        btnEqual =findViewById(R.id.equal_button);
        btnCollection=findViewById(R.id.collection_button);
        btnSubtract=findViewById(R.id.subtraction_button);
        btnMultiple=findViewById(R.id.multiplication_button);
        btnDivision=findViewById(R.id.division_button);
        btnSquare=findViewById(R.id.square_button);
        btnPercent=findViewById(R.id.procent_button);
        btnC=findViewById(R.id.c_button);
        btnAc=findViewById(R.id.ac_button);
        btnMC=findViewById(R.id.mc_button);
        btnMR=findViewById(R.id.mr_button);
        btnM_minus=findViewById(R.id.m_minus_button);
        btnM_plus=findViewById(R.id.m_plus_button);
        btnPlus_Minus=findViewById(R.id.plus_minus_button);

        memory=findViewById(R.id.textView);
        outPut=findViewById(R.id.textView2);
        showMemory=findViewById(R.id.textView3);

        showMemory.setVisibility(View.INVISIBLE);

        btnC.setOnClickListener(x->{
                memory.setText("");
                outPut.setText("");
        });

        btn0.setOnClickListener(x->{
            if(calc==true||percent==true||square==true||plus_minus==true) {
                outPut.setText("");
                memory.setText("");
                outPut.setText(outPut.getText() + "0");
                calc=false;
                percent=false;
                square=false;
                plus_minus=false;
            }else {
                outPut.setText(outPut.getText() + "0");
            }
        });

        btn1.setOnClickListener(x-> {
            if(calc==true||percent==true||square==true||plus_minus==true) {
                outPut.setText("");
                memory.setText("");
                outPut.setText(outPut.getText() + "1");
                calc=false;
                percent=false;
            }else {
                outPut.setText(outPut.getText() + "1");
            }
        });

        btn2.setOnClickListener(x->{
            if(calc==true||percent==true||square==true||plus_minus==true) {
                outPut.setText("");
                memory.setText("");
                outPut.setText(outPut.getText() + "2");
                calc=false;
                percent=false;
            }else {
                outPut.setText(outPut.getText() + "2");
            }
        });

        btn3.setOnClickListener(x->{
            if(calc==true||percent==true||square==true||plus_minus==true) {
                outPut.setText("");
                memory.setText("");
                outPut.setText(outPut.getText() + "3");
                calc=false;
                percent=false;
            }else {
                outPut.setText(outPut.getText() + "3");
            }
        });

        btn4.setOnClickListener(x->{
            if(calc==true||percent==true||square==true||plus_minus==true) {
                outPut.setText("");
                memory.setText("");
                outPut.setText(outPut.getText() + "4");
                calc=false;
                percent=false;
            }else {
                outPut.setText(outPut.getText() + "4");
            }
        });

        btn5.setOnClickListener(x->{
            if(calc==true||percent==true||square==true||plus_minus==true) {
                outPut.setText("");
                memory.setText("");
                outPut.setText(outPut.getText() + "5");
                calc=false;
                percent=false;
            }else {
                outPut.setText(outPut.getText() + "5");
            }
        });

        btn6.setOnClickListener(x->{
            if(calc==true||percent==true||square==true||plus_minus==true) {
                outPut.setText("");
                memory.setText("");
                outPut.setText(outPut.getText() + "6");
                calc=false;
                percent=false;
            }else {
                outPut.setText(outPut.getText() + "6");
            }
        });

        btn7.setOnClickListener(x->{
            if(calc==true||percent==true||square==true||plus_minus==true) {
                outPut.setText("");
                memory.setText("");
                outPut.setText(outPut.getText() + "7");
                calc=false;
                percent=false;
            }else {
                outPut.setText(outPut.getText() + "7");
            }
        });

        btn8.setOnClickListener(x->{
            if(calc==true||percent==true||square==true||plus_minus==true) {
                outPut.setText("");
                memory.setText("");
                outPut.setText(outPut.getText() + "8");
                calc=false;
                percent=false;
            }else {
                outPut.setText(outPut.getText() + "8");
            }
        });

        btn9.setOnClickListener(x->{
            if(calc==true||percent==true||square==true||plus_minus==true) {
                outPut.setText("");
                memory.setText("");
                outPut.setText(outPut.getText() + "9");
                calc=false;
                percent=false;
            }else {
                outPut.setText(outPut.getText() + "9");
            }
        });

        btnPoint.setOnClickListener(x->{
            if(point==false) {
                outPut.setText(outPut.getText() + ".");
                point=true;
            }else {
                outPut.setText(outPut.getText()+"");
            }
        });

        btnCollection.setOnClickListener(x->{
            if(outPut.getText().toString().length()==0){
                outPut.setText("");
            }else {
                memory.setText("+ PLUS");
                one = Double.parseDouble(outPut.getText() + "");
                collection = true;
                point=false;
                outPut.setText(null);
            }
        });

        btnDivision.setOnClickListener(x->{
            if(outPut.getText().toString().length()==0){
                outPut.setText("");
            }else {
                memory.setText("÷ DIVISION");
                one = Double.parseDouble(outPut.getText() + "");
                division = true;
                point=false;
                outPut.setText(null);
            }
        });

        btnMultiple.setOnClickListener(x->{
            if(outPut.getText().toString().length()==0){
                outPut.setText("");
            }else {
                memory.setText("* MULTIPLE");
                one=Double.parseDouble(outPut.getText().toString() + "");
                multiple = true;
                point=false;
                outPut.setText(null);
            }
        });

        btnPercent.setOnClickListener(x->{
            if(outPut.getText().toString().length()==0){
                outPut.setText("");
            }else {
                one = Double.parseDouble(outPut.getText().toString() + "");
                memory.setText("% PERCENT");
                outPut.setText(String.valueOf(one/100));
                percent = true;
            }
        });

        btnSubtract.setOnClickListener(x->{
            if(outPut.getText().toString().length()==0){
                outPut.setText("-");
            }else {
                memory.setText("- MINUS");
                one = Double.parseDouble(outPut.getText() + "");
                subtract = true;
                point=false;
                outPut.setText(null);
            }
        });

        btnSquare.setOnClickListener(x->{
            if(outPut.getText().toString().length()==0){
                outPut.setText("");
            }else {
                memory.setText("^ SQUARE");
                one = Double.parseDouble(outPut.getText() + "");
                outPut.setText(String.valueOf(one*one));
                square = true;
            }
        });

        btnPlus_Minus.setOnClickListener(x->{
            if(outPut.getText().toString().length()==0){
                outPut.setText("");
            }else {
                one = Double.parseDouble(outPut.getText() + "");
                if (one > 0) {
                    outPut.setText(String.valueOf(-one));
                    plus_minus = true;
                } else {
                    outPut.setText(String.valueOf(one * (-1)));
                    plus_minus = true;
                }
            }
        });

        btnM_plus.setOnClickListener(x->{
            if(outPut.getText().toString().length()==0){
                outPut.setText("");
            }else {
                memoryResult += Double.parseDouble(outPut.getText() + "");
                showMemory.setVisibility(View.VISIBLE);
            }
        });

        btnM_minus.setOnClickListener(x->{
            if(outPut.getText().toString().length()==0){
                outPut.setText("");
            }else {
                memoryResult -= Double.parseDouble(outPut.getText() + "");
                showMemory.setVisibility(View.VISIBLE);
            }
        });

        btnMR.setOnClickListener(x->{
            if(memoryResult==0){
                outPut.setText("");
            }else {
                outPut.setText(String.valueOf(memoryResult));
            }
        });

        btnMC.setOnClickListener(x->{
            memoryResult=0;
            showMemory.setVisibility(View.INVISIBLE);
            outPut.setText("");
        });

        btnAc.setOnClickListener(x->{
            memoryResult=0;
            showMemory.setVisibility(View.INVISIBLE);
            memory.setText("");
            outPut.setText("");
        });

        btnEqual.setOnClickListener(x->{

            if(outPut.getText().toString().length()==0){
                outPut.setText("");
            }else {
                two = Double.parseDouble(outPut.getText().toString() + "");

                if (subtract == true) {
                    outPut.setText(String.valueOf(one-two));
                    subtract = false;
                    memory.setText(null);
                    point=false;
                    calc = true;
                }

                if (collection == true) {
                    outPut.setText(String.valueOf(one+two));
                    collection = false;
                    memory.setText(null);
                    point=false;
                    calc = true;
                }

                if (multiple == true) {
                    outPut.setText(String.valueOf(one*two));
                    multiple = false;
                    memory.setText(null);
                    point=false;
                    calc = true;
                }

                if (division == true) {
                    outPut.setText(String.valueOf(one/two));
                    division = false;
                    memory.setText(null);
                    point=false;
                    calc = true;
                }
            }

        });



    }
}
