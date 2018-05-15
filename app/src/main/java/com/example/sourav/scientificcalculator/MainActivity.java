package com.example.sourav.scientificcalculator;

import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
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

//        bInvers.setText(Html.fromHtml(SyncStateContract.Helpers.insert()));
//        labelInverseCos.setText(Html.fromHtml(SyncStateContract.Helpers.inverseCos));
//        labelInverseTan.setText(Html.fromHtml(Helpers.inverseTan));
//        labelExponential.setText(Html.fromHtml(Helpers.exponential));
//        labelTenPowerX.setText(Html.fromHtml(Helpers.tenPowerX));
//        labelCubeRoot.setText(Html.fromHtml(Helpers.cubeSquare));
//        labelCube.setText(Html.fromHtml(Helpers.cubeRoot));
//        labelPi.setText(Html.fromHtml(Helpers.pi));

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
                tvInput.setText(tvInput.getText().toString()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"9");
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+".");
            }
        });
        bParsent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"%");
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"+");
            }
        });
        bTan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"tan");
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"-");
            }
        });
        bDivide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"/");
            }
        });
        bMulti.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"x");
            }
        });
        bx2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"x2");
            }
        });
        b10x.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"10x");
            }
        });
        bFactorial.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"x!");
            }
        });
        bPie.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"π");
            }
        });
        bLog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"log");
            }
        });
        bInvers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"^");
            }
        });
        bRoot.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"\u221a");
            }
        });
        bBraOpen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"(");
            }
        });
        bBraClose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+")");
            }
        });
        bTanIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"tan-");
            }
        });
        bSin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"sin");
            }
        });
        bSinIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"sin-");
            }
        });
        bCos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"cos");
            }
        });
        bCosIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+"cos-");
            }
        });
        bEqual.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });



    }
}