package com.example.ex084;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class nextActivity extends AppCompatActivity {
    Button back;
    LinearLayout color2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        color2 = (LinearLayout) findViewById(R.id.color2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"White");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Black)
            color2.setBackgroundColor(Color.BLACK);
        if (id == R.id.Blue)
            color2.setBackgroundColor(Color.BLUE);
        if (id == R.id.Red)
            color2.setBackgroundColor(Color.RED);
        if (id == 0)
            color2.setBackgroundColor(Color.WHITE);
        return true;
    }

    public void back(View view) {
        finish();
    }
}