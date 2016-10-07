package com.example.mahe.humble_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_page);
    }
    public void switchProfile(View view) {

        Intent intent = new Intent(this, ProfilePage.class);
        startActivity(intent);
    }

    public void switchSearch(View view) {

        Intent intent = new Intent(this, SearchPage.class);
        startActivity(intent);
    }

    public void switchHome(View view) {

        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void letscontribue(View view)
    {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }







}
