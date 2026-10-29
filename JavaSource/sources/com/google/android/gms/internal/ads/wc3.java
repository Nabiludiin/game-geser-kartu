package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: MyApplication */
public final class wc3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18196a;

    /* renamed from: b, reason: collision with root package name */
    private final Looper f18197b;

    public wc3(Context context, Looper looper) {
        this.f18196a = context;
        this.f18197b = looper;
    }

    public final void a(String str) {
        gd3 d02 = id3.d0();
        Context context = this.f18196a;
        d02.E(context.getPackageName());
        d02.G(2);
        ed3 d03 = fd3.d0();
        d03.E(str);
        d03.F(2);
        d02.F(d03);
        new xc3(context, this.f18197b, (id3) d02.A()).b();
    }
}
