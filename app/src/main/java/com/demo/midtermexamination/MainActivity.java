package com.demo.midtermexamination;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgOne = findViewById(R.id.imageView1);
        ImageView imgTwo = findViewById(R.id.imageView2);
        ImageView imgThree = findViewById(R.id.imageView3);
        ImageView imgFour = findViewById(R.id.imageView4);

        imgOne.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityOne.class);
                startActivity(intent);
            }
        });
        imgTwo.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(intent);
            }
        });
        imgThree.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityThree.class);
                startActivity(intent);
            }
        });
        imgFour.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityFour.class);
                startActivity(intent);
            }
        });





    }
}
