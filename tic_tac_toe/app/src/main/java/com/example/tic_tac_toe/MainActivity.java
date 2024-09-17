package com.example.tic_tac_toe;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag=0;
    int count=0;
    boolean problem=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();



    }

    private void init(){
        btn1=findViewById(R.id.b1);
        btn2=findViewById(R.id.b2);
        btn3=findViewById(R.id.b3);
        btn4=findViewById(R.id.b4);
        btn5=findViewById(R.id.b5);
        btn6=findViewById(R.id.b6);
        btn7=findViewById(R.id.b7);
        btn8=findViewById(R.id.b8);
        btn9=findViewById(R.id.b9);
    }

    public void check(View view) {
        if (problem == false) {
            Button btnCurrent = (Button) view;
            if (btnCurrent.getText().toString().equals("")) {
                count++;
                if (flag == 0) {
                    btnCurrent.setText("X");
                    flag = 1;
                } else {
                    btnCurrent.setText("O");
                    flag = 0;
                }

                if (count > 4) {
                    b1 = btn1.getText().toString();
                    b2 = btn2.getText().toString();
                    b3 = btn3.getText().toString();
                    b4 = btn4.getText().toString();
                    b5 = btn5.getText().toString();
                    b6 = btn6.getText().toString();
                    b7 = btn7.getText().toString();
                    b8 = btn8.getText().toString();
                    b9 = btn9.getText().toString();

                    //conditions
                    if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                        problem = true;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "winner is " + b1, Toast.LENGTH_LONG).show();
                                newGame();
                            }
                        }, 4000);
                        //1
                    } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                        problem = true;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "winner is " + b4, Toast.LENGTH_LONG).show();
                                newGame();
                            }
                        }, 4000);
                        //2
                    } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                        problem = true;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "winner is " + b7, Toast.LENGTH_LONG).show();
                                newGame();
                            }
                        }, 4000);
                        //3
                    } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                        problem = true;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "winner is " + b1, Toast.LENGTH_LONG).show();
                                newGame();
                            }
                        }, 4000);
                        //4
                    } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                        problem = true;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "winner is " + b2, Toast.LENGTH_LONG).show();
                                newGame();
                            }
                        }, 4000);
                        //5
                    } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                        problem = true;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "winner is " + b3, Toast.LENGTH_LONG).show();
                                newGame();
                            }
                        }, 4000);
                        //6
                    } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                        problem = true;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "winner is " + b1, Toast.LENGTH_LONG).show();
                                newGame();
                            }
                        }, 4000);
                        //7
                    } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                        problem = true;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "winner is " + b3, Toast.LENGTH_LONG).show();
                                newGame();
                            }
                        }, 4000);
                        //8
                    } else if (!b1.equals("") && !b2.equals("") && !b3.equals("") &&
                            !b4.equals("") && !b5.equals("") && !b6.equals("") &&
                            !b7.equals("") && !b8.equals("") && !b9.equals("")) {
                        problem = true;
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(MainActivity.this, "Game is drawn", Toast.LENGTH_LONG).show();
                                newGame();
                            }
                        }, 4000);

                    }

                }
            }
        }
    }
    public void newGame(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag=0;
        count=0;
        problem=false;
    }


}