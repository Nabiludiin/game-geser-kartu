package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import w3.c;

/* compiled from: MyApplication */
public final class a4 extends w3.c {
    public a4() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // w3.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof a2 ? (a2) queryLocalInterface : new a2(iBinder);
    }

    public final z1 c(Context context) {
        try {
            IBinder D2 = ((a2) b(context)).D2(w3.b.C1(context), ModuleDescriptor.MODULE_VERSION);
            if (D2 == null) {
                return null;
            }
            IInterface queryLocalInterface = D2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof z1 ? (z1) queryLocalInterface : new w1(D2);
        } catch (RemoteException e8) {
            e = e8;
            w2.p.g("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (c.a e9) {
            e = e9;
            w2.p.g("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
