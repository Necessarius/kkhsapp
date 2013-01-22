package com.android.kkhsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        final Button button1 = (Button) findViewById(R.id.studentnews);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent news = new Intent().setClass(MainActivity.this, NewsActivity.class);
                startActivity(news);
            }
        });
        final Button button2 = (Button) findViewById(R.id.useful_links);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent links = new Intent().setClass(MainActivity.this, LinksActivity.class);
                startActivity(links);
            }
        });

        final Button button3 = (Button) findViewById(R.id.calendar);
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent calendar = new Intent().setClass(MainActivity.this, Calendar.class);
                startActivity(calendar);
            }
        });
        final Button button4 = (Button) findViewById(R.id.about);
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent about = new Intent().setClass(MainActivity.this, AboutActivity.class);
                startActivity(about);
            }
        });

        final Button button5 = (Button) findViewById(R.id.credits);
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent credits = new Intent().setClass(MainActivity.this, CreditsActivity.class);
                startActivity(credits);
            }
        });
    }
}
