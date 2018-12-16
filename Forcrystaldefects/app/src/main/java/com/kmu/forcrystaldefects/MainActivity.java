package com.kmu.forcrystaldefects;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Dart(View view)
    {
        Intent intent = new Intent(this, Game1.class);
        startActivity(intent);
    }

    public void Game2(View view)
    {
        Intent intent = new Intent(this, Game2.class);
        startActivity(intent);
    }

    public void random_Game1(View view)
    {
        Intent intent = new Intent(this, random_Game1.class);
        startActivity(intent);
    }

    public void random_Game2(View view)
    {
        Intent intent = new Intent(this, random_Game2.class);
        startActivity(intent);
    }

    public void random_Game3(View view)
    {
        Intent intent = new Intent(this, random_Game3.class);
        startActivity(intent);
    }
}
