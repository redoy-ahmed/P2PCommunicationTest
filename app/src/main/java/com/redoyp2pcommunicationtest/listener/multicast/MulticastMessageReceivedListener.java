package com.redoyp2pcommunicationtest.listener.multicast;

import com.redoyp2pcommunicationtest.multicast.MulticastMessage;

public interface MulticastMessageReceivedListener {

    void onMulticastMessageReceived(MulticastMessage multicastMessage);
}
