package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public final class b85 extends e85 {

    /* renamed from: a, reason: collision with root package name */
    final Logger f5628a;

    public b85(String str) {
        this.f5628a = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.e85
    public final void a(String str) {
        this.f5628a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
