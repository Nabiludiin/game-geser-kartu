package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p3.c;

/* compiled from: MyApplication */
public final class tt extends r2.c {
    tt(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(oh0.a(context), looper, 123, aVar, bVar, null);
    }

    @Override // p3.c
    public final k3.d[] A() {
        return k2.f0.f24398b;
    }

    @Override // p3.c
    protected final String J() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // p3.c
    protected final String K() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean o0() {
        return ((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue() && com.google.android.gms.common.util.b.b(p(), k2.f0.f24397a);
    }

    public final wt p0() {
        return (wt) super.I();
    }

    @Override // p3.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof wt ? (wt) queryLocalInterface : new wt(iBinder);
    }
}
