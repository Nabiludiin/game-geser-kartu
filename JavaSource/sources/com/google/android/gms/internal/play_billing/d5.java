package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class d5 implements j5 {

    /* renamed from: a, reason: collision with root package name */
    private final z4 f21514a;

    /* renamed from: b, reason: collision with root package name */
    private final p5 f21515b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21516c = false;

    /* renamed from: d, reason: collision with root package name */
    private final u3 f21517d;

    private d5(p5 p5Var, u3 u3Var, z4 z4Var) {
        this.f21515b = p5Var;
        this.f21517d = u3Var;
        this.f21514a = z4Var;
    }

    static d5 j(p5 p5Var, u3 u3Var, z4 z4Var) {
        return new d5(p5Var, u3Var, z4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final void a(Object obj, a6 a6Var) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final int b(Object obj) {
        int hashCode = ((d4) obj).zzc.hashCode();
        if (!this.f21516c) {
            return hashCode;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final Object c() {
        z4 z4Var = this.f21514a;
        return z4Var instanceof d4 ? ((d4) z4Var).q() : z4Var.S().f();
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final int d(Object obj) {
        int b8 = ((d4) obj).zzc.b();
        if (!this.f21516c) {
            return b8;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final boolean e(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final void f(Object obj) {
        this.f21515b.b(obj);
        this.f21517d.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final void g(Object obj, Object obj2) {
        l5.u(this.f21515b, obj, obj2);
        if (this.f21516c) {
            l5.t(this.f21517d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final boolean h(Object obj, Object obj2) {
        if (!((d4) obj).zzc.equals(((d4) obj2).zzc)) {
            return false;
        }
        if (!this.f21516c) {
            return true;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.j5
    public final void i(Object obj, byte[] bArr, int i7, int i8, x2 x2Var) {
        d4 d4Var = (d4) obj;
        if (d4Var.zzc == q5.c()) {
            d4Var.zzc = q5.f();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
