package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class ex2 implements sx2 {

    /* renamed from: a, reason: collision with root package name */
    private final n23 f7859a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f7860b;

    /* renamed from: c, reason: collision with root package name */
    private final m64 f7861c = new bx2(this);

    public ex2(n23 n23Var, Executor executor) {
        this.f7859a = n23Var;
        this.f7860b = executor;
    }

    @Override // com.google.android.gms.internal.ads.sx2
    public final /* bridge */ /* synthetic */ a5.d a(tx2 tx2Var, rx2 rx2Var, Object obj) {
        return b(tx2Var, rx2Var, null);
    }

    public final a5.d b(tx2 tx2Var, rx2 rx2Var, final c91 c91Var) {
        n23 n23Var = this.f7859a;
        Executor executor = this.f7860b;
        return (h64) p64.g((h64) p64.j(h64.C(new ox2(n23Var, c91Var, executor).a()), new w54() { // from class: com.google.android.gms.internal.ads.cx2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return ex2.this.c(c91Var, (mx2) obj);
            }
        }, executor), Exception.class, new ax2(this), executor);
    }

    final /* synthetic */ a5.d c(c91 c91Var, mx2 mx2Var) {
        n23 n23Var = this.f7859a;
        x23 x23Var = mx2Var.f12476b;
        eh0 eh0Var = mx2Var.f12475a;
        w23 d8 = n23Var.d(x23Var);
        if (d8 != null && eh0Var != null) {
            p64.r(c91Var.a().f(eh0Var), this.f7861c, this.f7860b);
        }
        return p64.a(new dx2(x23Var, eh0Var, d8));
    }

    @Override // com.google.android.gms.internal.ads.sx2
    public final /* bridge */ /* synthetic */ Object h() {
        return null;
    }
}
