package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

/* compiled from: MyApplication */
public final class mc0 implements y2.i, y2.l, y2.n {

    /* renamed from: a, reason: collision with root package name */
    private final qb0 f12192a;

    /* renamed from: b, reason: collision with root package name */
    private y2.r f12193b;

    /* renamed from: c, reason: collision with root package name */
    private f30 f12194c;

    public mc0(qb0 qb0Var) {
        this.f12192a = qb0Var;
    }

    @Override // y2.i
    public final void a(MediationBannerAdapter mediationBannerAdapter) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAdClosed.");
        try {
            this.f12192a.e();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.n
    public final void b(MediationNativeAdapter mediationNativeAdapter) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAdOpened.");
        try {
            this.f12192a.j();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.l
    public final void c(MediationInterstitialAdapter mediationInterstitialAdapter, int i7) {
        p3.o.f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i7);
        sb.append(".");
        w2.p.a(sb.toString());
        try {
            this.f12192a.b0(i7);
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.n
    public final void d(MediationNativeAdapter mediationNativeAdapter, y2.r rVar) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAdLoaded.");
        this.f12193b = rVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            k2.w wVar = new k2.w();
            wVar.b(new zb0());
            if (rVar != null && rVar.s()) {
                rVar.H(wVar);
            }
        }
        try {
            this.f12192a.i();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.i
    public final void e(MediationBannerAdapter mediationBannerAdapter) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAdClicked.");
        try {
            this.f12192a.c();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.n
    public final void f(MediationNativeAdapter mediationNativeAdapter, k2.b bVar) {
        p3.o.f("#008 Must be called on the main UI thread.");
        int a8 = bVar.a();
        String c8 = bVar.c();
        String b8 = bVar.b();
        int length = String.valueOf(a8).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(c8).length() + 15 + String.valueOf(b8).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a8);
        sb.append(". ErrorMessage: ");
        sb.append(c8);
        sb.append(". ErrorDomain: ");
        sb.append(b8);
        w2.p.a(sb.toString());
        try {
            this.f12192a.i1(bVar.d());
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.i
    public final void g(MediationBannerAdapter mediationBannerAdapter, k2.b bVar) {
        p3.o.f("#008 Must be called on the main UI thread.");
        int a8 = bVar.a();
        String c8 = bVar.c();
        String b8 = bVar.b();
        int length = String.valueOf(a8).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(c8).length() + 15 + String.valueOf(b8).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a8);
        sb.append(". ErrorMessage: ");
        sb.append(c8);
        sb.append(". ErrorDomain: ");
        sb.append(b8);
        w2.p.a(sb.toString());
        try {
            this.f12192a.i1(bVar.d());
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.n
    public final void h(MediationNativeAdapter mediationNativeAdapter) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAdClosed.");
        try {
            this.f12192a.e();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.n
    public final void i(MediationNativeAdapter mediationNativeAdapter, f30 f30Var) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAdLoaded with template id ".concat(String.valueOf(f30Var.b())));
        this.f12194c = f30Var;
        try {
            this.f12192a.i();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.i
    public final void j(MediationBannerAdapter mediationBannerAdapter) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAdLoaded.");
        try {
            this.f12192a.i();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.n
    public final void k(MediationNativeAdapter mediationNativeAdapter) {
        p3.o.f("#008 Must be called on the main UI thread.");
        y2.r rVar = this.f12193b;
        if (this.f12194c == null) {
            if (rVar == null) {
                w2.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!rVar.m()) {
                w2.p.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        w2.p.a("Adapter called onAdClicked.");
        try {
            this.f12192a.c();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.i
    public final void l(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAppEvent.");
        try {
            this.f12192a.N6(str, str2);
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.l
    public final void m(MediationInterstitialAdapter mediationInterstitialAdapter, k2.b bVar) {
        p3.o.f("#008 Must be called on the main UI thread.");
        int a8 = bVar.a();
        String c8 = bVar.c();
        String b8 = bVar.b();
        int length = String.valueOf(a8).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(c8).length() + 15 + String.valueOf(b8).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(a8);
        sb.append(". ErrorMessage: ");
        sb.append(c8);
        sb.append(". ErrorDomain: ");
        sb.append(b8);
        w2.p.a(sb.toString());
        try {
            this.f12192a.i1(bVar.d());
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.n
    public final void n(MediationNativeAdapter mediationNativeAdapter, f30 f30Var, String str) {
        try {
            this.f12192a.U2(f30Var.a(), str);
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.l
    public final void o(MediationInterstitialAdapter mediationInterstitialAdapter) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAdLoaded.");
        try {
            this.f12192a.i();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.i
    public final void p(MediationBannerAdapter mediationBannerAdapter) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAdOpened.");
        try {
            this.f12192a.j();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.l
    public final void q(MediationInterstitialAdapter mediationInterstitialAdapter) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAdClosed.");
        try {
            this.f12192a.e();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.n
    public final void r(MediationNativeAdapter mediationNativeAdapter) {
        p3.o.f("#008 Must be called on the main UI thread.");
        y2.r rVar = this.f12193b;
        if (this.f12194c == null) {
            if (rVar == null) {
                w2.p.i("#007 Could not call remote method.", null);
                return;
            } else if (!rVar.n()) {
                w2.p.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        w2.p.a("Adapter called onAdImpression.");
        try {
            this.f12192a.l();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // y2.l
    public final void s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        p3.o.f("#008 Must be called on the main UI thread.");
        w2.p.a("Adapter called onAdOpened.");
        try {
            this.f12192a.j();
        } catch (RemoteException e8) {
            w2.p.i("#007 Could not call remote method.", e8);
        }
    }

    public final y2.r t() {
        return this.f12193b;
    }

    public final f30 u() {
        return this.f12194c;
    }
}
