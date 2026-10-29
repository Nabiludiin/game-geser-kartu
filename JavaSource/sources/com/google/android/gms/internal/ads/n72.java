package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class n72 {

    /* renamed from: a, reason: collision with root package name */
    private final j72 f12608a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f12609b;

    public n72(j72 j72Var, z64 z64Var) {
        this.f12608a = j72Var;
        this.f12609b = z64Var;
    }

    public final void a(j43 j43Var) {
        final j72 j72Var = this.f12608a;
        Objects.requireNonNull(j72Var);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.m72
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return j72.this.getWritableDatabase();
            }
        };
        z64 z64Var = this.f12609b;
        p64.r(z64Var.B0(callable), new l72(this, j43Var), z64Var);
    }
}
