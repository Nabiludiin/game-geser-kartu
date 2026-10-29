package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import y2.p;
import z2.d;

/* compiled from: MyApplication */
@Deprecated
public interface CustomEventNative extends z2.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, p pVar, Bundle bundle);
}
