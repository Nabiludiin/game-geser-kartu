package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class gk3 {

    /* renamed from: a, reason: collision with root package name */
    private final h85 f8969a;

    /* renamed from: b, reason: collision with root package name */
    private final h85 f8970b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f8971c;

    /* renamed from: d, reason: collision with root package name */
    private final h85 f8972d;

    /* renamed from: e, reason: collision with root package name */
    private a5.d f8973e = null;

    gk3(h85 h85Var, h85 h85Var2, ExecutorService executorService, h85 h85Var3) {
        this.f8969a = h85Var;
        this.f8970b = h85Var2;
        this.f8971c = executorService;
        this.f8972d = h85Var3;
    }

    public final synchronized a5.d a() {
        try {
            a5.d dVar = this.f8973e;
            if (dVar != null) {
                return dVar;
            }
            Set set = (Set) this.f8970b.b();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((ek3) it.next()).a());
            }
            nu3 nu3Var = (nu3) this.f8972d.b();
            a5.d k7 = p64.k(p64.m(arrayList), fk3.f8307a, this.f8971c);
            nu3Var.e(2, k7);
            this.f8973e = k7;
            Iterator it2 = ((Set) this.f8969a.b()).iterator();
            while (it2.hasNext()) {
                ((ek3) it2.next()).a();
            }
            a5.d dVar2 = this.f8973e;
            if (dVar2 != null) {
                return dVar2;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized a5.d b() {
        a5.d dVar;
        dVar = this.f8973e;
        if (dVar == null) {
            throw null;
        }
        return dVar;
    }
}
