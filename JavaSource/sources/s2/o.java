package s2;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
final /* synthetic */ class o implements w2.r {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ o f26199a = new o();

    private /* synthetic */ o() {
    }

    @Override // w2.r
    public final /* synthetic */ Object d(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof s0 ? (s0) queryLocalInterface : new s0(iBinder);
    }
}
