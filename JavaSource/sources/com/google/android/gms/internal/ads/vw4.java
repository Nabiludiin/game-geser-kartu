package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class vw4 extends ww4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ww4 f17900a;

    /* synthetic */ vw4(ww4 ww4Var, byte[] bArr) {
        Objects.requireNonNull(ww4Var);
        this.f17900a = ww4Var;
    }

    @Override // com.google.android.gms.internal.ads.ww4
    public final void a(xx4 xx4Var, Object obj) {
        throw null;
    }

    public final String toString() {
        String obj = this.f17900a.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 21);
        sb.append("NullSafeTypeAdapter[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
