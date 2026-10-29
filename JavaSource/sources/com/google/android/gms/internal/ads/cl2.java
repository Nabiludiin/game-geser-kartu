package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: MyApplication */
public final class cl2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    final String f6491a;

    /* renamed from: b, reason: collision with root package name */
    final int f6492b;

    public cl2(String str, int i7) {
        this.f6491a = str;
        this.f6492b = i7;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        int i7;
        Bundle bundle = ((x81) obj).f18664a;
        String str = this.f6491a;
        if (TextUtils.isEmpty(str) || (i7 = this.f6492b) == -1) {
            return;
        }
        Bundle a8 = m13.a(bundle, "pii");
        bundle.putBundle("pii", a8);
        a8.putString("pvid", str);
        a8.putInt("pvid_s", i7);
    }
}
