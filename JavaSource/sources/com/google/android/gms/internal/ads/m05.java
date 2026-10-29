package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class m05 implements o15 {

    /* renamed from: b, reason: collision with root package name */
    private static final t05 f12007b = new k05();

    /* renamed from: a, reason: collision with root package name */
    private final t05 f12008a;

    public m05() {
        nz4 c8 = nz4.c();
        int i7 = dy4.f7358a;
        l05 l05Var = new l05(c8, f12007b);
        byte[] bArr = c05.f6204b;
        this.f12008a = l05Var;
    }

    @Override // com.google.android.gms.internal.ads.o15
    public final n15 a(Class cls) {
        int i7 = p15.f13634b;
        if (!sz4.class.isAssignableFrom(cls)) {
            int i8 = dy4.f7358a;
        }
        s05 b8 = this.f12008a.b(cls);
        if (b8.a()) {
            int i9 = dy4.f7358a;
            return a15.b(p15.f(), iz4.a(), b8.b());
        }
        int i10 = dy4.f7358a;
        return z05.H(cls, b8, c15.a(), i05.a(), p15.f(), b8.d() + (-1) != 1 ? iz4.a() : null, r05.a());
    }
}
