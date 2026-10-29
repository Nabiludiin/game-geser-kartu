package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class vd0 extends hd0 {

    /* renamed from: q, reason: collision with root package name */
    private final RtbAdapter f17571q;

    /* renamed from: r, reason: collision with root package name */
    private String f17572r = "";

    public vd0(RtbAdapter rtbAdapter) {
        this.f17571q = rtbAdapter;
    }

    private final Bundle k8(s2.b5 b5Var) {
        Bundle bundle;
        Bundle bundle2 = b5Var.C;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f17571q.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle l8(String str) {
        w2.p.f("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e8) {
            w2.p.d("", e8);
            throw new RemoteException();
        }
    }

    private static final boolean m8(s2.b5 b5Var) {
        if (b5Var.f26061v) {
            return true;
        }
        s2.z.a();
        return w2.g.z();
    }

    private static final String n8(String str, s2.b5 b5Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return b5Var.K;
        }
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final boolean B0(w3.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void D1(String str, String str2, s2.b5 b5Var, w3.a aVar, sc0 sc0Var, qb0 qb0Var) {
        try {
            this.f17571q.loadRtbAppOpenAd(new y2.g((Context) w3.b.r0(aVar), str, l8(str2), k8(b5Var), m8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, n8(str2, b5Var), this.f17572r), new sd0(this, sc0Var, qb0Var));
        } catch (Throwable th) {
            w2.p.d("Adapter failed to render app open ad.", th);
            hb0.a(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void E1(String str, String str2, s2.b5 b5Var, w3.a aVar, fd0 fd0Var, qb0 qb0Var) {
        try {
            this.f17571q.loadRtbRewardedAd(new y2.o((Context) w3.b.r0(aVar), str, l8(str2), k8(b5Var), m8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, n8(str2, b5Var), this.f17572r), new ud0(this, fd0Var, qb0Var));
        } catch (Throwable th) {
            w2.p.d("Adapter failed to render rewarded ad.", th);
            hb0.a(aVar, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void F4(String str, String str2, s2.b5 b5Var, w3.a aVar, vc0 vc0Var, qb0 qb0Var, s2.g5 g5Var) {
        try {
            this.f17571q.loadRtbBannerAd(new y2.h((Context) w3.b.r0(aVar), str, l8(str2), k8(b5Var), m8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, n8(str2, b5Var), k2.a0.a(g5Var.f26099u, g5Var.f26096r, g5Var.f26095q), this.f17572r), new nd0(this, vc0Var, qb0Var));
        } catch (Throwable th) {
            w2.p.d("Adapter failed to render banner ad.", th);
            hb0.a(aVar, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.id0
    public final void G7(w3.a aVar, String str, Bundle bundle, Bundle bundle2, s2.g5 g5Var, ld0 ld0Var) {
        k2.c cVar;
        try {
            td0 td0Var = new td0(this, ld0Var);
            RtbAdapter rtbAdapter = this.f17571q;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        cVar = k2.c.BANNER;
                        y2.j jVar = new y2.j(cVar, bundle2);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(jVar);
                        rtbAdapter.collectSignals(new a3.a((Context) w3.b.r0(aVar), arrayList, bundle, k2.a0.a(g5Var.f26099u, g5Var.f26096r, g5Var.f26095q)), td0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -1052618729:
                    if (str.equals("native")) {
                        cVar = k2.c.NATIVE;
                        y2.j jVar2 = new y2.j(cVar, bundle2);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(jVar2);
                        rtbAdapter.collectSignals(new a3.a((Context) w3.b.r0(aVar), arrayList2, bundle, k2.a0.a(g5Var.f26099u, g5Var.f26096r, g5Var.f26095q)), td0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -239580146:
                    if (str.equals("rewarded")) {
                        cVar = k2.c.REWARDED;
                        y2.j jVar22 = new y2.j(cVar, bundle2);
                        ArrayList arrayList22 = new ArrayList();
                        arrayList22.add(jVar22);
                        rtbAdapter.collectSignals(new a3.a((Context) w3.b.r0(aVar), arrayList22, bundle, k2.a0.a(g5Var.f26099u, g5Var.f26096r, g5Var.f26095q)), td0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 604727084:
                    if (str.equals("interstitial")) {
                        cVar = k2.c.INTERSTITIAL;
                        y2.j jVar222 = new y2.j(cVar, bundle2);
                        ArrayList arrayList222 = new ArrayList();
                        arrayList222.add(jVar222);
                        rtbAdapter.collectSignals(new a3.a((Context) w3.b.r0(aVar), arrayList222, bundle, k2.a0.a(g5Var.f26099u, g5Var.f26096r, g5Var.f26095q)), td0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1167692200:
                    if (str.equals("app_open")) {
                        cVar = k2.c.APP_OPEN_AD;
                        y2.j jVar2222 = new y2.j(cVar, bundle2);
                        ArrayList arrayList2222 = new ArrayList();
                        arrayList2222.add(jVar2222);
                        rtbAdapter.collectSignals(new a3.a((Context) w3.b.r0(aVar), arrayList2222, bundle, k2.a0.a(g5Var.f26099u, g5Var.f26096r, g5Var.f26095q)), td0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) s2.b0.c().d(uy.Rc)).booleanValue()) {
                            cVar = k2.c.APP_OPEN_AD;
                            y2.j jVar22222 = new y2.j(cVar, bundle2);
                            ArrayList arrayList22222 = new ArrayList();
                            arrayList22222.add(jVar22222);
                            rtbAdapter.collectSignals(new a3.a((Context) w3.b.r0(aVar), arrayList22222, bundle, k2.a0.a(g5Var.f26099u, g5Var.f26096r, g5Var.f26095q)), td0Var);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        cVar = k2.c.REWARDED_INTERSTITIAL;
                        y2.j jVar222222 = new y2.j(cVar, bundle2);
                        ArrayList arrayList222222 = new ArrayList();
                        arrayList222222.add(jVar222222);
                        rtbAdapter.collectSignals(new a3.a((Context) w3.b.r0(aVar), arrayList222222, bundle, k2.a0.a(g5Var.f26099u, g5Var.f26096r, g5Var.f26095q)), td0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            w2.p.d("Error generating signals for RTB", th);
            hb0.a(aVar, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void I5(String str, String str2, s2.b5 b5Var, w3.a aVar, cd0 cd0Var, qb0 qb0Var) {
        t3(str, str2, b5Var, aVar, cd0Var, qb0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void O0(String str) {
        this.f17572r = str;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void Q4(String str, String str2, s2.b5 b5Var, w3.a aVar, fd0 fd0Var, qb0 qb0Var) {
        try {
            this.f17571q.loadRtbRewardedInterstitialAd(new y2.o((Context) w3.b.r0(aVar), str, l8(str2), k8(b5Var), m8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, n8(str2, b5Var), this.f17572r), new ud0(this, fd0Var, qb0Var));
        } catch (Throwable th) {
            w2.p.d("Adapter failed to render rewarded interstitial ad.", th);
            hb0.a(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void S6(String str, String str2, s2.b5 b5Var, w3.a aVar, yc0 yc0Var, qb0 qb0Var) {
        try {
            this.f17571q.loadRtbInterstitialAd(new y2.k((Context) w3.b.r0(aVar), str, l8(str2), k8(b5Var), m8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, n8(str2, b5Var), this.f17572r), new pd0(this, yc0Var, qb0Var));
        } catch (Throwable th) {
            w2.p.d("Adapter failed to render interstitial ad.", th);
            hb0.a(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final wd0 e() {
        this.f17571q.getVersionInfo();
        return wd0.M0(null);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final wd0 f() {
        this.f17571q.getSDKVersionInfo();
        return wd0.M0(null);
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final s2.b3 g() {
        Object obj = this.f17571q;
        if (obj instanceof y2.s) {
            try {
                return ((y2.s) obj).getVideoController();
            } catch (Throwable th) {
                w2.p.d("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final boolean g4(w3.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void g5(String str, String str2, s2.b5 b5Var, w3.a aVar, vc0 vc0Var, qb0 qb0Var, s2.g5 g5Var) {
        try {
            od0 od0Var = new od0(this, vc0Var, qb0Var);
            RtbAdapter rtbAdapter = this.f17571q;
            l8(str2);
            k8(b5Var);
            m8(b5Var);
            Location location = b5Var.A;
            n8(str2, b5Var);
            k2.a0.a(g5Var.f26099u, g5Var.f26096r, g5Var.f26095q);
            od0Var.a(new k2.b(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
        } catch (Throwable th) {
            w2.p.d("Adapter failed to render interscroller ad.", th);
            hb0.a(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void t3(String str, String str2, s2.b5 b5Var, w3.a aVar, cd0 cd0Var, qb0 qb0Var, z10 z10Var) {
        try {
            this.f17571q.loadRtbNativeAdMapper(new y2.m((Context) w3.b.r0(aVar), str, l8(str2), k8(b5Var), m8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, n8(str2, b5Var), this.f17572r, z10Var), new qd0(this, cd0Var, qb0Var));
        } catch (Throwable th) {
            w2.p.d("Adapter failed to render native ad.", th);
            hb0.a(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                this.f17571q.loadRtbNativeAd(new y2.m((Context) w3.b.r0(aVar), str, l8(str2), k8(b5Var), m8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, n8(str2, b5Var), this.f17572r, z10Var), new rd0(this, cd0Var, qb0Var));
            } catch (Throwable th2) {
                w2.p.d("Adapter failed to render native ad.", th2);
                hb0.a(aVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final boolean y0(w3.a aVar) {
        return false;
    }
}
