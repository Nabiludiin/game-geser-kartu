package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import l3.a;
import m3.o1;
import m3.p0;
import m3.p1;
import m3.r0;

/* compiled from: MyApplication */
public final class x implements r0, p1 {
    private volatile m3.z A;
    int C;
    final u D;
    final p0 E;

    /* renamed from: q, reason: collision with root package name */
    private final Lock f4525q;

    /* renamed from: r, reason: collision with root package name */
    private final Condition f4526r;

    /* renamed from: s, reason: collision with root package name */
    private final Context f4527s;

    /* renamed from: t, reason: collision with root package name */
    private final k3.h f4528t;

    /* renamed from: u, reason: collision with root package name */
    private final w f4529u;

    /* renamed from: v, reason: collision with root package name */
    final Map f4530v;

    /* renamed from: x, reason: collision with root package name */
    final p3.d f4532x;

    /* renamed from: y, reason: collision with root package name */
    final Map f4533y;

    /* renamed from: z, reason: collision with root package name */
    final a.AbstractC0106a f4534z;

    /* renamed from: w, reason: collision with root package name */
    final Map f4531w = new HashMap();
    private k3.b B = null;

    public x(Context context, u uVar, Lock lock, Looper looper, k3.h hVar, Map map, p3.d dVar, Map map2, a.AbstractC0106a abstractC0106a, ArrayList arrayList, p0 p0Var) {
        this.f4527s = context;
        this.f4525q = lock;
        this.f4528t = hVar;
        this.f4530v = map;
        this.f4532x = dVar;
        this.f4533y = map2;
        this.f4534z = abstractC0106a;
        this.D = uVar;
        this.E = p0Var;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((o1) arrayList.get(i7)).b(this);
        }
        this.f4529u = new w(this, looper);
        this.f4526r = lock.newCondition();
        this.A = new q(this);
    }

    @Override // m3.p1
    public final void H2(k3.b bVar, l3.a aVar, boolean z7) {
        this.f4525q.lock();
        try {
            this.A.d(bVar, aVar, z7);
        } finally {
            this.f4525q.unlock();
        }
    }

    @Override // m3.e
    public final void O(int i7) {
        this.f4525q.lock();
        try {
            this.A.c(i7);
        } finally {
            this.f4525q.unlock();
        }
    }

    @Override // m3.r0
    public final void a() {
        this.A.b();
    }

    @Override // m3.r0
    public final boolean b() {
        return this.A instanceof e;
    }

    @Override // m3.r0
    public final a c(a aVar) {
        aVar.n();
        return this.A.g(aVar);
    }

    @Override // m3.r0
    public final void d() {
        if (this.A.f()) {
            this.f4531w.clear();
        }
    }

    @Override // m3.r0
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.A);
        for (l3.a aVar : this.f4533y.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) aVar.d()).println(":");
            ((a.f) p3.o.m((a.f) this.f4530v.get(aVar.b()))).j(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    final void h() {
        this.f4525q.lock();
        try {
            this.D.u();
            this.A = new e(this);
            this.A.e();
            this.f4526r.signalAll();
        } finally {
            this.f4525q.unlock();
        }
    }

    final void i() {
        x xVar;
        this.f4525q.lock();
        try {
            xVar = this;
            try {
                xVar.A = new p(xVar, this.f4532x, this.f4533y, this.f4528t, this.f4534z, this.f4525q, this.f4527s);
                xVar.A.e();
                xVar.f4526r.signalAll();
                xVar.f4525q.unlock();
            } catch (Throwable th) {
                th = th;
                xVar.f4525q.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xVar = this;
        }
    }

    final void j(k3.b bVar) {
        this.f4525q.lock();
        try {
            this.B = bVar;
            this.A = new q(this);
            this.A.e();
            this.f4526r.signalAll();
        } finally {
            this.f4525q.unlock();
        }
    }

    final void k(v vVar) {
        w wVar = this.f4529u;
        wVar.sendMessage(wVar.obtainMessage(1, vVar));
    }

    final void l(RuntimeException runtimeException) {
        w wVar = this.f4529u;
        wVar.sendMessage(wVar.obtainMessage(2, runtimeException));
    }

    @Override // m3.e
    public final void r0(Bundle bundle) {
        this.f4525q.lock();
        try {
            this.A.a(bundle);
        } finally {
            this.f4525q.unlock();
        }
    }
}
