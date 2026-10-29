package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* compiled from: MyApplication */
public final class us3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f16966a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f16967b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f16968c;

    private us3(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f16966a = w85Var;
        this.f16967b = w85Var2;
        this.f16968c = w85Var3;
    }

    public static us3 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new us3(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        File file = (File) this.f16966a.b();
        dk3 dk3Var = (dk3) this.f16967b.b();
        final nu3 nu3Var = (nu3) this.f16968c.b();
        return dk3Var.a(file, xk3.h0(), new Function() { // from class: com.google.android.gms.internal.ads.ts3
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                nu3.this.d(20308, (Throwable) obj);
                return xk3.h0();
            }
        });
    }
}
