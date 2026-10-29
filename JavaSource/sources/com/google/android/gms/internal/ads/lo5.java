package com.google.android.gms.internal.ads;

import android.os.Build;

/* compiled from: MyApplication */
final /* synthetic */ class lo5 implements oo5 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ lo5 f11714a = new lo5();

    private /* synthetic */ lo5() {
    }

    @Override // com.google.android.gms.internal.ads.oo5
    public final /* synthetic */ int d(Object obj) {
        int i7 = to5.f16275b;
        String str = ((qn5) obj).f14520a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
