package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class nu3 {

    /* renamed from: a, reason: collision with root package name */
    private final ik3 f12928a;

    /* renamed from: b, reason: collision with root package name */
    private final sh3 f12929b;

    nu3(sh3 sh3Var, ik3 ik3Var) {
        this.f12928a = ik3Var;
        this.f12929b = sh3Var;
    }

    public final lu3 a(int i7) {
        return new lu3(i7, this.f12929b, this.f12928a);
    }

    public final void b(int i7) {
        this.f12928a.c(i7 - 1, -1L, null, null);
    }

    public final void c(int i7, String str) {
        this.f12928a.c(i7 - 1, -1L, null, str);
    }

    public final void d(int i7, Throwable th) {
        this.f12928a.c(i7 - 1, -1L, th, null);
    }

    public final a5.d e(int i7, a5.d dVar) {
        lu3 a8 = a(i7);
        a8.a();
        p64.r(dVar, new mu3(this, a8), g74.a());
        return dVar;
    }

    public final void f(int i7, Runnable runnable) {
        try {
            a(i7).a();
            runnable.run();
        } finally {
        }
    }
}
