package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttondot, buttonEqual,buttonclear;
    TextView numberText;
    double numOne,numTwo;
    boolean addsymbol=false,subsymbol=false,mulsymbol=false,divsymbol=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttondot = (Button) findViewById(R.id.buttondot);
        buttonAdd = (Button) findViewById(R.id.add);
        buttonSub = (Button) findViewById(R.id.sub);
        buttonMul = (Button) findViewById(R.id.mul);
        buttonDivision = (Button) findViewById(R.id.div);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        numberText = (TextView) findViewById(R.id.edt1);
        buttonclear = (Button) findViewById(R.id.buttonclear);



        button0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText()+"9");
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numberText.setText(numberText.getText()+".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (numberText.getText().length() == 0)
                    Toast.makeText(MainActivity.this, "enter a number first", Toast.LENGTH_SHORT).show();

                else
                {
                    numOne = Double.parseDouble(numberText.getText() + "");
                    numberText.setText(null);
                    addsymbol=true;
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (numberText.getText().length() == 0)
                    numberText.setText("-");

                else
                {
                    numOne = Double.parseDouble(numberText.getText() + "");
                    numberText.setText(null);
                    subsymbol=true;
                }
                }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (numberText.getText().length()==0) {
                    Toast.makeText(MainActivity.this, "Enter a valid number", Toast.LENGTH_SHORT).show();
                    numberText.setText("");
                }

                else
                {
                    numOne = Double.parseDouble(numberText.getText() + "");
                    numberText.setText(null);
                    mulsymbol=true;
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (numberText.getText().length()== 0)
                    Toast.makeText(MainActivity.this, "Enter a valid number", Toast.LENGTH_SHORT).show();

                else
                {
                    numOne = Double.parseDouble(numberText.getText() + "");
                    numberText.setText(null);
                    divsymbol=true;
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                numTwo = Double.parseDouble(numberText.getText()+"");

                if(addsymbol)
                {
                    numberText.setText(numOne+numTwo+"");
                    addsymbol=false;
                }

                if(subsymbol)
                {
                    numberText.setText(numOne-numTwo+"");
                    subsymbol=false;
                }

                if(mulsymbol)
                {
                    numberText.setText(numOne*numTwo+"");
                    mulsymbol=false;
                }

                if(divsymbol)
                {
                    numberText.setText(numOne/numTwo+"");
                    divsymbol=false;
                }
            }
        });

        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberText.setText("");
            }
        });




    }
}