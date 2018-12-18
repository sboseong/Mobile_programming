package com.kmu.forcrystaldefects;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.Random;
import android.app.AlertDialog;
import android.widget.Button;
import android.widget.ImageButton;

public class random_Game2 extends Activity {

    final int Default_number = 12;
    int[] bombs = new int[Default_number];
    ImageButton tmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random__game2);

        for (int i = 0; i < Default_number; i++){
            bombs[i] = 0;
        }

        Random rnd = new Random();
        int tmp = rnd.nextInt(bombs.length);

        bombs[tmp] = 1;

    }

    public void onClick(View view){
        switch (view.getId()) {
            case R.id.b1:
                if (bombs[0] != 0){
                    Log.v("problem",": 1");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b1);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
            case R.id.b2:
                if (bombs[1] != 0){
                    Log.v("problem",": 2");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b2);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
            case R.id.b3:
                if (bombs[2] != 0){
                    Log.v("problem",": 3");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b3);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
            case R.id.b4:
                if (bombs[3] != 0){
                    Log.v("problem",": 4");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b4);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
            case R.id.b5:
                if (bombs[4] != 0){
                    Log.v("problem",": 5");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b5);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
            case R.id.b6:
                if (bombs[5] != 0){
                    Log.v("problem",": 6");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b6);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
            case R.id.b7:
                if (bombs[6] != 0){
                    Log.v("problem",": 7");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b7);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
            case R.id.b8:
                if (bombs[7] != 0){
                    Log.v("problem",": 8");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b8);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
            case R.id.b9:
                if (bombs[8] != 0){
                    Log.v("problem",": 9");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b9);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
            case R.id.b10:
                if (bombs[9] != 0){
                    Log.v("problem",": 10");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b10);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
            case R.id.b11:
                if (bombs[10] != 0){
                    Log.v("problem",": 11");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b11);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
            case R.id.b12:
                if (bombs[11] != 0){
                    Log.v("problem",": 12");
                    BOOM();}
                else {
                    tmp = (ImageButton) findViewById(R.id.b12);
                    tmp.setImageResource(R.drawable.circle);
                }
                break;
        }
    }

    public void backtomain(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void BOOM(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("꽝!  폭 탄 이 터 졌 습 니 다.")
                .setPositiveButton("확인(초기화)", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
