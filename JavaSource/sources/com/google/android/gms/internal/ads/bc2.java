package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: MyApplication */
final class bc2 implements ym1 {

    /* renamed from: a, reason: collision with root package name */
    private Message f5712a;

    /* synthetic */ bc2(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.ym1
    public final void a() {
        Message message = this.f5712a;
        message.getClass();
        message.sendToTarget();
        this.f5712a = null;
        cd2.f(this);
    }

    public final bc2 b(Message message, cd2 cd2Var) {
        this.f5712a = message;
        return this;
    }

    public final boolean c(Handler handler) {
        Message message = this.f5712a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.f5712a = null;
        cd2.f(this);
        return sendMessageAtFrontOfQueue;
    }
}
