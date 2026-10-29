package s2;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
final /* synthetic */ class q implements w2.r {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ q f26210a = new q();

    private /* synthetic */ q() {
    }

    @Override // w2.r
    public final /* synthetic */ Object d(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return queryLocalInterface instanceof i1 ? (i1) queryLocalInterface : new i1(iBinder);
    }
}
