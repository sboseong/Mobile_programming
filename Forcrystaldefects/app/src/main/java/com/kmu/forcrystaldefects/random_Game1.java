package com.kmu.forcrystaldefects;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class random_Game1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random__game1);
    }

    public void backtomain(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
