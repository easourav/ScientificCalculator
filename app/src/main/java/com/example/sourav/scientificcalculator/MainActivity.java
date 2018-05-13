package com.example.sourav.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bDot,bParsent,bAdd,bSub,bMulti,bDivide,bC,bDel,bEqual,bSin,bSinIn,bCos,bCosIn,bTan,bTanIn,b10x,bFactorial,bPie,bx2,bLog,bInvers,bBraOpen,bBraClose,bRoot;
    TextView tvInput, tvResultView;
    Double vat1,var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewImplement();
    }

    private void viewImplement() {
        b0=findViewById(R.id.btnZero);
        b1=findViewById(R.id.btnOne);
        b2=findViewById(R.id.btnTwo);
        b3=findViewById(R.id.btnThree);
        b4=findViewById(R.id.btnFour);
        b5=findViewById(R.id.btnfive);
        b6=findViewById(R.id.btnSix);
        b7=findViewById(R.id.btnSeven);
        b8=findViewById(R.id.btnEight);
        b9=findViewById(R.id.btnNine);
        bDot=findViewById(R.id.btnDot);
        bEqual=findViewById(R.id.btnEqual);
        bAdd=findViewById(R.id.btnAdd);
        bParsent=findViewById(R.id.btnParsent);
        bSub=findViewById(R.id.btnSub);
        bMulti=findViewById(R.id.btnMultiplex);
        bDivide=findViewById(R.id.btnDivide);
        bC=findViewById(R.id.btnC);
        bDel=findViewById(R.id.btnDel);
        bSin=findViewById(R.id.btnSin);
        bSinIn=findViewById(R.id.sin1);
        bCos=findViewById(R.id.btnCos);
        bCosIn=findViewById(R.id.btnCos1);
        bTan=findViewById(R.id.btnTan);
        bTanIn=findViewById(R.id.btnTan1);
        b10x=findViewById(R.id.btn10x);
        bFactorial=findViewById(R.id.btnFactorial);
        bx2=findViewById(R.id.btnx2);
        bPie=findViewById(R.id.btnPye);
        bLog=findViewById(R.id.btnlog);
        bInvers=findViewById(R.id.btnInvers);
        bBraOpen=findViewById(R.id.btnBracetOpen);
        bBraClose=findViewById(R.id.btnBracketClose);
        bRoot=findViewById(R.id.btnRoot);
        tvInput=findViewById(R.id.tvViewInput);
        tvResultView=findViewById(R.id.tvResult);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bDot.setOnClickListener(this);
        bEqual.setOnClickListener(this);
        bAdd.setOnClickListener(this);
        bParsent.setOnClickListener(this);
        bSub.setOnClickListener(this);
        bMulti.setOnClickListener(this);
        bDivide.setOnClickListener(this);
        bC.setOnClickListener(this);
        bDel.setOnClickListener(this);
        bSin.setOnClickListener(this);
        bSinIn.setOnClickListener(this);
        bCos.setOnClickListener(this);
        bCosIn.setOnClickListener(this);
        bTan.setOnClickListener(this);
        bTanIn.setOnClickListener(this);
        bx2.setOnClickListener(this);
        bPie.setOnClickListener(this);
        bLog.setOnClickListener(this);
        bInvers.setOnClickListener(this);
        bBraOpen.setOnClickListener(this);
        bBraClose.setOnClickListener(this);
        bRoot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    }
}
