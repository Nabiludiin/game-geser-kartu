package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: MyApplication */
final class jo5 implements io5 {
    /* synthetic */ jo5(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.io5
    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.io5
    public final MediaCodecInfo b(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // com.google.android.gms.internal.ads.io5
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.io5
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.io5
    public final boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}
