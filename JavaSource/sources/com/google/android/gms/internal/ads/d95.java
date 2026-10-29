package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
public final class d95 extends androidx.browser.customtabs.e {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f7000b;

    public d95(wz wzVar) {
        this.f7000b = new WeakReference(wzVar);
    }

    @Override // androidx.browser.customtabs.e
    public final void a(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        wz wzVar = (wz) this.f7000b.get();
        if (wzVar != null) {
            wzVar.f(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        wz wzVar = (wz) this.f7000b.get();
        if (wzVar != null) {
            wzVar.g();
        }
    }
}
