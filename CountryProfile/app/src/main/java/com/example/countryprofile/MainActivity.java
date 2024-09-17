package com.example.countryprofile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bangladeshButton, indiaButton, pakistanButton;
    private Intent intent;

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
        bangladeshButton=findViewById(R.id.bangladesh_Button_id);
        indiaButton=findViewById(R.id.india_Button_id);
        pakistanButton=findViewById(R.id.pakistan_Button_id);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bangladesh_Button_id){
            intent=new Intent(MainActivity.this,countryHistory.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }
        if(v.getId()==R.id.india_Button_id){
            intent=new Intent(MainActivity.this,countryHistory.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }
        if(v.getId()==R.id.pakistan_Button_id){
            intent=new Intent(MainActivity.this,countryHistory.class);
            intent.putExtra("name","pakistan");
            startActivity(intent);
        }

    }
}