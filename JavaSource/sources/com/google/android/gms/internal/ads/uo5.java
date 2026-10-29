package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: MyApplication */
public final class uo5 implements nn5 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f16870a;

    /* renamed from: b, reason: collision with root package name */
    private final in5 f16871b;

    /* synthetic */ uo5(MediaCodec mediaCodec, in5 in5Var, byte[] bArr) {
        this.f16870a = mediaCodec;
        this.f16871b = in5Var;
        if (Build.VERSION.SDK_INT < 35 || in5Var == null) {
            return;
        }
        in5Var.b(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final ByteBuffer F(int i7) {
        return this.f16870a.getInputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final ByteBuffer I(int i7) {
        return this.f16870a.getOutputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void X(Bundle bundle) {
        this.f16870a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void a(int i7, int i8, int i9, long j7, int i10) {
        this.f16870a.queueInputBuffer(i7, 0, i9, j7, i10);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void b(int i7, int i8, tg4 tg4Var, long j7, int i9) {
        this.f16870a.queueSecureInputBuffer(i7, 0, tg4Var.b(), j7, i9);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void b0(int i7, long j7) {
        this.f16870a.releaseOutputBuffer(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final int c() {
        return this.f16870a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f16870a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void e(int i7, boolean z7) {
        this.f16870a.releaseOutputBuffer(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final MediaFormat f() {
        return this.f16870a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public /* synthetic */ boolean g(ln5 ln5Var) {
        return mn5.a(this, ln5Var);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void h(Surface surface) {
        this.f16870a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void i() {
        this.f16870a.flush();
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void i0(int i7) {
        this.f16870a.setVideoScalingMode(i7);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void l() {
        in5 in5Var;
        in5 in5Var2;
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && i7 < 33) {
                this.f16870a.stop();
            }
            if (i7 >= 35 && (in5Var2 = this.f16871b) != null) {
                in5Var2.c(this.f16870a);
            }
            this.f16870a.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (in5Var = this.f16871b) != null) {
                in5Var.c(this.f16870a);
            }
            this.f16870a.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void o() {
        this.f16870a.detachOutputSurface();
    }
}
