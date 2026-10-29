package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: MyApplication */
final class r81 implements qb1, sa1 {

    /* renamed from: q, reason: collision with root package name */
    private final c03 f14787q;

    public r81(Context context, c03 c03Var, hf0 hf0Var) {
        this.f14787q = c03Var;
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void f() {
        if0 if0Var = this.f14787q.f6157d0;
        if (if0Var == null || !if0Var.f10022a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = if0Var.f10023b;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void d(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void h(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.sa1
    public final void j(Context context) {
    }
}
