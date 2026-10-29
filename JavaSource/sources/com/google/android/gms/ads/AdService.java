package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gb0;
import s2.z;
import w2.p;

/* compiled from: MyApplication */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        try {
            z.b().j(this, new gb0()).c1(intent);
        } catch (RemoteException e8) {
            p.c("RemoteException calling handleNotificationIntent: ".concat(e8.toString()));
        }
    }
}
