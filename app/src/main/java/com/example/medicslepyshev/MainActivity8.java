package com.example.medicslepyshev;

import static android.content.Intent.EXTRA_COMPONENT_NAME;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.jar.Attributes;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Button button = findViewById(R.id.buttonSozdat);
        EditText editText1 = findViewById(R.id.Name);
        EditText editText2 = findViewById(R.id.Birthsday);
        EditText editText3 = findViewById(R.id.Otchestco);
        EditText editText4 = findViewById(R.id.Familiay);
        Spinner spinner = findViewById(R.id.Pol);

        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @SuppressLint("ResourceAsColor")
            @Override
            public void afterTextChanged(Editable s) {
                String name = editText1.getText().toString();
                String otchestvo = editText3.getText().toString();
                String familiay = editText4.getText().toString();
                String birthsday = editText2.getText().toString();
                if (name.isEmpty() & otchestvo.isEmpty() & familiay.isEmpty() & birthsday.isEmpty()) {
                    button.setBackgroundColor(R.color.blue);
                } else {
                    button.setBackgroundColor(R.color.blue2);
                    button.setEnabled(true);
                    button.setClickable(true);
                }
            }
        });

    }
    public void onClickHandler8(View view) {
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);
    }
}