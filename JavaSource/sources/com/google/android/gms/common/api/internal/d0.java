package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import m3.p0;
import m3.r1;

/* compiled from: MyApplication */
final class d0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f4455a;

    /* synthetic */ d0(b bVar, r1 r1Var) {
        this.f4455a = bVar;
    }

    @Override // m3.p0
    public final void a(k3.b bVar) {
        Lock lock;
        Lock lock2;
        lock = this.f4455a.C;
        lock.lock();
        try {
            this.f4455a.A = bVar;
            b.u(this.f4455a);
        } finally {
            lock2 = this.f4455a.C;
            lock2.unlock();
        }
    }

    @Override // m3.p0
    public final void b(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f4455a.C;
        lock.lock();
        try {
            this.f4455a.A = k3.b.f24462u;
            b.u(this.f4455a);
        } finally {
            lock2 = this.f4455a.C;
            lock2.unlock();
        }
    }

    @Override // m3.p0
    public final void c(int i7, boolean z7) {
        Lock lock;
        Lock lock2;
        boolean z8;
        x xVar;
        Lock lock3;
        lock = this.f4455a.C;
        lock.lock();
        try {
            b bVar = this.f4455a;
            z8 = bVar.B;
            if (z8) {
                bVar.B = false;
                b.s(this.f4455a, i7, z7);
            } else {
                bVar.B = true;
                xVar = this.f4455a.f4444t;
                xVar.O(i7);
            }
            lock3 = this.f4455a.C;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f4455a.C;
            lock2.unlock();
            throw th;
        }
    }
}
