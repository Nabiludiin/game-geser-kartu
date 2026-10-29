package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class zb5 implements kq5, fm5 {

    /* renamed from: q, reason: collision with root package name */
    private final cc5 f20120q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ fc5 f20121r;

    public zb5(fc5 fc5Var, cc5 cc5Var) {
        Objects.requireNonNull(fc5Var);
        this.f20121r = fc5Var;
        this.f20120q = cc5Var;
    }

    private final Pair b(int i7, xp5 xp5Var) {
        xp5 xp5Var2;
        xp5 xp5Var3 = null;
        if (xp5Var != null) {
            cc5 cc5Var = this.f20120q;
            int i8 = 0;
            while (true) {
                List list = cc5Var.f6372c;
                if (i8 >= list.size()) {
                    xp5Var2 = null;
                    break;
                }
                if (((xp5) list.get(i8)).f18927d == xp5Var.f18927d) {
                    Object obj = xp5Var.f18924a;
                    Object obj2 = cc5Var.f6371b;
                    int i9 = mc5.f12200k;
                    xp5Var2 = xp5Var.a(Pair.create(obj2, obj));
                    break;
                }
                i8++;
            }
            if (xp5Var2 == null) {
                return null;
            }
            xp5Var3 = xp5Var2;
        }
        return Pair.create(Integer.valueOf(this.f20120q.f6373d), xp5Var3);
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void Q(int i7, xp5 xp5Var, final tp5 tp5Var) {
        final Pair b8 = b(0, xp5Var);
        if (b8 != null) {
            fc5 fc5Var = this.f20121r;
            fc5Var.k().j(new Runnable() { // from class: com.google.android.gms.internal.ads.xb5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = b8;
                    zb5.this.f20121r.j().Q(((Integer) pair.first).intValue(), (xp5) pair.second, tp5Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void V(int i7, xp5 xp5Var, final op5 op5Var, final tp5 tp5Var) {
        final Pair b8 = b(0, xp5Var);
        if (b8 != null) {
            fc5 fc5Var = this.f20121r;
            fc5Var.k().j(new Runnable() { // from class: com.google.android.gms.internal.ads.vb5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = b8;
                    zb5.this.f20121r.j().V(((Integer) pair.first).intValue(), (xp5) pair.second, op5Var, tp5Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void c0(int i7, xp5 xp5Var, final op5 op5Var, final tp5 tp5Var) {
        final Pair b8 = b(0, xp5Var);
        if (b8 != null) {
            fc5 fc5Var = this.f20121r;
            fc5Var.k().j(new Runnable() { // from class: com.google.android.gms.internal.ads.ub5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = b8;
                    zb5.this.f20121r.j().c0(((Integer) pair.first).intValue(), (xp5) pair.second, op5Var, tp5Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void j(int i7, xp5 xp5Var, final op5 op5Var, final tp5 tp5Var, final IOException iOException, final boolean z7) {
        final Pair b8 = b(0, xp5Var);
        if (b8 != null) {
            fc5 fc5Var = this.f20121r;
            fc5Var.k().j(new Runnable() { // from class: com.google.android.gms.internal.ads.wb5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = b8;
                    zb5.this.f20121r.j().j(((Integer) pair.first).intValue(), (xp5) pair.second, op5Var, tp5Var, iOException, z7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.kq5
    public final void p(int i7, xp5 xp5Var, final op5 op5Var, final tp5 tp5Var, final int i8) {
        final Pair b8 = b(0, xp5Var);
        if (b8 != null) {
            fc5 fc5Var = this.f20121r;
            fc5Var.k().j(new Runnable() { // from class: com.google.android.gms.internal.ads.yb5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = b8;
                    zb5.this.f20121r.j().p(((Integer) pair.first).intValue(), (xp5) pair.second, op5Var, tp5Var, i8);
                }
            });
        }
    }
}
