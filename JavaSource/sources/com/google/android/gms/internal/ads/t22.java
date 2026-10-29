package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class t22 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f15949a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f15950b;

    /* renamed from: c, reason: collision with root package name */
    private final e42 f15951c;

    /* renamed from: d, reason: collision with root package name */
    private final h85 f15952d;

    public t22(z64 z64Var, z64 z64Var2, e42 e42Var, h85 h85Var) {
        this.f15949a = z64Var;
        this.f15950b = z64Var2;
        this.f15951c = e42Var;
        this.f15952d = h85Var;
    }

    public final a5.d a(final eh0 eh0Var) {
        a5.d h8;
        String str = eh0Var.f7627t;
        r2.t.g();
        if (v2.f2.g(str)) {
            h8 = p64.c(new b52(1));
        } else {
            h8 = p64.h(this.f15949a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.s22
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return t22.this.b(eh0Var);
                }
            }), ExecutionException.class, n22.f12553a, this.f15950b);
        }
        final int callingUid = Binder.getCallingUid();
        return p64.h(h8, b52.class, new w54() { // from class: com.google.android.gms.internal.ads.q22
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return t22.this.c(eh0Var, callingUid, (b52) obj);
            }
        }, this.f15950b);
    }

    final /* synthetic */ c52 b(eh0 eh0Var) {
        return (c52) this.f15951c.d(eh0Var).get(((Integer) s2.b0.c().d(uy.f17124i6)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ a5.d c(final eh0 eh0Var, int i7, b52 b52Var) {
        Bundle bundle;
        if (eh0Var != null && (bundle = eh0Var.C) != null) {
            bundle.putBoolean("ls", true);
        }
        return p64.j(((w62) this.f15952d.b()).j8(eh0Var, i7), new w54() { // from class: com.google.android.gms.internal.ads.r22
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return p64.a(new c52((InputStream) obj, eh0.this));
            }
        }, this.f15950b);
    }
}
