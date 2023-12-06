package com.nicolasgl.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9, btnC, bntSuma,btnResta,btnPor,btnDiv, btnIgual,btnDot;
    double num1,num2;
    int tipo;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(TextView)findViewById(R.id.textArea);
        btn0=(Button)findViewById(R.id.b0);
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
        btn7=(Button)findViewById(R.id.button7);
        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btnDot=(Button)findViewById(R.id.bPunto);

        bntSuma=(Button)findViewById(R.id.bMas);
        btnResta=(Button)findViewById(R.id.bMenos);
        btnPor=(Button)findViewById(R.id.bPor);
        btnDiv=(Button)findViewById(R.id.bDiv);
        btnIgual=(Button)findViewById(R.id.bIgual);
        btnC=(Button)findViewById(R.id.bC);

        bntSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(display.getText().toString());
                tipo=1;
                display.setText("0");
                btnResta.setEnabled(false);
                btnPor.setEnabled(false);
                btnDiv.setEnabled(false);
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(display.getText().toString());
                tipo=2;
                display.setText("0");
                bntSuma.setEnabled(false);
                btnPor.setEnabled(false);
                btnDiv.setEnabled(false);

            }
        });

        btnPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(display.getText().toString());
                tipo=3;
                display.setText("0");
                bntSuma.setEnabled(false);
                btnResta.setEnabled(false);
                btnDiv.setEnabled(false);

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(display.getText().toString());
                tipo=4;
                display.setText("0");
                bntSuma.setEnabled(false);
                btnResta.setEnabled(false);
                btnPor.setEnabled(false);

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bntSuma.setEnabled(true);
                btnResta.setEnabled(true);
                btnPor.setEnabled(true);
                btnDiv.setEnabled(true);
                display.setText("0");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2=Double.parseDouble(display.getText().toString());
                switch (tipo){
                    case 1:
                        display.setText(Double.toString(num1+num2));
                        break;
                    case 2:
                        display.setText(Double.toString(num1-num2));
                        break;
                    case 3:
                        display.setText(Double.toString(num1*num2));
                        break;
                    case 4:
                        if(num2==0){
                            display.setText("00");
                        }else
                            display.setText(Double.toString(num1/num2));
                        break;
                }
                bntSuma.setEnabled(true);
                btnResta.setEnabled(true);
                btnPor.setEnabled(true);
                btnDiv.setEnabled(true);
                tipo=0;

            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().compareTo("0") == 0) {
                    display.setText("0");
                } else {
                    display.setText(display.getText().toString()+"0");
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().compareTo("0") == 0) {
                    display.setText("1");
                } else {
                    display.setText(display.getText().toString()+"1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().compareTo("0") == 0) {
                    display.setText("2");
                } else {
                    display.setText(display.getText().toString()+"2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().compareTo("0") == 0) {
                    display.setText("3");
                } else {
                    display.setText(display.getText().toString()+"3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().compareTo("0") == 0) {
                    display.setText("4");
                } else {
                    display.setText(display.getText().toString()+"4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().compareTo("0") == 0) {
                    display.setText("5");
                } else {
                    display.setText(display.getText().toString()+"5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().compareTo("0") == 0) {
                    display.setText("6");
                } else {
                    display.setText(display.getText().toString()+"6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().compareTo("0") == 0) {
                    display.setText("7");
                } else {
                    display.setText(display.getText().toString()+"7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().compareTo("0") == 0) {
                    display.setText("8");
                } else {
                    display.setText(display.getText().toString()+"8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().compareTo("0") == 0) {
                    display.setText("9");
                } else {
                    display.setText(display.getText().toString()+"9");
                }
            }
        });

    }
}
