package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class eu3 extends BroadcastReceiver implements it3, ek3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7826a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f7827b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7828c = true;

    eu3(Context context, ExecutorService executorService) {
        this.f7826a = context;
        this.f7827b = executorService;
    }

    private final synchronized void g(boolean z7) {
        this.f7828c = z7;
    }

    @Override // com.google.android.gms.internal.ads.ek3
    public final a5.d a() {
        return p64.d(new Callable() { // from class: com.google.android.gms.internal.ads.du3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                eu3.this.f();
                return null;
            }
        }, this.f7827b);
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void b(Map map) {
        map.put("up", Boolean.valueOf(e()));
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void c(Map map) {
        map.put("up", Boolean.valueOf(e()));
    }

    @Override // com.google.android.gms.internal.ads.it3
    public final void d(Map map, Context context, View view) {
        map.put("up", Boolean.valueOf(e()));
    }

    final synchronized boolean e() {
        return this.f7828c;
    }

    final /* synthetic */ Void f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f7826a.registerReceiver(this, intentFilter);
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            g(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            g(false);
        }
    }
}
