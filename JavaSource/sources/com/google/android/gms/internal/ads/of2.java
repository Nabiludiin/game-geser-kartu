package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class of2 implements gb1 {

    /* renamed from: a, reason: collision with root package name */
    boolean f13312a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ na2 f13313b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ im0 f13314c;

    of2(rf2 rf2Var, na2 na2Var, im0 im0Var) {
        this.f13313b = na2Var;
        this.f13314c = im0Var;
        Objects.requireNonNull(rf2Var);
        this.f13312a = false;
    }

    private final synchronized void c(s2.x2 x2Var) {
        int i7 = 1;
        if (true == ((Boolean) s2.b0.c().d(uy.f17088e6)).booleanValue()) {
            i7 = 3;
        }
        this.f13314c.e(new oa2(i7, x2Var));
    }

    @Override // com.google.android.gms.internal.ads.gb1
    public final synchronized void G0(int i7, String str) {
        try {
            if (this.f13312a) {
                return;
            }
            this.f13312a = true;
            if (str == null) {
                str = rf2.e(this.f13313b.f12648a, i7);
            }
            c(new s2.x2(i7, str, "undefined", null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.gb1
    public final synchronized void a() {
        this.f13314c.b(null);
    }

    @Override // com.google.android.gms.internal.ads.gb1
    public final synchronized void b(int i7) {
        if (this.f13312a) {
            return;
        }
        this.f13312a = true;
        c(new s2.x2(i7, rf2.e(this.f13313b.f12648a, i7), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.gb1
    public final synchronized void u0(s2.x2 x2Var) {
        if (this.f13312a) {
            return;
        }
        this.f13312a = true;
        c(x2Var);
    }
}
