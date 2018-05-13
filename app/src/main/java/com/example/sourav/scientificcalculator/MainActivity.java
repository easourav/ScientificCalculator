package com.example.sourav.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bDot, bParsent, bAdd, bSub, bMulti, bDivide, bC, bDel, bEqual, bSin, bSinIn, bCos, bCosIn, bTan, bTanIn, b10x, bFactorial, bPie, bx2, bLog, bInvers, bBraOpen, bBraClose, bRoot;
    TextView tvInput, tvResultView;
    String vat1;
    Double var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewImplement();
        bTan.setText("tan");
    }

    private void viewImplement() {
        b0 = findViewById(R.id.btnZero);
        b1 = findViewById(R.id.btnOne);
        b2 = findViewById(R.id.btnTwo);
        b3 = findViewById(R.id.btnThree);
        b4 = findViewById(R.id.btnFour);
        b5 = findViewById(R.id.btnfive);
        b6 = findViewById(R.id.btnSix);
        b7 = findViewById(R.id.btnSeven);
        b8 = findViewById(R.id.btnEight);
        b9 = findViewById(R.id.btnNine);
        bDot = findViewById(R.id.btnDot);
        bEqual = findViewById(R.id.btnEqual);
        bAdd = findViewById(R.id.btnAdd);
        bParsent = findViewById(R.id.btnParsent);
        bSub = findViewById(R.id.btnSub);
        bMulti = findViewById(R.id.btnMultiplex);
        bDivide = findViewById(R.id.btnDivide);
        bC = findViewById(R.id.btnC);
        bDel = findViewById(R.id.btnDel);
        bSin = findViewById(R.id.btnSin);
        bSinIn = findViewById(R.id.sin1);
        bCos = findViewById(R.id.btnCos);
        bCosIn = findViewById(R.id.btnCos1);
        bTan = findViewById(R.id.btnTan);
        bTanIn = findViewById(R.id.btnTan1);
        b10x = findViewById(R.id.btn10x);
        bFactorial = findViewById(R.id.btnFactorial);
        bx2 = findViewById(R.id.btnx2);
        bPie = findViewById(R.id.btnPye);
        bLog = findViewById(R.id.btnlog);
        bInvers = findViewById(R.id.btnInvers);
        bBraOpen = findViewById(R.id.btnBracetOpen);
        bBraClose = findViewById(R.id.btnBracketClose);
        bRoot = findViewById(R.id.btnRoot);
        tvInput = findViewById(R.id.tvViewInput);
        tvResultView = findViewById(R.id.tvResult);

        bC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvResultView.setText("");
            }
        });
        bDel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                if (vat1.length()>0)
                {
                    vat1=vat1.substring(0,vat1.length() -1);
                    tvInput.setText(vat1);
                }
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "9");
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + ".");
            }
        });
        bParsent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "%");
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "+");
            }
        });
        bTan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "tan");
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "-");
            }
        });
        bDivide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "/");
            }
        });
        bMulti.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "X");
            }
        });
        bx2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "x2");
            }
        });
        b10x.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "10x");
            }
        });
        bFactorial.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "x!");
            }
        });
        bPie.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "π");
            }
        });
        bLog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "log");
            }
        });
        bInvers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "^");
            }
        });
        bRoot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "\u221a");
            }
        });
        bBraOpen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "(");
            }
        });
        bBraClose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + ")");
            }
        });
        bTanIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "tan-");
            }
        });
        bSin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "sin");
            }
        });
        bSinIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "sin-");
            }
        });
        bCos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "cos");
            }
        });
        bCosIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                vat1=tvInput.getText().toString();
                tvInput.setText(vat1 + "cos-");
            }
        });



    }
}