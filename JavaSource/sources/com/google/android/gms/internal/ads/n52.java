package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: MyApplication */
public final class n52 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f12576a;

    /* renamed from: b, reason: collision with root package name */
    private final s42 f12577b;

    /* renamed from: c, reason: collision with root package name */
    private final h85 f12578c;

    public n52(z64 z64Var, s42 s42Var, h85 h85Var) {
        this.f12576a = z64Var;
        this.f12577b = s42Var;
        this.f12578c = h85Var;
    }

    private final a5.d g(final eh0 eh0Var, d52 d52Var, final d52 d52Var2, final w54 w54Var) {
        a5.d h8;
        String str = eh0Var.f7627t;
        r2.t.g();
        if (v2.f2.g(str)) {
            h8 = p64.c(new b52(1));
        } else {
            h8 = p64.h(d52Var.a(eh0Var), ExecutionException.class, m52.f12079a, this.f12576a);
        }
        z64 z64Var = this.f12576a;
        return (h64) p64.h((h64) p64.j((h64) p64.j(h64.C(h8), f52.f8040a, z64Var), w54Var, z64Var), b52.class, new w54() { // from class: com.google.android.gms.internal.ads.g52
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return n52.this.c(d52Var2, eh0Var, w54Var, (b52) obj);
            }
        }, z64Var);
    }

    public final a5.d a(final eh0 eh0Var) {
        w54 w54Var = new w54() { // from class: com.google.android.gms.internal.ads.h52
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                String str = new String(v34.a((InputStream) obj), StandardCharsets.UTF_8);
                eh0 eh0Var2 = eh0.this;
                eh0Var2.f7633z = str;
                return p64.a(eh0Var2);
            }
        };
        final s42 s42Var = this.f12577b;
        Objects.requireNonNull(s42Var);
        return g(eh0Var, new d52() { // from class: com.google.android.gms.internal.ads.e52
            @Override // com.google.android.gms.internal.ads.d52
            public final /* synthetic */ a5.d a(eh0 eh0Var2) {
                return s42.this.d(eh0Var2);
            }
        }, new d52() { // from class: com.google.android.gms.internal.ads.i52
            @Override // com.google.android.gms.internal.ads.d52
            public final /* synthetic */ a5.d a(eh0 eh0Var2) {
                return n52.this.d(eh0Var2);
            }
        }, w54Var);
    }

    public final a5.d b(eh0 eh0Var) {
        return g(eh0Var, new d52() { // from class: com.google.android.gms.internal.ads.k52
            @Override // com.google.android.gms.internal.ads.d52
            public final /* synthetic */ a5.d a(eh0 eh0Var2) {
                return n52.this.e(eh0Var2);
            }
        }, new d52() { // from class: com.google.android.gms.internal.ads.l52
            @Override // com.google.android.gms.internal.ads.d52
            public final /* synthetic */ a5.d a(eh0 eh0Var2) {
                return n52.this.f(eh0Var2);
            }
        }, j52.f10347a);
    }

    final /* synthetic */ a5.d c(d52 d52Var, eh0 eh0Var, w54 w54Var, b52 b52Var) {
        return p64.j(d52Var.a(eh0Var), w54Var, this.f12576a);
    }

    final /* synthetic */ a5.d d(eh0 eh0Var) {
        return ((w62) this.f12578c.b()).k8(eh0Var, Binder.getCallingUid());
    }

    final /* synthetic */ a5.d e(eh0 eh0Var) {
        return this.f12577b.e(eh0Var.f7631x);
    }

    final /* synthetic */ a5.d f(eh0 eh0Var) {
        return ((w62) this.f12578c.b()).l8(eh0Var.f7631x);
    }
}
