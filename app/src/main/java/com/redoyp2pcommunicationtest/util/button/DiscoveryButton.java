package com.redoyp2pcommunicationtest.util.button;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import com.redoyp2pcommunicationtest.R;
import com.redoyp2pcommunicationtest.listener.wifip2p.WifiP2pListener;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class DiscoveryButton extends AppCompatButton {

    private WifiP2pListener wifiP2pListener;
    private DiscoveryAndConnectionButtonState buttonState;

    public DiscoveryButton(Context context) {
        super(context);
    }

    public DiscoveryButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DiscoveryButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void initialize(WifiP2pListener wifiP2pListener){
        this.wifiP2pListener = wifiP2pListener;
        setStateStartDiscovery();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this);
    }

    @OnClick
    public void onClick() {
        if (buttonState == DiscoveryAndConnectionButtonState.START_DISCOVERY) {
            wifiP2pListener.onStartPeerDiscovery();
        } else if (buttonState == DiscoveryAndConnectionButtonState.STOP_DISCOVERY) {
            wifiP2pListener.onStopPeerDiscovery();
        }
    }

    public void setStateStartDiscovery() {
        setText(getContext().getString(R.string.discover));
        buttonState = DiscoveryAndConnectionButtonState.START_DISCOVERY;
    }

    public void setStateStopDiscovery() {
        setText(getContext().getString(R.string.stop));
        buttonState = DiscoveryAndConnectionButtonState.STOP_DISCOVERY;
    }
}
