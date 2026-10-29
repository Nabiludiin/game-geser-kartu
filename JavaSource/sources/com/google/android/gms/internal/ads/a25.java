package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class a25 extends y15 {
    a25() {
    }

    @Override // com.google.android.gms.internal.ads.y15
    final /* bridge */ /* synthetic */ void a(Object obj, int i7, long j7) {
        ((z15) obj).j(i7 << 3, Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.ads.y15
    final /* bridge */ /* synthetic */ void b(Object obj, int i7, int i8) {
        ((z15) obj).j((i7 << 3) | 5, Integer.valueOf(i8));
    }

    @Override // com.google.android.gms.internal.ads.y15
    final /* bridge */ /* synthetic */ void c(Object obj, int i7, long j7) {
        ((z15) obj).j((i7 << 3) | 1, Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.ads.y15
    final /* bridge */ /* synthetic */ void d(Object obj, int i7, qy4 qy4Var) {
        ((z15) obj).j((i7 << 3) | 2, qy4Var);
    }

    @Override // com.google.android.gms.internal.ads.y15
    final /* bridge */ /* synthetic */ void e(Object obj, int i7, Object obj2) {
        ((z15) obj).j((i7 << 3) | 3, (z15) obj2);
    }

    @Override // com.google.android.gms.internal.ads.y15
    final /* synthetic */ Object f() {
        return z15.b();
    }

    @Override // com.google.android.gms.internal.ads.y15
    final /* synthetic */ Object g(Object obj) {
        z15 z15Var = (z15) obj;
        z15Var.d();
        return z15Var;
    }

    @Override // com.google.android.gms.internal.ads.y15
    final /* bridge */ /* synthetic */ Object h(Object obj) {
        sz4 sz4Var = (sz4) obj;
        z15 z15Var = sz4Var.zzt;
        if (z15Var != z15.a()) {
            return z15Var;
        }
        z15 b8 = z15.b();
        sz4Var.zzt = b8;
        return b8;
    }

    @Override // com.google.android.gms.internal.ads.y15
    final /* synthetic */ void i(Object obj, Object obj2) {
        ((sz4) obj).zzt = (z15) obj2;
    }

    @Override // com.google.android.gms.internal.ads.y15
    final void j(Object obj) {
        ((sz4) obj).zzt.d();
    }
}
