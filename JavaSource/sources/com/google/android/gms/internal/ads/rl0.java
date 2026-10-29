package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* compiled from: MyApplication */
public final class rl0 {

    /* renamed from: g, reason: collision with root package name */
    final String f14995g;

    /* renamed from: h, reason: collision with root package name */
    private final v2.p1 f14996h;

    /* renamed from: a, reason: collision with root package name */
    long f14989a = -1;

    /* renamed from: b, reason: collision with root package name */
    long f14990b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f14991c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f14992d = -1;

    /* renamed from: e, reason: collision with root package name */
    long f14993e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f14994f = new Object();

    /* renamed from: i, reason: collision with root package name */
    int f14997i = 0;

    /* renamed from: j, reason: collision with root package name */
    int f14998j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f14999k = 0;

    public rl0(String str, v2.p1 p1Var) {
        this.f14995g = str;
        this.f14996h = p1Var;
    }

    private final void i() {
        if (((Boolean) d10.f6903a.e()).booleanValue()) {
            synchronized (this.f14994f) {
                this.f14991c--;
                this.f14992d--;
            }
        }
    }

    public final void a() {
        synchronized (this.f14994f) {
            this.f14997i++;
        }
    }

    public final void b() {
        synchronized (this.f14994f) {
            this.f14998j++;
        }
    }

    public final void c() {
        synchronized (this.f14994f) {
            this.f14999k++;
        }
    }

    public final int d() {
        int i7;
        synchronized (this.f14994f) {
            i7 = this.f14999k;
        }
        return i7;
    }

    public final void e(s2.b5 b5Var, long j7) {
        Bundle bundle;
        synchronized (this.f14994f) {
            try {
                v2.p1 p1Var = this.f14996h;
                long n7 = p1Var.n();
                long a8 = r2.t.o().a();
                if (this.f14990b == -1) {
                    if (a8 - n7 > ((Long) s2.b0.c().d(uy.f17151m1)).longValue()) {
                        this.f14992d = -1;
                    } else {
                        this.f14992d = p1Var.q();
                    }
                    this.f14990b = j7;
                    this.f14989a = j7;
                } else {
                    this.f14989a = j7;
                }
                if (((Boolean) s2.b0.c().d(uy.f17095f4)).booleanValue() || (bundle = b5Var.f26058s) == null || bundle.getInt("gw", 2) != 1) {
                    this.f14991c++;
                    int i7 = this.f14992d + 1;
                    this.f14992d = i7;
                    if (i7 == 0) {
                        this.f14993e = 0L;
                        p1Var.A(a8);
                    } else {
                        this.f14993e = a8 - p1Var.m();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        i();
    }

    public final void g() {
        i();
    }

    public final Bundle h(Context context, String str) {
        Bundle bundle;
        synchronized (this.f14994f) {
            try {
                bundle = new Bundle();
                if (!this.f14996h.H()) {
                    bundle.putString("session_id", this.f14995g);
                }
                bundle.putLong("basets", this.f14990b);
                bundle.putLong("currts", this.f14989a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f14991c);
                bundle.putInt("preqs_in_session", this.f14992d);
                bundle.putLong("time_in_session", this.f14993e);
                bundle.putInt("pclick", this.f14997i);
                bundle.putInt("pimp", this.f14998j);
                Context a8 = oh0.a(context);
                int identifier = a8.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z7 = false;
                if (identifier == 0) {
                    int i7 = v2.n1.f26802b;
                    w2.p.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == a8.getPackageManager().getActivityInfo(new ComponentName(a8.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z7 = true;
                        } else {
                            int i8 = v2.n1.f26802b;
                            w2.p.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i9 = v2.n1.f26802b;
                        w2.p.f("Fail to fetch AdActivity theme");
                        w2.p.e("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z7);
                bundle.putInt("consent_form_action_identifier", d());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }
}
