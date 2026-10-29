package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class vz1 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f02 f17929a;

    vz1(f02 f02Var) {
        Objects.requireNonNull(f02Var);
        this.f17929a = f02Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        synchronized (this) {
            f02 f02Var = this.f17929a;
            f02Var.n(true);
            f02Var.m("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (r2.t.o().b() - f02Var.o()));
            f02Var.p().e(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            f02 f02Var = this.f17929a;
            f02Var.n(true);
            f02Var.m("com.google.android.gms.ads.MobileAds", true, "", (int) (r2.t.o().b() - f02Var.o()));
            f02Var.q().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uz1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    vz1.this.f17929a.l(str);
                }
            });
        }
    }
}
