package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: MyApplication */
public class pn5 extends uh4 {

    /* renamed from: q, reason: collision with root package name */
    public final int f13976q;

    public pn5(Throwable th, qn5 qn5Var) {
        super("Decoder failed: ".concat(String.valueOf(qn5Var == null ? null : qn5Var.f14520a)), th);
        int i7;
        if (th instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
            codecException.getDiagnosticInfo();
            i7 = codecException.getErrorCode();
        } else {
            i7 = 0;
        }
        this.f13976q = i7;
    }
}
