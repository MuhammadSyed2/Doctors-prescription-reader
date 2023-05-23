package com.example.dpr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private RelativeLayout mListLayout;
   private ImageView mimageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mimageView1 = findViewById(R.id.getStarted);


        mListLayout = findViewById(R.id.layout);

        mimageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharedIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(sharedIntent);
            }
        });
    }
}
