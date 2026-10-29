package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: MyApplication */
final class ko5 implements io5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f11177a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f11178b;

    public ko5(boolean z7, boolean z8, boolean z9) {
        int i7 = 1;
        if (!z7 && !z8 && !z9) {
            i7 = 0;
        }
        this.f11177a = i7;
    }

    private final void f() {
        if (this.f11178b == null) {
            this.f11178b = new MediaCodecList(this.f11177a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.io5
    public final int a() {
        f();
        return this.f11178b.length;
    }

    @Override // com.google.android.gms.internal.ads.io5
    public final MediaCodecInfo b(int i7) {
        f();
        return this.f11178b[i7];
    }

    @Override // com.google.android.gms.internal.ads.io5
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.io5
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.io5
    public final boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
