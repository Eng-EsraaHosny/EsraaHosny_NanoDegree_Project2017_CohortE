package com.example.hp.nanodegreepro2017.Intro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.nanodegreepro2017.Email.Login;
import com.example.hp.nanodegreepro2017.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

import static android.content.Intent.getIntent;

/**
 * Created by HP on 15/01/2017.
 */

public class contactAdapter extends BaseAdapter {

    Context context;
    ArrayList<Contact> contacts;


    public contactAdapter(Context context, ArrayList<Contact> contacts) {
        this.context = context;
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_item, parent, false);
        }

        final Contact currentContact = (Contact) this.getItem(position);

        final TextView name = (TextView) convertView.findViewById(R.id.ContactName);
        name.setText(currentContact.getName());

        final TextView phone = (TextView) convertView.findViewById(R.id.phoneNumber);
        phone.setText(currentContact.getPhone());

        final TextView email = (TextView) convertView.findViewById(R.id.emailAddress);
        email.setText(currentContact.getEmail());

        final TextView address = (TextView) convertView.findViewById(R.id.address);
        address.setText(currentContact.getAddress());

        // part of image of listView_item layout
        final ImageView ivContactImage = (ImageView) convertView.findViewById(R.id.ivContactImage);
        // ivContactImage.setImageURI(currentContact.getImageURI());



        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(context,currentContact.getName(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, ContactDetails.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("address", address.getText().toString());

                // intent.putExtra("image",onActivityResult());
                context.startActivity(intent);

            }
        });
        ImageView imageOfCall = (ImageView) convertView.findViewById(R.id.callimage);
        imageOfCall.setImageResource(R.drawable.call);
        imageOfCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Bundle extras = getIntent().getExtras();
                //this phone number we get it from contact phone in firebase as extension of this app
                // intent.setData(Uri.parse("tel:123"));
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:123"));
                //this part is trying to get contact phone by bundle
               // String getPhone = intent.getString("phone");
                //intent.setData(Uri.parse(getPhone));
                context.startActivity(intent);

            }
        });
        return convertView;
    }
}
