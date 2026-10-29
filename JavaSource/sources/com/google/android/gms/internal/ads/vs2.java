package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: MyApplication */
public final class vs2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    final String f17751a;

    /* renamed from: b, reason: collision with root package name */
    final int f17752b;

    /* synthetic */ vs2(String str, int i7, byte[] bArr) {
        this.f17751a = str;
        this.f17752b = i7;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        x81 x81Var = (x81) obj;
        if (((Boolean) s2.b0.c().d(uy.vb)).booleanValue()) {
            String str = this.f17751a;
            if (!TextUtils.isEmpty(str)) {
                x81Var.f18664a.putString("topics", str);
            }
            int i7 = this.f17752b;
            if (i7 != -1) {
                x81Var.f18664a.putInt("atps", i7);
            }
        }
    }
}
