package com.example.mahe.humble_bundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PV3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pv3);
    }
    public void switchToLogin(View view) {

        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
