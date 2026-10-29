package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class oh3 extends nh3 {

    /* renamed from: i, reason: collision with root package name */
    private static oh3 f13330i;

    private oh3(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final oh3 i(Context context) {
        oh3 oh3Var;
        synchronized (oh3.class) {
            try {
                if (f13330i == null) {
                    f13330i = new oh3(context);
                }
                oh3Var = f13330i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oh3Var;
    }

    public final kh3 j(long j7, boolean z7) {
        kh3 a8;
        synchronized (oh3.class) {
            a8 = a(null, null, j7, z7);
        }
        return a8;
    }

    public final kh3 k(String str, String str2, long j7, boolean z7) {
        kh3 a8;
        synchronized (oh3.class) {
            a8 = a(str, str2, j7, z7);
        }
        return a8;
    }

    public final void l() {
        synchronized (oh3.class) {
            c(false);
        }
    }

    public final void m() {
        synchronized (oh3.class) {
            c(true);
        }
    }
}
