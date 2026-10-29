package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gb0;
import com.google.android.gms.internal.ads.ve0;
import s2.z;
import w2.p;

/* compiled from: MyApplication */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            ve0 j7 = z.b().j(this, new gb0());
            if (j7 == null) {
                p.c("OfflineUtils is null");
            } else {
                j7.c1(getIntent());
            }
        } catch (RemoteException e8) {
            p.c("RemoteException calling handleNotificationIntent: ".concat(e8.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
