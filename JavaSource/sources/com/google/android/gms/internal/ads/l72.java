package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.Objects;

/* compiled from: MyApplication */
final class l72 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j43 f11439a;

    l72(n72 n72Var, j43 j43Var) {
        this.f11439a = j43Var;
        Objects.requireNonNull(n72Var);
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        int i7 = v2.n1.f26802b;
        w2.p.c("Failed to get offline signal database: ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.f11439a.d((SQLiteDatabase) obj);
        } catch (Exception e8) {
            String valueOf = String.valueOf(e8.getMessage());
            int i7 = v2.n1.f26802b;
            w2.p.c("Error executing function on offline signal database: ".concat(valueOf));
        }
    }
}
