package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    final n3 f20891a;

    /* renamed from: b, reason: collision with root package name */
    o4 f20892b;

    /* renamed from: c, reason: collision with root package name */
    final c f20893c;

    /* renamed from: d, reason: collision with root package name */
    private final pg f20894d;

    public e1() {
        n3 n3Var = new n3();
        this.f20891a = n3Var;
        this.f20892b = n3Var.f21149b.c();
        this.f20893c = new c();
        this.f20894d = new pg();
        n3Var.f21151d.a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.d0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return e1.this.g();
            }
        });
        n3Var.f21151d.a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new v8(e1.this.f20893c);
            }
        });
    }

    public final void a(String str, Callable callable) {
        this.f20891a.f21151d.a(str, callable);
    }

    public final boolean b(b bVar) {
        try {
            c cVar = this.f20893c;
            cVar.b(bVar);
            this.f20891a.f21150c.e("runtime.counter", new j(Double.valueOf(0.0d)));
            this.f20894d.b(this.f20892b.c(), cVar);
            if (c()) {
                return true;
            }
            return d();
        } catch (Throwable th) {
            throw new d2(th);
        }
    }

    public final boolean c() {
        c cVar = this.f20893c;
        return !cVar.c().equals(cVar.a());
    }

    public final boolean d() {
        return !this.f20893c.f().isEmpty();
    }

    public final c e() {
        return this.f20893c;
    }

    public final void f(s7 s7Var) {
        k kVar;
        try {
            n3 n3Var = this.f20891a;
            this.f20892b = n3Var.f21149b.c();
            if (n3Var.a(this.f20892b, (w7[]) s7Var.F().toArray(new w7[0])) instanceof h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (p7 p7Var : s7Var.G().F()) {
                List G = p7Var.G();
                String F = p7Var.F();
                Iterator it = G.iterator();
                while (it.hasNext()) {
                    r a8 = n3Var.a(this.f20892b, (w7) it.next());
                    if (!(a8 instanceof o)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    o4 o4Var = this.f20892b;
                    if (o4Var.d(F)) {
                        r h8 = o4Var.h(F);
                        if (!(h8 instanceof k)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(F)));
                        }
                        kVar = (k) h8;
                    } else {
                        kVar = null;
                    }
                    if (kVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(F)));
                    }
                    kVar.a(this.f20892b, Collections.singletonList(a8));
                }
            }
        } catch (Throwable th) {
            throw new d2(th);
        }
    }

    final /* synthetic */ k g() {
        return new lg(this.f20894d);
    }
}
