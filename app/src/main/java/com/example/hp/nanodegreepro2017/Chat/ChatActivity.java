package com.example.hp.nanodegreepro2017.Chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.hp.nanodegreepro2017.R;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {

    private EditText messageEditText;
    private String user1 = "user1";
    private String user2 = "user2";
    private String counter1;
    public static ArrayList<String> chatlist;
    public static chatAdapter chatAdapter;
    ListView msgListView;

    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_chat);

        messageEditText = (EditText) findViewById(R.id.messageEditText);
        msgListView = (ListView) findViewById(R.id.msgListView);
        ImageView sendImage = (ImageView) findViewById(R.id.sendMessageImage);  // is send button


        sendImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sendTextMessage();
            }
        });


    }
    //here i tried to alternate turns between user1 & user2

   /* public void sendTextMessage() {
        String message = messageEditText.getEditableText().toString();
        String[] counter = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

        for (int i = 0; counter.length(); i++) {
            int value = 0;
            String str = Integer.toString(value);  // type casting
            if (((counter[i]) % str ) == 0) {
                counter1 = counter[i];

                //user1 sends message
                messageContent chatMessage = new messageContent(user1, user2, message, counter1, true);
                chatlist.add(messageEditText.getText().toString());
                ArrayList<messageContent> messageContents = new ArrayList<>();
                chatAdapter = new chatAdapter(ChatActivity.this, messageContents);
                msgListView.setAdapter(chatAdapter);
                chatAdapter.notifyDataSetChanged();

                }
            else {
                //user 2 sends message
                messageContent chatMessage = new messageContent(user1, user2, message, counter1, true);
                chatlist.add(messageEditText.getText().toString());
                ArrayList<messageContent> messageContents = new ArrayList<>();
                chatAdapter = new chatAdapter(ChatActivity.this, messageContents);
                msgListView.setAdapter(chatAdapter);
                chatAdapter.notifyDataSetChanged();

            }
        }
    }*/
}


