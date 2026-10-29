package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class ph3 extends nh3 {

    /* renamed from: i, reason: collision with root package name */
    private static ph3 f13887i;

    private ph3(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final ph3 i(Context context) {
        ph3 ph3Var;
        synchronized (ph3.class) {
            try {
                if (f13887i == null) {
                    f13887i = new ph3(context);
                }
                ph3Var = f13887i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ph3Var;
    }

    public final kh3 j(long j7, boolean z7) {
        synchronized (ph3.class) {
            try {
                if (this.f12742g.c()) {
                    return a(null, null, j7, z7);
                }
                return new kh3();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (ph3.class) {
            try {
                if (g(false)) {
                    c(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
