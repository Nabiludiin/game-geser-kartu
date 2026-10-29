package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class va3 {

    /* renamed from: d, reason: collision with root package name */
    private static final va3 f17486d = new va3();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f17487a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17488b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17489c = false;

    public static va3 a() {
        return f17486d;
    }

    public final void b(Context context) {
        if (context == null) {
            return;
        }
        this.f17487a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new ua3(this), intentFilter);
    }

    public final void c() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f17487a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean isDeviceLocked = keyguardManager.isDeviceLocked();
        d(this.f17488b, isDeviceLocked);
        this.f17489c = isDeviceLocked;
    }

    public final void d(boolean z7, boolean z8) {
        if ((z8 || z7) == (this.f17489c || this.f17488b)) {
            return;
        }
        Iterator it = ka3.a().e().iterator();
        while (it.hasNext()) {
            ((q93) it.next()).g().g(z8 || z7);
        }
    }

    final /* synthetic */ void e(boolean z7) {
        this.f17488b = z7;
    }

    final /* synthetic */ boolean f() {
        return this.f17489c;
    }
}
