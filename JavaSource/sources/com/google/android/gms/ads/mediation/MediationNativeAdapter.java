package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import y2.f;
import y2.n;
import y2.p;

/* compiled from: MyApplication */
@Deprecated
public interface MediationNativeAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, n nVar, Bundle bundle, p pVar, Bundle bundle2);
}
