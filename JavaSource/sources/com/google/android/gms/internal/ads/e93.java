package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public abstract class e93 {

    /* renamed from: a, reason: collision with root package name */
    protected final ClientApi f7475a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f7476b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f7477c;

    /* renamed from: d, reason: collision with root package name */
    protected final t13 f7478d;

    /* renamed from: e, reason: collision with root package name */
    protected s2.m4 f7479e;

    /* renamed from: f, reason: collision with root package name */
    protected AtomicBoolean f7480f;

    /* renamed from: g, reason: collision with root package name */
    private s2.c1 f7481g;

    /* renamed from: h, reason: collision with root package name */
    protected s2.e1 f7482h;

    /* renamed from: i, reason: collision with root package name */
    private final Queue f7483i;

    /* renamed from: j, reason: collision with root package name */
    private final h83 f7484j;

    /* renamed from: k, reason: collision with root package name */
    private final String f7485k;

    /* renamed from: l, reason: collision with root package name */
    private AtomicBoolean f7486l;

    /* renamed from: m, reason: collision with root package name */
    private final ScheduledExecutorService f7487m;

    /* renamed from: n, reason: collision with root package name */
    private AtomicBoolean f7488n;

    /* renamed from: o, reason: collision with root package name */
    private AtomicBoolean f7489o;

    /* renamed from: p, reason: collision with root package name */
    private m83 f7490p;

    /* renamed from: q, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f7491q;

    /* renamed from: r, reason: collision with root package name */
    private final u83 f7492r;

    public e93(ClientApi clientApi, Context context, int i7, t13 t13Var, s2.m4 m4Var, s2.c1 c1Var, ScheduledExecutorService scheduledExecutorService, h83 h83Var, com.google.android.gms.common.util.e eVar) {
        this("none", clientApi, context, i7, t13Var, m4Var, scheduledExecutorService, h83Var, eVar);
        this.f7481g = c1Var;
    }

    static final /* synthetic */ double d(s2.y2 y2Var) {
        if (y2Var instanceof p91) {
            return ((p91) y2Var).n8();
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized void K(Object obj) {
        try {
            this.f7486l.set(false);
            if (obj != null) {
                this.f7484j.a();
                this.f7489o.set(true);
                i(obj);
            }
            j(obj == null);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final synchronized void L(Throwable th) {
        try {
            this.f7486l.set(false);
            if ((th instanceof z73) && ((z73) th).a() == 0) {
                throw null;
            }
            j(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void M(s2.x2 x2Var) {
        try {
            if (this.f7488n.get()) {
                v2.f2.f26746l.post(new b93(this, x2Var));
            }
            this.f7486l.set(false);
            int i7 = x2Var.f26259q;
            if (i7 != 1 && i7 != 8 && i7 != 10 && i7 != 11) {
                j(true);
                return;
            }
            s2.m4 m4Var = this.f7479e;
            int i8 = m4Var.f26190r;
            String str = m4Var.f26189q;
            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 26 + String.valueOf(str).length() + 61);
            sb.append("Preloading ");
            sb.append(i8);
            sb.append(", for adUnitId:");
            sb.append(str);
            sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
            String sb2 = sb.toString();
            int i9 = v2.n1.f26802b;
            w2.p.e(sb2);
            this.f7480f.set(false);
            t83 t83Var = new t83(this.f7479e.f26189q, D());
            t83Var.a(this.f7485k);
            this.f7490p.k(this.f7491q.a(), new u83(t83Var, null), x2Var, this.f7479e.f26192t, E(), Q());
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void i(Object obj) {
        try {
            com.google.android.gms.common.util.e eVar = this.f7491q;
            v83 v83Var = new v83(obj, eVar);
            this.f7483i.add(v83Var);
            s2.y2 s7 = s(obj);
            long a8 = eVar.a();
            if (this.f7488n.get()) {
                v2.f2.f26746l.post(new z83(this, s7));
            }
            ScheduledExecutorService scheduledExecutorService = this.f7487m;
            scheduledExecutorService.execute(new a93(this, a8, s7));
            scheduledExecutorService.schedule(new y83(this), v83Var.c(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void j(boolean z7) {
        try {
            h83 h83Var = this.f7484j;
            if (h83Var.d()) {
                return;
            }
            if (z7) {
                h83Var.c();
            }
            this.f7487m.schedule(new y83(this), h83Var.b(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void k() {
        Iterator it = this.f7483i.iterator();
        while (it.hasNext()) {
            if (((v83) it.next()).b()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized void N(s2.x2 x2Var) {
        s2.e1 e1Var = this.f7482h;
        if (e1Var != null) {
            try {
                e1Var.O2(this.f7485k, x2Var);
            } catch (RemoteException unused) {
                int i7 = v2.n1.f26802b;
                w2.p.f("Failed to call onAdFailedToPreload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final synchronized void O(s2.y2 y2Var) {
        s2.c1 c1Var = this.f7481g;
        if (c1Var != null) {
            try {
                c1Var.h2(this.f7479e);
            } catch (RemoteException unused) {
                int i7 = v2.n1.f26802b;
                w2.p.f("Failed to call onAdsAvailable");
            }
        }
        s2.e1 e1Var = this.f7482h;
        if (e1Var != null) {
            try {
                e1Var.Q6(this.f7485k, y2Var);
            } catch (RemoteException unused2) {
                int i8 = v2.n1.f26802b;
                w2.p.f("Failed to call onAdPreloaded");
            }
        }
    }

    private final synchronized void n() {
        try {
            if (this.f7489o.get() && this.f7483i.isEmpty()) {
                this.f7489o.set(false);
                if (this.f7488n.get()) {
                    v2.f2.f26746l.post(new c93(this));
                }
                this.f7487m.execute(new d93(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final synchronized void P() {
        s2.c1 c1Var = this.f7481g;
        if (c1Var != null) {
            try {
                c1Var.s1(this.f7479e);
            } catch (RemoteException unused) {
                int i7 = v2.n1.f26802b;
                w2.p.f("Failed to call onAdsExhausted");
            }
        }
        s2.e1 e1Var = this.f7482h;
        if (e1Var != null) {
            try {
                e1Var.u(this.f7485k);
            } catch (RemoteException unused2) {
                int i8 = v2.n1.f26802b;
                w2.p.f("Failed to call onAdsExhausted");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final String Q() {
        return true != "none".equals(this.f7485k) ? "2" : "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(s2.y2 y2Var) {
        if (y2Var instanceof p91) {
            return ((p91) y2Var).m8();
        }
        return null;
    }

    public final void A(m83 m83Var) {
        this.f7490p = m83Var;
    }

    public final synchronized void B(int i7) {
        p3.o.a(i7 >= 5);
        this.f7484j.e(i7);
    }

    protected final String C() {
        return this.f7485k;
    }

    protected final k2.c D() {
        return k2.c.c(this.f7479e.f26190r);
    }

    protected final synchronized int E() {
        return this.f7483i.size();
    }

    protected final void F() {
        this.f7483i.clear();
    }

    protected final synchronized Object G() {
        v83 v83Var = (v83) this.f7483i.peek();
        if (v83Var == null) {
            return null;
        }
        return v83Var.a();
    }

    protected final synchronized void H() {
        a5.d r7;
        try {
            k();
            n();
            if (!this.f7486l.get() && this.f7480f.get() && this.f7483i.size() < this.f7479e.f26192t) {
                this.f7486l.set(true);
                Activity d8 = r2.t.k().d();
                if (d8 == null) {
                    String valueOf = String.valueOf(this.f7479e.f26189q);
                    int i7 = v2.n1.f26802b;
                    w2.p.f("Empty activity context at preloading: ".concat(valueOf));
                    r7 = r(this.f7476b);
                } else {
                    r7 = r(d8);
                }
                p64.r(r7, new w83(this), this.f7487m);
            }
        } finally {
        }
    }

    protected final void I(int i7) {
        p3.o.a(i7 > 0);
        k2.c c8 = k2.c.c(this.f7479e.f26190r);
        int i8 = this.f7479e.f26192t;
        synchronized (this) {
            try {
                s2.m4 m4Var = this.f7479e;
                this.f7479e = new s2.m4(m4Var.f26189q, m4Var.f26190r, m4Var.f26191s, i7 > 0 ? i7 : m4Var.f26192t);
                Queue queue = this.f7483i;
                if (queue.size() > i7) {
                    if (((Boolean) s2.b0.c().d(uy.f17229w)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i9 = 0; i9 < i7; i9++) {
                            v83 v83Var = (v83) queue.poll();
                            if (v83Var != null) {
                                arrayList.add(v83Var);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m83 m83Var = this.f7490p;
        if (m83Var == null || c8 == null) {
            return;
        }
        m83Var.c(i8, i7, this.f7491q.a(), new u83(new t83(this.f7479e.f26189q, c8), null));
    }

    protected final void J(s2.b5 b5Var) {
        if (((Boolean) s2.b0.c().d(uy.B)).booleanValue()) {
            Bundle bundle = b5Var.R;
            bundle.putInt("plcs", E());
            bundle.putInt("plbs", this.f7479e.f26192t);
            bundle.putString("plid", this.f7485k);
        }
    }

    final /* synthetic */ m83 a() {
        return this.f7490p;
    }

    final /* synthetic */ com.google.android.gms.common.util.e b() {
        return this.f7491q;
    }

    final /* synthetic */ u83 c() {
        return this.f7492r;
    }

    protected abstract a5.d r(Context context);

    protected abstract s2.y2 s(Object obj);

    public final synchronized e93 t() {
        this.f7487m.submit(new y83(this));
        return this;
    }

    public final synchronized boolean u() {
        try {
            if (((Boolean) s2.b0.c().d(uy.H)).booleanValue()) {
                this.f7484j.a();
            }
            k();
        } catch (Throwable th) {
            throw th;
        }
        return !this.f7483i.isEmpty();
    }

    public final synchronized Object v() {
        try {
            this.f7484j.a();
            Queue queue = this.f7483i;
            v83 v83Var = (v83) queue.poll();
            this.f7489o.set(v83Var != null);
            if (v83Var == null) {
                v83Var = null;
            } else if (!queue.isEmpty()) {
                v83 v83Var2 = (v83) queue.peek();
                k2.c c8 = k2.c.c(this.f7479e.f26190r);
                String q7 = q(s(v83Var.a()));
                if (v83Var2 != null && c8 != null && q7 != null && v83Var2.d() < v83Var.d()) {
                    this.f7490p.g(this.f7491q.a(), this.f7479e.f26192t, E(), q7, this.f7492r, Q());
                }
            }
            H();
            if (v83Var == null) {
                return null;
            }
            return v83Var.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void w() {
        this.f7480f.set(false);
        this.f7488n.set(false);
    }

    public final void x() {
        this.f7480f.set(false);
    }

    public final synchronized void y() {
        this.f7480f.set(true);
        this.f7488n.set(true);
        this.f7487m.submit(new y83(this));
    }

    public final synchronized String z() {
        Object G;
        G = G();
        return q(G == null ? null : s(G));
    }

    public e93(String str, ClientApi clientApi, Context context, int i7, t13 t13Var, s2.m4 m4Var, s2.e1 e1Var, ScheduledExecutorService scheduledExecutorService, h83 h83Var, com.google.android.gms.common.util.e eVar) {
        this(str, clientApi, context, i7, t13Var, m4Var, scheduledExecutorService, h83Var, eVar);
        this.f7482h = e1Var;
    }

    private e93(String str, ClientApi clientApi, Context context, int i7, t13 t13Var, s2.m4 m4Var, ScheduledExecutorService scheduledExecutorService, h83 h83Var, com.google.android.gms.common.util.e eVar) {
        this.f7485k = str;
        this.f7475a = clientApi;
        this.f7476b = context;
        this.f7477c = i7;
        this.f7478d = t13Var;
        this.f7479e = m4Var;
        this.f7483i = new PriorityQueue(Math.max(1, m4Var.f26192t), new x83(this));
        this.f7480f = new AtomicBoolean(true);
        this.f7486l = new AtomicBoolean(false);
        this.f7487m = scheduledExecutorService;
        this.f7484j = h83Var;
        this.f7488n = new AtomicBoolean(true);
        this.f7489o = new AtomicBoolean(false);
        this.f7491q = eVar;
        t83 t83Var = new t83(m4Var.f26189q, k2.c.c(this.f7479e.f26190r));
        t83Var.a(str);
        this.f7492r = new u83(t83Var, null);
    }
}
