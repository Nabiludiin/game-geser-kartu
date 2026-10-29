package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: MyApplication */
final class ym5 extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f19663b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f19664c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f19669h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f19670i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f19671j;

    /* renamed from: k, reason: collision with root package name */
    private MediaCodec.CryptoException f19672k;

    /* renamed from: l, reason: collision with root package name */
    private long f19673l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19674m;

    /* renamed from: n, reason: collision with root package name */
    private IllegalStateException f19675n;

    /* renamed from: o, reason: collision with root package name */
    private ln5 f19676o;

    /* renamed from: a, reason: collision with root package name */
    private final Object f19662a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final r.c f19665d = new r.c();

    /* renamed from: e, reason: collision with root package name */
    private final r.c f19666e = new r.c();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f19667f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f19668g = new ArrayDeque();

    ym5(HandlerThread handlerThread) {
        this.f19663b = handlerThread;
    }

    private final void i() {
        ArrayDeque arrayDeque = this.f19668g;
        if (!arrayDeque.isEmpty()) {
            this.f19670i = (MediaFormat) arrayDeque.getLast();
        }
        this.f19665d.b();
        this.f19666e.b();
        this.f19667f.clear();
        arrayDeque.clear();
    }

    private final boolean j() {
        return this.f19673l > 0 || this.f19674m;
    }

    private final void k(MediaFormat mediaFormat) {
        this.f19666e.a(-2);
        this.f19668g.add(mediaFormat);
    }

    private final void l() {
        IllegalStateException illegalStateException = this.f19675n;
        if (illegalStateException != null) {
            this.f19675n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f19671j;
        if (codecException != null) {
            this.f19671j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f19672k;
        if (cryptoException == null) {
            return;
        }
        this.f19672k = null;
        throw cryptoException;
    }

    public final void a(MediaCodec mediaCodec) {
        rx3.h(this.f19664c == null);
        HandlerThread handlerThread = this.f19663b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f19664c = handler;
    }

    public final void b() {
        synchronized (this.f19662a) {
            this.f19674m = true;
            this.f19663b.quit();
            i();
        }
    }

    public final int c() {
        synchronized (this.f19662a) {
            try {
                l();
                int i7 = -1;
                if (j()) {
                    return -1;
                }
                r.c cVar = this.f19665d;
                if (!cVar.d()) {
                    i7 = cVar.e();
                }
                return i7;
            } finally {
            }
        }
    }

    public final int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f19662a) {
            try {
                l();
                if (j()) {
                    return -1;
                }
                r.c cVar = this.f19666e;
                if (cVar.d()) {
                    return -1;
                }
                int e8 = cVar.e();
                if (e8 >= 0) {
                    if (this.f19669h == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f19667f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (e8 == -2) {
                    this.f19669h = (MediaFormat) this.f19668g.remove();
                    e8 = -2;
                }
                return e8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat e() {
        MediaFormat mediaFormat;
        synchronized (this.f19662a) {
            try {
                mediaFormat = this.f19669h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void f() {
        synchronized (this.f19662a) {
            this.f19673l++;
            Handler handler = this.f19664c;
            String str = hi2.f9535a;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.xm5
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    ym5.this.h();
                }
            });
        }
    }

    public final void g(ln5 ln5Var) {
        synchronized (this.f19662a) {
            this.f19676o = ln5Var;
        }
    }

    final /* synthetic */ void h() {
        Object obj = this.f19662a;
        synchronized (obj) {
            try {
                if (this.f19674m) {
                    return;
                }
                long j7 = this.f19673l - 1;
                this.f19673l = j7;
                if (j7 > 0) {
                    return;
                }
                if (j7 >= 0) {
                    i();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    this.f19675n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f19662a) {
            this.f19672k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f19662a) {
            this.f19671j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        synchronized (this.f19662a) {
            try {
                this.f19665d.a(i7);
                ln5 ln5Var = this.f19676o;
                if (ln5Var != null) {
                    do5 do5Var = ((ao5) ln5Var).f5193a;
                    if (do5Var.j1() != null) {
                        do5Var.j1().a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f19662a) {
            try {
                MediaFormat mediaFormat = this.f19670i;
                if (mediaFormat != null) {
                    k(mediaFormat);
                    this.f19670i = null;
                }
                this.f19666e.a(i7);
                this.f19667f.add(bufferInfo);
                ln5 ln5Var = this.f19676o;
                if (ln5Var != null) {
                    do5 do5Var = ((ao5) ln5Var).f5193a;
                    if (do5Var.j1() != null) {
                        do5Var.j1().a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f19662a) {
            k(mediaFormat);
            this.f19670i = null;
        }
    }
}
