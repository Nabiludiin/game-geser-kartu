package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class x73 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18646a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f18647b;

    /* renamed from: c, reason: collision with root package name */
    private final a74 f18648c;

    /* renamed from: d, reason: collision with root package name */
    private final w2.v f18649d;

    /* renamed from: e, reason: collision with root package name */
    private final o73 f18650e;

    /* renamed from: f, reason: collision with root package name */
    private final e63 f18651f;

    /* renamed from: g, reason: collision with root package name */
    private final du0 f18652g;

    x73(Context context, Executor executor, a74 a74Var, w2.v vVar, o73 o73Var, e63 e63Var, du0 du0Var) {
        this.f18646a = context;
        this.f18647b = executor;
        this.f18648c = a74Var;
        this.f18649d = vVar;
        this.f18650e = o73Var;
        this.f18651f = e63Var;
        this.f18652g = du0Var;
    }

    public final void a(List list, w2.w wVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), wVar, null, null);
        }
    }

    public final void b(final String str, w2.w wVar, b63 b63Var, sc1 sc1Var) {
        a5.d B0;
        r53 r53Var = null;
        if (e63.a() && ((Boolean) p00.f13597d.e()).booleanValue()) {
            r53Var = q53.a(this.f18646a, 14);
            r53Var.a();
        }
        if (wVar != null) {
            B0 = new n73(wVar.a(), this.f18649d, this.f18648c, this.f18650e, this.f18652g).a(str);
        } else {
            B0 = this.f18648c.B0(new Callable() { // from class: com.google.android.gms.internal.ads.w73
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return x73.this.c(str);
                }
            });
        }
        p64.r(B0, new v73(this, r53Var, b63Var, sc1Var), this.f18647b);
    }

    final /* synthetic */ w2.u c(String str) {
        if (!((Boolean) s2.b0.c().d(uy.O9)).booleanValue() || (!r2.t.g().U(str) && !r2.t.g().V(str))) {
            return this.f18649d.c(str, null);
        }
        String b8 = this.f18652g.b();
        HashMap hashMap = new HashMap();
        if (b8 != null) {
            hashMap.put((String) s2.b0.c().d(uy.P9), b8);
        }
        return this.f18649d.c(str, hashMap);
    }

    final /* synthetic */ w2.v d() {
        return this.f18649d;
    }

    final /* synthetic */ e63 e() {
        return this.f18651f;
    }
}
