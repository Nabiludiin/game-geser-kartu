package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class yu1 {

    /* renamed from: a, reason: collision with root package name */
    private final rx1 f19792a;

    yu1(rx1 rx1Var) {
        this.f19792a = rx1Var;
    }

    public final boolean a(wf3 wf3Var) {
        if (wf3Var.p0()) {
            qx1 a8 = this.f19792a.a();
            a8.c("action", "aq_ad_closed");
            a8.c("gqi", wf3Var.h0());
            a8.c("aq_ad_duration", String.valueOf(wf3Var.i0()));
            a8.c("aq_ad_bounce_cnt", String.valueOf(wf3Var.j0()));
            a8.c("aq_time_away", String.valueOf(wf3Var.m0()));
            return a8.e().equals(w2.u.SUCCESS);
        }
        qx1 a9 = this.f19792a.a();
        a9.c("action", "aq_ad_kill");
        a9.c("gqi", wf3Var.h0());
        a9.c("aq_ad_duration", String.valueOf(wf3Var.i0()));
        a9.c("aq_ad_bounce_cnt", String.valueOf(wf3Var.j0()));
        a9.c("aq_time_away", String.valueOf(wf3Var.m0()));
        a9.c("aq_is_os_kill", String.valueOf(wf3Var.l0()));
        return a9.e().equals(w2.u.SUCCESS);
    }
}
