package com.example.trainbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        ImageButton imageButtonDefault1 = (ImageButton)findViewById(R.id.imageButtonDefault1);

        imageButtonDefault1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutUs.this,Info.class));
            }
        });

        ImageButton imageButtonDefault2 = (ImageButton)findViewById(R.id.imageButtonDefault2);

        imageButtonDefault2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutUs.this,Profile.class));
            }
        });

        ImageButton imageButtonDefault3 = (ImageButton)findViewById(R.id.imageButtonDefault3);

        imageButtonDefault3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AboutUs.this,MainActivity.class));
            }
        });
    }
}