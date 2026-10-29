package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;

/* compiled from: MyApplication */
public final class br0 extends gn0 {

    /* renamed from: s, reason: collision with root package name */
    private final co0 f5930s;

    /* renamed from: t, reason: collision with root package name */
    private cr0 f5931t;

    /* renamed from: u, reason: collision with root package name */
    private Uri f5932u;

    /* renamed from: v, reason: collision with root package name */
    private fn0 f5933v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5934w;

    /* renamed from: x, reason: collision with root package name */
    private int f5935x;

    public br0(Context context, co0 co0Var) {
        super(context);
        this.f5935x = 1;
        this.f5934w = false;
        this.f5930s = co0Var;
        co0Var.a(this);
    }

    private final boolean F() {
        int i7 = this.f5935x;
        return (i7 == 1 || i7 == 2 || this.f5931t == null) ? false : true;
    }

    private final void G(int i7) {
        if (i7 == 4) {
            this.f5930s.e();
            this.f9030r.d();
        } else if (this.f5935x == 4) {
            this.f5930s.f();
            this.f9030r.e();
        }
        this.f5935x = i7;
    }

    final /* synthetic */ void C() {
        fn0 fn0Var = this.f5933v;
        if (fn0Var != null) {
            fn0Var.b();
        }
    }

    final /* synthetic */ void D() {
        fn0 fn0Var = this.f5933v;
        if (fn0Var != null) {
            if (!this.f5934w) {
                fn0Var.l();
                this.f5934w = true;
            }
            this.f5933v.d();
        }
    }

    final /* synthetic */ void E() {
        fn0 fn0Var = this.f5933v;
        if (fn0Var != null) {
            fn0Var.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final String h() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void i(fn0 fn0Var) {
        this.f5933v = fn0Var;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void j(String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f5932u = parse;
            this.f5931t = new cr0(parse.toString());
            G(3);
            v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ar0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    br0.this.C();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void k() {
        v2.n1.k("AdImmersivePlayerView stop");
        cr0 cr0Var = this.f5931t;
        if (cr0Var != null) {
            cr0Var.d();
            this.f5931t = null;
            G(1);
        }
        this.f5930s.c();
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void l() {
        v2.n1.k("AdImmersivePlayerView play");
        if (F()) {
            this.f5931t.b();
            G(4);
            this.f9029q.a();
            v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.yq0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    br0.this.D();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0, com.google.android.gms.internal.ads.eo0
    public final void m() {
        if (this.f5931t != null) {
            this.f9030r.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void n() {
        v2.n1.k("AdImmersivePlayerView pause");
        if (F() && this.f5931t.a()) {
            this.f5931t.c();
            G(5);
            v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zq0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    br0.this.E();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int o() {
        return F() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int p() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void q(int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i7);
        v2.n1.k(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int s() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int t() {
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = br0.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final long u() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final long v() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final long w() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int x() {
        return F() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void r(float f8, float f9) {
    }
}
