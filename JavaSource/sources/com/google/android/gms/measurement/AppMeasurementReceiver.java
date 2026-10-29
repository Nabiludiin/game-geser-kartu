package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import t4.m;
import t4.n;

/* compiled from: MyApplication */
public final class AppMeasurementReceiver extends l0.a implements m {

    /* renamed from: c, reason: collision with root package name */
    private n f21826c;

    @Override // t4.m
    public void a(Context context, Intent intent) {
        l0.a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f21826c == null) {
            this.f21826c = new n(this);
        }
        this.f21826c.a(context, intent);
    }
}
