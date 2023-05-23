package com.example.medicslepyshev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    Button knopka1;
    Button knopka2;
    Button knopka3;
    Button knopka4;
    Button knopka5;
    Button knopka6;
    Button knopka7;
    Button knopka8;
    Button knopka9;
    Button knopka0;
    ImageView n1;
    ImageView n2;
    ImageView n3;
    ImageView n4;
    ImageView back;
    String kod="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        knopka1=findViewById(R.id.button4);
        knopka2=findViewById(R.id.button5);
        knopka3=findViewById(R.id.button6);
        knopka4=findViewById(R.id.button7);
        knopka5=findViewById(R.id.button8);
        knopka6=findViewById(R.id.button9);
        knopka7=findViewById(R.id.button10);
        knopka8=findViewById(R.id.button11);
        knopka9=findViewById(R.id.button12);
        knopka0=findViewById(R.id.button14);
        back=findViewById(R.id.imageButton2);
        knopka1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"1";
                    n1=findViewById(R.id.imageView5);
                    n1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"1";
                    n2=findViewById(R.id.imageView6);
                    n2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"1";
                    n3=findViewById(R.id.imageView7);
                    n3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"1";
                    n4=findViewById(R.id.imageView8);
                    n4.setImageResource(R.drawable.el);
                    onClickHandler7();
                }

            }
        });
        knopka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"2";
                    n1=findViewById(R.id.imageView5);
                    n1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"2";
                    n2=findViewById(R.id.imageView6);
                    n2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"2";
                    n3=findViewById(R.id.imageView7);
                    n3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"2";
                    n4=findViewById(R.id.imageView8);
                    n4.setImageResource(R.drawable.el);
                    onClickHandler7();
                }
            }
        });
        knopka3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"3";
                    n1=findViewById(R.id.imageView5);
                    n1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"3";
                    n2=findViewById(R.id.imageView6);
                    n2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"3";
                    n3=findViewById(R.id.imageView7);
                    n3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"3";
                    n4=findViewById(R.id.imageView8);
                    n4.setImageResource(R.drawable.el);
                    onClickHandler7();
                }
            }
        });
        knopka4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"4";
                    n1=findViewById(R.id.imageView5);
                    n1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"4";
                    n2=findViewById(R.id.imageView6);
                    n2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"4";
                    n3=findViewById(R.id.imageView7);
                    n3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"4";
                    n4=findViewById(R.id.imageView8);
                    n4.setImageResource(R.drawable.el);
                    onClickHandler7();
                }
            }
        });
        knopka5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"5";
                    n1=findViewById(R.id.imageView5);
                    n1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"5";
                    n2=findViewById(R.id.imageView6);
                    n2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"5";
                    n3=findViewById(R.id.imageView7);
                    n3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"5";
                    n4=findViewById(R.id.imageView8);
                    n4.setImageResource(R.drawable.el);
                    onClickHandler7();
                }
            }
        });

        knopka6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"6";
                    n1=findViewById(R.id.imageView5);
                    n1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"6";
                    n2=findViewById(R.id.imageView6);
                    n2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"6";
                    n3=findViewById(R.id.imageView7);
                    n3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"6";
                    n4=findViewById(R.id.imageView8);
                    n4.setImageResource(R.drawable.el);
                    onClickHandler7();
                }
            }
        });
        knopka7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"7";
                    n1=findViewById(R.id.imageView5);
                    n1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"7";
                    n2=findViewById(R.id.imageView6);
                    n2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"7";
                    n3=findViewById(R.id.imageView7);
                    n3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"7";
                    n4=findViewById(R.id.imageView8);
                    n4.setImageResource(R.drawable.el);
                    onClickHandler7();
                }
            }
        });
        knopka8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"8";
                    n1=findViewById(R.id.imageView5);
                    n1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"8";
                    n2=findViewById(R.id.imageView6);
                    n2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"8";
                    n3=findViewById(R.id.imageView7);
                    n3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"8";
                    n4=findViewById(R.id.imageView8);
                    n4.setImageResource(R.drawable.el);
                    onClickHandler7();
                }
            }
        });
        knopka9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"9";
                    n1=findViewById(R.id.imageView5);
                    n1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"9";
                    n2=findViewById(R.id.imageView6);
                    n2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"9";
                    n3=findViewById(R.id.imageView7);
                    n3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"9";
                    n4=findViewById(R.id.imageView8);
                    n4.setImageResource(R.drawable.el);
                    onClickHandler7();
                }
            }
        });

        knopka0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                    kod=kod+"0";
                    n1=findViewById(R.id.imageView5);
                    n1.setImageResource(R.drawable.el);
                }
                else if(kod.length()==1){
                    kod=kod+"0";
                    n2=findViewById(R.id.imageView6);
                    n2.setImageResource(R.drawable.el);
                }
                else if(kod.length()==2){
                    kod=kod+"0";
                    n3=findViewById(R.id.imageView7);
                    n3.setImageResource(R.drawable.el);
                }
                else if(kod.length()==3){
                    kod=kod+"0";
                    n4=findViewById(R.id.imageView8);
                    n4.setImageResource(R.drawable.el);
                    onClickHandler7();
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kod.length()==0){
                }
                else if (kod.length()==1){
                    kod="";
                    n2=findViewById(R.id.imageView5);
                    n2.setImageResource(R.drawable.ellipse);
                }
                else if (kod.length()==2){
                    kod=kod.substring(0, kod.length()-1);
                    n3=findViewById(R.id.imageView6);
                    n3.setImageResource(R.drawable.ellipse);
                }
                else if (kod.length()==3){
                    kod=kod.substring(0, kod.length()-1);
                    n4=findViewById(R.id.imageView7);
                    n4.setImageResource(R.drawable.ellipse);
                }
                else if (kod.length()==4){
                    kod=kod.substring(0, kod.length()-1);
                    n4=findViewById(R.id.imageView8);
                    n4.setImageResource(R.drawable.ellipse);
                }
                Toast.makeText(MainActivity7.this, kod, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onClickHandler7() {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}

