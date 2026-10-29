package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class yw2 implements sx2 {

    /* renamed from: a, reason: collision with root package name */
    private final sx2 f19885a;

    /* renamed from: b, reason: collision with root package name */
    private final sx2 f19886b;

    /* renamed from: c, reason: collision with root package name */
    private final j33 f19887c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19888d;

    /* renamed from: e, reason: collision with root package name */
    private c91 f19889e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f19890f;

    public yw2(sx2 sx2Var, sx2 sx2Var2, j33 j33Var, String str, Executor executor) {
        this.f19885a = sx2Var;
        this.f19886b = sx2Var2;
        this.f19887c = j33Var;
        this.f19888d = str;
        this.f19890f = executor;
    }

    private final a5.d f(w23 w23Var, tx2 tx2Var) {
        c91 c91Var = w23Var.f17992a;
        this.f19889e = c91Var;
        if (w23Var.f17994c != null) {
            if (c91Var.d() != null) {
                w23Var.f17994c.f().j(w23Var.f17992a.d());
            }
            return p64.a(w23Var.f17994c);
        }
        c91Var.a().h(w23Var.f17993b);
        return ((jx2) this.f19885a).c(tx2Var, null, w23Var.f17992a);
    }

    @Override // com.google.android.gms.internal.ads.sx2
    public final /* bridge */ /* synthetic */ a5.d a(tx2 tx2Var, rx2 rx2Var, Object obj) {
        return c(tx2Var, rx2Var, null);
    }

    @Override // com.google.android.gms.internal.ads.sx2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized c91 h() {
        return this.f19889e;
    }

    public final synchronized a5.d c(final tx2 tx2Var, final rx2 rx2Var, c91 c91Var) {
        b91 a8 = rx2Var.a(tx2Var.f16482b);
        a8.h(new zw2(this.f19888d));
        final c91 c91Var2 = (c91) a8.g();
        c91Var2.b();
        c91Var2.b();
        s2.b5 b5Var = c91Var2.b().f17958d;
        if (b5Var.I != null || b5Var.N != null) {
            this.f19889e = c91Var2;
            return ((jx2) this.f19885a).c(tx2Var, rx2Var, c91Var2);
        }
        w03 b8 = c91Var2.b();
        s2.b5 b5Var2 = b8.f17958d;
        String str = b8.f17961g;
        s2.m5 m5Var = b8.f17965k;
        Executor executor = this.f19890f;
        final xw2 xw2Var = new xw2(rx2Var, tx2Var, b5Var2, str, executor, m5Var, null);
        return (h64) p64.j(h64.C(((ex2) this.f19886b).b(tx2Var, rx2Var, c91Var2)), new w54() { // from class: com.google.android.gms.internal.ads.ww2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return yw2.this.d(tx2Var, xw2Var, rx2Var, c91Var2, (dx2) obj);
            }
        }, executor);
    }

    final /* synthetic */ a5.d d(tx2 tx2Var, xw2 xw2Var, rx2 rx2Var, c91 c91Var, dx2 dx2Var) {
        if (dx2Var != null) {
            xw2 xw2Var2 = new xw2(xw2Var.f19275a, xw2Var.f19276b, xw2Var.f19277c, xw2Var.f19278d, xw2Var.f19279e, xw2Var.f19280f, dx2Var.f7345a);
            w23 w23Var = dx2Var.f7347c;
            if (w23Var != null) {
                this.f19889e = null;
                this.f19887c.a(xw2Var2);
                return f(w23Var, tx2Var);
            }
            j33 j33Var = this.f19887c;
            a5.d b8 = j33Var.b(xw2Var2);
            if (b8 != null) {
                this.f19889e = null;
                return p64.j(b8, new w54() { // from class: com.google.android.gms.internal.ads.vw2
                    @Override // com.google.android.gms.internal.ads.w54
                    public final /* synthetic */ a5.d d(Object obj) {
                        return yw2.this.e((f33) obj);
                    }
                }, this.f19890f);
            }
            j33Var.a(xw2Var2);
            tx2Var = new tx2(tx2Var.f16482b, dx2Var.f7346b);
        }
        a5.d c8 = ((jx2) this.f19885a).c(tx2Var, rx2Var, c91Var);
        this.f19889e = c91Var;
        return c8;
    }

    final /* synthetic */ a5.d e(f33 f33Var) {
        w23 w23Var;
        h33 h33Var;
        if (f33Var == null || (w23Var = f33Var.f8016a) == null || (h33Var = f33Var.f8017b) == null) {
            throw new j22(1, "Empty prefetch");
        }
        ew g02 = lw.g0();
        cw i02 = dw.i0();
        i02.E(fw.IN_MEMORY);
        i02.F(iw.f0());
        g02.E(i02);
        w23Var.f17992a.a().d().X((lw) g02.A());
        return f(w23Var, ((xw2) h33Var).f19276b);
    }
}
