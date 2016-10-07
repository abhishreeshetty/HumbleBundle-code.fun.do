package com.example.mahe.humble_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void switchProfile(View view) {

        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }

    public void switchSearch(View view) {

        Intent intent = new Intent(this, SearchPage.class);
        startActivity(intent);
    }



    public void switchNotification(View view) {

        Intent intent = new Intent(this, NotificationPage.class);
        startActivity(intent);
    }
}
