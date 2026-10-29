package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;

/* compiled from: MyApplication */
public final class tg4 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f16182a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f16183b;

    /* renamed from: c, reason: collision with root package name */
    public int f16184c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f16185d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f16186e;

    /* renamed from: f, reason: collision with root package name */
    public int f16187f;

    /* renamed from: g, reason: collision with root package name */
    public int f16188g;

    /* renamed from: h, reason: collision with root package name */
    public int f16189h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f16190i;

    /* renamed from: j, reason: collision with root package name */
    private final sf4 f16191j;

    /* JADX WARN: Multi-variable type inference failed */
    public tg4() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f16190i = cryptoInfo;
        this.f16191j = Build.VERSION.SDK_INT >= 24 ? new sf4(cryptoInfo, 0 == true ? 1 : 0) : null;
    }

    public final void a(int i7, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i8, int i9, int i10) {
        this.f16187f = i7;
        this.f16185d = iArr;
        this.f16186e = iArr2;
        this.f16183b = bArr;
        this.f16182a = bArr2;
        this.f16184c = i8;
        this.f16188g = i9;
        this.f16189h = i10;
        MediaCodec.CryptoInfo cryptoInfo = this.f16190i;
        cryptoInfo.numSubSamples = i7;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i8;
        if (Build.VERSION.SDK_INT >= 24) {
            sf4 sf4Var = this.f16191j;
            sf4Var.getClass();
            sf4Var.a(i9, i10);
        }
    }

    public final MediaCodec.CryptoInfo b() {
        return this.f16190i;
    }

    public final void c(int i7) {
        if (i7 == 0) {
            return;
        }
        if (this.f16185d == null) {
            int[] iArr = new int[1];
            this.f16185d = iArr;
            this.f16190i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f16185d;
        iArr2[0] = iArr2[0] + i7;
    }
}
