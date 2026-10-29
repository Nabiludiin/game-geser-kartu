package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
final class yp3 {

    /* renamed from: a, reason: collision with root package name */
    private final at3 f19710a;

    /* renamed from: b, reason: collision with root package name */
    private final jr3 f19711b;

    /* renamed from: c, reason: collision with root package name */
    private final as3 f19712c;

    /* renamed from: d, reason: collision with root package name */
    private final nu3 f19713d;

    yp3(at3 at3Var, jr3 jr3Var, as3 as3Var, nu3 nu3Var) {
        this.f19710a = at3Var;
        this.f19711b = jr3Var;
        this.f19712c = as3Var;
        this.f19713d = nu3Var;
    }

    final a5.d a() {
        return (h64) p64.g((h64) p64.g((h64) p64.g((h64) p64.j((h64) p64.k((h64) p64.g(h64.C(this.f19712c.a()), Throwable.class, wp3.f18377a, g74.a()), new hx3() { // from class: com.google.android.gms.internal.ads.lp3
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                yp3.this.b((xk3) obj);
                return new Integer(0);
            }
        }, g74.a()), new w54() { // from class: com.google.android.gms.internal.ads.np3
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return yp3.this.c((Integer) obj);
            }
        }, g74.a()), jp3.class, op3.f13438a, g74.a()), ip3.class, pp3.f14003a, g74.a()), kp3.class, qp3.f14552a, g74.a());
    }

    final /* synthetic */ int b(xk3 xk3Var) {
        if (this.f19710a.a(xk3Var)) {
            return 0;
        }
        throw new jp3(null);
    }

    final /* synthetic */ a5.d c(Integer num) {
        h64 h64Var = (h64) p64.k((h64) p64.j((h64) p64.k(h64.C(this.f19711b.a()), new hx3(this) { // from class: com.google.android.gms.internal.ads.rp3
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                tk3 tk3Var = (tk3) obj;
                int l02 = tk3Var.l0() - 1;
                if (l02 == 1 || l02 == 2) {
                    return tk3Var;
                }
                if (l02 != 3) {
                    throw new ip3(tk3Var.l0() - 1);
                }
                throw new kp3(tk3Var.l0() - 1);
            }
        }, g74.a()), new w54() { // from class: com.google.android.gms.internal.ads.sp3
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return yp3.this.d((tk3) obj);
            }
        }, g74.a()), tp3.f16296a, g74.a());
        this.f19713d.e(1002, h64Var);
        return h64Var;
    }

    final /* synthetic */ a5.d d(final tk3 tk3Var) {
        if (tk3Var.l0() == 2) {
            return (h64) p64.j(h64.C(this.f19712c.e(tk3Var.e0().w())), new w54() { // from class: com.google.android.gms.internal.ads.up3
                @Override // com.google.android.gms.internal.ads.w54
                public final /* synthetic */ a5.d d(Object obj) {
                    return yp3.this.e(tk3Var, (Void) obj);
                }
            }, g74.a());
        }
        if (tk3Var.l0() == 3) {
            return (h64) p64.j((h64) p64.j(h64.C(this.f19712c.b(xk3.h0())), new w54() { // from class: com.google.android.gms.internal.ads.vp3
                @Override // com.google.android.gms.internal.ads.w54
                public final /* synthetic */ a5.d d(Object obj) {
                    return yp3.this.f(tk3Var, (Void) obj);
                }
            }, g74.a()), new w54() { // from class: com.google.android.gms.internal.ads.mp3
                @Override // com.google.android.gms.internal.ads.w54
                public final /* synthetic */ a5.d d(Object obj) {
                    return yp3.this.g(tk3Var, (List) obj);
                }
            }, g74.a());
        }
        throw new AssertionError("Unreachable");
    }

    final /* synthetic */ a5.d e(tk3 tk3Var, Void r22) {
        return this.f19712c.b(tk3Var.d0());
    }

    final /* synthetic */ a5.d f(tk3 tk3Var, Void r42) {
        byte[] w7 = tk3Var.e0().w();
        as3 as3Var = this.f19712c;
        return p64.l(as3Var.e(w7), as3Var.g(tk3Var.f0().w()));
    }

    final /* synthetic */ a5.d g(tk3 tk3Var, List list) {
        return this.f19712c.b(tk3Var.d0());
    }
}
