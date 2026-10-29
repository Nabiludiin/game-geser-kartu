package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* compiled from: MyApplication */
final class m5 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ int f22353q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ String f22354r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ Object f22355s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ Object f22356t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ Object f22357u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ p5 f22358v;

    m5(p5 p5Var, int i7, String str, Object obj, Object obj2, Object obj3) {
        this.f22353q = i7;
        this.f22354r = str;
        this.f22355s = obj;
        this.f22356t = obj2;
        this.f22357u = obj3;
        Objects.requireNonNull(p5Var);
        this.f22358v = p5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p5 p5Var = this.f22358v;
        d6 x7 = p5Var.f22928a.x();
        if (!x7.k()) {
            Log.println(6, p5Var.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (p5Var.D() == 0) {
            w6 w6Var = p5Var.f22928a;
            if (w6Var.w().B()) {
                w6Var.c();
                p5Var.E('C');
            } else {
                w6Var.c();
                p5Var.E('c');
            }
        }
        if (p5Var.F() < 0) {
            p5Var.f22928a.w().A();
            p5Var.G(133005L);
        }
        int i7 = this.f22353q;
        char D = p5Var.D();
        long F = p5Var.F();
        String str = this.f22354r;
        Object obj = this.f22355s;
        Object obj2 = this.f22356t;
        Object obj3 = this.f22357u;
        char charAt = "01VDIWEA?".charAt(i7);
        String A = p5.A(true, str, obj, obj2, obj3);
        int length = String.valueOf(charAt).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(D).length() + String.valueOf(F).length() + 1 + A.length());
        sb.append("2");
        sb.append(charAt);
        sb.append(D);
        sb.append(F);
        sb.append(":");
        sb.append(A);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = str.substring(0, 1024);
        }
        b6 b6Var = x7.f22025e;
        if (b6Var != null) {
            b6Var.a(sb2, 1L);
        }
    }
}
