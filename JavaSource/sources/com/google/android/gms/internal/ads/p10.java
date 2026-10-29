package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
final /* synthetic */ class p10 implements w2.r {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ p10 f13629a = new p10();

    private /* synthetic */ p10() {
    }

    @Override // w2.r
    public final /* synthetic */ Object d(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        return queryLocalInterface instanceof r10 ? (r10) queryLocalInterface : new r10(iBinder);
    }
}
