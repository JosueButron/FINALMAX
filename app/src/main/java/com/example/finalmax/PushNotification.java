package com.example.finalmax;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class PushNotification extends FirebaseMessagingService {
    private static
    final String TAG = "®";
    public PushNotification() {
    }
    public void onMessageReceived (@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d(TAG, "From:" + remoteMessage.getFrom());
    }
}


