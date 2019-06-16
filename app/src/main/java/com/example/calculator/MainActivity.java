package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {





    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_calc, btn_dec, btn_clear, btn_del,clobrack,obrack;
    TextView tv1;TextView tv2;

    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision;



    String display="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mul = (Button) findViewById(R.id.btn_Mul);
        btn_calc = (Button) findViewById(R.id.btn_calc);
        btn_dec = (Button) findViewById(R.id.btn_dec);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_del = (Button) findViewById(R.id.btn_del);
        clobrack = (Button) findViewById(R.id.clobrack);
        obrack = (Button) findViewById(R.id.obrack);
        tv1 = (TextView) findViewById(R.id.Text3);
        tv2 = (TextView) findViewById(R.id.text2);

        obrack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {




                tv1.setText(tv1.getText()+"(");
            }
                                  });
        clobrack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {




                tv1.setText(tv1.getText()+")");
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "0");

            }
        });


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "1");

            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "2");

            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "3");

            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "5");

            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "6");


            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "7");

            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "8");

            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + "9");

            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText() + ".");

            }
        });


        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("");
                tv2.setText("");
            }
        });
        btn_del.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                int length = tv1.getText().length();
                if (length > 0) {
                    String text = tv1.getText().toString();
                    tv1.setText(text.substring(0, text.length() - 1));
                }
            }
        });
        btn_calc.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                if (!GetLastchar().equals("*")&&!GetLastchar().equals("+")&&!GetLastchar().equals("-")&&!GetLastchar().equals("/")&&!GetLastchar().equals("("))
                {

                    tv2.setText(tv1.getText().toString()+"=");

                    tv2.setText(compute(tv1.getText().toString()).toString());
                    btn_calc.setWidth(btn_0.getWidth());



                }
                else
                {
                    Toast toast=Toast.makeText(getApplicationContext(),"Equation cannot end with an operator",Toast.LENGTH_SHORT);
                    toast.show();
                }

            }

        });

        btn_Add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!GetLastchar().equals("*")&&!GetLastchar().equals("+")&&!GetLastchar().equals("-")&&!GetLastchar().equals("/")&&!GetLastchar().equals("("))
                    tv1.setText(tv1.getText().toString() + "+");
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Syntax error, Please check your equation", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
        btn_Sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (!GetLastchar().equals("*")&&!GetLastchar().equals("+")&&!GetLastchar().equals("-")&&!GetLastchar().equals("/")&&!GetLastchar().equals("("))
                    tv1.setText(tv1.getText().toString() + "-");
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Syntax error, Please check your equation", Toast.LENGTH_SHORT);
                    toast.show();
                }


            }
        });
        btn_Mul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (!GetLastchar().equals("*")&&!GetLastchar().equals("+")&&!GetLastchar().equals("-")&&!GetLastchar().equals("/")&&!GetLastchar().equals("("))
                    tv1.setText(tv1.getText().toString() + "*");
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Syntax error, Please check your equation", Toast.LENGTH_SHORT);
                    toast.show();
                }


            }
        });
        btn_Div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (!GetLastchar().equals("*")&&!GetLastchar().equals("+")&&!GetLastchar().equals("-")&&!GetLastchar().equals("/")&&!GetLastchar().equals("("))
                    tv1.setText(tv1.getText().toString() + "/");
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Syntax error, Please check your equation", Toast.LENGTH_SHORT);
                    toast.show();
                }


            }
        });


    }
    private String GetLastchar()
    {

        CharSequence s = tv1.getText();
        String n=(s.subSequence(s.length()-1, s.length())).toString();


        return n;

    }




    static Double compute(String equation) {


        double result = 0.0;
        String noMinus = equation.replace("-", "+-");
        String[] byPlus = noMinus.split("\\+");

        for (String multi : byPlus) {
            String[] byMultipl = multi.split("\\*");
            double multiplyResult = 1.0;
            for (String operand : byMultipl) {
                if (operand.contains("/")) {
                    String[] division = operand.split("\\/");
                    double dividend = Double.parseDouble(division[0]);
                    for (int i = 1; i < division.length; i++) {
                        dividend /= Double.parseDouble(division[i]);
                    }
                    multiplyResult *= dividend;
                } else {
                    multiplyResult *= Double.parseDouble(operand);
                }
            }
            result += multiplyResult;
        }

        return result;
    }



}
