package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: MyApplication */
public final class jn5 {

    /* renamed from: a, reason: collision with root package name */
    public final qn5 f10662a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaFormat f10663b;

    /* renamed from: c, reason: collision with root package name */
    public final eq5 f10664c;

    /* renamed from: d, reason: collision with root package name */
    public final Surface f10665d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCrypto f10666e = null;

    /* renamed from: f, reason: collision with root package name */
    public final in5 f10667f;

    private jn5(qn5 qn5Var, MediaFormat mediaFormat, eq5 eq5Var, Surface surface, MediaCrypto mediaCrypto, in5 in5Var) {
        this.f10662a = qn5Var;
        this.f10663b = mediaFormat;
        this.f10664c = eq5Var;
        this.f10665d = surface;
        this.f10667f = in5Var;
    }

    public static jn5 a(qn5 qn5Var, MediaFormat mediaFormat, eq5 eq5Var, MediaCrypto mediaCrypto, in5 in5Var) {
        return new jn5(qn5Var, mediaFormat, eq5Var, null, null, in5Var);
    }

    public static jn5 b(qn5 qn5Var, MediaFormat mediaFormat, eq5 eq5Var, Surface surface, MediaCrypto mediaCrypto) {
        return new jn5(qn5Var, mediaFormat, eq5Var, surface, null, null);
    }
}
