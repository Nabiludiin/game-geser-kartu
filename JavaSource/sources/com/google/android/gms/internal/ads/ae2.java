package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: MyApplication */
public final class ae2 {

    /* renamed from: a, reason: collision with root package name */
    private final q13 f4899a;

    /* renamed from: b, reason: collision with root package name */
    private final bv1 f4900b;

    /* renamed from: c, reason: collision with root package name */
    private final rx1 f4901c;

    public ae2(q13 q13Var, bv1 bv1Var, rx1 rx1Var) {
        this.f4899a = q13Var;
        this.f4900b = bv1Var;
        this.f4901c = rx1Var;
    }

    public final void a(f03 f03Var, c03 c03Var, int i7, oa2 oa2Var, long j7) {
        av1 av1Var;
        qx1 a8 = this.f4901c.a();
        a8.a(f03Var);
        a8.b(c03Var);
        a8.c("action", "adapter_status");
        a8.c("adapter_l", String.valueOf(j7));
        a8.c("sc", Integer.toString(i7));
        if (oa2Var != null) {
            a8.c("arec", Integer.toString(oa2Var.b().f26259q));
            String a9 = this.f4899a.a(oa2Var.getMessage());
            if (a9 != null) {
                a8.c("areec", a9);
            }
        }
        bv1 bv1Var = this.f4900b;
        Iterator it = c03Var.f6188t.iterator();
        while (true) {
            if (!it.hasNext()) {
                av1Var = null;
                break;
            } else {
                av1Var = bv1Var.c((String) it.next());
                if (av1Var != null) {
                    break;
                }
            }
        }
        if (av1Var != null) {
            a8.c("ancn", av1Var.f5301a);
            wd0 wd0Var = av1Var.f5302b;
            if (wd0Var != null) {
                a8.c("adapter_v", wd0Var.toString());
            }
            wd0 wd0Var2 = av1Var.f5303c;
            if (wd0Var2 != null) {
                a8.c("adapter_sv", wd0Var2.toString());
            }
        }
        a8.d();
    }
}
