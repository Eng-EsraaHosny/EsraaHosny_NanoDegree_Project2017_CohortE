package com.example.hp.nanodegreepro2017.Call;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.hp.nanodegreepro2017.R;
import com.squareup.picasso.Picasso;

import java.net.URL;

public class CallActivity extends AppCompatActivity {


    ImageView image, image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        image2 = (ImageView) findViewById(R.id.image2);
        image = (ImageView) findViewById(R.id.image);
        String url = "http://valueaddedacademy.com/wp-content/uploads/2011/04/man_on_phone1-300x246.gif";
        Glide.with(CallActivity.this).load(url).into(image);


        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                //this phone number we get it from contact phone in firebase as extension of this app
                intent.setData(Uri.parse("tel:123"));
                startActivity(intent);

            }
        });

    }


}
