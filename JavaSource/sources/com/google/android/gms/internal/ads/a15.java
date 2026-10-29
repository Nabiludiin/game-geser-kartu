package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class a15 implements n15 {

    /* renamed from: a, reason: collision with root package name */
    private final v05 f4684a;

    /* renamed from: b, reason: collision with root package name */
    private final y15 f4685b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4686c = false;

    /* renamed from: d, reason: collision with root package name */
    private final fz4 f4687d;

    private a15(y15 y15Var, fz4 fz4Var, v05 v05Var) {
        this.f4685b = y15Var;
        this.f4687d = fz4Var;
        this.f4684a = v05Var;
    }

    static a15 b(y15 y15Var, fz4 fz4Var, v05 v05Var) {
        return new a15(y15Var, fz4Var, v05Var);
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final Object a() {
        v05 v05Var = this.f4684a;
        return v05Var instanceof sz4 ? ((sz4) v05Var).M() : v05Var.l().c();
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final void e(Object obj) {
        this.f4685b.j(obj);
        this.f4687d.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final boolean f(Object obj, Object obj2) {
        if (!((sz4) obj).zzt.equals(((sz4) obj2).zzt)) {
            return false;
        }
        if (!this.f4686c) {
            return true;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final int g(Object obj) {
        int g8 = ((sz4) obj).zzt.g();
        if (!this.f4686c) {
            return g8;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final void h(Object obj, Object obj2) {
        p15.i(this.f4685b, obj, obj2);
        if (this.f4686c) {
            p15.h(this.f4687d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final boolean i(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final int j(Object obj) {
        int hashCode = ((sz4) obj).zzt.hashCode();
        if (!this.f4686c) {
            return hashCode;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final void k(Object obj, n25 n25Var) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final void l(Object obj, i15 i15Var, ez4 ez4Var) {
        this.f4685b.h(obj);
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.n15
    public final void m(Object obj, byte[] bArr, int i7, int i8, ey4 ey4Var) {
        sz4 sz4Var = (sz4) obj;
        if (sz4Var.zzt == z15.a()) {
            sz4Var.zzt = z15.b();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
