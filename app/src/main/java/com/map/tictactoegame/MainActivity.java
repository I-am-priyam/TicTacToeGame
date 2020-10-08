package com.map.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int ch=0;
    Button bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9,resb;
    TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bn1=findViewById(R.id.b1);
        bn2=findViewById(R.id.b2);
        bn3=findViewById(R.id.b3);
        bn4=findViewById(R.id.b4);
        bn5=findViewById(R.id.b5);
        bn6=findViewById(R.id.b6);
        bn7=findViewById(R.id.b7);
        bn8=findViewById(R.id.b8);
        bn9=findViewById(R.id.b9);
        resb=findViewById(R.id.button10);

        tv1=findViewById(R.id.textView2);
        tv2=findViewById(R.id.textView);

        bn1.setOnClickListener(this);
        bn2.setOnClickListener(this);
        bn3.setOnClickListener(this);
        bn4.setOnClickListener(this);
        bn5.setOnClickListener(this);
        bn6.setOnClickListener(this);
        bn7.setOnClickListener(this);
        bn8.setOnClickListener(this);
        bn9.setOnClickListener(this);
        resb.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.b1:
                if(ch%2==0){
                    bn1.setText("X");
                    bn1.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 2");
                }
                else {
                    bn1.setText("O");
                    bn1.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 1");
                }
                break;
            case R.id.b2:
                if(ch%2==0){
                    bn2.setText("X");
                    bn2.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 2");
                }
                else {
                    bn2.setText("O");
                    bn2.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 1");
                }
                break;
            case R.id.b3:
                if(ch%2==0){
                    bn3.setText("X");
                    bn3.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 2");
                }
                else {
                    bn3.setText("O");
                    bn3.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 1");
                }
                break;
            case R.id.b4:
                if(ch%2==0){
                    bn4.setText("X");
                    bn4.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 2");
                }
                else {
                    bn4.setText("O");
                    bn4.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 1");
                }
                break;
            case R.id.b5:
                if(ch%2==0){
                    bn5.setText("X");
                    bn5.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 2");
                }
                else {
                    bn5.setText("O");
                    bn5.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 1");
                }
                break;
            case R.id.b6:
                if(ch%2==0){
                    bn6.setText("X");
                    bn6.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 2");
                }
                else {
                    bn6.setText("O");
                    bn6.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 1");
                }
                break;
            case R.id.b7:
                if(ch%2==0){
                    bn7.setText("X");
                    bn7.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 2");
                }
                else {
                    bn7.setText("O");
                    bn7.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 1");
                }
                break;
            case R.id.b8:
                if(ch%2==0){
                    bn8.setText("X");
                    bn8.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 2");
                }
                else {
                    bn8.setText("O");
                    bn8.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 1");
                }
                break;
            case R.id.b9:
                if(ch%2==0){
                    bn9.setText("X");
                    bn9.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 2");
                }
                else {
                    bn9.setText("O");
                    bn9.setEnabled(false);
                    ch++;
                    tv1.setText("Chance of Player 1");
                }
                break;
            case R.id.button10:
                ch=0;
                bn1.setText("");
                bn2.setText("");
                bn3.setText("");
                bn4.setText("");
                bn5.setText("");
                bn6.setText("");
                bn7.setText("");
                bn8.setText("");
                bn9.setText("");

                bn1.setEnabled(true);
                bn2.setEnabled(true);
                bn3.setEnabled(true);
                bn4.setEnabled(true);
                bn5.setEnabled(true);
                bn6.setEnabled(true);
                bn7.setEnabled(true);
                bn8.setEnabled(true);
                bn9.setEnabled(true);
                tv2.setText("");
                break;

        }
        if(bn1.getText().toString().equals("X") && bn4.getText().toString().equals("X") && bn7.getText().toString().equals("X")){
            tv2.setText("Player 1 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn1.getText().toString().equals("X") && bn2.getText().toString().equals("X") && bn3.getText().toString().equals("X")){
            tv2.setText("Player 1 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn1.getText().toString().equals("X") && bn5.getText().toString().equals("X") && bn9.getText().toString().equals("X")){
            tv2.setText("Player 1 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn2.getText().toString().equals("X") && bn5.getText().toString().equals("X") && bn8.getText().toString().equals("X")){
            tv2.setText("Player 1 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn4.getText().toString().equals("X") && bn5.getText().toString().equals("X") && bn6.getText().toString().equals("X")){
            tv2.setText("Player 1 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn3.getText().toString().equals("X") && bn6.getText().toString().equals("X") && bn9.getText().toString().equals("X")){
            tv2.setText("Player 1 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn7.getText().toString().equals("X") && bn8.getText().toString().equals("X") && bn9.getText().toString().equals("X")){
            tv2.setText("Player 1 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }

        // For Player 2
        if(bn1.getText().toString().equals("O") && bn4.getText().toString().equals("O") && bn7.getText().toString().equals("O")){
            tv2.setText("Player 2 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn1.getText().toString().equals("O") && bn2.getText().toString().equals("O") && bn3.getText().toString().equals("O")){
            tv2.setText("Player 2 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn1.getText().toString().equals("O") && bn5.getText().toString().equals("O") && bn9.getText().toString().equals("O")){
            tv2.setText("Player 2 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn2.getText().toString().equals("O") && bn5.getText().toString().equals("O") && bn8.getText().toString().equals("O")){
            tv2.setText("Player 2 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn4.getText().toString().equals("O") && bn5.getText().toString().equals("O") && bn6.getText().toString().equals("O")){
            tv2.setText("Player 2 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn3.getText().toString().equals("O") && bn6.getText().toString().equals("O") && bn9.getText().toString().equals("O")){
            tv2.setText("Player 2 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }
        if(bn7.getText().toString().equals("O") && bn8.getText().toString().equals("O") && bn9.getText().toString().equals("O")){
            tv2.setText("Player 2 Won");
            bn1.setEnabled(false);
            bn2.setEnabled(false);
            bn3.setEnabled(false);
            bn4.setEnabled(false);
            bn5.setEnabled(false);
            bn6.setEnabled(false);
            bn7.setEnabled(false);
            bn8.setEnabled(false);
            bn9.setEnabled(false);
        }


    }
}
