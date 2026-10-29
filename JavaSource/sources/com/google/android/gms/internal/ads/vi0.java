package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
final /* synthetic */ class vi0 implements w2.r {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ vi0 f17617a = new vi0();

    private /* synthetic */ vi0() {
    }

    @Override // w2.r
    public final /* synthetic */ Object d(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return queryLocalInterface instanceof oi0 ? (oi0) queryLocalInterface : new oi0(iBinder);
    }
}
