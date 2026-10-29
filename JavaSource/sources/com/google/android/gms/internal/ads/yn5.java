package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;

/* compiled from: MyApplication */
abstract class yn5 {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f19695a;

    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d8) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f19695a;
        if (bool == null || !bool.booleanValue()) {
            return wn5.a(videoCapabilities, i7, i8, d8);
        }
        return 0;
    }
}
