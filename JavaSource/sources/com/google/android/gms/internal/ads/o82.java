package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

/* compiled from: MyApplication */
final class o82 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j43 f13224a;

    o82(v82 v82Var, j43 j43Var) {
        this.f13224a = j43Var;
        Objects.requireNonNull(v82Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        int i7 = v2.n1.f26802b;
        w2.p.c("Failed to get offline buffered ping database: ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.f13224a.d((SQLiteDatabase) obj);
        } catch (Exception e8) {
            String valueOf = String.valueOf(e8.getMessage());
            int i7 = v2.n1.f26802b;
            w2.p.c("Error executing function on offline buffered ping database: ".concat(valueOf));
        }
    }
}
