package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.util.Objects;

/* compiled from: MyApplication */
final class xm implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ym f18869q;

    xm(ym ymVar) {
        Objects.requireNonNull(ymVar);
        this.f18869q = ymVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z7;
        ConditionVariable conditionVariable2;
        ym ymVar = this.f18869q;
        if (ymVar.f19654b != null) {
            return;
        }
        conditionVariable = ym.f19650c;
        synchronized (conditionVariable) {
            if (ymVar.f19654b != null) {
                return;
            }
            boolean z8 = false;
            try {
                z7 = ((Boolean) uy.U2.e()).booleanValue();
            } catch (IllegalStateException unused) {
                z7 = false;
            }
            if (z7) {
                try {
                    ym.f19651d = je3.b(this.f18869q.b().f11151a, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z8 = z7;
            this.f18869q.f19654b = Boolean.valueOf(z8);
            conditionVariable2 = ym.f19650c;
            conditionVariable2.open();
        }
    }
}
