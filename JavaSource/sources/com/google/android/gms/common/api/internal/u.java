package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import l3.a;
import l3.f;
import m3.o0;
import m3.p0;
import m3.r0;
import p3.f0;
import p3.g0;

/* compiled from: MyApplication */
public final class u extends l3.f implements p0 {

    /* renamed from: b, reason: collision with root package name */
    private final Lock f4499b;

    /* renamed from: c, reason: collision with root package name */
    private final g0 f4500c;

    /* renamed from: e, reason: collision with root package name */
    private final int f4502e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f4503f;

    /* renamed from: g, reason: collision with root package name */
    private final Looper f4504g;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f4506i;

    /* renamed from: j, reason: collision with root package name */
    private long f4507j;

    /* renamed from: k, reason: collision with root package name */
    private long f4508k;

    /* renamed from: l, reason: collision with root package name */
    private final s f4509l;

    /* renamed from: m, reason: collision with root package name */
    private final k3.g f4510m;

    /* renamed from: n, reason: collision with root package name */
    o0 f4511n;

    /* renamed from: o, reason: collision with root package name */
    final Map f4512o;

    /* renamed from: p, reason: collision with root package name */
    Set f4513p;

    /* renamed from: q, reason: collision with root package name */
    final p3.d f4514q;

    /* renamed from: r, reason: collision with root package name */
    final Map f4515r;

    /* renamed from: s, reason: collision with root package name */
    final a.AbstractC0106a f4516s;

    /* renamed from: t, reason: collision with root package name */
    private final m3.l f4517t;

    /* renamed from: u, reason: collision with root package name */
    private final ArrayList f4518u;

    /* renamed from: v, reason: collision with root package name */
    private Integer f4519v;

    /* renamed from: w, reason: collision with root package name */
    Set f4520w;

    /* renamed from: x, reason: collision with root package name */
    final z f4521x;

    /* renamed from: y, reason: collision with root package name */
    private final f0 f4522y;

    /* renamed from: d, reason: collision with root package name */
    private r0 f4501d = null;

    /* renamed from: h, reason: collision with root package name */
    final Queue f4505h = new LinkedList();

    public u(Context context, Lock lock, Looper looper, p3.d dVar, k3.g gVar, a.AbstractC0106a abstractC0106a, Map map, List list, List list2, Map map2, int i7, int i8, ArrayList arrayList) {
        this.f4507j = true != com.google.android.gms.common.util.d.a() ? 120000L : 10000L;
        this.f4508k = 5000L;
        this.f4513p = new HashSet();
        this.f4517t = new m3.l();
        this.f4519v = null;
        this.f4520w = null;
        r rVar = new r(this);
        this.f4522y = rVar;
        this.f4503f = context;
        this.f4499b = lock;
        this.f4500c = new g0(looper, rVar);
        this.f4504g = looper;
        this.f4509l = new s(this, looper);
        this.f4510m = gVar;
        this.f4502e = i7;
        if (i7 >= 0) {
            this.f4519v = Integer.valueOf(i8);
        }
        this.f4515r = map;
        this.f4512o = map2;
        this.f4518u = arrayList;
        this.f4521x = new z();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f4500c.f((f.b) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f4500c.g((f.c) it2.next());
        }
        this.f4514q = dVar;
        this.f4516s = abstractC0106a;
    }

    public static int p(Iterable iterable, boolean z7) {
        Iterator it = iterable.iterator();
        boolean z8 = false;
        boolean z9 = false;
        while (it.hasNext()) {
            a.f fVar = (a.f) it.next();
            z8 |= fVar.t();
            z9 |= fVar.b();
        }
        if (z8) {
            return (z9 && z7) ? 2 : 1;
        }
        return 3;
    }

    static String r(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    static /* bridge */ /* synthetic */ void s(u uVar) {
        uVar.f4499b.lock();
        try {
            if (uVar.f4506i) {
                uVar.w();
            }
        } finally {
            uVar.f4499b.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void t(u uVar) {
        uVar.f4499b.lock();
        try {
            if (uVar.u()) {
                uVar.w();
            }
        } finally {
            uVar.f4499b.unlock();
        }
    }

    private final void v(int i7) {
        u uVar;
        Integer num = this.f4519v;
        if (num == null) {
            this.f4519v = Integer.valueOf(i7);
        } else if (num.intValue() != i7) {
            throw new IllegalStateException("Cannot use sign-in mode: " + r(i7) + ". Mode was already set to " + r(this.f4519v.intValue()));
        }
        if (this.f4501d != null) {
            return;
        }
        boolean z7 = false;
        boolean z8 = false;
        for (a.f fVar : this.f4512o.values()) {
            z7 |= fVar.t();
            z8 |= fVar.b();
        }
        int intValue = this.f4519v.intValue();
        if (intValue == 1) {
            uVar = this;
            if (!z7) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (z8) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            if (intValue == 2 && z7) {
                this.f4501d = b.l(this.f4503f, this, this.f4499b, this.f4504g, this.f4510m, this.f4512o, this.f4514q, this.f4515r, this.f4516s, this.f4518u);
                return;
            }
            uVar = this;
        }
        uVar.f4501d = new x(uVar.f4503f, uVar, uVar.f4499b, uVar.f4504g, uVar.f4510m, uVar.f4512o, uVar.f4514q, uVar.f4515r, uVar.f4516s, uVar.f4518u, this);
    }

    private final void w() {
        this.f4500c.b();
        ((r0) p3.o.m(this.f4501d)).a();
    }

    @Override // m3.p0
    public final void a(k3.b bVar) {
        if (!this.f4510m.k(this.f4503f, bVar.M0())) {
            u();
        }
        if (this.f4506i) {
            return;
        }
        this.f4500c.c(bVar);
        this.f4500c.a();
    }

    @Override // m3.p0
    public final void b(Bundle bundle) {
        while (!this.f4505h.isEmpty()) {
            g((a) this.f4505h.remove());
        }
        this.f4500c.d(bundle);
    }

    @Override // m3.p0
    public final void c(int i7, boolean z7) {
        if (i7 == 1) {
            if (!z7 && !this.f4506i) {
                this.f4506i = true;
                if (this.f4511n == null && !com.google.android.gms.common.util.d.a()) {
                    try {
                        this.f4511n = this.f4510m.u(this.f4503f.getApplicationContext(), new t(this));
                    } catch (SecurityException unused) {
                    }
                }
                s sVar = this.f4509l;
                sVar.sendMessageDelayed(sVar.obtainMessage(1), this.f4507j);
                s sVar2 = this.f4509l;
                sVar2.sendMessageDelayed(sVar2.obtainMessage(2), this.f4508k);
            }
            i7 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f4521x.f4537a.toArray(new BasePendingResult[0])) {
            basePendingResult.g(z.f4536c);
        }
        this.f4500c.e(i7);
        this.f4500c.a();
        if (i7 == 2) {
            w();
        }
    }

    @Override // l3.f
    public final void d() {
        this.f4499b.lock();
        try {
            int i7 = 2;
            boolean z7 = false;
            if (this.f4502e >= 0) {
                p3.o.q(this.f4519v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f4519v;
                if (num == null) {
                    this.f4519v = Integer.valueOf(p(this.f4512o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) p3.o.m(this.f4519v)).intValue();
            this.f4499b.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i7 = intValue;
                } else if (intValue != 2) {
                    i7 = intValue;
                    p3.o.b(z7, "Illegal sign-in mode: " + i7);
                    v(i7);
                    w();
                    this.f4499b.unlock();
                    return;
                }
                p3.o.b(z7, "Illegal sign-in mode: " + i7);
                v(i7);
                w();
                this.f4499b.unlock();
                return;
            } finally {
                this.f4499b.unlock();
            }
            z7 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l3.f
    public final void e() {
        this.f4499b.lock();
        try {
            this.f4521x.b();
            r0 r0Var = this.f4501d;
            if (r0Var != null) {
                r0Var.d();
            }
            this.f4517t.a();
            for (a aVar : this.f4505h) {
                aVar.q(null);
                aVar.e();
            }
            this.f4505h.clear();
            if (this.f4501d != null) {
                u();
                this.f4500c.a();
            }
            this.f4499b.unlock();
        } catch (Throwable th) {
            this.f4499b.unlock();
            throw th;
        }
    }

    @Override // l3.f
    public final void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f4503f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f4506i);
        printWriter.append(" mWorkQueue.size()=").print(this.f4505h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f4521x.f4537a.size());
        r0 r0Var = this.f4501d;
        if (r0Var != null) {
            r0Var.e(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // l3.f
    public final a g(a aVar) {
        Map map = this.f4512o;
        l3.a s7 = aVar.s();
        p3.o.b(map.containsKey(aVar.t()), "GoogleApiClient is not configured to use " + (s7 != null ? s7.d() : "the API") + " required for this call.");
        this.f4499b.lock();
        try {
            r0 r0Var = this.f4501d;
            if (r0Var == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f4506i) {
                this.f4505h.add(aVar);
                while (!this.f4505h.isEmpty()) {
                    a aVar2 = (a) this.f4505h.remove();
                    this.f4521x.a(aVar2);
                    aVar2.a(Status.f4418x);
                }
            } else {
                aVar = r0Var.c(aVar);
            }
            this.f4499b.unlock();
            return aVar;
        } catch (Throwable th) {
            this.f4499b.unlock();
            throw th;
        }
    }

    @Override // l3.f
    public final a.f h(a.c cVar) {
        a.f fVar = (a.f) this.f4512o.get(cVar);
        p3.o.n(fVar, "Appropriate Api was not requested.");
        return fVar;
    }

    @Override // l3.f
    public final Looper i() {
        return this.f4504g;
    }

    @Override // l3.f
    public final boolean j(l3.a aVar) {
        return this.f4512o.containsKey(aVar.b());
    }

    @Override // l3.f
    public final boolean k(l3.a aVar) {
        a.f fVar;
        return l() && (fVar = (a.f) this.f4512o.get(aVar.b())) != null && fVar.a();
    }

    @Override // l3.f
    public final boolean l() {
        r0 r0Var = this.f4501d;
        return r0Var != null && r0Var.b();
    }

    @Override // l3.f
    public final void m(f.c cVar) {
        this.f4500c.g(cVar);
    }

    @Override // l3.f
    public final void n(f.c cVar) {
        this.f4500c.h(cVar);
    }

    final String q() {
        StringWriter stringWriter = new StringWriter();
        f("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    final boolean u() {
        if (!this.f4506i) {
            return false;
        }
        this.f4506i = false;
        this.f4509l.removeMessages(2);
        this.f4509l.removeMessages(1);
        o0 o0Var = this.f4511n;
        if (o0Var != null) {
            o0Var.b();
            this.f4511n = null;
        }
        return true;
    }
}
