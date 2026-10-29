package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class tl0 implements bs {

    /* renamed from: r, reason: collision with root package name */
    private final v2.p1 f16240r;

    /* renamed from: t, reason: collision with root package name */
    final rl0 f16242t;

    /* renamed from: q, reason: collision with root package name */
    private final Object f16239q = new Object();

    /* renamed from: u, reason: collision with root package name */
    final HashSet f16243u = new HashSet();

    /* renamed from: v, reason: collision with root package name */
    final HashSet f16244v = new HashSet();

    /* renamed from: w, reason: collision with root package name */
    private boolean f16245w = false;

    /* renamed from: s, reason: collision with root package name */
    private final sl0 f16241s = new sl0();

    public tl0(String str, v2.p1 p1Var) {
        this.f16242t = new rl0(str, p1Var);
        this.f16240r = p1Var;
    }

    public final void a(kl0 kl0Var) {
        synchronized (this.f16239q) {
            this.f16243u.add(kl0Var);
        }
    }

    public final void b(HashSet hashSet) {
        synchronized (this.f16239q) {
            this.f16243u.addAll(hashSet);
        }
    }

    public final void c() {
        synchronized (this.f16239q) {
            this.f16242t.a();
        }
    }

    public final void d() {
        synchronized (this.f16239q) {
            this.f16242t.b();
        }
    }

    public final void e(s2.b5 b5Var, long j7) {
        synchronized (this.f16239q) {
            this.f16242t.e(b5Var, j7);
        }
    }

    public final void f() {
        synchronized (this.f16239q) {
            this.f16242t.f();
        }
    }

    public final void g() {
        synchronized (this.f16239q) {
            this.f16242t.g();
        }
    }

    public final void h() {
        synchronized (this.f16239q) {
            this.f16242t.c();
        }
    }

    public final int i() {
        int d8;
        synchronized (this.f16239q) {
            d8 = this.f16242t.d();
        }
        return d8;
    }

    public final kl0 j(com.google.android.gms.common.util.e eVar, String str) {
        return new kl0(eVar, this, this.f16241s.a(), str);
    }

    public final boolean k() {
        return this.f16245w;
    }

    public final String l() {
        return this.f16241s.b();
    }

    public final Bundle m(Context context, f23 f23Var) {
        HashSet hashSet = new HashSet();
        synchronized (this.f16239q) {
            HashSet hashSet2 = this.f16243u;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f16242t.h(context, this.f16241s.b()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.f16244v.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((kl0) it2.next()).i());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        f23Var.a(hashSet);
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void r0(boolean z7) {
        long a8 = r2.t.o().a();
        if (!z7) {
            v2.p1 p1Var = this.f16240r;
            p1Var.J0(a8);
            p1Var.g(this.f16242t.f14992d);
            return;
        }
        v2.p1 p1Var2 = this.f16240r;
        if (a8 - p1Var2.n() > ((Long) s2.b0.c().d(uy.f17151m1)).longValue()) {
            this.f16242t.f14992d = -1;
        } else {
            this.f16242t.f14992d = p1Var2.q();
        }
        this.f16245w = true;
    }
}
