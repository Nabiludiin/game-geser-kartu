package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.b6;
import com.google.android.gms.internal.play_billing.d6;
import com.google.android.gms.internal.play_billing.f6;
import com.google.android.gms.internal.play_billing.i6;
import com.google.android.gms.internal.play_billing.j6;
import com.google.android.gms.internal.play_billing.l6;
import com.google.android.gms.internal.play_billing.n6;
import com.google.android.gms.internal.play_billing.s6;

/* compiled from: MyApplication */
public abstract /* synthetic */ class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4000a = 0;

    static {
        int i7 = m0.f4004a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + com.google.android.gms.internal.play_billing.z.b(exc.getMessage());
            int i7 = com.google.android.gms.internal.play_billing.q0.f21711a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static d6 b(l6 l6Var, int i7, d dVar, String str, s6 s6Var) {
        try {
            j6 G = n6.G();
            G.v(dVar.c());
            G.q(dVar.a());
            if (dVar.b() != 0) {
                G.r(dVar.b());
            }
            if (l6Var != null) {
                G.s(l6Var);
            }
            if (str != null) {
                G.p(str);
            }
            b6 I = d6.I();
            I.q(G);
            I.v(i7);
            if (!s6Var.equals(s6.BROADCAST_ACTION_UNSPECIFIED)) {
                I.p(s6Var);
            }
            return (d6) I.l();
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static i6 c(int i7, s6 s6Var) {
        try {
            f6 G = i6.G();
            G.s(i7);
            if (!s6Var.equals(s6.BROADCAST_ACTION_UNSPECIFIED)) {
                G.p(s6Var);
            }
            return (i6) G.l();
        } catch (Exception e8) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to create logging payload", e8);
            return null;
        }
    }
}
