package com.example.ibm_calculator;

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
    private EditText edWeight, edHeightFt,edHeightIn;
    private Button btnCal;
    private TextView textResult;

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
        edWeight=findViewById(R.id.weight_id);
        edHeightFt=findViewById(R.id.heightFt_id);
        edHeightIn=findViewById(R.id.hightIn_id);
        btnCal=findViewById(R.id.button_id);
        textResult=findViewById(R.id.text_id);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String weight_str=edWeight.getText().toString();
                    int weight=Integer.parseInt(weight_str);

                    int heightFt=Integer.parseInt(edHeightFt.getText().toString());
                    int heightIn=Integer.parseInt(edHeightIn.getText().toString());

                    int totalIn=heightFt*12+heightIn;

                    double totalCm=totalIn*2.53;

                    double totalM=totalCm/100;

                    double bmi=weight/(totalM*totalM);

                    if(bmi>25){
                        textResult.setText("you are OverWeight");
                    } else if (bmi<18) {
                        textResult.setText("you are UnderWeight");
                    }else{
                        textResult.setText("you are healthy");
                    }
                }
                catch ( Exception exception){
                    Toast.makeText(MainActivity.this,"Sorry sonjoy das",Toast.LENGTH_SHORT).show();
                }
                
            }
        });
    }
}