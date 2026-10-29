package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p3.c;

/* compiled from: MyApplication */
public final class f70 extends r2.c {
    f70(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(oh0.a(context), looper, 166, aVar, bVar, null);
    }

    @Override // p3.c
    protected final String J() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // p3.c
    protected final String K() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final m70 o0() {
        return (m70) super.I();
    }

    @Override // p3.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof m70 ? (m70) queryLocalInterface : new m70(iBinder);
    }
}
