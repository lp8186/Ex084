package com.example.ex084;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout color;
    Intent move1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color = (LinearLayout) findViewById(R.id.color);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id==R.id.Black)
            color.setBackgroundColor(Color.BLACK);
        if (id==R.id.Blue)
            color.setBackgroundColor(Color.BLUE);
        if (id==R.id.Red)
            color.setBackgroundColor(Color.RED);
        return true;
    }


    public void move(View view) {
        move1 = new Intent(this,nextActivity.class);
        startActivity(move1);
    }
}