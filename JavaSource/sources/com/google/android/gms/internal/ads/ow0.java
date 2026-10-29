package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
final class ow0 implements hy2 {

    /* renamed from: a, reason: collision with root package name */
    private final tv0 f13515a;

    /* renamed from: b, reason: collision with root package name */
    private Context f13516b;

    /* renamed from: c, reason: collision with root package name */
    private String f13517c;

    /* renamed from: d, reason: collision with root package name */
    private s2.g5 f13518d;

    /* synthetic */ ow0(tv0 tv0Var, byte[] bArr) {
        this.f13515a = tv0Var;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final /* bridge */ /* synthetic */ hy2 W(String str) {
        str.getClass();
        this.f13517c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final iy2 a() {
        v85.c(this.f13516b, Context.class);
        v85.c(this.f13517c, String.class);
        v85.c(this.f13518d, s2.g5.class);
        return new pw0(this.f13515a, this.f13516b, this.f13517c, this.f13518d);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final /* bridge */ /* synthetic */ hy2 b(s2.g5 g5Var) {
        g5Var.getClass();
        this.f13518d = g5Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final /* bridge */ /* synthetic */ hy2 c(Context context) {
        context.getClass();
        this.f13516b = context;
        return this;
    }
}
