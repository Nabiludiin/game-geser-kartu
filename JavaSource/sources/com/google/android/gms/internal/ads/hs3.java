package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* compiled from: MyApplication */
public final class hs3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f9671a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f9672b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f9673c;

    private hs3(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f9671a = w85Var;
        this.f9672b = w85Var2;
        this.f9673c = w85Var3;
    }

    public static hs3 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new hs3(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        File file = (File) this.f9671a.b();
        dk3 dk3Var = (dk3) this.f9672b.b();
        final nu3 nu3Var = (nu3) this.f9673c.b();
        return dk3Var.a(file, xk3.h0(), new Function() { // from class: com.google.android.gms.internal.ads.fs3
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                nu3.this.d(15308, (Throwable) obj);
                return xk3.h0();
            }
        });
    }
}
