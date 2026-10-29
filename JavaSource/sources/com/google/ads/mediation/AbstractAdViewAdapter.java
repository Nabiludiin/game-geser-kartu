package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Iterator;
import java.util.Set;
import k2.f;
import k2.g;
import k2.h;
import k2.i;
import s2.b3;
import s2.z;
import y2.l;
import y2.n;
import y2.p;
import y2.q;
import y2.s;

/* compiled from: MyApplication */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, q, s {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private f adLoader;
    protected i mAdView;
    protected x2.a mInterstitialAd;

    g buildAdRequest(Context context, y2.e eVar, Bundle bundle, Bundle bundle2) {
        g.a aVar = new g.a();
        Set h8 = eVar.h();
        if (h8 != null) {
            Iterator it = h8.iterator();
            while (it.hasNext()) {
                aVar.b((String) it.next());
            }
        }
        if (eVar.g()) {
            z.a();
            aVar.h(w2.g.d(context));
        }
        if (eVar.d() != -1) {
            aVar.i(eVar.d() == 1);
        }
        aVar.j(eVar.f());
        aVar.c(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.k();
    }

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    x2.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // y2.s
    public b3 getVideoController() {
        i iVar = this.mAdView;
        if (iVar != null) {
            return iVar.e().c();
        }
        return null;
    }

    f.a newAdLoader(Context context, String str) {
        return new f.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, y2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        i iVar = this.mAdView;
        if (iVar != null) {
            iVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // y2.q
    public void onImmersiveModeUpdated(boolean z7) {
        x2.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(z7);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, y2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        i iVar = this.mAdView;
        if (iVar != null) {
            iVar.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, y2.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        i iVar = this.mAdView;
        if (iVar != null) {
            iVar.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, y2.i iVar, Bundle bundle, h hVar, y2.e eVar, Bundle bundle2) {
        i iVar2 = new i(context);
        this.mAdView = iVar2;
        iVar2.setAdSize(new h(hVar.c(), hVar.a()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, iVar));
        this.mAdView.b(buildAdRequest(context, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, l lVar, Bundle bundle, y2.e eVar, Bundle bundle2) {
        x2.a.b(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new c(this, lVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, n nVar, Bundle bundle, p pVar, Bundle bundle2) {
        e eVar = new e(this, nVar);
        f.a newAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        newAdLoader.c(eVar);
        newAdLoader.g(pVar.i());
        newAdLoader.d(pVar.c());
        if (pVar.e()) {
            newAdLoader.e(eVar);
        }
        if (pVar.a()) {
            for (String str : pVar.b().keySet()) {
                newAdLoader.f(str, eVar, true != ((Boolean) pVar.b().get(str)).booleanValue() ? null : eVar);
            }
        }
        f a8 = newAdLoader.a();
        this.adLoader = a8;
        a8.a(buildAdRequest(context, pVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        x2.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.e(null);
        }
    }
}
