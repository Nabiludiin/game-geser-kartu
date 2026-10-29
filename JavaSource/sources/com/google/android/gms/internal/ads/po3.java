package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* compiled from: MyApplication */
public final class po3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13992a;

    /* renamed from: b, reason: collision with root package name */
    private final nu3 f13993b;

    /* renamed from: c, reason: collision with root package name */
    private final jm3 f13994c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13995d;

    po3(Context context, nu3 nu3Var, jm3 jm3Var, li3 li3Var) {
        this.f13992a = context;
        this.f13993b = nu3Var;
        this.f13994c = jm3Var;
        this.f13995d = li3Var.i0();
    }

    public final String a(boolean z7, long j7) {
        String num;
        lu3 a8 = this.f13993b.a(55);
        try {
            try {
                try {
                    a8.a();
                    hl d02 = il.d0();
                    d02.F(this.f13995d);
                    d02.E("0.808261137");
                    d02.H(this.f13992a.getPackageName());
                    d02.G(System.currentTimeMillis() / 1000);
                    d02.J((System.currentTimeMillis() - j7) / 1000);
                    try {
                        d02.I(r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        d02.I(-1L);
                    }
                    jm3 jm3Var = this.f13994c;
                    if (!jm3Var.c()) {
                        jm3Var.a();
                    }
                    ol f8 = jm3Var.f(((il) d02.A()).e(), null);
                    f8.G(5);
                    f8.H(2);
                    num = hj3.a(((pl) f8.A()).e(), true);
                } catch (UnsupportedEncodingException e8) {
                    a8.b(e8);
                    num = Integer.toString(7);
                }
                a8.c();
                return num;
            } catch (Throwable th) {
                a8.b(th);
                throw th;
            }
        } catch (Throwable th2) {
            a8.c();
            throw th2;
        }
    }
}
