package com.kmu.forcrystaldefects;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.Random;

public class random_Game2 extends Activity {

    final int Default_number = 16;
    int[] bombs = new int[Default_number];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random__game2);

        for (int i = 0; i < Default_number; i++){
            bombs[i] = 0;
        }

        Random rnd = new Random();
        int tmp = rnd.nextInt(bombs.length);

    }

    public void backtomain(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
