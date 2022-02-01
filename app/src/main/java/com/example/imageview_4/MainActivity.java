package com.example.imageview_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iv;
    int rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        iv = findViewById(R.id.image1);
    }

    public void clicking(View view) {
        rnd = (int) (101 * Math.random()) % 3 + 1;
        btn.setText("click for image: " + rnd);
        if (rnd == 1) {
            iv.setImageResource(R.drawable.tenniscourt1); }
        else if (rnd == 2) {
            iv.setImageResource(R.drawable.tenniscourt2); }
        else {
            iv.setImageResource(R.drawable.tenniscourt3); }
    }
}