package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class o05 {

    /* renamed from: a, reason: collision with root package name */
    private final n05 f13141a;

    private o05(l25 l25Var, Object obj, l25 l25Var2, Object obj2) {
        this.f13141a = new n05(l25Var, "", l25Var2, obj2);
    }

    public static o05 a(l25 l25Var, Object obj, l25 l25Var2, Object obj2) {
        return new o05(l25Var, "", l25Var2, obj2);
    }

    static void b(az4 az4Var, n05 n05Var, Object obj, Object obj2) {
        kz4.c(az4Var, n05Var.f12533a, 1, obj);
        kz4.c(az4Var, n05Var.f12535c, 2, obj2);
    }

    static int c(n05 n05Var, Object obj, Object obj2) {
        return kz4.d(n05Var.f12533a, 1, obj) + kz4.d(n05Var.f12535c, 2, obj2);
    }

    public final int d(int i7, Object obj, Object obj2) {
        n05 n05Var = this.f13141a;
        int b8 = az4.b(i7 << 3);
        int c8 = c(n05Var, obj, obj2);
        return b8 + az4.b(c8) + c8;
    }

    final n05 e() {
        return this.f13141a;
    }
}
