package com.example.countryprofile;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class countryHistory extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_country_history);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageView=findViewById(R.id.history_image_view_id);
        textView=findViewById(R.id.history_text_view_id);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String country=bundle.getString("name");
            //this is method
            showDetails(country);
        }

    }
    void showDetails(String value){
        if(value.equals("bangladesh")){
            imageView.setImageResource(R.drawable.bangladesh_parliament);
            textView.setText(R.string.bangladesh_history);
        }
        if(value.equals("india")){
            imageView.setImageResource(R.drawable.indian_parliament);
            textView.setText(R.string.india_history);
        }
        if(value.equals("pakistan")){
            imageView.setImageResource(R.drawable.pakistan_parliament);
            textView.setText(R.string.pakistan_history);
        }
    }
}