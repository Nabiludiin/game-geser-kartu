package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: MyApplication */
final class s52 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v62 f15466a;

    /* synthetic */ s52(v62 v62Var, byte[] bArr) {
        Objects.requireNonNull(v62Var);
        this.f15466a = v62Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.f15466a.f().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.r42
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                s52.this.f15466a.d(context);
            }
        });
    }
}
