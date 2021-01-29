package com.example.demorecorder1.ui.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class BaseService extends Service {
    public BaseService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public abstract void startPerformService();
    public abstract void stopPerformService();
}
