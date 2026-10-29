package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p3.c;

/* compiled from: MyApplication */
public final class od3 extends r2.c {
    private final int F;

    public od3(Context context, Looper looper, c.a aVar, c.b bVar, int i7) {
        super(context, looper, 116, aVar, bVar, null);
        this.F = i7;
    }

    @Override // p3.c
    protected final String J() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // p3.c
    protected final String K() {
        return "com.google.android.gms.gass.START";
    }

    @Override // p3.c, l3.a.f
    public final int o() {
        return this.F;
    }

    public final td3 o0() {
        return (td3) super.I();
    }

    @Override // p3.c
    protected final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof td3 ? (td3) queryLocalInterface : new td3(iBinder);
    }
}
