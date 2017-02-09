package com.example.rm31544.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView)findViewById(R.id.imgAnimada);
        img.setBackgroundResource(R.drawable.hadouken_animation);
        AnimationDrawable frameAnimation = (AnimationDrawable)
                img.getBackground();
        frameAnimation.start();
    }
}
