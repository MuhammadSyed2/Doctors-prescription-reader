package com.example.dpr;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SecondActivity extends AppCompatActivity {

private  RelativeLayout OCRLayout;
private  RelativeLayout SearchLayout;
    private ImageView add;
    private ImageView SearchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);

        SearchView = findViewById(R.id.searchView);
        add = findViewById(R.id.addImage);
        OCRLayout = findViewById(R.id.ocrLayout);
        SearchLayout = findViewById(R.id.searchLayout);

        OCRLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharedIntent = new Intent(SecondActivity.this, OCRActivity.class);
                startActivity(sharedIntent);
            }
        });
        SearchLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vv) {
                Intent sharedIntent = new Intent(SecondActivity.this, SearchActivity.class);
                startActivity(sharedIntent);
            }
        });
    }

}


/* private RelativeLayout mListLayout;
   private ImageView mimageView1;
   private TextView mgetStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mimageView1 = (ImageView) findViewById(R.id.getStarted);
        mgetStarted = (TextView) findViewById(R.id.textView);

        mListLayout = (RelativeLayout) findViewById(R.id.layout);

        mimageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharedIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(sharedIntent);
            }
        });*/
