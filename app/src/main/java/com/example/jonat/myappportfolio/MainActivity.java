package com.example.jonat.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mPopular, mStock, mBuild, mMake, mGoUbiquitous,
            mCapstone;

    private TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPopular = (Button) findViewById(R.id.btn_popular_movies);
        mStock = (Button) findViewById(R.id.btn_stock_hawk);
        mBuild = (Button) findViewById(R.id.btn_build_it_bigger);
        mMake = (Button) findViewById(R.id.btn_make_your_app);
        mGoUbiquitous = (Button) findViewById(R.id.btn_go_ubiquitous);
        mCapstone = (Button) findViewById(R.id.btn_capstone);
        mTitle = (TextView) findViewById(R.id.title_textview);



        mPopular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Hey, you got a good taste!!", Toast.LENGTH_SHORT).show();
            }
        });

        mStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Stock Hawk World", Toast.LENGTH_SHORT).show();

            }
        });

        mBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Builders House", Toast.LENGTH_SHORT).show();
            }
        });

        mMake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Make your App Great", Toast.LENGTH_SHORT).show();
            }
        });

        mGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ubiquitous!!", Toast.LENGTH_SHORT).show();
            }
        });

        mCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Welcome to Capstone", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
