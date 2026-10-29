package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
final class bc implements ic {

    /* renamed from: a, reason: collision with root package name */
    private final xb f20835a;

    /* renamed from: b, reason: collision with root package name */
    private final tc f20836b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20837c = false;

    /* renamed from: d, reason: collision with root package name */
    private final ma f20838d;

    private bc(tc tcVar, ma maVar, xb xbVar) {
        this.f20836b = tcVar;
        this.f20838d = maVar;
        this.f20835a = xbVar;
    }

    static bc i(tc tcVar, ma maVar, xb xbVar) {
        return new bc(tcVar, maVar, xbVar);
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final Object a() {
        xb xbVar = this.f20835a;
        return xbVar instanceof xa ? ((xa) xbVar).o() : xbVar.b().h();
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final void b(Object obj) {
        this.f20836b.b(obj);
        this.f20838d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final void c(Object obj, byte[] bArr, int i7, int i8, r9 r9Var) {
        xa xaVar = (xa) obj;
        if (xaVar.zzc == uc.a()) {
            xaVar.zzc = uc.b();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final void d(Object obj, gd gdVar) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final boolean e(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final boolean f(Object obj, Object obj2) {
        if (!((xa) obj).zzc.equals(((xa) obj2).zzc)) {
            return false;
        }
        if (!this.f20837c) {
            return true;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final int g(Object obj) {
        int g8 = ((xa) obj).zzc.g();
        if (!this.f20837c) {
            return g8;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final void h(Object obj, Object obj2) {
        kc.d(this.f20836b, obj, obj2);
        if (this.f20837c) {
            kc.c(this.f20838d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ic
    public final int j(Object obj) {
        int hashCode = ((xa) obj).zzc.hashCode();
        if (!this.f20837c) {
            return hashCode;
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }
}
