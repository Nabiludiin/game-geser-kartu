package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p3.c;

/* compiled from: MyApplication */
public final class hg0 extends r2.c {
    public hg0(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(oh0.a(context), looper, 8, aVar, bVar, null);
    }

    @Override // p3.c
    protected final String J() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // p3.c
    protected final String K() {
        return "com.google.android.gms.ads.service.START";
    }

    @Override // p3.c, l3.a.f
    public final int o() {
        return 244933000;
    }

    public final sg0 o0() {
        return (sg0) super.I();
    }

    @Override // p3.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof sg0 ? (sg0) queryLocalInterface : new qg0(iBinder);
    }
}
