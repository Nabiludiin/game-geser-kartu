package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import y2.e;

/* compiled from: MyApplication */
@Deprecated
public interface CustomEventInterstitial extends z2.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, z2.c cVar, String str, e eVar, Bundle bundle);

    void showInterstitial();
}
