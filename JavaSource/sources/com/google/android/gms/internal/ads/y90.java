package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class y90 implements mm0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aa0 f19429a;

    y90(aa0 aa0Var) {
        Objects.requireNonNull(aa0Var);
        this.f19429a = aa0Var;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        final u80 u80Var = (u80) obj;
        cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.x90
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                u80 u80Var2 = u80Var;
                u80Var2.J("/result", x50.f18556o);
                u80Var2.i();
            }
        });
    }
}
