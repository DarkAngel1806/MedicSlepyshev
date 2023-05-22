package com.example.medicslepyshev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        LinearLayout screen = (LinearLayout) findViewById(R.id.lin);

    }

    public void onClick(View v){
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);

    }

}