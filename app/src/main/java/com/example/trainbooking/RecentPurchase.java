package com.example.trainbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RecentPurchase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent_purchase);

        ImageButton imageButtonDefault1 = (ImageButton)findViewById(R.id.imageButtonDefault1);

        imageButtonDefault1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecentPurchase.this,Profile.class));
            }
        });

        ImageButton imageButtonDefault2 = (ImageButton)findViewById(R.id.imageButtonDefault2);

        imageButtonDefault2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecentPurchase.this,Info.class));
            }
        });

        ImageButton imageButtonDefault3 = (ImageButton)findViewById(R.id.imageButtonDefault3);

        imageButtonDefault3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecentPurchase.this,MainActivity.class));
            }
        });

        ImageButton imageButton1 = (ImageButton)findViewById(R.id.imageButton1);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecentPurchase.this,Receipt.class));
            }
        });

        ImageButton imageButton2 = (ImageButton)findViewById(R.id.imageButton2);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecentPurchase.this,Receipt.class));
            }
        });

        ImageButton imageButton3 = (ImageButton)findViewById(R.id.imageButton3);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RecentPurchase.this,Receipt.class));
            }
        });
    }
}