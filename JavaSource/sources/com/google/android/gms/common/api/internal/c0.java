package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import m3.p0;
import m3.q1;

/* compiled from: MyApplication */
final class c0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f4453a;

    /* synthetic */ c0(b bVar, q1 q1Var) {
        this.f4453a = bVar;
    }

    @Override // m3.p0
    public final void a(k3.b bVar) {
        Lock lock;
        Lock lock2;
        lock = this.f4453a.C;
        lock.lock();
        try {
            this.f4453a.f4450z = bVar;
            b.u(this.f4453a);
        } finally {
            lock2 = this.f4453a.C;
            lock2.unlock();
        }
    }

    @Override // m3.p0
    public final void b(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.f4453a.C;
        lock.lock();
        try {
            b.t(this.f4453a, bundle);
            this.f4453a.f4450z = k3.b.f24462u;
            b.u(this.f4453a);
        } finally {
            lock2 = this.f4453a.C;
            lock2.unlock();
        }
    }

    @Override // m3.p0
    public final void c(int i7, boolean z7) {
        Lock lock;
        Lock lock2;
        boolean z8;
        Lock lock3;
        k3.b bVar;
        k3.b bVar2;
        x xVar;
        lock = this.f4453a.C;
        lock.lock();
        try {
            b bVar3 = this.f4453a;
            z8 = bVar3.B;
            if (!z8) {
                bVar = bVar3.A;
                if (bVar != null) {
                    bVar2 = bVar3.A;
                    if (bVar2.Q0()) {
                        this.f4453a.B = true;
                        xVar = this.f4453a.f4445u;
                        xVar.O(i7);
                        lock3 = this.f4453a.C;
                        lock3.unlock();
                    }
                }
            }
            this.f4453a.B = false;
            b.s(this.f4453a, i7, z7);
            lock3 = this.f4453a.C;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.f4453a.C;
            lock2.unlock();
            throw th;
        }
    }
}
