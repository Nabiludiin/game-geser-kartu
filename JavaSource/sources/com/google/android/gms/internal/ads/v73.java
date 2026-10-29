package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class v73 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r53 f17412a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b63 f17413b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ sc1 f17414c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ x73 f17415d;

    v73(x73 x73Var, r53 r53Var, b63 b63Var, sc1 sc1Var) {
        this.f17412a = r53Var;
        this.f17413b = b63Var;
        this.f17414c = sc1Var;
        Objects.requireNonNull(x73Var);
        this.f17415d = x73Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        r53 r53Var = this.f17412a;
        if (r53Var == null) {
            return;
        }
        r53Var.e(false);
        b63 b63Var = this.f17413b;
        if (b63Var != null) {
            b63Var.a(r53Var);
            b63Var.h();
        } else {
            x73 x73Var = this.f17415d;
            x73Var.e().b(r53Var.n());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c1, code lost:
    
        if (r4.equals("PRECISE") != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    @Override // com.google.android.gms.internal.ads.m64
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v73.b(java.lang.Object):void");
    }
}
