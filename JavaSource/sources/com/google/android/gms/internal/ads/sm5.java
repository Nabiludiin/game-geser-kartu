package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: MyApplication */
final class sm5 implements nn5 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f15715a;

    /* renamed from: b, reason: collision with root package name */
    private final ym5 f15716b;

    /* renamed from: c, reason: collision with root package name */
    private final on5 f15717c;

    /* renamed from: d, reason: collision with root package name */
    private final in5 f15718d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15719e;

    /* renamed from: f, reason: collision with root package name */
    private int f15720f = 0;

    /* synthetic */ sm5(MediaCodec mediaCodec, HandlerThread handlerThread, on5 on5Var, in5 in5Var, byte[] bArr) {
        this.f15715a = mediaCodec;
        this.f15716b = new ym5(handlerThread);
        this.f15717c = on5Var;
        this.f15718d = in5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n(int i7, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i7 == 1) {
            sb.append("Audio");
        } else if (i7 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i7);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final ByteBuffer F(int i7) {
        return this.f15715a.getInputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final ByteBuffer I(int i7) {
        return this.f15715a.getOutputBuffer(i7);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void X(Bundle bundle) {
        this.f15717c.d(bundle);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void a(int i7, int i8, int i9, long j7, int i10) {
        this.f15717c.b(i7, 0, i9, j7, i10);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void b(int i7, int i8, tg4 tg4Var, long j7, int i9) {
        this.f15717c.g(i7, 0, tg4Var, j7, i9);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void b0(int i7, long j7) {
        this.f15715a.releaseOutputBuffer(i7, j7);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final int c() {
        this.f15717c.f();
        return this.f15716b.c();
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final int d(MediaCodec.BufferInfo bufferInfo) {
        this.f15717c.f();
        return this.f15716b.d(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void e(int i7, boolean z7) {
        this.f15715a.releaseOutputBuffer(i7, false);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final MediaFormat f() {
        return this.f15716b.e();
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final boolean g(ln5 ln5Var) {
        this.f15716b.g(ln5Var);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void h(Surface surface) {
        this.f15715a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void i() {
        this.f15717c.c();
        MediaCodec mediaCodec = this.f15715a;
        mediaCodec.flush();
        this.f15716b.f();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void i0(int i7) {
        this.f15715a.setVideoScalingMode(i7);
    }

    final /* synthetic */ void j(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
        in5 in5Var;
        ym5 ym5Var = this.f15716b;
        MediaCodec mediaCodec = this.f15715a;
        ym5Var.a(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i7);
        Trace.endSection();
        this.f15717c.a();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (in5Var = this.f15718d) != null) {
            in5Var.b(mediaCodec);
        }
        this.f15720f = 1;
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void l() {
        in5 in5Var;
        in5 in5Var2;
        in5 in5Var3;
        try {
            try {
                if (this.f15720f == 1) {
                    this.f15717c.e();
                    this.f15716b.b();
                }
                this.f15720f = 2;
                if (this.f15719e) {
                    return;
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 30 && i7 < 33) {
                    this.f15715a.stop();
                }
                if (i7 >= 35 && (in5Var3 = this.f15718d) != null) {
                    in5Var3.c(this.f15715a);
                }
                this.f15715a.release();
                this.f15719e = true;
            } catch (Throwable th) {
                if (!this.f15719e) {
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 30 && i8 < 33) {
                        this.f15715a.stop();
                    }
                    if (i8 >= 35 && (in5Var2 = this.f15718d) != null) {
                        in5Var2.c(this.f15715a);
                    }
                    this.f15715a.release();
                    this.f15719e = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (in5Var = this.f15718d) != null) {
                in5Var.c(this.f15715a);
            }
            this.f15715a.release();
            this.f15719e = true;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.nn5
    public final void o() {
        this.f15715a.detachOutputSurface();
    }
}
