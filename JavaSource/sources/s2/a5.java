package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.kb0;
import w3.c;

/* compiled from: MyApplication */
public final class a5 extends w3.c {
    public a5() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // w3.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return queryLocalInterface instanceof i1 ? (i1) queryLocalInterface : new i1(iBinder);
    }

    public final h1 c(Context context, kb0 kb0Var) {
        h1 f1Var;
        try {
            IBinder D2 = ((i1) b(context)).D2(w3.b.C1(context), kb0Var, ModuleDescriptor.MODULE_VERSION);
            if (D2 == null) {
                f1Var = null;
            } else {
                IInterface queryLocalInterface = D2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                f1Var = queryLocalInterface instanceof h1 ? (h1) queryLocalInterface : new f1(D2);
            }
            f1Var.Y4(kb0Var);
            return f1Var;
        } catch (RemoteException e8) {
            e = e8;
            w2.p.g("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (c.a e9) {
            e = e9;
            w2.p.g("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }
}
