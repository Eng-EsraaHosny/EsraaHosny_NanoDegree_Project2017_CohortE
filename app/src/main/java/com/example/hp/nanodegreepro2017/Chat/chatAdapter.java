package com.example.hp.nanodegreepro2017.Chat;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hp.nanodegreepro2017.R;

import java.util.ArrayList;

/**
 * Created by HP on 14/01/2017.
 */

public class chatAdapter extends BaseAdapter {

    public ArrayList<messageContent> list;
    private Context context;
    private LayoutInflater layoutInflater;

    private int layout;

    public chatAdapter(Context context, ArrayList<messageContent> list) {
        this.list = list;
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        /* Set default layout to portrait */
        layout = R.layout.chat_item1;
    }

    public void setOrientation(int orientation) {

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            layout = R.layout.chat_item2;
        } else {
            layout = R.layout.chat_item1;
        }

        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(layout, parent, false);
        }
        messageContent message = (messageContent) this.getItem(position);
        TextView msg = (TextView) view.findViewById(R.id.message_text);
        msg.setText(message.content);


        // if message is mine then align to right
        if (message.isMine) {
            setOrientation(R.layout.chat_item2);
        }
        // If not mine then align to left
        else {
            setOrientation(R.layout.chat_item1);

        }
        msg.setTextColor(Color.BLACK);
        list.add(message);
        return view;

    }
}



