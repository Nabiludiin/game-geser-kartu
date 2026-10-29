package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: MyApplication */
final class sf4 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f15600a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f15601b = rf4.a(0, 0);

    /* synthetic */ sf4(MediaCodec.CryptoInfo cryptoInfo, byte[] bArr) {
        this.f15600a = cryptoInfo;
    }

    final /* synthetic */ void a(int i7, int i8) {
        MediaCodec.CryptoInfo.Pattern pattern = this.f15601b;
        pattern.set(i7, i8);
        this.f15600a.setPattern(pattern);
    }
}
