package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: MyApplication */
final class um implements de3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gc3 f16825a;

    um(wm wmVar, gc3 gc3Var) {
        this.f16825a = gc3Var;
        Objects.requireNonNull(wmVar);
    }

    @Override // com.google.android.gms.internal.ads.de3
    public final boolean a(File file) {
        try {
            return this.f16825a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
