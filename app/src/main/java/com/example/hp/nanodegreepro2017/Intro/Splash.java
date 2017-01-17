package com.example.hp.nanodegreepro2017.Intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.nanodegreepro2017.R;

public class Splash extends AppCompatActivity {


    private ImageView imageView;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        imageView = (ImageView) findViewById(R.id.logo);
        button = (Button) findViewById(R.id.skip);
        textView = (TextView) findViewById(R.id.editText);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);

            }
        });


      /*  {
            "rules": {
            ".read": true,
                    ".write": true,
                    "users": {
                "$user": {
                    "name": {
                        ".validate": "newData.isString() && newData.val().length < 50"
                    },
                    "email": {
                        ".validate": "newData.isString() && newData.val().matches(/^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$/i)"
                    }
                }
            }
        }
        }*/

    }
}
