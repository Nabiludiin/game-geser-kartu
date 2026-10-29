package s2;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
final /* synthetic */ class y4 implements w2.r {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ y4 f26270a = new y4();

    private /* synthetic */ y4() {
    }

    @Override // w2.r
    public final /* synthetic */ Object d(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof w0 ? (w0) queryLocalInterface : new w0(iBinder);
    }
}
