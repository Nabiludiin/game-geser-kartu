package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* compiled from: MyApplication */
final class gu3 implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iu3 f9153a;

    gu3(iu3 iu3Var) {
        Objects.requireNonNull(iu3Var);
        this.f9153a = iu3Var;
    }

    public final void onOpActiveChanged(String str, int i7, String str2, boolean z7) {
        iu3 iu3Var = this.f9153a;
        synchronized (iu3Var) {
            try {
                if (z7) {
                    iu3Var.g(System.currentTimeMillis());
                    iu3Var.j(true);
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (iu3Var.h() > 0 && currentTimeMillis >= iu3Var.h()) {
                        iu3Var.i(currentTimeMillis - iu3Var.h());
                    }
                    iu3Var.j(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
