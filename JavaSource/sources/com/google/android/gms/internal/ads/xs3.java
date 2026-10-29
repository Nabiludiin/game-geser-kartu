package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* compiled from: MyApplication */
public final class xs3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f19012a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f19013b;

    /* renamed from: c, reason: collision with root package name */
    private final w85 f19014c;

    private xs3(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        this.f19012a = w85Var;
        this.f19013b = w85Var2;
        this.f19014c = w85Var3;
    }

    public static xs3 a(w85 w85Var, w85 w85Var2, w85 w85Var3) {
        return new xs3(w85Var, w85Var2, w85Var3);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        File file = (File) this.f19012a.b();
        dk3 dk3Var = (dk3) this.f19013b.b();
        final nu3 nu3Var = (nu3) this.f19014c.b();
        return dk3Var.b(file, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.rs3
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                nu3.this.d(20310, (Throwable) obj);
                return new byte[0];
            }
        });
    }
}
