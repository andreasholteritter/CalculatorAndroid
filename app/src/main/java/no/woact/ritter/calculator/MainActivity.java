package no.woact.ritter.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnPluss;
    private Button btnMinus;
    private Button btnMulti;
    private Button btnDivide;
    private Button btnBack;
    private Button btnSquare;
    private Button btnReset;
    private Button btnRoot;
    private Button btnComma;
    private Button btnEquals;

    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnNumber0;

    private TextView txtAnswer;
    private TextView txtInput;
    private TextView txtSign;

    private String number;
    private String sign;
    private String holderString1;
    private String holderString2;
    private String holderNumber1;
    private double holderNumber2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();

        btnPluss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sign = "+";
                    txtSign.setText(sign);
                    holderString1 = txtAnswer.getText().toString();
                    holderString2 = txtInput.getText().toString();
                    if (Double.parseDouble(holderString1) == 0){
                        holderNumber1 = holderString2;
                    } else {
                        holderNumber2 = Double.parseDouble(holderString1) + Double.parseDouble(holderString2);
                        holderNumber1 = Double.toString(holderNumber2);
                    }
                    txtAnswer.setText(holderNumber1);
                    txtInput.setText(Double.toString(0));
                } catch (Exception exc){
                    sign = "NaN";
                    txtSign.setText(sign);
                    txtInput.setText(Double.toString(0));
                    txtAnswer.setText(Double.toString(0));
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sign = "-";
                    txtSign.setText(sign);
                    holderString1 = txtAnswer.getText().toString();
                    holderString2 = txtInput.getText().toString();
                    if (Double.parseDouble(holderString1) == 0){
                        holderNumber1 = holderString2;
                    } else {
                        holderNumber2 = Double.parseDouble(holderString1) - Double.parseDouble(holderString2);
                        holderNumber1 = Double.toString(holderNumber2);
                    }
                    txtAnswer.setText(holderNumber1);
                    txtInput.setText(Double.toString(0));
                } catch (Exception exc){
                    sign = "NaN";
                    txtSign.setText(sign);
                    txtInput.setText(Double.toString(0));
                    txtAnswer.setText(Double.toString(0));
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sign = "*";
                    txtSign.setText(sign);
                    holderString1 = txtAnswer.getText().toString();
                    holderString2 = txtInput.getText().toString();
                    if (Double.parseDouble(holderString1) == 0){
                        holderNumber1 = holderString2;
                    } else {
                        holderNumber2 = Double.parseDouble(holderString1) * Double.parseDouble(holderString2);
                        holderNumber1 = Double.toString(holderNumber2);
                    }
                    txtAnswer.setText(holderNumber1);
                    txtInput.setText(Double.toString(0));
                } catch (Exception exc){
                    sign = "NaN";
                    txtSign.setText(sign);
                    txtInput.setText(Double.toString(0));
                    txtAnswer.setText(Double.toString(0));
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sign = "/";
                    txtSign.setText(sign);
                    holderString1 = txtAnswer.getText().toString();
                    holderString2 = txtInput.getText().toString();
                    if (Double.parseDouble(holderString1) == 0){
                        holderNumber1 = holderString2;
                    } else {
                        holderNumber2 = Double.parseDouble(holderString1) / Double.parseDouble(holderString2);
                        holderNumber1 = Double.toString(holderNumber2);
                    }
                    txtAnswer.setText(holderNumber1);
                    txtInput.setText(Double.toString(0));
                } catch (Exception exc){
                    sign = "NaN";
                    txtSign.setText(sign);
                    txtInput.setText(Double.toString(0));
                    txtAnswer.setText(Double.toString(0));
                }

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "<-|";
                txtSign.setText(sign);
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) == 0) {
                    return;
                } else {
                    if (Double.parseDouble(holderString2) > 1) {
                        holderString2 = holderString2.substring(0, holderString2.length() - 1);
                    } else {
                        holderString2 = "0";
                    }
                }
                txtInput.setText(holderString2);
            }
        });

        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sign = "x^2";
                    txtSign.setText(sign);
                    holderNumber2 = 0;
                    holderString1 = txtAnswer.getText().toString();
                    holderString2 = txtInput.getText().toString();
                    if (Double.parseDouble(holderString2) > 0) {
                        holderNumber2 = Double.parseDouble(holderString2) * Double.parseDouble(holderString2);
                    } else if (Double.parseDouble(holderString1) > 0) {
                        holderNumber2 = Double.parseDouble(holderString1) * Double.parseDouble(holderString1);
                    }
                    txtAnswer.setText(Double.toString(holderNumber2));
                    txtInput.setText("0");
                } catch (Exception exc){
                    sign = "NaN";
                    txtSign.setText(sign);
                    txtInput.setText(Double.toString(0));
                    txtAnswer.setText(Double.toString(0));
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtInput.setText(Double.toString(0));
                txtAnswer.setText(Double.toString(0));
            }
        });

        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    sign = "x^-1";
                    txtSign.setText(sign);
                    holderNumber2 = 0;
                    holderString1 = txtAnswer.getText().toString();
                    holderString2 = txtInput.getText().toString();
                    if (Double.parseDouble(holderString2) > 0) {
                        holderNumber2 = Math.sqrt(Double.parseDouble(holderString2));
                    } else if (Double.parseDouble(holderString1) > 0) {
                        holderNumber2 = Math.sqrt(Double.parseDouble(holderString1));
                    }
                    txtAnswer.setText(Double.toString(holderNumber2));
                    txtInput.setText("0");
                } catch (Exception exc){
                    sign = "NaN";
                    txtSign.setText(sign);
                    txtInput.setText(Double.toString(0));
                    txtAnswer.setText(Double.toString(0));
                }
            }
        });

        btnComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = ".";
                txtSign.setText(sign);
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) > 0) {
                    txtInput.setText(holderString2 + number);
                }
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    holderString1 = txtAnswer.getText().toString();
                    holderString2 = txtInput.getText().toString();

                    switch (sign) {
                        case "+":
                            if (Double.parseDouble(holderString1) == 0){
                                holderNumber1 = holderString2;
                            } else {
                                holderNumber2 = Double.parseDouble(holderString1) + Double.parseDouble(holderString2);
                                holderNumber1 = Double.toString(holderNumber2);
                            }
                            txtAnswer.setText(holderNumber1);
                            txtInput.setText(Double.toString(0));
                            break;
                        case "-":
                            if (Double.parseDouble(holderString1) == 0){
                                holderNumber1 = holderString2;
                            } else {
                                holderNumber2 = Double.parseDouble(holderString1) - Double.parseDouble(holderString2);
                                holderNumber1 = Double.toString(holderNumber2);
                            }
                            txtAnswer.setText(holderNumber1);
                            txtInput.setText(Double.toString(0));
                            break;
                        case "*":
                            if (Double.parseDouble(holderString1) == 0){
                                holderNumber1 = holderString2;
                            } else {
                                holderNumber2 = Double.parseDouble(holderString1) * Double.parseDouble(holderString2);
                                holderNumber1 = Double.toString(holderNumber2);
                            }
                            txtAnswer.setText(holderNumber1);
                            txtInput.setText(Double.toString(0));
                            break;
                        case "/":
                            if (Double.parseDouble(holderString1) == 0){
                                holderNumber1 = holderString2;
                            } else {
                                holderNumber2 = Double.parseDouble(holderString1) / Double.parseDouble(holderString2);
                                holderNumber1 = Double.toString(holderNumber2);
                            }
                            txtAnswer.setText(holderNumber1);
                            txtInput.setText(Double.toString(0));
                            break;
                        case "<-|":
                            if (Double.parseDouble(holderString2) == 0) {
                                return;
                            } else {
                                if (Double.parseDouble(holderString2) > 1) {
                                    holderString2 = holderString2.substring(0, holderString2.length() - 1);
                                } else {
                                    holderString2 = "0";
                                }
                            }
                            txtInput.setText(holderString2);
                            break;
                        case "x^2":
                            if (Double.parseDouble(holderString2) > 0) {
                                holderNumber2 = Math.sqrt(Double.parseDouble(holderString2));
                            } else if (Double.parseDouble(holderString1) > 0) {
                                holderNumber2 = Math.sqrt(Double.parseDouble(holderString1));
                            }
                            txtAnswer.setText(Double.toString(holderNumber2));
                            txtInput.setText("0");
                            break;
                        case "X^-1":
                            if (Double.parseDouble(holderString2) > 0) {
                                holderNumber2 = Math.sqrt(Double.parseDouble(holderString2));
                            } else if (Double.parseDouble(holderString1) > 0) {
                                holderNumber2 = Math.sqrt(Double.parseDouble(holderString1));
                            }
                            txtAnswer.setText(Double.toString(holderNumber2));
                            txtInput.setText("0");
                            break;
                    }
                } catch (Exception exc){
                    sign = "NaN";
                    txtSign.setText(sign);
                    txtInput.setText(Double.toString(0));
                    txtAnswer.setText(Double.toString(0));
                }
            }
        });

        btnNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "1";
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) == 0) {
                    txtInput.setText(number);
                } else {
                    txtInput.setText(txtInput.getText().toString() + number);
                }
            }
        });

        btnNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "2";
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) == 0) {
                    txtInput.setText(number);
                } else {
                    txtInput.setText(txtInput.getText().toString() + number);
                }
            }
        });

        btnNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "3";
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) == 0) {
                    txtInput.setText(number);
                } else {
                    txtInput.setText(txtInput.getText().toString() + number);
                }
            }
        });

        btnNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "4";
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) == 0) {
                    txtInput.setText(number);
                } else {
                    txtInput.setText(txtInput.getText().toString() + number);
                }
            }
        });

        btnNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "5";
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) == 0) {
                    txtInput.setText(number);
                } else {
                    txtInput.setText(txtInput.getText().toString() + number);
                }
            }
        });

        btnNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "6";
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) == 0) {
                    txtInput.setText(number);
                } else {
                    txtInput.setText(txtInput.getText().toString() + number);
                }
            }
        });

        btnNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "7";
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) == 0) {
                    txtInput.setText(number);
                } else {
                    txtInput.setText(txtInput.getText().toString() + number);
                }
            }
        });

        btnNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "8";
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) == 0) {
                    txtInput.setText(number);
                } else {
                    txtInput.setText(txtInput.getText().toString() + number);
                }
            }
        });

        btnNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "9";
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) == 0) {
                    txtInput.setText(number);
                } else {
                    txtInput.setText(txtInput.getText().toString() + number);
                }
            }
        });

        btnNumber0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = "0";
                holderString2 = txtInput.getText().toString();
                if (Double.parseDouble(holderString2) == 0) {
                    txtInput.setText(number);
                } else {
                    txtInput.setText(txtInput.getText().toString() + number);
                }
            }
        });
    }

    private void initWidgets(){
        btnPluss = (Button) findViewById(R.id.btnPluss);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnSquare = (Button) findViewById(R.id.btnSquare);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnRoot = (Button) findViewById(R.id.btnRoot);
        btnComma = (Button) findViewById(R.id.btnComma);
        btnEquals = (Button) findViewById(R.id.btnEquals);

        btnNumber1 = (Button) findViewById(R.id.btnNumber1);
        btnNumber2 = (Button) findViewById(R.id.btnNumber2);
        btnNumber3 = (Button) findViewById(R.id.btnNumber3);
        btnNumber4 = (Button) findViewById(R.id.btnNumber4);
        btnNumber5 = (Button) findViewById(R.id.btnNumber5);
        btnNumber6 = (Button) findViewById(R.id.btnNumber6);
        btnNumber7 = (Button) findViewById(R.id.btnNumber7);
        btnNumber8 = (Button) findViewById(R.id.btnNumber8);
        btnNumber9 = (Button) findViewById(R.id.btnNumber9);
        btnNumber0 = (Button) findViewById(R.id.btnNumber0);

        txtAnswer = (TextView) findViewById(R.id.txtAnswer);
        txtInput = (TextView) findViewById(R.id.txtInput);
        txtSign = (TextView) findViewById(R.id.txtSign);
    }
}
