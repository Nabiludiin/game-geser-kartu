package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: MyApplication */
final class w extends n4.l {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f4524b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(x xVar, Looper looper) {
        super(looper);
        this.f4524b = xVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 1) {
            ((v) message.obj).b(this.f4524b);
        } else {
            if (i7 == 2) {
                throw ((RuntimeException) message.obj);
            }
            Log.w("GACStateManager", "Unknown message id: " + i7);
        }
    }
}
