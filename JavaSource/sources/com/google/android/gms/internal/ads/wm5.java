package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class wm5 implements on5 {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque f18320g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f18321h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f18322a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f18323b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f18324c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f18325d;

    /* renamed from: e, reason: collision with root package name */
    private final sg1 f18326e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18327f;

    public wm5(MediaCodec mediaCodec, HandlerThread handlerThread) {
        sg1 sg1Var = new sg1(pd1.f13828a);
        this.f18322a = mediaCodec;
        this.f18323b = handlerThread;
        this.f18326e = sg1Var;
        this.f18325d = new AtomicReference();
    }

    private static um5 i() {
        ArrayDeque arrayDeque = f18320g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new um5();
                }
                return (um5) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static int[] j(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private static byte[] k(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.on5
    public final void a() {
        if (this.f18327f) {
            return;
        }
        HandlerThread handlerThread = this.f18323b;
        handlerThread.start();
        this.f18324c = new tm5(this, handlerThread.getLooper());
        this.f18327f = true;
    }

    @Override // com.google.android.gms.internal.ads.on5
    public final void b(int i7, int i8, int i9, long j7, int i10) {
        f();
        um5 i11 = i();
        i11.a(i7, 0, i9, j7, i10);
        Handler handler = this.f18324c;
        String str = hi2.f9535a;
        handler.obtainMessage(1, i11).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.on5
    public final void c() {
        if (this.f18327f) {
            try {
                Handler handler = this.f18324c;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                sg1 sg1Var = this.f18326e;
                sg1Var.b();
                Handler handler2 = this.f18324c;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                sg1Var.c();
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.on5
    public final void d(Bundle bundle) {
        f();
        Handler handler = this.f18324c;
        String str = hi2.f9535a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.on5
    public final void e() {
        if (this.f18327f) {
            c();
            this.f18323b.quit();
        }
        this.f18327f = false;
    }

    @Override // com.google.android.gms.internal.ads.on5
    public final void f() {
        RuntimeException runtimeException = (RuntimeException) this.f18325d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.on5
    public final void g(int i7, int i8, tg4 tg4Var, long j7, int i9) {
        f();
        um5 i10 = i();
        i10.a(i7, 0, 0, j7, i9);
        MediaCodec.CryptoInfo cryptoInfo = i10.f16834d;
        cryptoInfo.numSubSamples = tg4Var.f16187f;
        cryptoInfo.numBytesOfClearData = j(tg4Var.f16185d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(tg4Var.f16186e, cryptoInfo.numBytesOfEncryptedData);
        byte[] k7 = k(tg4Var.f16183b, cryptoInfo.key);
        k7.getClass();
        cryptoInfo.key = k7;
        byte[] k8 = k(tg4Var.f16182a, cryptoInfo.iv);
        k8.getClass();
        cryptoInfo.iv = k8;
        cryptoInfo.mode = tg4Var.f16184c;
        if (Build.VERSION.SDK_INT >= 24) {
            vm5.a();
            cryptoInfo.setPattern(rf4.a(tg4Var.f16188g, tg4Var.f16189h));
        }
        Handler handler = this.f18324c;
        String str = hi2.f9535a;
        handler.obtainMessage(2, i10).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void h(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 == r1) goto L20
            java.util.concurrent.atomic.AtomicReference r0 = r10.f18325d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r1.<init>(r11)
            m3.l1.a(r0, r2, r1)
            goto L74
        L20:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            android.media.MediaCodec r0 = r10.f18322a     // Catch: java.lang.RuntimeException -> L2a
            r0.setParameters(r11)     // Catch: java.lang.RuntimeException -> L2a
            goto L74
        L2a:
            r0 = move-exception
            r11 = r0
            java.util.concurrent.atomic.AtomicReference r0 = r10.f18325d
            m3.l1.a(r0, r2, r11)
            goto L74
        L32:
            com.google.android.gms.internal.ads.sg1 r11 = r10.f18326e
            r11.a()
            goto L74
        L38:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.um5 r11 = (com.google.android.gms.internal.ads.um5) r11
            int r4 = r11.f16831a
            android.media.MediaCodec$CryptoInfo r6 = r11.f16834d
            long r7 = r11.f16835e
            int r9 = r11.f16836f
            java.lang.Object r1 = com.google.android.gms.internal.ads.wm5.f18321h     // Catch: java.lang.RuntimeException -> L52
            monitor-enter(r1)     // Catch: java.lang.RuntimeException -> L52
            android.media.MediaCodec r3 = r10.f18322a     // Catch: java.lang.Throwable -> L4f
            r5 = 0
            r3.queueSecureInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            goto L58
        L4f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r0     // Catch: java.lang.RuntimeException -> L52
        L52:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r10.f18325d
            m3.l1.a(r1, r2, r0)
        L58:
            r2 = r11
            goto L74
        L5a:
            java.lang.Object r11 = r11.obj
            com.google.android.gms.internal.ads.um5 r11 = (com.google.android.gms.internal.ads.um5) r11
            int r4 = r11.f16831a
            int r6 = r11.f16833c
            long r7 = r11.f16835e
            int r9 = r11.f16836f
            android.media.MediaCodec r3 = r10.f18322a     // Catch: java.lang.RuntimeException -> L6d
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch: java.lang.RuntimeException -> L6d
            goto L58
        L6d:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r1 = r10.f18325d
            m3.l1.a(r1, r2, r0)
            goto L58
        L74:
            if (r2 == 0) goto L81
            java.util.ArrayDeque r11 = com.google.android.gms.internal.ads.wm5.f18320g
            monitor-enter(r11)
            r11.add(r2)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L7e
            goto L81
        L7e:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L7e
            throw r0
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wm5.h(android.os.Message):void");
    }
}
