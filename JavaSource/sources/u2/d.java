package u2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.bs;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.uy;
import v2.f2;
import v2.n1;

/* compiled from: MyApplication */
public final class d extends bf0 implements bs {

    /* renamed from: q, reason: collision with root package name */
    private final AdOverlayInfoParcel f26500q;

    /* renamed from: r, reason: collision with root package name */
    private final Activity f26501r;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f26505v;

    /* renamed from: s, reason: collision with root package name */
    private boolean f26502s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f26503t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f26504u = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f26506w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f26507x = false;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (((java.lang.Boolean) s2.b0.c().d(com.google.android.gms.internal.ads.uy.f17219u5)).booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.app.Activity r3, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f26502s = r0
            r2.f26503t = r0
            r2.f26504u = r0
            r2.f26506w = r0
            r2.f26507x = r0
            r2.f26500q = r4
            r2.f26501r = r3
            com.google.android.gms.internal.ads.ly r3 = com.google.android.gms.internal.ads.uy.f17179p5
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r3 = r1.d(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L48
            com.google.android.gms.internal.ads.ly r3 = com.google.android.gms.internal.ads.uy.f17187q5
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r3 = r1.d(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L48
            com.google.android.gms.internal.ads.ly r3 = com.google.android.gms.internal.ads.uy.f17219u5
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r3 = r1.d(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L79
        L48:
            u2.m r3 = r4.f4340q
            if (r3 == 0) goto L79
            boolean r3 = r3.f26534z
            if (r3 == 0) goto L79
            java.lang.String r3 = android.os.Build.MANUFACTURER
            com.google.android.gms.internal.ads.ly r4 = com.google.android.gms.internal.ads.uy.f17203s5
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r4 = r1.d(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L79
            java.lang.String r3 = android.os.Build.MODEL
            com.google.android.gms.internal.ads.ly r4 = com.google.android.gms.internal.ads.uy.f17211t5
            com.google.android.gms.internal.ads.sy r1 = s2.b0.c()
            java.lang.Object r4 = r1.d(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L79
            r0 = 1
        L79:
            r2.f26505v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.<init>(android.app.Activity, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel):void");
    }

    private final synchronized void d() {
        try {
            if (!this.f26503t) {
                c0 c0Var = this.f26500q.f4342s;
                if (c0Var != null) {
                    c0Var.V5(4);
                }
                this.f26503t = true;
                if (this.f26505v) {
                    if (((Boolean) s2.b0.c().d(uy.f17219u5)).booleanValue()) {
                        r2.t.k().c(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void X(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f26502s);
    }

    final /* synthetic */ void b() {
        if (this.f26506w) {
            this.f26501r.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void e() {
        c0 c0Var = this.f26500q.f4342s;
        if (c0Var != null) {
            c0Var.t7();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final boolean f() {
        return ((Boolean) s2.b0.c().d(uy.f17187q5)).booleanValue() && this.f26505v && this.f26506w;
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void k() {
        this.f26506w = false;
        c0 c0Var = this.f26500q.f4342s;
        if (c0Var != null) {
            c0Var.P4();
        }
        if (this.f26501r.isFinishing()) {
            d();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void l() {
        if (this.f26502s) {
            n1.k("LauncherOverlay finishing activity");
            this.f26501r.finish();
            return;
        }
        this.f26502s = true;
        this.f26506w = true;
        c0 c0Var = this.f26500q.f4342s;
        if (c0Var != null) {
            c0Var.M5();
        }
        if (this.f26505v) {
            if (((Boolean) s2.b0.c().d(uy.f17179p5)).booleanValue()) {
                f2.f26746l.postDelayed(new Runnable() { // from class: u2.c
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        d.this.b();
                    }
                }, ((Integer) s2.b0.c().d(uy.f17195r5)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void m() {
        if (this.f26501r.isFinishing()) {
            d();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void p() {
        this.f26504u = true;
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void r0(boolean z7) {
        if (!z7) {
            this.f26507x = true;
        } else if (this.f26507x) {
            int i7 = n1.f26802b;
            w2.p.a("Foregrounded: finishing activity from LauncherOverlay");
            this.f26501r.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void s() {
        if (this.f26501r.isFinishing()) {
            d();
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void x7(Bundle bundle) {
        c0 c0Var;
        if (((Boolean) s2.b0.c().d(uy.S9)).booleanValue() && !this.f26504u) {
            this.f26501r.requestWindowFeature(1);
        }
        boolean z7 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z7 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f26500q;
        if (adOverlayInfoParcel == null) {
            this.f26501r.finish();
            return;
        }
        if (z7) {
            this.f26501r.finish();
            return;
        }
        if (bundle == null) {
            s2.a aVar = adOverlayInfoParcel.f4341r;
            if (aVar != null) {
                aVar.c0();
            }
            pi1 pi1Var = adOverlayInfoParcel.K;
            if (pi1Var != null) {
                pi1Var.z();
            }
            Activity activity = this.f26501r;
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (c0Var = adOverlayInfoParcel.f4342s) != null) {
                c0Var.g();
            }
        }
        if (this.f26505v) {
            if (((Boolean) s2.b0.c().d(uy.f17219u5)).booleanValue()) {
                r2.t.k().b(this);
            }
        }
        Activity activity2 = this.f26501r;
        m mVar = adOverlayInfoParcel.f4340q;
        e eVar = adOverlayInfoParcel.f4348y;
        r2.t.e();
        if (a.b(activity2, mVar, eVar, mVar.f26533y, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void j0(w3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void K2(int i7, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void V2(int i7, int i8, Intent intent) {
    }
}
