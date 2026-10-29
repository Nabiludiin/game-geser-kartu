package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import l3.a;
import p3.l0;

/* compiled from: MyApplication */
public final class p implements m3.z {

    /* renamed from: a, reason: collision with root package name */
    private final x f4474a;

    /* renamed from: b, reason: collision with root package name */
    private final Lock f4475b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4476c;

    /* renamed from: d, reason: collision with root package name */
    private final k3.h f4477d;

    /* renamed from: e, reason: collision with root package name */
    private k3.b f4478e;

    /* renamed from: f, reason: collision with root package name */
    private int f4479f;

    /* renamed from: h, reason: collision with root package name */
    private int f4481h;

    /* renamed from: k, reason: collision with root package name */
    private u4.e f4484k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f4485l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4486m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4487n;

    /* renamed from: o, reason: collision with root package name */
    private p3.j f4488o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4489p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4490q;

    /* renamed from: r, reason: collision with root package name */
    private final p3.d f4491r;

    /* renamed from: s, reason: collision with root package name */
    private final Map f4492s;

    /* renamed from: t, reason: collision with root package name */
    private final a.AbstractC0106a f4493t;

    /* renamed from: g, reason: collision with root package name */
    private int f4480g = 0;

    /* renamed from: i, reason: collision with root package name */
    private final Bundle f4482i = new Bundle();

    /* renamed from: j, reason: collision with root package name */
    private final Set f4483j = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    private final ArrayList f4494u = new ArrayList();

    public p(x xVar, p3.d dVar, Map map, k3.h hVar, a.AbstractC0106a abstractC0106a, Lock lock, Context context) {
        this.f4474a = xVar;
        this.f4491r = dVar;
        this.f4492s = map;
        this.f4477d = hVar;
        this.f4493t = abstractC0106a;
        this.f4475b = lock;
        this.f4476c = context;
    }

    static /* bridge */ /* synthetic */ void A(p pVar, v4.l lVar) {
        if (pVar.n(0)) {
            k3.b M0 = lVar.M0();
            if (!M0.Q0()) {
                if (!pVar.p(M0)) {
                    pVar.k(M0);
                    return;
                } else {
                    pVar.h();
                    pVar.m();
                    return;
                }
            }
            l0 l0Var = (l0) p3.o.m(lVar.N0());
            k3.b M02 = l0Var.M0();
            if (!M02.Q0()) {
                String valueOf = String.valueOf(M02);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                pVar.k(M02);
                return;
            }
            pVar.f4487n = true;
            pVar.f4488o = (p3.j) p3.o.m(l0Var.N0());
            pVar.f4489p = l0Var.O0();
            pVar.f4490q = l0Var.P0();
            pVar.m();
        }
    }

    private final void I() {
        ArrayList arrayList = this.f4494u;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Future) arrayList.get(i7)).cancel(true);
        }
        this.f4494u.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.f4486m = false;
        this.f4474a.D.f4513p = Collections.EMPTY_SET;
        for (a.c cVar : this.f4483j) {
            if (!this.f4474a.f4531w.containsKey(cVar)) {
                x xVar = this.f4474a;
                xVar.f4531w.put(cVar, new k3.b(17, null));
            }
        }
    }

    private final void i(boolean z7) {
        u4.e eVar = this.f4484k;
        if (eVar != null) {
            if (eVar.a() && z7) {
                eVar.q();
            }
            eVar.h();
            this.f4488o = null;
        }
    }

    private final void j() {
        this.f4474a.h();
        m3.a0.a().execute(new f(this));
        u4.e eVar = this.f4484k;
        if (eVar != null) {
            if (this.f4489p) {
                eVar.i((p3.j) p3.o.m(this.f4488o), this.f4490q);
            }
            i(false);
        }
        Iterator it = this.f4474a.f4531w.keySet().iterator();
        while (it.hasNext()) {
            ((a.f) p3.o.m((a.f) this.f4474a.f4530v.get((a.c) it.next()))).h();
        }
        this.f4474a.E.b(this.f4482i.isEmpty() ? null : this.f4482i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(k3.b bVar) {
        I();
        i(!bVar.P0());
        this.f4474a.j(bVar);
        this.f4474a.E.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(k3.b bVar, l3.a aVar, boolean z7) {
        int b8 = aVar.c().b();
        if ((!z7 || bVar.P0() || this.f4477d.c(bVar.M0()) != null) && (this.f4478e == null || b8 < this.f4479f)) {
            this.f4478e = bVar;
            this.f4479f = b8;
        }
        x xVar = this.f4474a;
        xVar.f4531w.put(aVar.b(), bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (this.f4481h != 0) {
            return;
        }
        if (!this.f4486m || this.f4487n) {
            ArrayList arrayList = new ArrayList();
            this.f4480g = 1;
            this.f4481h = this.f4474a.f4530v.size();
            for (a.c cVar : this.f4474a.f4530v.keySet()) {
                if (!this.f4474a.f4531w.containsKey(cVar)) {
                    arrayList.add((a.f) this.f4474a.f4530v.get(cVar));
                } else if (o()) {
                    j();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f4494u.add(m3.a0.a().submit(new k(this, arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(int i7) {
        if (this.f4480g == i7) {
            return true;
        }
        Log.w("GACConnecting", this.f4474a.D.q());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.f4481h);
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + q(this.f4480g) + " but received callback for step " + q(i7), new Exception());
        k(new k3.b(8, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        int i7 = this.f4481h - 1;
        this.f4481h = i7;
        if (i7 > 0) {
            return false;
        }
        if (i7 < 0) {
            Log.w("GACConnecting", this.f4474a.D.q());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            k(new k3.b(8, null));
            return false;
        }
        k3.b bVar = this.f4478e;
        if (bVar == null) {
            return true;
        }
        this.f4474a.C = this.f4479f;
        k(bVar);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(k3.b bVar) {
        return this.f4485l && !bVar.P0();
    }

    private static final String q(int i7) {
        return i7 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    static /* bridge */ /* synthetic */ Set x(p pVar) {
        p3.d dVar = pVar.f4491r;
        if (dVar == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(dVar.f());
        Map k7 = pVar.f4491r.k();
        for (l3.a aVar : k7.keySet()) {
            x xVar = pVar.f4474a;
            if (!xVar.f4531w.containsKey(aVar.b())) {
                android.support.v4.media.session.b.a(k7.get(aVar));
                throw null;
            }
        }
        return hashSet;
    }

    @Override // m3.z
    public final void a(Bundle bundle) {
        if (n(1)) {
            if (bundle != null) {
                this.f4482i.putAll(bundle);
            }
            if (o()) {
                j();
            }
        }
    }

    @Override // m3.z
    public final void c(int i7) {
        k(new k3.b(8, null));
    }

    @Override // m3.z
    public final void d(k3.b bVar, l3.a aVar, boolean z7) {
        if (n(1)) {
            l(bVar, aVar, z7);
            if (o()) {
                j();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [l3.a$f, u4.e] */
    @Override // m3.z
    public final void e() {
        this.f4474a.f4531w.clear();
        this.f4486m = false;
        m3.x xVar = null;
        this.f4478e = null;
        this.f4480g = 0;
        this.f4485l = true;
        this.f4487n = false;
        this.f4489p = false;
        HashMap hashMap = new HashMap();
        boolean z7 = false;
        for (l3.a aVar : this.f4492s.keySet()) {
            a.f fVar = (a.f) p3.o.m((a.f) this.f4474a.f4530v.get(aVar.b()));
            z7 |= aVar.c().b() == 1;
            boolean booleanValue = ((Boolean) this.f4492s.get(aVar)).booleanValue();
            if (fVar.t()) {
                this.f4486m = true;
                if (booleanValue) {
                    this.f4483j.add(aVar.b());
                } else {
                    this.f4485l = false;
                }
            }
            hashMap.put(fVar, new g(this, aVar, booleanValue));
        }
        if (z7) {
            this.f4486m = false;
        }
        if (this.f4486m) {
            p3.o.m(this.f4491r);
            p3.o.m(this.f4493t);
            this.f4491r.l(Integer.valueOf(System.identityHashCode(this.f4474a.D)));
            n nVar = new n(this, xVar);
            a.AbstractC0106a abstractC0106a = this.f4493t;
            Context context = this.f4476c;
            x xVar2 = this.f4474a;
            p3.d dVar = this.f4491r;
            this.f4484k = abstractC0106a.c(context, xVar2.D.i(), dVar, dVar.h(), nVar, nVar);
        }
        this.f4481h = this.f4474a.f4530v.size();
        this.f4494u.add(m3.a0.a().submit(new j(this, hashMap)));
    }

    @Override // m3.z
    public final boolean f() {
        I();
        i(true);
        this.f4474a.j(null);
        return true;
    }

    @Override // m3.z
    public final a g(a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // m3.z
    public final void b() {
    }
}
