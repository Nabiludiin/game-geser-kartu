package com.google.android.gms.ads.mediation.rtb;

import a3.b;
import y2.a;
import y2.d;
import y2.g;
import y2.h;
import y2.k;
import y2.m;
import y2.o;

/* compiled from: MyApplication */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(a3.a aVar, b bVar);

    public void loadRtbAppOpenAd(g gVar, d dVar) {
        loadAppOpenAd(gVar, dVar);
    }

    public void loadRtbBannerAd(h hVar, d dVar) {
        loadBannerAd(hVar, dVar);
    }

    public void loadRtbInterstitialAd(k kVar, d dVar) {
        loadInterstitialAd(kVar, dVar);
    }

    @Deprecated
    public void loadRtbNativeAd(m mVar, d dVar) {
        loadNativeAd(mVar, dVar);
    }

    public void loadRtbNativeAdMapper(m mVar, d dVar) {
        loadNativeAdMapper(mVar, dVar);
    }

    public void loadRtbRewardedAd(o oVar, d dVar) {
        loadRewardedAd(oVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(o oVar, d dVar) {
        loadRewardedInterstitialAd(oVar, dVar);
    }
}
