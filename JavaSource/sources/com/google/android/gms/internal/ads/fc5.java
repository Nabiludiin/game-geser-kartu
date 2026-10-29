package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
final class fc5 {

    /* renamed from: a, reason: collision with root package name */
    private final ni5 f8183a;

    /* renamed from: e, reason: collision with root package name */
    private final ec5 f8187e;

    /* renamed from: h, reason: collision with root package name */
    private final md5 f8190h;

    /* renamed from: i, reason: collision with root package name */
    private final zn1 f8191i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8192j;

    /* renamed from: k, reason: collision with root package name */
    private kb4 f8193k;

    /* renamed from: l, reason: collision with root package name */
    private tr5 f8194l = new tr5(0);

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f8185c = new IdentityHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f8186d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f8184b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f8188f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Set f8189g = new HashSet();

    public fc5(ec5 ec5Var, md5 md5Var, zn1 zn1Var, ni5 ni5Var) {
        this.f8183a = ni5Var;
        this.f8187e = ec5Var;
        this.f8190h = md5Var;
        this.f8191i = zn1Var;
    }

    private final void q() {
        Iterator it = this.f8189g.iterator();
        while (it.hasNext()) {
            cc5 cc5Var = (cc5) it.next();
            if (cc5Var.f6372c.isEmpty()) {
                r(cc5Var);
                it.remove();
            }
        }
    }

    private final void r(cc5 cc5Var) {
        bc5 bc5Var = (bc5) this.f8188f.get(cc5Var);
        if (bc5Var != null) {
            bc5Var.f5714a.e(bc5Var.f5715b);
        }
    }

    private final void s(int i7, int i8) {
        while (true) {
            i8--;
            if (i8 < i7) {
                return;
            }
            cc5 cc5Var = (cc5) this.f8184b.remove(i8);
            this.f8186d.remove(cc5Var.f6371b);
            t(i8, -cc5Var.f6370a.J().a());
            cc5Var.f6374e = true;
            if (this.f8192j) {
                v(cc5Var);
            }
        }
    }

    private final void t(int i7, int i8) {
        while (true) {
            List list = this.f8184b;
            if (i7 >= list.size()) {
                return;
            }
            ((cc5) list.get(i7)).f6373d += i8;
            i7++;
        }
    }

    private final void u(cc5 cc5Var) {
        sp5 sp5Var = cc5Var.f6370a;
        yp5 yp5Var = new yp5() { // from class: com.google.android.gms.internal.ads.dc5
            @Override // com.google.android.gms.internal.ads.yp5
            public final /* synthetic */ void a(aq5 aq5Var, az azVar) {
                fc5.this.i(aq5Var, azVar);
            }
        };
        zb5 zb5Var = new zb5(this, cc5Var);
        this.f8188f.put(cc5Var, new bc5(sp5Var, yp5Var, zb5Var));
        sp5Var.g(new Handler(hi2.B(), null), zb5Var);
        sp5Var.j(new Handler(hi2.B(), null), zb5Var);
        sp5Var.d(yp5Var, this.f8193k, this.f8183a);
    }

    private final void v(cc5 cc5Var) {
        if (cc5Var.f6374e && cc5Var.f6372c.isEmpty()) {
            bc5 bc5Var = (bc5) this.f8188f.remove(cc5Var);
            bc5Var.getClass();
            aq5 aq5Var = bc5Var.f5714a;
            aq5Var.a(bc5Var.f5715b);
            zb5 zb5Var = bc5Var.f5716c;
            aq5Var.c(zb5Var);
            aq5Var.l(zb5Var);
            this.f8189g.remove(cc5Var);
        }
    }

    public final az a(int i7, int i8, List list) {
        rx3.a(i7 >= 0 && i7 <= i8 && i8 <= c());
        rx3.a(list.size() == i8 - i7);
        for (int i9 = i7; i9 < i8; i9++) {
            ((cc5) this.f8184b.get(i9)).f6370a.i((j9) list.get(i9 - i7));
        }
        return h();
    }

    public final boolean b() {
        return this.f8192j;
    }

    public final int c() {
        return this.f8184b.size();
    }

    public final void d(kb4 kb4Var) {
        rx3.h(!this.f8192j);
        this.f8193k = kb4Var;
        int i7 = 0;
        while (true) {
            List list = this.f8184b;
            if (i7 >= list.size()) {
                this.f8192j = true;
                return;
            }
            cc5 cc5Var = (cc5) list.get(i7);
            u(cc5Var);
            this.f8189g.add(cc5Var);
            i7++;
        }
    }

    public final vp5 e(xp5 xp5Var, ku5 ku5Var, long j7) {
        int i7 = mc5.f12200k;
        Pair pair = (Pair) xp5Var.f18924a;
        Object obj = pair.first;
        xp5 a8 = xp5Var.a(pair.second);
        cc5 cc5Var = (cc5) this.f8186d.get(obj);
        cc5Var.getClass();
        this.f8189g.add(cc5Var);
        bc5 bc5Var = (bc5) this.f8188f.get(cc5Var);
        if (bc5Var != null) {
            bc5Var.f5714a.k(bc5Var.f5715b);
        }
        cc5Var.f6372c.add(a8);
        pp5 f8 = cc5Var.f6370a.f(a8, ku5Var, j7);
        this.f8185c.put(f8, cc5Var);
        q();
        return f8;
    }

    public final void f(vp5 vp5Var) {
        IdentityHashMap identityHashMap = this.f8185c;
        cc5 cc5Var = (cc5) identityHashMap.remove(vp5Var);
        cc5Var.getClass();
        cc5Var.f6370a.h(vp5Var);
        cc5Var.f6372c.remove(((pp5) vp5Var).f14004q);
        if (!identityHashMap.isEmpty()) {
            q();
        }
        v(cc5Var);
    }

    public final void g() {
        for (bc5 bc5Var : this.f8188f.values()) {
            try {
                bc5Var.f5714a.a(bc5Var.f5715b);
            } catch (RuntimeException e8) {
                gv1.f("MediaSourceList", "Failed to release child source.", e8);
            }
            aq5 aq5Var = bc5Var.f5714a;
            zb5 zb5Var = bc5Var.f5716c;
            aq5Var.c(zb5Var);
            aq5Var.l(zb5Var);
        }
        this.f8188f.clear();
        this.f8189g.clear();
        this.f8192j = false;
    }

    public final az h() {
        List list = this.f8184b;
        if (list.isEmpty()) {
            return az.f5406a;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            cc5 cc5Var = (cc5) list.get(i8);
            cc5Var.f6373d = i7;
            i7 += cc5Var.f6370a.J().a();
        }
        return new mc5(list, this.f8194l);
    }

    final /* synthetic */ void i(aq5 aq5Var, az azVar) {
        this.f8187e.q();
    }

    final /* synthetic */ md5 j() {
        return this.f8190h;
    }

    final /* synthetic */ zn1 k() {
        return this.f8191i;
    }

    public final az l(List list, tr5 tr5Var) {
        List list2 = this.f8184b;
        s(0, list2.size());
        return m(list2.size(), list, tr5Var);
    }

    public final az m(int i7, List list, tr5 tr5Var) {
        if (!list.isEmpty()) {
            this.f8194l = tr5Var;
            for (int i8 = i7; i8 < list.size() + i7; i8++) {
                cc5 cc5Var = (cc5) list.get(i8 - i7);
                if (i8 > 0) {
                    cc5 cc5Var2 = (cc5) this.f8184b.get(i8 - 1);
                    cc5Var.c(cc5Var2.f6373d + cc5Var2.f6370a.J().a());
                } else {
                    cc5Var.c(0);
                }
                t(i8, cc5Var.f6370a.J().a());
                this.f8184b.add(i8, cc5Var);
                this.f8186d.put(cc5Var.f6371b, cc5Var);
                if (this.f8192j) {
                    u(cc5Var);
                    if (this.f8185c.isEmpty()) {
                        this.f8189g.add(cc5Var);
                    } else {
                        r(cc5Var);
                    }
                }
            }
        }
        return h();
    }

    public final az n(int i7, int i8, tr5 tr5Var) {
        boolean z7 = false;
        if (i7 >= 0 && i7 <= i8 && i8 <= c()) {
            z7 = true;
        }
        rx3.a(z7);
        this.f8194l = tr5Var;
        s(i7, i8);
        return h();
    }

    public final az o(tr5 tr5Var) {
        int c8 = c();
        if (tr5Var.a() != c8) {
            tr5Var = tr5Var.h().f(0, c8);
        }
        this.f8194l = tr5Var;
        return h();
    }

    public final tr5 p() {
        return this.f8194l;
    }
}
