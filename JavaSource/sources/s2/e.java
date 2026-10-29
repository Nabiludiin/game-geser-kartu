package s2;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
final /* synthetic */ class e implements w2.r {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ e f26085a = new e();

    private /* synthetic */ e() {
    }

    @Override // w2.r
    public final /* synthetic */ Object d(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
        return queryLocalInterface instanceof u2 ? (u2) queryLocalInterface : new u2(iBinder);
    }
}
