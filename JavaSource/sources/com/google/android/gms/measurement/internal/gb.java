package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class gb implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ AtomicReference f22178q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22179r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f22180s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ ae f22181t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ boolean f22182u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ vb f22183v;

    gb(vb vbVar, AtomicReference atomicReference, String str, String str2, String str3, ae aeVar, boolean z7) {
        this.f22178q = atomicReference;
        this.f22179r = str2;
        this.f22180s = str3;
        this.f22181t = aeVar;
        this.f22182u = z7;
        Objects.requireNonNull(vbVar);
        this.f22183v = vbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        vb vbVar;
        t4.d N;
        AtomicReference atomicReference2 = this.f22178q;
        synchronized (atomicReference2) {
            try {
                try {
                    vbVar = this.f22183v;
                    N = vbVar.N();
                } catch (RemoteException e8) {
                    this.f22183v.f22928a.a().o().d("(legacy) Failed to get user properties; remote exception", null, this.f22179r, e8);
                    this.f22178q.set(Collections.EMPTY_LIST);
                    atomicReference = this.f22178q;
                }
                if (N == null) {
                    vbVar.f22928a.a().o().d("(legacy) Failed to get user properties; not connected to service", null, this.f22179r, this.f22180s);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    ae aeVar = this.f22181t;
                    p3.o.m(aeVar);
                    atomicReference2.set(N.V6(this.f22179r, this.f22180s, this.f22182u, aeVar));
                } else {
                    atomicReference2.set(N.m1(null, this.f22179r, this.f22180s, this.f22182u));
                }
                vbVar.J();
                atomicReference = this.f22178q;
                atomicReference.notify();
            } catch (Throwable th) {
                this.f22178q.notify();
                throw th;
            }
        }
    }
}
