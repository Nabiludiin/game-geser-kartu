package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p3.c;

/* compiled from: MyApplication */
public final class j5 extends p3.c {
    public j5(Context context, Looper looper, c.a aVar, c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // p3.c
    protected final String J() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // p3.c
    protected final String K() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // p3.c, l3.a.f
    public final int o() {
        return k3.k.f24503a;
    }

    @Override // p3.c
    public final /* synthetic */ IInterface x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof t4.d ? (t4.d) queryLocalInterface : new d5(iBinder);
    }
}
