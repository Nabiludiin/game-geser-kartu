package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class h5 implements m2 {

    /* renamed from: b, reason: collision with root package name */
    private p2 f9329b;

    /* renamed from: c, reason: collision with root package name */
    private int f9330c;

    /* renamed from: d, reason: collision with root package name */
    private int f9331d;

    /* renamed from: e, reason: collision with root package name */
    private int f9332e;

    /* renamed from: g, reason: collision with root package name */
    private l5 f9334g;

    /* renamed from: h, reason: collision with root package name */
    private n2 f9335h;

    /* renamed from: i, reason: collision with root package name */
    private v3 f9336i;

    /* renamed from: j, reason: collision with root package name */
    private j8 f9337j;

    /* renamed from: a, reason: collision with root package name */
    private final y82 f9328a = new y82(2);

    /* renamed from: f, reason: collision with root package name */
    private long f9333f = -1;

    private final int a(n2 n2Var) {
        y82 y82Var = this.f9328a;
        y82Var.z(2);
        ((b2) n2Var).x(y82Var.H(), 0, 2, false);
        return y82Var.S();
    }

    private final int c(n2 n2Var) {
        y82 y82Var = this.f9328a;
        y82Var.z(2);
        n2Var.u(y82Var.H(), 0, 2);
        return y82Var.S() - 2;
    }

    private final void d() {
        p2 p2Var = this.f9329b;
        p2Var.getClass();
        p2Var.z();
        this.f9329b.B(new p3(-9223372036854775807L, 0L));
        this.f9330c = 6;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ List b() {
        return l2.a(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public /* synthetic */ m2 e() {
        return l2.b(this);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void i(long j7, long j8) {
        if (j7 == 0) {
            this.f9330c = 0;
            this.f9337j = null;
        } else if (this.f9330c == 5) {
            j8 j8Var = this.f9337j;
            j8Var.getClass();
            j8Var.i(j7, j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean j(n2 n2Var) {
        int c8;
        if (a(n2Var) == 65496) {
            while (true) {
                int a8 = a(n2Var);
                this.f9331d = a8;
                if (a8 == 65498 || (c8 = c(n2Var)) < 0) {
                    break;
                }
                if (this.f9331d != 65505) {
                    ((b2) n2Var).c(c8, false);
                } else {
                    y82 y82Var = this.f9328a;
                    y82Var.z(c8);
                    ((b2) n2Var).x(y82Var.H(), 0, c8, false);
                    if (Objects.equals(y82Var.m((char) 0), "http://ns.adobe.com/xap/1.0/") && k5.b(y82Var.m((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void k(p2 p2Var) {
        this.f9329b = p2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0190  */
    @Override // com.google.android.gms.internal.ads.m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(com.google.android.gms.internal.ads.n2 r26, com.google.android.gms.internal.ads.n3 r27) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h5.l(com.google.android.gms.internal.ads.n2, com.google.android.gms.internal.ads.n3):int");
    }
}
