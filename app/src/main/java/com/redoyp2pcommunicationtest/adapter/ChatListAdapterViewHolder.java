package com.redoyp2pcommunicationtest.adapter;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.redoyp2pcommunicationtest.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChatListAdapterViewHolder {

    @BindView(R.id.message_received_layout)
    RelativeLayout messageReceivedLayout;

    @BindView(R.id.message_received_text_view)
    TextView messageReceivedTextView;

    @BindView(R.id.message_sent_layout)
    RelativeLayout messageSentLayout;

    @BindView(R.id.message_sent_text_view)
    TextView messageSentTextView;

    public ChatListAdapterViewHolder(View view) {
        ButterKnife.bind(this, view);
    }
}
