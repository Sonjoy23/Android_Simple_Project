package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private TextView textView2;
    private Button buttonClr,buttonOk;

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
        editText1=(EditText) findViewById(R.id.edit_Text_Id1);
        textView2=(TextView) findViewById(R.id.textViewId);

        buttonClr=(Button) findViewById(R.id.button_id1);
        buttonOk=(Button) findViewById(R.id.button_id2);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText("");
                try{
                    if(v.getId()==R.id.button_id2){
                        String str1=editText1.getText().toString();
                        int num=Integer.parseInt(str1);
                        for(int i=1; i<=10; i++){
                            int result=num*i;
                            textView2.append(num+" x "+i+" = "+result+"\n");
                        }

                    }
                }
                catch ( Exception e ){
                    Toast.makeText(MainActivity.this, "Something is wrong ", Toast.LENGTH_SHORT).show();

                }

            }
        });
        buttonClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
                textView2.setText("");

            }
        });




    }

}