package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: MyApplication */
final class zm4 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final zn1 f20227a;

    public zm4(bp4 bp4Var, zn1 zn1Var, ao4 ao4Var) {
        Objects.requireNonNull(bp4Var);
        this.f20227a = zn1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f20227a.j(new Runnable(this) { // from class: com.google.android.gms.internal.ads.yl4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                }
            });
        }
    }
}
