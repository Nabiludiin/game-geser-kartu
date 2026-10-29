package m3;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import l3.a;
import l3.f;

/* compiled from: MyApplication */
public final class h0 implements f.b, f.c, p1 {
    final /* synthetic */ g C;

    /* renamed from: r, reason: collision with root package name */
    private final a.f f24802r;

    /* renamed from: s, reason: collision with root package name */
    private final b f24803s;

    /* renamed from: t, reason: collision with root package name */
    private final u f24804t;

    /* renamed from: w, reason: collision with root package name */
    private final int f24807w;

    /* renamed from: x, reason: collision with root package name */
    private final y0 f24808x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f24809y;

    /* renamed from: q, reason: collision with root package name */
    private final Queue f24801q = new LinkedList();

    /* renamed from: u, reason: collision with root package name */
    private final Set f24805u = new HashSet();

    /* renamed from: v, reason: collision with root package name */
    private final Map f24806v = new HashMap();

    /* renamed from: z, reason: collision with root package name */
    private final List f24810z = new ArrayList();
    private k3.b A = null;
    private int B = 0;

    public h0(g gVar, l3.e eVar) {
        this.C = gVar;
        a.f l7 = eVar.l(gVar.D.getLooper(), this);
        this.f24802r = l7;
        this.f24803s = eVar.h();
        this.f24804t = new u();
        this.f24807w = eVar.k();
        if (l7.t()) {
            this.f24808x = eVar.m(gVar.f24789u, gVar.D);
        } else {
            this.f24808x = null;
        }
    }

    static /* bridge */ /* synthetic */ void A(h0 h0Var, j0 j0Var) {
        k3.d dVar;
        k3.d[] g8;
        if (h0Var.f24810z.remove(j0Var)) {
            h0Var.C.D.removeMessages(15, j0Var);
            h0Var.C.D.removeMessages(16, j0Var);
            dVar = j0Var.f24816b;
            ArrayList arrayList = new ArrayList(h0Var.f24801q.size());
            for (f1 f1Var : h0Var.f24801q) {
                if ((f1Var instanceof q0) && (g8 = ((q0) f1Var).g(h0Var)) != null && com.google.android.gms.common.util.b.b(g8, dVar)) {
                    arrayList.add(f1Var);
                }
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                f1 f1Var2 = (f1) arrayList.get(i7);
                h0Var.f24801q.remove(f1Var2);
                f1Var2.b(new l3.l(dVar));
            }
        }
    }

    private final k3.d d(k3.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            k3.d[] p7 = this.f24802r.p();
            if (p7 == null) {
                p7 = new k3.d[0];
            }
            r.a aVar = new r.a(p7.length);
            for (k3.d dVar : p7) {
                aVar.put(dVar.getName(), Long.valueOf(dVar.M0()));
            }
            for (k3.d dVar2 : dVarArr) {
                Long l7 = (Long) aVar.get(dVar2.getName());
                if (l7 == null || l7.longValue() < dVar2.M0()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private final void e(k3.b bVar) {
        Iterator it = this.f24805u.iterator();
        if (!it.hasNext()) {
            this.f24805u.clear();
            return;
        }
        android.support.v4.media.session.b.a(it.next());
        if (p3.n.a(bVar, k3.b.f24462u)) {
            this.f24802r.g();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Status status) {
        p3.o.d(this.C.D);
        g(status, null, false);
    }

    private final void g(Status status, Exception exc, boolean z7) {
        p3.o.d(this.C.D);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f24801q.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if (!z7 || f1Var.f24784a == 2) {
                if (status != null) {
                    f1Var.a(status);
                } else {
                    f1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void h() {
        ArrayList arrayList = new ArrayList(this.f24801q);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            f1 f1Var = (f1) arrayList.get(i7);
            if (!this.f24802r.a()) {
                return;
            }
            if (n(f1Var)) {
                this.f24801q.remove(f1Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        B();
        e(k3.b.f24462u);
        m();
        Iterator it = this.f24806v.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        h();
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(int i7) {
        B();
        this.f24809y = true;
        this.f24804t.e(i7, this.f24802r.r());
        b bVar = this.f24803s;
        g gVar = this.C;
        gVar.D.sendMessageDelayed(Message.obtain(gVar.D, 9, bVar), 5000L);
        b bVar2 = this.f24803s;
        g gVar2 = this.C;
        gVar2.D.sendMessageDelayed(Message.obtain(gVar2.D, 11, bVar2), 120000L);
        this.C.f24791w.c();
        Iterator it = this.f24806v.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private final void k() {
        this.C.D.removeMessages(12, this.f24803s);
        b bVar = this.f24803s;
        g gVar = this.C;
        gVar.D.sendMessageDelayed(gVar.D.obtainMessage(12, bVar), this.C.f24785q);
    }

    private final void l(f1 f1Var) {
        f1Var.d(this.f24804t, b());
        try {
            f1Var.c(this);
        } catch (DeadObjectException unused) {
            O(1);
            this.f24802r.d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void m() {
        if (this.f24809y) {
            g gVar = this.C;
            gVar.D.removeMessages(11, this.f24803s);
            g gVar2 = this.C;
            gVar2.D.removeMessages(9, this.f24803s);
            this.f24809y = false;
        }
    }

    private final boolean n(f1 f1Var) {
        if (!(f1Var instanceof q0)) {
            l(f1Var);
            return true;
        }
        q0 q0Var = (q0) f1Var;
        k3.d d8 = d(q0Var.g(this));
        if (d8 == null) {
            l(f1Var);
            return true;
        }
        Log.w("GoogleApiManager", this.f24802r.getClass().getName() + " could not execute call because it requires feature (" + d8.getName() + ", " + d8.M0() + ").");
        if (!this.C.E || !q0Var.f(this)) {
            q0Var.b(new l3.l(d8));
            return true;
        }
        j0 j0Var = new j0(this.f24803s, d8, null);
        int indexOf = this.f24810z.indexOf(j0Var);
        if (indexOf >= 0) {
            j0 j0Var2 = (j0) this.f24810z.get(indexOf);
            this.C.D.removeMessages(15, j0Var2);
            g gVar = this.C;
            gVar.D.sendMessageDelayed(Message.obtain(gVar.D, 15, j0Var2), 5000L);
            return false;
        }
        this.f24810z.add(j0Var);
        g gVar2 = this.C;
        gVar2.D.sendMessageDelayed(Message.obtain(gVar2.D, 15, j0Var), 5000L);
        g gVar3 = this.C;
        gVar3.D.sendMessageDelayed(Message.obtain(gVar3.D, 16, j0Var), 120000L);
        k3.b bVar = new k3.b(2, null);
        if (o(bVar)) {
            return false;
        }
        this.C.e(bVar, this.f24807w);
        return false;
    }

    private final boolean o(k3.b bVar) {
        synchronized (g.H) {
            try {
                g gVar = this.C;
                if (gVar.A == null || !gVar.B.contains(this.f24803s)) {
                    return false;
                }
                this.C.A.s(bVar, this.f24807w);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean p(boolean z7) {
        p3.o.d(this.C.D);
        if (!this.f24802r.a() || !this.f24806v.isEmpty()) {
            return false;
        }
        if (!this.f24804t.g()) {
            this.f24802r.d("Timing out service connection.");
            return true;
        }
        if (!z7) {
            return false;
        }
        k();
        return false;
    }

    static /* bridge */ /* synthetic */ void z(h0 h0Var, j0 j0Var) {
        if (h0Var.f24810z.contains(j0Var) && !h0Var.f24809y) {
            if (h0Var.f24802r.a()) {
                h0Var.h();
            } else {
                h0Var.C();
            }
        }
    }

    public final void B() {
        p3.o.d(this.C.D);
        this.A = null;
    }

    public final void C() {
        p3.o.d(this.C.D);
        if (this.f24802r.a() || this.f24802r.f()) {
            return;
        }
        try {
            g gVar = this.C;
            int b8 = gVar.f24791w.b(gVar.f24789u, this.f24802r);
            if (b8 == 0) {
                g gVar2 = this.C;
                a.f fVar = this.f24802r;
                l0 l0Var = new l0(gVar2, fVar, this.f24803s);
                if (fVar.t()) {
                    ((y0) p3.o.m(this.f24808x)).a4(l0Var);
                }
                try {
                    this.f24802r.e(l0Var);
                    return;
                } catch (SecurityException e8) {
                    F(new k3.b(10), e8);
                    return;
                }
            }
            k3.b bVar = new k3.b(b8, null);
            Log.w("GoogleApiManager", "The service for " + this.f24802r.getClass().getName() + " is not available: " + bVar.toString());
            F(bVar, null);
        } catch (IllegalStateException e9) {
            F(new k3.b(10), e9);
        }
    }

    public final void D(f1 f1Var) {
        p3.o.d(this.C.D);
        if (this.f24802r.a()) {
            if (n(f1Var)) {
                k();
                return;
            } else {
                this.f24801q.add(f1Var);
                return;
            }
        }
        this.f24801q.add(f1Var);
        k3.b bVar = this.A;
        if (bVar == null || !bVar.P0()) {
            C();
        } else {
            F(this.A, null);
        }
    }

    final void E() {
        this.B++;
    }

    public final void F(k3.b bVar, Exception exc) {
        p3.o.d(this.C.D);
        y0 y0Var = this.f24808x;
        if (y0Var != null) {
            y0Var.u4();
        }
        B();
        this.C.f24791w.c();
        e(bVar);
        if ((this.f24802r instanceof r3.e) && bVar.M0() != 24) {
            this.C.f24786r = true;
            g gVar = this.C;
            gVar.D.sendMessageDelayed(gVar.D.obtainMessage(19), 300000L);
        }
        if (bVar.M0() == 4) {
            f(g.G);
            return;
        }
        if (this.f24801q.isEmpty()) {
            this.A = bVar;
            return;
        }
        if (exc != null) {
            p3.o.d(this.C.D);
            g(null, exc, false);
            return;
        }
        if (!this.C.E) {
            f(g.f(this.f24803s, bVar));
            return;
        }
        g(g.f(this.f24803s, bVar), null, true);
        if (this.f24801q.isEmpty() || o(bVar) || this.C.e(bVar, this.f24807w)) {
            return;
        }
        if (bVar.M0() == 18) {
            this.f24809y = true;
        }
        if (!this.f24809y) {
            f(g.f(this.f24803s, bVar));
            return;
        }
        g gVar2 = this.C;
        gVar2.D.sendMessageDelayed(Message.obtain(gVar2.D, 9, this.f24803s), 5000L);
    }

    public final void G(k3.b bVar) {
        p3.o.d(this.C.D);
        a.f fVar = this.f24802r;
        fVar.d("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(bVar));
        F(bVar, null);
    }

    public final void H() {
        p3.o.d(this.C.D);
        if (this.f24809y) {
            C();
        }
    }

    @Override // m3.p1
    public final void H2(k3.b bVar, l3.a aVar, boolean z7) {
        throw null;
    }

    public final void I() {
        p3.o.d(this.C.D);
        f(g.F);
        this.f24804t.f();
        for (k kVar : (k[]) this.f24806v.keySet().toArray(new k[0])) {
            D(new e1(null, new w4.j()));
        }
        e(new k3.b(4));
        if (this.f24802r.a()) {
            this.f24802r.l(new g0(this));
        }
    }

    public final void J() {
        p3.o.d(this.C.D);
        if (this.f24809y) {
            m();
            g gVar = this.C;
            f(gVar.f24790v.i(gVar.f24789u) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f24802r.d("Timing out connection while resuming.");
        }
    }

    @Override // m3.e
    public final void O(int i7) {
        if (Looper.myLooper() == this.C.D.getLooper()) {
            j(i7);
        } else {
            this.C.D.post(new e0(this, i7));
        }
    }

    @Override // m3.n
    public final void a(k3.b bVar) {
        F(bVar, null);
    }

    public final boolean b() {
        return this.f24802r.t();
    }

    public final boolean c() {
        return p(true);
    }

    public final int q() {
        return this.f24807w;
    }

    final int r() {
        return this.B;
    }

    @Override // m3.e
    public final void r0(Bundle bundle) {
        if (Looper.myLooper() == this.C.D.getLooper()) {
            i();
        } else {
            this.C.D.post(new d0(this));
        }
    }

    public final a.f t() {
        return this.f24802r;
    }

    public final Map v() {
        return this.f24806v;
    }
}
