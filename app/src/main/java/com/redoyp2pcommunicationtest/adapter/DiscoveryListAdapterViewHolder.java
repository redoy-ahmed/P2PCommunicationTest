package com.redoyp2pcommunicationtest.adapter;

import android.view.View;
import android.widget.TextView;

import com.redoyp2pcommunicationtest.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DiscoveryListAdapterViewHolder {

    @BindView(R.id.discovered_device_name_text_view)
    TextView deviceNameTextView;

    @BindView(R.id.discovered_device_status_text_view)
    TextView deviceStatusTextView;

    public DiscoveryListAdapterViewHolder(View view) {
        ButterKnife.bind(this, view);
    }
}
