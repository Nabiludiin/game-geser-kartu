package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: MyApplication */
final class s extends n4.l {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u f4497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(u uVar, Looper looper) {
        super(looper);
        this.f4497b = uVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            u.t(this.f4497b);
            return;
        }
        if (i7 == 2) {
            u.s(this.f4497b);
            return;
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + i7);
    }
}
