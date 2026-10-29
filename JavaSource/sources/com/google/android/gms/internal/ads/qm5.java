package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* compiled from: MyApplication */
public final class qm5 implements kn5 {

    /* renamed from: a, reason: collision with root package name */
    private final jy3 f14509a;

    /* renamed from: b, reason: collision with root package name */
    private final jy3 f14510b;

    public qm5(final int i7) {
        jy3 jy3Var = new jy3() { // from class: com.google.android.gms.internal.ads.pm5
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                String n7;
                n7 = sm5.n(i7, "ExoPlayer:MediaCodecAsyncAdapter:");
                return new HandlerThread(n7);
            }
        };
        jy3 jy3Var2 = new jy3() { // from class: com.google.android.gms.internal.ads.om5
            @Override // com.google.android.gms.internal.ads.jy3
            public final /* synthetic */ Object a() {
                String n7;
                n7 = sm5.n(i7, "ExoPlayer:MediaCodecQueueingThread:");
                return new HandlerThread(n7);
            }
        };
        this.f14509a = jy3Var;
        this.f14510b = jy3Var2;
    }

    @Override // com.google.android.gms.internal.ads.kn5
    public final /* bridge */ /* synthetic */ nn5 a(jn5 jn5Var) {
        throw null;
    }

    public final sm5 b(jn5 jn5Var) {
        Exception exc;
        MediaCodec mediaCodec;
        qn5 qn5Var = jn5Var.f10662a;
        String str = qn5Var.f14520a;
        sm5 sm5Var = null;
        try {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("createCodec:");
            sb.append(str);
            Trace.beginSection(sb.toString());
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                sm5 sm5Var2 = new sm5(mediaCodec, (HandlerThread) this.f14509a.a(), new wm5(mediaCodec, (HandlerThread) this.f14510b.a()), jn5Var.f10667f, null);
                try {
                    Trace.endSection();
                    Surface surface = jn5Var.f10665d;
                    int i7 = 0;
                    if (surface == null && qn5Var.f14527h && Build.VERSION.SDK_INT >= 35) {
                        i7 = 8;
                    }
                    sm5Var2.j(jn5Var.f10663b, surface, null, i7);
                    return sm5Var2;
                } catch (Exception e8) {
                    exc = e8;
                    sm5Var = sm5Var2;
                    if (sm5Var != null) {
                        sm5Var.l();
                        throw exc;
                    }
                    if (mediaCodec == null) {
                        throw exc;
                    }
                    mediaCodec.release();
                    throw exc;
                }
            } catch (Exception e9) {
                exc = e9;
            }
        } catch (Exception e10) {
            exc = e10;
            mediaCodec = null;
        }
    }
}
