package com.example.hp.nanodegreepro2017.Intro;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.nanodegreepro2017.Call.CallActivity;
import com.example.hp.nanodegreepro2017.Chat.ChatActivity;
import com.example.hp.nanodegreepro2017.Email.Login;
import com.example.hp.nanodegreepro2017.NoteBook.Diary;
import com.example.hp.nanodegreepro2017.R;
import com.example.hp.nanodegreepro2017.SMS.SMSActivity;

public class ContactDetails extends AppCompatActivity {

    TextView textname, textphone, textemail, textaddress;
    ImageView imagesms, imagephone, imageemail, imagechat, imagePerson, imagenote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        textname = (TextView) findViewById(R.id.textname);
        textphone = (TextView) findViewById(R.id.textphone);
        textemail = (TextView) findViewById(R.id.textemail);
        textaddress = (TextView) findViewById(R.id.textaddress);

        imagesms = (ImageView) findViewById(R.id.imagesms);
        imagephone = (ImageView) findViewById(R.id.imagephone);
        imageemail = (ImageView) findViewById(R.id.imageemail);
        imagechat = (ImageView) findViewById(R.id.imagechat);
        imagenote = (ImageView) findViewById(R.id.imagenote);

        imagePerson = (ImageView) findViewById(R.id.imageView6);


        Bundle extras = getIntent().getExtras();
        String getName = extras.getString("name");
        String getPhone = extras.getString("phone");
        String getEmail = extras.getString("email");
        String getAddress = extras.getString("address");
        // ImageView image = this.getIntent().getParcelableExtra("BitmapImage");

        textname.setText("Name : " + getName);
        textphone.setText("Phone :" + getPhone);
        textemail.setText("Email : " + getEmail);
        textaddress.setText("Address : " + getAddress);

        phoneClick();
        chatClick();
        emailClick();
        smsClick();
        noteClick();

    }

    // if user wants to make a phone call
    public void phoneClick() {
        imagephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_call = new Intent(ContactDetails.this, CallActivity.class);
                startActivity(intent_call);
            }
        });
    }


    //if user wants to chat fis/her friend
    public void chatClick() {
        imagechat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactDetails.this, ChatActivity.class);
                startActivity(intent);

            }
        });
    }


    //if user wants to email fis/her friend
    public void emailClick() {
        imageemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent_email = new Intent(Intent.ACTION_SEND);
                intent_email.setData(Uri.parse("mail to : " + textname));
                intent_email.setType("text/plain");*/

                Intent intent = new Intent(ContactDetails.this, Login.class);
                startActivity(intent);
            }
        });
    }

    //if user wants to send sms to his/her friend
    public void smsClick() {
        imagesms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ContactDetails.this, SMSActivity.class);
                startActivity(intent);

            }
        });
    }

    public void noteClick() {
        imagenote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactDetails.this, Diary.class);
                startActivity(intent);
            }
        });
    }

}
