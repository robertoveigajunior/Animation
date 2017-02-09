package com.example.rm31544.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText login;
    EditText password;
    Button dologin;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
        dologin = (Button) findViewById(R.id.dologin);
        dologin.setOnClickListener(onClickListener);

    }

    private void animate() {
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.shake);
        login.startAnimation(animation);
        password.startAnimation(animation);
        dologin.startAnimation(animation);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String log = login.getEditableText().toString();
            String pass = password.getEditableText().toString();
            if (log.equals("admin") && pass.equals("admin")) {
                Intent intent = new Intent(Login.this,MainActivity.class);
                startActivity(intent);
            } else {
                animate();
            }
        }
    };


}
