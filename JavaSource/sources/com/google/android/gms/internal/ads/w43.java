package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class w43 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18024a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18025b;

    /* renamed from: c, reason: collision with root package name */
    private final a5.d f18026c;

    /* renamed from: d, reason: collision with root package name */
    private final List f18027d;

    /* renamed from: e, reason: collision with root package name */
    private final a5.d f18028e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ x43 f18029f;

    /* synthetic */ w43(x43 x43Var, Object obj, String str, a5.d dVar, List list, a5.d dVar2, byte[] bArr) {
        this(x43Var, obj, null, dVar, list, dVar2);
    }

    public final w43 a(String str) {
        return new w43(this.f18029f, this.f18024a, str, this.f18026c, this.f18027d, this.f18028e);
    }

    public final w43 b(final j43 j43Var) {
        return c(new w54() { // from class: com.google.android.gms.internal.ads.v43
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return p64.a(j43.this.d(obj));
            }
        });
    }

    public final w43 c(w54 w54Var) {
        return d(w54Var, this.f18029f.e());
    }

    public final w43 d(w54 w54Var, Executor executor) {
        return new w43(this.f18029f, this.f18024a, this.f18025b, this.f18026c, this.f18027d, p64.j(this.f18028e, w54Var, executor));
    }

    public final w43 e(final a5.d dVar) {
        return d(new w54() { // from class: com.google.android.gms.internal.ads.s43
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return a5.d.this;
            }
        }, cm0.f6506g);
    }

    public final w43 f(Class cls, final j43 j43Var) {
        return g(cls, new w54(j43Var) { // from class: com.google.android.gms.internal.ads.t43
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return p64.a("");
            }
        });
    }

    public final w43 g(Class cls, w54 w54Var) {
        x43 x43Var = this.f18029f;
        z64 e8 = x43Var.e();
        return new w43(x43Var, this.f18024a, this.f18025b, this.f18026c, this.f18027d, p64.h(this.f18028e, cls, w54Var, e8));
    }

    public final w43 h(long j7, TimeUnit timeUnit) {
        x43 x43Var = this.f18029f;
        ScheduledExecutorService f8 = x43Var.f();
        return new w43(x43Var, this.f18024a, this.f18025b, this.f18026c, this.f18027d, p64.i(this.f18028e, j7, timeUnit, f8));
    }

    public final l43 i() {
        Object obj = this.f18024a;
        String str = this.f18025b;
        if (str == null) {
            str = this.f18029f.c(obj);
        }
        final l43 l43Var = new l43(obj, str, this.f18028e);
        this.f18029f.g().B(l43Var);
        a5.d dVar = this.f18026c;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.u43
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                w43.this.f18029f.g().u(l43Var);
            }
        };
        z64 z64Var = cm0.f6506g;
        dVar.c(runnable, z64Var);
        p64.r(l43Var, new r43(this, l43Var), z64Var);
        return l43Var;
    }

    public final w43 j(Object obj) {
        return this.f18029f.a(obj, i());
    }

    private w43(x43 x43Var, Object obj, String str, a5.d dVar, List list, a5.d dVar2) {
        Objects.requireNonNull(x43Var);
        this.f18029f = x43Var;
        this.f18024a = obj;
        this.f18025b = str;
        this.f18026c = dVar;
        this.f18027d = list;
        this.f18028e = dVar2;
    }
}
