package com.example.hp.nanodegreepro2017.SMS;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.hp.nanodegreepro2017.R;

import java.util.ArrayList;

public class SMSActivity extends AppCompatActivity {

    ListView listMessage;
    EditText messageedit;
    ArrayAdapter<String> adapter;
    ImageView send,emotions1;
    ArrayList<String> strings;

   // EmojiconEditText editText;
   // EmojiconTextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
       // messageedit = (EditText) findViewById(R.id.messageedit);
        listMessage = (ListView) findViewById(R.id.listMessage);
        emotions1 = (ImageView)findViewById(R.id.emotions1);
        send = (ImageView) findViewById(R.id.send);


        strings = new ArrayList<>();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        listMessage.setAdapter(adapter);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String messages = messageedit.getText().toString();
                // Now add it to the list
                strings.add(messages);

                // And finally, update the list
                adapter.notifyDataSetChanged();

            }
        });
       /* emotions1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }
}