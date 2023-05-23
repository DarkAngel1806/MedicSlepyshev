package com.example.medicslepyshev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    private TextView mTimer;
    private TextView povtor;
    private CountDownTimer countDownTimer;
    private long timeLeftInMillis = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mTimer = (TextView) findViewById(R.id.textView8);
        povtor = (TextView) findViewById(R.id.textView10);

        startTimer();

        povtor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetTimer();
            }
        });

        final EditText editText1 = findViewById(R.id.editTextNumber1);
        final EditText editText2 = findViewById(R.id.editTextNumber2);
        final EditText editText3 = findViewById(R.id.editTextNumber3);
        final EditText editText4 = findViewById(R.id.editTextNumber4);
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == editText1.length()) {
                    editText2.requestFocus();
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == editText2.length()) {
                    editText3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == editText3.length()) {
                    editText4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        String num1Str = editText1.getText().toString();
        String num2Str = editText2.getText().toString();
        String num3Str = editText3.getText().toString();
        String num4Str = editText4.getText().toString();

        int num1 = num1Str.isEmpty() ? 0 : Integer.parseInt(num1Str);
        int num2 = num2Str.isEmpty() ? 0 : Integer.parseInt(num2Str);
        int num3 = num3Str.isEmpty() ? 0 : Integer.parseInt(num3Str);
        int num4 = num4Str.isEmpty() ? 0 : Integer.parseInt(num4Str);

        String result = String.format("%d%d%d%d", num1, num2, num3, num4);
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                mTimer.setText("будет через " + millisUntilFinished / 1000 + " секунд");
                povtor.setEnabled(false);
            }

            public void onFinish() {
                povtor.setTextColor(getResources().getColor(R.color.blue2));
                povtor.setEnabled(true);
            }
        }.start();

    }

    private void resetTimer() {
        countDownTimer.cancel();
        timeLeftInMillis = 6000;
        mTimer.setText("будет через " + timeLeftInMillis / 1000 + " секунд");
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                mTimer.setText("будет через " + millisUntilFinished / 1000 + " секунд");
                povtor.setEnabled(false);
                povtor.setTextColor(getResources().getColor(R.color.blue));
            }

            public void onFinish() {
                povtor.setTextColor(getResources().getColor(R.color.blue2));
                povtor.setEnabled(true);
            }
        }.start();
    }

    public void onClickHandler5(View view) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void onClickHandler6(View view) {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
}