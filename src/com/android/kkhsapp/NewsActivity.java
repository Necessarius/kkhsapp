package com.android.kkhsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewsActivity extends Activity {

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null;
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);



        final Button button1 = (Button) findViewById(R.id.seniornews);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (isNetworkAvailable() == true) {
                    Intent senior_news = new Intent().setClass(NewsActivity.this, SeniorNews.class);
                    startActivity(senior_news);
                } else {
                    Toast.makeText(getApplicationContext(), "Please enable your network", Toast.LENGTH_LONG).show();
                }
            }
        });
        final Button button2 = (Button) findViewById(R.id.studentnews);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (isNetworkAvailable() == true) {
                    Intent student_news = new Intent().setClass(NewsActivity.this, StudentNews.class);
                    startActivity(student_news);
                } else {
                    Toast.makeText(getApplicationContext(), "Please enable your network", Toast.LENGTH_LONG).show();

                }
            }
        });
        final Button button3 = (Button) findViewById(R.id.parentnews);
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (isNetworkAvailable() == true) {
                    Intent parent_news = new Intent().setClass(NewsActivity.this, ParentNews.class);
                    startActivity(parent_news);
                } else {
                    Toast.makeText(getApplicationContext(), "Please enable your network", Toast.LENGTH_LONG).show();

                }
            }
        });

        final Button button4 = (Button) findViewById(R.id.counselornews);
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (isNetworkAvailable() == true) {
                    Intent counselor_news = new Intent().setClass(NewsActivity.this, CounselorNews.class);
                    startActivity(counselor_news);
                } else {
                    Toast.makeText(getApplicationContext(), "Please enable your network", Toast.LENGTH_LONG).show();

                }
            }
        });

        final Button button5 = (Button) findViewById(R.id.archives);
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (isNetworkAvailable() == true) {
                    Intent archives = new Intent().setClass(NewsActivity.this, ArchivesMenu.class);
                    startActivity(archives);
                } else {
                    Toast.makeText(getApplicationContext(), "Please enable your network", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}