package com.example.hp.nanodegreepro2017.Intro;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.hp.nanodegreepro2017.R;

public class Settings extends AppCompatActivity {

    TextView textView1 , textView2;
    Button button1, button2;
    Typeface tf1,tf2,tf3,tf4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

      //here i was training to make format settings to manage all texts in app , but unfortunately there is no time.

        textView1 = (TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
        button1 = (Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);

        tf1 = Typeface.createFromAsset(getAssets(),"Amarillo.ttf");
        tf2 = Typeface.createFromAsset(getAssets(),"Angeline Vintage_Demo.ttf");
        tf3 = Typeface.createFromAsset(getAssets(),"RemachineScript_Personal_Use.ttf");
        tf4 = Typeface.createFromAsset(getAssets(),"The Fabulous Orchestra.ttf");

        textView1.setTypeface(tf1);
        textView2.setTypeface(tf2);
        button1.setTypeface(tf3);
        button2.setTypeface(tf4);



    }
}
