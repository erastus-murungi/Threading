package com.example.threading;

import android.os.Message;

/**
 * An interface for worker threads to send messages to the UI thread.
 * MainActivity implemented this Interface in this app.
 */
public interface UiThreadCallback {
    void publishToUiThread(Message message);
}
