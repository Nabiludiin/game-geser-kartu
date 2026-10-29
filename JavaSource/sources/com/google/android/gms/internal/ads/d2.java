package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* compiled from: MyApplication */
final /* synthetic */ class d2 implements e2 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ d2 f6910a = new d2();

    private /* synthetic */ d2() {
    }

    @Override // com.google.android.gms.internal.ads.e2
    public final /* synthetic */ Constructor a() {
        int i7 = g2.f8620f;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(m2.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
