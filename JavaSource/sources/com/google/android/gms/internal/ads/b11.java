package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class b11 implements gr, sa1, u2.c0, ra1 {

    /* renamed from: q, reason: collision with root package name */
    private final v01 f5459q;

    /* renamed from: r, reason: collision with root package name */
    private final w01 f5460r;

    /* renamed from: t, reason: collision with root package name */
    private final cb0 f5462t;

    /* renamed from: u, reason: collision with root package name */
    private final Executor f5463u;

    /* renamed from: v, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f5464v;

    /* renamed from: s, reason: collision with root package name */
    private final Set f5461s = new HashSet();

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f5465w = new AtomicBoolean(false);

    /* renamed from: x, reason: collision with root package name */
    private final a11 f5466x = new a11();

    /* renamed from: y, reason: collision with root package name */
    private boolean f5467y = false;

    /* renamed from: z, reason: collision with root package name */
    private WeakReference f5468z = new WeakReference(this);

    public b11(ya0 ya0Var, w01 w01Var, Executor executor, v01 v01Var, com.google.android.gms.common.util.e eVar) {
        this.f5459q = v01Var;
        ja0 ja0Var = ma0.f12152b;
        this.f5462t = ya0Var.a("google.afma.activeView.handleUpdate", ja0Var, ja0Var);
        this.f5460r = w01Var;
        this.f5463u = executor;
        this.f5464v = eVar;
    }

    private final void f() {
        Iterator it = this.f5461s.iterator();
        while (it.hasNext()) {
            this.f5459q.c((mr0) it.next());
        }
        this.f5459q.d();
    }

    @Override // com.google.android.gms.internal.ads.ra1
    public final synchronized void E() {
        if (this.f5465w.compareAndSet(false, true)) {
            this.f5459q.a(this);
            a();
        }
    }

    @Override // u2.c0
    public final synchronized void M5() {
        this.f5466x.f4669b = false;
        a();
    }

    @Override // u2.c0
    public final synchronized void P4() {
        this.f5466x.f4669b = true;
        a();
    }

    public final synchronized void a() {
        try {
            if (this.f5468z.get() == null) {
                b();
                return;
            }
            if (this.f5467y || !this.f5465w.get()) {
                return;
            }
            try {
                a11 a11Var = this.f5466x;
                a11Var.f4671d = this.f5464v.b();
                final JSONObject b8 = this.f5460r.b(a11Var);
                for (final mr0 mr0Var : this.f5461s) {
                    this.f5463u.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.y01
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            JSONObject jSONObject = b8;
                            String obj = jSONObject.toString();
                            StringBuilder sb = new StringBuilder(obj.length() + 31);
                            sb.append("Calling AFMA_updateActiveView(");
                            sb.append(obj);
                            sb.append(")");
                            String sb2 = sb.toString();
                            int i7 = v2.n1.f26802b;
                            w2.p.a(sb2);
                            mr0Var.c("AFMA_updateActiveView", jSONObject);
                        }
                    });
                }
                fm0.b(this.f5462t.b(b8), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e8) {
                v2.n1.l("Failed to call ActiveViewJS", e8);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        f();
        this.f5467y = true;
    }

    public final synchronized void c(mr0 mr0Var) {
        this.f5461s.add(mr0Var);
        this.f5459q.b(mr0Var);
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final synchronized void d(Context context) {
        this.f5466x.f4672e = "u";
        a();
        f();
        this.f5467y = true;
    }

    public final void e(Object obj) {
        this.f5468z = new WeakReference(obj);
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final synchronized void h(Context context) {
        this.f5466x.f4669b = true;
        a();
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final synchronized void j(Context context) {
        this.f5466x.f4669b = false;
        a();
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final synchronized void t(fr frVar) {
        a11 a11Var = this.f5466x;
        a11Var.f4668a = frVar.f8430j;
        a11Var.f4673f = frVar;
        a();
    }

    @Override // u2.c0
    public final void C7() {
    }

    @Override // u2.c0
    public final void H2() {
    }

    @Override // u2.c0
    public final void T5() {
    }

    @Override // u2.c0
    public final void Z4() {
    }

    @Override // u2.c0
    public final void a4() {
    }

    @Override // u2.c0
    public final void g() {
    }

    @Override // u2.c0
    public final void t7() {
    }

    @Override // u2.c0
    public final void v3() {
    }

    @Override // u2.c0
    public final void V5(int i7) {
    }
}
