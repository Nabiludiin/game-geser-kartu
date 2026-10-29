package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import y2.e;
import y2.f;
import y2.l;

/* compiled from: MyApplication */
@Deprecated
public interface MediationInterstitialAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, l lVar, Bundle bundle, e eVar, Bundle bundle2);

    void showInterstitial();
}
