package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class eb implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f22097q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22098r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f22099s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ ae f22100t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ vb f22101u;

    eb(vb vbVar, AtomicReference atomicReference, String str, String str2, String str3, ae aeVar) {
        this.f22097q = atomicReference;
        this.f22098r = str2;
        this.f22099s = str3;
        this.f22100t = aeVar;
        Objects.requireNonNull(vbVar);
        this.f22101u = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        vb vbVar;
        t4.d N;
        AtomicReference atomicReference2 = this.f22097q;
        synchronized (atomicReference2) {
            try {
                try {
                    vbVar = this.f22101u;
                    N = vbVar.N();
                } catch (RemoteException e8) {
                    this.f22101u.f22928a.a().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.f22098r, e8);
                    this.f22097q.set(Collections.EMPTY_LIST);
                    atomicReference = this.f22097q;
                }
                if (N == null) {
                    vbVar.f22928a.a().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f22098r, this.f22099s);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    ae aeVar = this.f22100t;
                    p3.o.m(aeVar);
                    atomicReference2.set(N.q7(this.f22098r, this.f22099s, aeVar));
                } else {
                    atomicReference2.set(N.h3(null, this.f22098r, this.f22099s));
                }
                vbVar.J();
                atomicReference = this.f22097q;
                atomicReference.notify();
            } catch (Throwable th) {
                this.f22097q.notify();
                throw th;
            }
        }
    }
}
