package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* compiled from: MyApplication */
final class vv4 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ wv4 f17864a;

    vv4(wv4 wv4Var) {
        Objects.requireNonNull(wv4Var);
        this.f17864a = wv4Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            gv4 gv4Var = gv4.f9170c;
            wv4 wv4Var = this.f17864a;
            Mac mac = (Mac) gv4Var.b(wv4Var.b());
            mac.init(wv4Var.c());
            return mac;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}
