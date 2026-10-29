package s2;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: MyApplication */
final /* synthetic */ class s implements w2.r {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ s f26217a = new s();

    private /* synthetic */ s() {
    }

    @Override // w2.r
    public final /* synthetic */ Object d(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof a2 ? (a2) queryLocalInterface : new a2(iBinder);
    }
}
