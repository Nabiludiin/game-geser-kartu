package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class x53 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b63 f18580a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r53 f18581b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f18582c;

    x53(b63 b63Var, r53 r53Var, boolean z7) {
        this.f18580a = b63Var;
        this.f18581b = r53Var;
        this.f18582c = z7;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        r53 r53Var = this.f18581b;
        if (r53Var.b()) {
            b63 b63Var = this.f18580a;
            r53Var.j0(th);
            r53Var.e(false);
            b63Var.a(r53Var);
            if (this.f18582c) {
                b63Var.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void b(Object obj) {
        r53 r53Var = this.f18581b;
        r53Var.e(true);
        b63 b63Var = this.f18580a;
        b63Var.a(r53Var);
        if (this.f18582c) {
            b63Var.h();
        }
    }
}
