package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* compiled from: MyApplication */
final class tm5 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ wm5 f16255a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    tm5(wm5 wm5Var, Looper looper) {
        super(looper);
        Objects.requireNonNull(wm5Var);
        this.f16255a = wm5Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f16255a.h(message);
    }
}
