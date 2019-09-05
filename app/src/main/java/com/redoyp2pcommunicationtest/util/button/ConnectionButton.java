package com.redoyp2pcommunicationtest.util.button;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import com.redoyp2pcommunicationtest.R;
import com.redoyp2pcommunicationtest.listener.wifip2p.WifiP2pListener;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ConnectionButton extends AppCompatButton {

    private WifiP2pListener wifiP2pListener;
    private DiscoveryAndConnectionButtonState buttonState;

    public ConnectionButton(Context context) {
        super(context);
    }

    public ConnectionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ConnectionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void initialize(WifiP2pListener wifiP2pListener) {
        this.wifiP2pListener = wifiP2pListener;
        setStateCreateGroup();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);
    }

    @OnClick
    public void onClick() {
        if (buttonState == DiscoveryAndConnectionButtonState.CANCEL_INVITATION) {
            wifiP2pListener.onCancelConnect();
        } else if (buttonState == DiscoveryAndConnectionButtonState.CREATE_GROUP) {
            wifiP2pListener.onCreateGroup();
        } else if (buttonState == DiscoveryAndConnectionButtonState.DISCONNECT) {
            wifiP2pListener.onDisconnect();
        }
    }

    public void setStateCancelInvitation() {
        setText(getContext().getString(R.string.cancel_invitation));
        buttonState = DiscoveryAndConnectionButtonState.CANCEL_INVITATION;
    }

    public void setStateCreateGroup() {
        setText(getContext().getString(R.string.create_group));
        buttonState = DiscoveryAndConnectionButtonState.CREATE_GROUP;
    }

    public void setStateDisconnect() {
        setText(getContext().getString(R.string.disconnect));
        buttonState = DiscoveryAndConnectionButtonState.DISCONNECT;
    }
}
