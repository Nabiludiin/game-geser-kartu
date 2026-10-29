package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class lc0 extends mb0 {

    /* renamed from: q, reason: collision with root package name */
    private final Object f11542q;

    /* renamed from: r, reason: collision with root package name */
    private mc0 f11543r;

    /* renamed from: s, reason: collision with root package name */
    private ci0 f11544s;

    /* renamed from: t, reason: collision with root package name */
    private w3.a f11545t;

    /* renamed from: u, reason: collision with root package name */
    private View f11546u;

    /* renamed from: v, reason: collision with root package name */
    private y2.r f11547v;

    /* renamed from: w, reason: collision with root package name */
    private final String f11548w = "";

    public lc0(y2.a aVar) {
        this.f11542q = aVar;
    }

    private final Bundle j8(String str, s2.b5 b5Var, String str2) {
        w2.p.a("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f11542q instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (b5Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", b5Var.f26062w);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            w2.p.d("", th);
            throw new RemoteException();
        }
    }

    private final Bundle k8(s2.b5 b5Var) {
        Bundle bundle;
        Bundle bundle2 = b5Var.C;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f11542q.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final boolean l8(s2.b5 b5Var) {
        if (b5Var.f26061v) {
            return true;
        }
        s2.z.a();
        return w2.g.z();
    }

    private static final String m8(String str, s2.b5 b5Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return b5Var.K;
        }
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void D5(w3.a aVar) {
        Object obj = this.f11542q;
        if (obj instanceof y2.a) {
            w2.p.a("Show rewarded ad from adapter.");
            w2.p.c("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = y2.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void E0(w3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void G3(w3.a aVar) {
        Object obj = this.f11542q;
        if ((obj instanceof y2.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                g();
                return;
            } else {
                w2.p.a("Show interstitial ad from adapter.");
                w2.p.c("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = y2.a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final boolean H() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final s2.b3 J() {
        Object obj = this.f11542q;
        if (obj instanceof y2.s) {
            try {
                return ((y2.s) obj).getVideoController();
            } catch (Throwable th) {
                w2.p.d("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final wd0 M() {
        Object obj = this.f11542q;
        if (!(obj instanceof y2.a)) {
            return null;
        }
        ((y2.a) obj).getVersionInfo();
        return wd0.M0(null);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final tb0 S() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final yb0 T() {
        y2.r rVar;
        y2.r t7;
        Object obj = this.f11542q;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof y2.a) || (rVar = this.f11547v) == null) {
                return null;
            }
            return new pc0(rVar);
        }
        mc0 mc0Var = this.f11543r;
        if (mc0Var == null || (t7 = mc0Var.t()) == null) {
            return null;
        }
        return new pc0(t7);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void T3(s2.b5 b5Var, String str) {
        b6(b5Var, str, null);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final wd0 U() {
        Object obj = this.f11542q;
        if (!(obj instanceof y2.a)) {
            return null;
        }
        ((y2.a) obj).getSDKVersionInfo();
        return wd0.M0(null);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void U1(w3.a aVar, s2.g5 g5Var, s2.b5 b5Var, String str, qb0 qb0Var) {
        w3(aVar, g5Var, b5Var, str, null, qb0Var);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void X5(w3.a aVar, s2.b5 b5Var, String str, qb0 qb0Var) {
        Object obj = this.f11542q;
        if (obj instanceof y2.a) {
            w2.p.a("Requesting rewarded interstitial ad from adapter.");
            try {
                ((y2.a) obj).loadRewardedInterstitialAd(new y2.o((Context) w3.b.r0(aVar), "", j8(str, b5Var, null), k8(b5Var), l8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, m8(str, b5Var), ""), new ic0(this, qb0Var));
                return;
            } catch (Exception e8) {
                hb0.a(aVar, e8, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        String canonicalName = y2.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void b6(s2.b5 b5Var, String str, String str2) {
        Object obj = this.f11542q;
        if (obj instanceof y2.a) {
            i3(this.f11545t, b5Var, str, new nc0((y2.a) obj, this.f11544s));
            return;
        }
        String canonicalName = y2.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void c4(boolean z7) {
        Object obj = this.f11542q;
        if (obj instanceof y2.q) {
            try {
                ((y2.q) obj).onImmersiveModeUpdated(z7);
                return;
            } catch (Throwable th) {
                w2.p.d("", th);
                return;
            }
        }
        String canonicalName = y2.q.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        w2.p.a(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void d5(w3.a aVar) {
        Object obj = this.f11542q;
        if (obj instanceof y2.a) {
            w2.p.a("Show app open ad from adapter.");
            w2.p.c("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = y2.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final w3.a e() {
        Object obj = this.f11542q;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return w3.b.C1(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                w2.p.d("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof y2.a) {
            return w3.b.C1(this.f11546u);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = y2.a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void e3(w3.a aVar, s2.b5 b5Var, String str, qb0 qb0Var) {
        Object obj = this.f11542q;
        if (obj instanceof y2.a) {
            w2.p.a("Requesting app open ad from adapter.");
            try {
                ((y2.a) obj).loadAppOpenAd(new y2.g((Context) w3.b.r0(aVar), "", j8(str, b5Var, null), k8(b5Var), l8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, m8(str, b5Var), ""), new jc0(this, qb0Var));
                return;
            } catch (Exception e8) {
                w2.p.d("", e8);
                hb0.a(aVar, e8, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        String canonicalName = y2.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void e5(w3.a aVar, s2.g5 g5Var, s2.b5 b5Var, String str, String str2, qb0 qb0Var) {
        Object obj = this.f11542q;
        if (!(obj instanceof y2.a)) {
            String canonicalName = y2.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            w2.p.f(sb.toString());
            throw new RemoteException();
        }
        w2.p.a("Requesting interscroller ad from adapter.");
        try {
            y2.a aVar2 = (y2.a) obj;
            cc0 cc0Var = new cc0(this, qb0Var, aVar2);
            j8(str, b5Var, str2);
            k8(b5Var);
            l8(b5Var);
            Location location = b5Var.A;
            m8(str, b5Var);
            k2.a0.c(g5Var.f26099u, g5Var.f26096r);
            cc0Var.a(new k2.b(7, aVar2.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
        } catch (Exception e8) {
            w2.p.d("", e8);
            hb0.a(aVar, e8, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final ub0 f0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void g() {
        Object obj = this.f11542q;
        if (obj instanceof MediationInterstitialAdapter) {
            w2.p.a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                w2.p.d("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void g2(w3.a aVar, s2.b5 b5Var, String str, String str2, qb0 qb0Var, z10 z10Var, List list) {
        Object obj = this.f11542q;
        boolean z7 = obj instanceof MediationNativeAdapter;
        if (!z7 && !(obj instanceof y2.a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = y2.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            w2.p.f(sb.toString());
            throw new RemoteException();
        }
        w2.p.a("Requesting native ad from adapter.");
        if (z7) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list2 = b5Var.f26060u;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j7 = b5Var.f26057r;
                oc0 oc0Var = new oc0(j7 == -1 ? null : new Date(j7), b5Var.f26059t, hashSet, b5Var.A, l8(b5Var), b5Var.f26062w, z10Var, list, b5Var.H, b5Var.J, m8(str, b5Var));
                Bundle bundle = b5Var.C;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f11543r = new mc0(qb0Var);
                mediationNativeAdapter.requestNativeAd((Context) w3.b.r0(aVar), this.f11543r, j8(str, b5Var, str2), oc0Var, bundle2);
                return;
            } catch (Throwable th) {
                w2.p.d("", th);
                hb0.a(aVar, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.f11542q;
        if (obj2 instanceof y2.a) {
            try {
                ((y2.a) obj2).loadNativeAdMapper(new y2.m((Context) w3.b.r0(aVar), "", j8(str, b5Var, str2), k8(b5Var), l8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, m8(str, b5Var), this.f11548w, z10Var), new hc0(this, qb0Var));
            } catch (Throwable th2) {
                w2.p.d("", th2);
                hb0.a(aVar, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((y2.a) this.f11542q).loadNativeAd(new y2.m((Context) w3.b.r0(aVar), "", j8(str, b5Var, str2), k8(b5Var), l8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, m8(str, b5Var), this.f11548w, z10Var), new gc0(this, qb0Var));
                } catch (Throwable th3) {
                    w2.p.d("", th3);
                    hb0.a(aVar, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void i3(w3.a aVar, s2.b5 b5Var, String str, qb0 qb0Var) {
        Object obj = this.f11542q;
        if (obj instanceof y2.a) {
            w2.p.a("Requesting rewarded ad from adapter.");
            try {
                ((y2.a) obj).loadRewardedAd(new y2.o((Context) w3.b.r0(aVar), "", j8(str, b5Var, null), k8(b5Var), l8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, m8(str, b5Var), ""), new ic0(this, qb0Var));
                return;
            } catch (Exception e8) {
                w2.p.d("", e8);
                hb0.a(aVar, e8, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        String canonicalName = y2.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void j() {
        Object obj = this.f11542q;
        if (obj instanceof y2.f) {
            try {
                ((y2.f) obj).onDestroy();
            } catch (Throwable th) {
                w2.p.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void k() {
        Object obj = this.f11542q;
        if (obj instanceof y2.f) {
            try {
                ((y2.f) obj).onPause();
            } catch (Throwable th) {
                w2.p.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void k4(w3.a aVar, s2.b5 b5Var, String str, qb0 qb0Var) {
        p1(aVar, b5Var, str, null, qb0Var);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final boolean m() {
        Object obj = this.f11542q;
        if ((obj instanceof y2.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f11544s != null;
        }
        String canonicalName = y2.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void n() {
        Object obj = this.f11542q;
        if (obj instanceof y2.f) {
            try {
                ((y2.f) obj).onResume();
            } catch (Throwable th) {
                w2.p.d("", th);
                throw new RemoteException();
            }
        }
    }

    final /* synthetic */ Object n8() {
        return this.f11542q;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final Bundle p() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void p1(w3.a aVar, s2.b5 b5Var, String str, String str2, qb0 qb0Var) {
        Object obj = this.f11542q;
        boolean z7 = obj instanceof MediationInterstitialAdapter;
        if (!z7 && !(obj instanceof y2.a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = y2.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            w2.p.f(sb.toString());
            throw new RemoteException();
        }
        w2.p.a("Requesting interstitial ad from adapter.");
        if (!z7) {
            Object obj2 = this.f11542q;
            if (obj2 instanceof y2.a) {
                try {
                    ((y2.a) obj2).loadInterstitialAd(new y2.k((Context) w3.b.r0(aVar), "", j8(str, b5Var, str2), k8(b5Var), l8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, m8(str, b5Var), this.f11548w), new fc0(this, qb0Var));
                    return;
                } catch (Throwable th) {
                    w2.p.d("", th);
                    hb0.a(aVar, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = b5Var.f26060u;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j7 = b5Var.f26057r;
            bc0 bc0Var = new bc0(j7 == -1 ? null : new Date(j7), b5Var.f26059t, hashSet, b5Var.A, l8(b5Var), b5Var.f26062w, b5Var.H, b5Var.J, m8(str, b5Var));
            Bundle bundle = b5Var.C;
            mediationInterstitialAdapter.requestInterstitialAd((Context) w3.b.r0(aVar), new mc0(qb0Var), j8(str, b5Var, str2), bc0Var, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            w2.p.d("", th2);
            hb0.a(aVar, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.nb0
    public final void p7(w3.a aVar, x70 x70Var, List list) {
        Object obj = this.f11542q;
        if (!(obj instanceof y2.a)) {
            throw new RemoteException();
        }
        dc0 dc0Var = new dc0(this, x70Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d80 d80Var = (d80) it.next();
            String str = d80Var.f6967q;
            k2.c cVar = null;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        cVar = k2.c.BANNER;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        cVar = k2.c.NATIVE;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        cVar = k2.c.REWARDED;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        cVar = k2.c.INTERSTITIAL;
                        break;
                    }
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        cVar = k2.c.APP_OPEN_AD;
                        break;
                    }
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) s2.b0.c().d(uy.Rc)).booleanValue()) {
                            cVar = k2.c.APP_OPEN_AD;
                            break;
                        }
                    }
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        cVar = k2.c.REWARDED_INTERSTITIAL;
                        break;
                    }
                    break;
            }
            if (cVar != null) {
                arrayList.add(new y2.j(cVar, d80Var.f6968r));
            }
        }
        ((y2.a) obj).initialize((Context) w3.b.r0(aVar), dc0Var, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final Bundle r() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void s() {
        Object obj = this.f11542q;
        if (obj instanceof y2.a) {
            w2.p.c("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = y2.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final vb0 s0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final Bundle t() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void t6(w3.a aVar, s2.b5 b5Var, String str, ci0 ci0Var, String str2) {
        Object obj = this.f11542q;
        if ((obj instanceof y2.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f11545t = aVar;
            this.f11544s = ci0Var;
            ci0Var.Y(w3.b.C1(obj));
            return;
        }
        String canonicalName = y2.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        w2.p.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void w3(w3.a aVar, s2.g5 g5Var, s2.b5 b5Var, String str, String str2, qb0 qb0Var) {
        String str3;
        MediationBannerAdapter mediationBannerAdapter;
        bc0 bc0Var;
        Bundle bundle;
        Object obj = this.f11542q;
        boolean z7 = obj instanceof MediationBannerAdapter;
        if (!z7 && !(obj instanceof y2.a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = y2.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            w2.p.f(sb.toString());
            throw new RemoteException();
        }
        w2.p.a("Requesting banner ad from adapter.");
        k2.h b8 = g5Var.D ? k2.a0.b(g5Var.f26099u, g5Var.f26096r) : k2.a0.a(g5Var.f26099u, g5Var.f26096r, g5Var.f26095q);
        if (!z7) {
            Object obj2 = this.f11542q;
            if (obj2 instanceof y2.a) {
                try {
                    ((y2.a) obj2).loadBannerAd(new y2.h((Context) w3.b.r0(aVar), "", j8(str, b5Var, str2), k8(b5Var), l8(b5Var), b5Var.A, b5Var.f26062w, b5Var.J, m8(str, b5Var), b8, this.f11548w), new ec0(this, qb0Var));
                    return;
                } catch (Throwable th) {
                    w2.p.d("", th);
                    hb0.a(aVar, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = b5Var.f26060u;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j7 = b5Var.f26057r;
            bc0Var = new bc0(j7 == -1 ? null : new Date(j7), b5Var.f26059t, hashSet, b5Var.A, l8(b5Var), b5Var.f26062w, b5Var.H, b5Var.J, m8(str, b5Var));
            Bundle bundle2 = b5Var.C;
            bundle = bundle2 != null ? bundle2.getBundle(mediationBannerAdapter.getClass().getName()) : null;
            str3 = "";
        } catch (Throwable th2) {
            th = th2;
            str3 = "";
        }
        try {
            mediationBannerAdapter.requestBannerAd((Context) w3.b.r0(aVar), new mc0(qb0Var), j8(str, b5Var, str2), b8, bc0Var, bundle);
        } catch (Throwable th3) {
            th = th3;
            w2.p.d(str3, th);
            hb0.a(aVar, th, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final e30 x() {
        mc0 mc0Var = this.f11543r;
        if (mc0Var == null) {
            return null;
        }
        f30 u7 = mc0Var.u();
        if (kc0.a(u7)) {
            return u7.a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.nb0
    public final void z6(w3.a aVar, ci0 ci0Var, List list) {
        w2.p.f("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    public lc0(y2.f fVar) {
        this.f11542q = fVar;
    }
}
