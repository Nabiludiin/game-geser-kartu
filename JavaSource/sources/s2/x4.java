package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.kb0;
import w3.c;

/* compiled from: MyApplication */
public final class x4 extends w3.c {
    public x4() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // w3.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof s0 ? (s0) queryLocalInterface : new s0(iBinder);
    }

    public final r0 c(Context context, String str, kb0 kb0Var) {
        try {
            IBinder D2 = ((s0) b(context)).D2(w3.b.C1(context), str, kb0Var, ModuleDescriptor.MODULE_VERSION);
            if (D2 == null) {
                return null;
            }
            IInterface queryLocalInterface = D2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new p0(D2);
        } catch (RemoteException e8) {
            e = e8;
            w2.p.g("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (c.a e9) {
            e = e9;
            w2.p.g("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
