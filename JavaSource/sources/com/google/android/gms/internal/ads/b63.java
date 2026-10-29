package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class b63 implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    private final e63 f5594r;

    /* renamed from: s, reason: collision with root package name */
    private String f5595s;

    /* renamed from: u, reason: collision with root package name */
    private String f5597u;

    /* renamed from: v, reason: collision with root package name */
    private n03 f5598v;

    /* renamed from: w, reason: collision with root package name */
    private s2.x2 f5599w;

    /* renamed from: x, reason: collision with root package name */
    private Future f5600x;

    /* renamed from: q, reason: collision with root package name */
    private final List f5593q = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    private int f5601y = 2;

    /* renamed from: t, reason: collision with root package name */
    private g63 f5596t = g63.SCAR_REQUEST_TYPE_UNSPECIFIED;

    b63(e63 e63Var) {
        this.f5594r = e63Var;
    }

    public final synchronized b63 a(r53 r53Var) {
        try {
            if (((Boolean) p00.f13596c.e()).booleanValue()) {
                List list = this.f5593q;
                r53Var.d();
                list.add(r53Var);
                Future future = this.f5600x;
                if (future != null) {
                    future.cancel(false);
                }
                this.f5600x = cm0.f6503d.schedule(this, ((Integer) s2.b0.c().d(uy.H9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized b63 b(ArrayList arrayList) {
        try {
            if (((Boolean) p00.f13596c.e()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains(k2.c.BANNER.name())) {
                    if (!arrayList.contains("interstitial") && !arrayList.contains(k2.c.INTERSTITIAL.name())) {
                        if (!arrayList.contains("native") && !arrayList.contains(k2.c.NATIVE.name())) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains(k2.c.REWARDED.name())) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.f5601y = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(k2.c.REWARDED_INTERSTITIAL.name())) {
                                    this.f5601y = 6;
                                }
                            }
                            this.f5601y = 5;
                        }
                        this.f5601y = 8;
                    }
                    this.f5601y = 4;
                }
                this.f5601y = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized b63 c(String str) {
        if (((Boolean) p00.f13596c.e()).booleanValue() && a63.a(str)) {
            this.f5595s = str;
        }
        return this;
    }

    public final synchronized b63 d(Bundle bundle) {
        if (((Boolean) p00.f13596c.e()).booleanValue()) {
            this.f5596t = b3.c.d(bundle);
        }
        return this;
    }

    public final synchronized b63 e(n03 n03Var) {
        if (((Boolean) p00.f13596c.e()).booleanValue()) {
            this.f5598v = n03Var;
        }
        return this;
    }

    public final synchronized b63 f(s2.x2 x2Var) {
        if (((Boolean) p00.f13596c.e()).booleanValue()) {
            this.f5599w = x2Var;
        }
        return this;
    }

    public final synchronized b63 g(String str) {
        if (((Boolean) p00.f13596c.e()).booleanValue()) {
            this.f5597u = str;
        }
        return this;
    }

    public final synchronized void h() {
        try {
            if (((Boolean) p00.f13596c.e()).booleanValue()) {
                Future future = this.f5600x;
                if (future != null) {
                    future.cancel(false);
                }
                List<r53> list = this.f5593q;
                for (r53 r53Var : list) {
                    int i7 = this.f5601y;
                    if (i7 != 2) {
                        r53Var.i0(i7);
                    }
                    if (!TextUtils.isEmpty(this.f5595s)) {
                        r53Var.y(this.f5595s);
                    }
                    if (!TextUtils.isEmpty(this.f5597u) && !r53Var.k()) {
                        r53Var.c0(this.f5597u);
                    }
                    n03 n03Var = this.f5598v;
                    if (n03Var != null) {
                        r53Var.m0(n03Var);
                    } else {
                        s2.x2 x2Var = this.f5599w;
                        if (x2Var != null) {
                            r53Var.l0(x2Var);
                        }
                    }
                    r53Var.k0(this.f5596t);
                    this.f5594r.b(r53Var.n());
                }
                list.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized b63 i(int i7) {
        if (((Boolean) p00.f13596c.e()).booleanValue()) {
            this.f5601y = i7;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
