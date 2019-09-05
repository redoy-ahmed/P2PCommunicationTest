package com.redoyp2pcommunicationtest.listener.wifip2p.action;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.util.Log;
import android.widget.Toast;

import com.redoyp2pcommunicationtest.R;
import com.redoyp2pcommunicationtest.listener.discovery.DiscoveryStateListener;
import com.redoyp2pcommunicationtest.wifip2p.P2pCommunicationWifiP2pManager;

public class WifiP2pStopPeerDiscoveryActionListener implements ActionListener {

    private static final String TAG = WifiP2pStopPeerDiscoveryActionListener.class.getSimpleName();
    private final Context context;
    private DiscoveryStateListener discoveryStateListener;

    public WifiP2pStopPeerDiscoveryActionListener(Context context, DiscoveryStateListener discoveryStateListener) {
        this.context = context;
        this.discoveryStateListener = discoveryStateListener;
    }

    @Override
    public void onSuccess() {
        discoveryStateListener.onStoppedDiscovery();
        Log.i(TAG, context.getString(R.string.successfully_stopped_discovery));
    }

    @Override
    public void onFailure(int reasonCode) {
        String reason = context.getString(R.string.could_not_stop_discovery) + ": ";
        reason += P2pCommunicationWifiP2pManager.getFailureReason(context, reasonCode);
        Toast.makeText(context, reason, Toast.LENGTH_SHORT).show();
        Log.w(TAG, reason);
    }
}
