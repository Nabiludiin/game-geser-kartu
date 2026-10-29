package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class lh3 {

    /* renamed from: b, reason: collision with root package name */
    private static lh3 f11614b;

    /* renamed from: a, reason: collision with root package name */
    final mh3 f11615a;

    private lh3(Context context) {
        this.f11615a = mh3.a(context);
    }

    public static final lh3 a(Context context) {
        lh3 lh3Var;
        synchronized (lh3.class) {
            try {
                if (f11614b == null) {
                    f11614b = new lh3(context);
                }
                lh3Var = f11614b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lh3Var;
    }

    public final void b(boolean z7) {
        synchronized (lh3.class) {
            try {
                mh3 mh3Var = this.f11615a;
                mh3Var.b("paidv2_publisher_option", Boolean.valueOf(z7));
                if (!z7) {
                    mh3Var.f("paidv2_creation_time");
                    mh3Var.f("paidv2_id");
                    mh3Var.f("vendor_scoped_gpid_v2_id");
                    mh3Var.f("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean e8;
        synchronized (lh3.class) {
            e8 = this.f11615a.e("paidv2_publisher_option", true);
        }
        return e8;
    }

    public final void d(boolean z7) {
        synchronized (lh3.class) {
            this.f11615a.b("paidv2_user_option", Boolean.valueOf(z7));
        }
    }

    public final boolean e() {
        boolean e8;
        synchronized (lh3.class) {
            e8 = this.f11615a.e("paidv2_user_option", true);
        }
        return e8;
    }
}
