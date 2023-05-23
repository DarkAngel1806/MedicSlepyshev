package com.example.medicslepyshev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button but1 = findViewById(R.id.button2);
        EditText edit = findViewById(R.id.editTextTextEmailAddress);

        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String email = edit.getText().toString();
                if (email.contains("@") & email.contains(".")) {
                    but1.setBackgroundColor(getResources().getColor(R.color.blue2));
                    but1.setEnabled(true);
                    but1.setClickable(true);

                } else {
                    but1.setBackgroundColor(getResources().getColor(R.color.blue));

                }
            }
        });
    }
    public void onClickHandler4(View view) {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}