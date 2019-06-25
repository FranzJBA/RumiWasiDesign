    package com.example.rumiwasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void Register(View view){
        Intent Register = new Intent(this,RegisterActivity.class);
        startActivity(Register);
        finish();
    }
}
