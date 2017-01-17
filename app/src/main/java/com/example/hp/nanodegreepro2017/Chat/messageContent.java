package com.example.hp.nanodegreepro2017.Chat;

import java.util.Random;

/**
 * Created by HP on 14/01/2017.
 */

public class messageContent {
    public String sender;  //user1
    public String receiver;   //user2
    public String content;   //message content
    public String counter;
    public boolean isMine;// this boolean for me if i send the message

    public messageContent(String Sender, String Receiver, String messageString, String role, boolean isMINE) {
        content = messageString;
        isMine = isMINE;
        sender = Sender;
        receiver = Receiver;
        counter = role;


    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }
}
