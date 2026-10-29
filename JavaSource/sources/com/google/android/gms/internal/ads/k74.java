package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
final class k74 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    m74 f10918q;

    k74(m74 m74Var) {
        this.f10918q = m74Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a5.d E;
        m74 m74Var = this.f10918q;
        if (m74Var == null || (E = m74Var.E()) == null) {
            return;
        }
        this.f10918q = null;
        if (E.isDone()) {
            m74Var.v(E);
            return;
        }
        try {
            ScheduledFuture F = m74Var.F();
            m74Var.G(null);
            String str = "Timed out";
            if (F != null) {
                try {
                    long abs = Math.abs(F.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(abs).length() + 55);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                } catch (Throwable th) {
                    m74Var.m(new l74(str, null));
                    throw th;
                }
            }
            String obj = E.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            m74Var.m(new l74(sb2.toString(), null));
        } finally {
            E.cancel(true);
        }
    }
}
