package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: MyApplication */
public final class e82 implements g53 {

    /* renamed from: q, reason: collision with root package name */
    private final r72 f7460q;

    /* renamed from: r, reason: collision with root package name */
    private final v72 f7461r;

    e82(r72 r72Var, v72 v72Var) {
        this.f7460q = r72Var;
        this.f7461r = v72Var;
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void k(z43 z43Var, String str) {
        if (((Boolean) s2.b0.c().d(uy.L6)).booleanValue()) {
            if (z43.RENDERER == z43Var) {
                this.f7460q.g(r2.t.o().b());
                return;
            }
            if (z43.PRELOADED_LOADER == z43Var || z43.SERVER_TRANSACTION == z43Var) {
                r72 r72Var = this.f7460q;
                r72Var.a(r2.t.o().b());
                final v72 v72Var = this.f7461r;
                final long b8 = r72Var.b();
                v72Var.f5626b.a(new j43() { // from class: com.google.android.gms.internal.ads.u72
                    @Override // com.google.android.gms.internal.ads.j43
                    public final /* synthetic */ Object d(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (v72.this.a()) {
                            return null;
                        }
                        long j7 = b8;
                        bv I0 = av.I0();
                        I0.K(j7);
                        byte[] e8 = ((av) I0.A()).e();
                        d82.f(sQLiteDatabase, false, false);
                        d82.e(sQLiteDatabase, j7, e8);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void s(z43 z43Var, String str, Throwable th) {
        if (((Boolean) s2.b0.c().d(uy.L6)).booleanValue() && z43.RENDERER == z43Var) {
            r72 r72Var = this.f7460q;
            if (r72Var.h() != 0) {
                r72Var.i(r2.t.o().b() - r72Var.h());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void t(z43 z43Var, String str) {
        if (((Boolean) s2.b0.c().d(uy.L6)).booleanValue() && z43.RENDERER == z43Var) {
            r72 r72Var = this.f7460q;
            if (r72Var.h() != 0) {
                r72Var.i(r2.t.o().b() - r72Var.h());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void q(z43 z43Var, String str) {
    }
}
