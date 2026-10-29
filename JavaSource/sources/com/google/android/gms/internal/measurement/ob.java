package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
final class ob implements jc {

    /* renamed from: b, reason: collision with root package name */
    private static final vb f21209b = new mb();

    /* renamed from: a, reason: collision with root package name */
    private final vb f21210a;

    public ob() {
        ua c8 = ua.c();
        int i7 = fc.f20950d;
        nb nbVar = new nb(c8, f21209b);
        byte[] bArr = eb.f20914b;
        this.f21210a = nbVar;
    }

    @Override // com.google.android.gms.internal.measurement.jc
    public final ic a(Class cls) {
        int i7 = kc.f21080b;
        if (!xa.class.isAssignableFrom(cls)) {
            int i8 = fc.f20950d;
        }
        ub b8 = this.f21210a.b(cls);
        if (b8.a()) {
            int i9 = fc.f20950d;
            return bc.i(kc.a(), oa.a(), b8.b());
        }
        int i10 = fc.f20950d;
        return ac.B(cls, b8, dc.a(), jb.a(), kc.a(), b8.d() + (-1) != 1 ? oa.a() : null, tb.a());
    }
}
