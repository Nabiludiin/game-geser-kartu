package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: MyApplication */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12494a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12495b;

    /* renamed from: c, reason: collision with root package name */
    private fo5 f12496c = fo5.f8371a;

    /* renamed from: d, reason: collision with root package name */
    private final kn5 f12497d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f12498e;

    /* renamed from: f, reason: collision with root package name */
    private z0 f12499f;

    public n(Context context) {
        this.f12494a = context;
        this.f12497d = new an5(context, null, null);
    }

    public final n a(fo5 fo5Var) {
        this.f12496c = fo5Var;
        return this;
    }

    public final n b(Handler handler) {
        this.f12498e = handler;
        return this;
    }

    public final n c(z0 z0Var) {
        this.f12499f = z0Var;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r3.f12499f != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.p d() {
        /*
            r3 = this;
            boolean r0 = r3.f12495b
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.rx3.h(r0)
            android.os.Handler r0 = r3.f12498e
            if (r0 != 0) goto L12
            com.google.android.gms.internal.ads.z0 r2 = r3.f12499f
            if (r2 == 0) goto L10
            goto L12
        L10:
            r2 = r1
            goto L1a
        L12:
            r2 = 0
            if (r0 == 0) goto L1a
            com.google.android.gms.internal.ads.z0 r0 = r3.f12499f
            if (r0 == 0) goto L1a
            goto L10
        L1a:
            com.google.android.gms.internal.ads.rx3.h(r2)
            r3.f12495b = r1
            com.google.android.gms.internal.ads.p r0 = new com.google.android.gms.internal.ads.p
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n.d():com.google.android.gms.internal.ads.p");
    }

    final /* synthetic */ Context e() {
        return this.f12494a;
    }

    final /* synthetic */ fo5 f() {
        return this.f12496c;
    }

    final /* synthetic */ kn5 g() {
        return this.f12497d;
    }

    final /* synthetic */ Handler h() {
        return this.f12498e;
    }

    final /* synthetic */ z0 i() {
        return this.f12499f;
    }
}
