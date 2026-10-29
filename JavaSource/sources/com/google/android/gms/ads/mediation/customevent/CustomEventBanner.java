package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import k2.h;
import y2.e;

/* compiled from: MyApplication */
@Deprecated
public interface CustomEventBanner extends z2.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, z2.b bVar, String str, h hVar, e eVar, Bundle bundle);
}
