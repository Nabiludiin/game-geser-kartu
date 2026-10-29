package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.cg0;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.uy;
import w3.c;

/* compiled from: MyApplication */
public final class z4 extends w3.c {

    /* renamed from: c, reason: collision with root package name */
    private cg0 f26278c;

    public z4() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // w3.c
    protected final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof w0 ? (w0) queryLocalInterface : new w0(iBinder);
    }

    public final v0 c(Context context, g5 g5Var, String str, kb0 kb0Var, int i7) {
        uy.a(context);
        if (!((Boolean) b0.c().d(uy.Jb)).booleanValue()) {
            try {
                IBinder D2 = ((w0) b(context)).D2(w3.b.C1(context), g5Var, str, kb0Var, ModuleDescriptor.MODULE_VERSION, i7);
                if (D2 == null) {
                    return null;
                }
                IInterface queryLocalInterface = D2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof v0 ? (v0) queryLocalInterface : new t0(D2);
            } catch (RemoteException e8) {
                e = e8;
                w2.p.b("Could not create remote AdManager.", e);
                return null;
            } catch (c.a e9) {
                e = e9;
                w2.p.b("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder D22 = ((w0) w2.t.a(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", y4.f26270a)).D2(w3.b.C1(context), g5Var, str, kb0Var, ModuleDescriptor.MODULE_VERSION, i7);
            if (D22 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = D22.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof v0 ? (v0) queryLocalInterface2 : new t0(D22);
        } catch (RemoteException e10) {
            e = e10;
            Throwable th = e;
            cg0 c8 = ag0.c(context);
            this.f26278c = c8;
            c8.a(th, "AdManagerCreator.newAdManagerByDynamiteLoader");
            w2.p.i("#007 Could not call remote method.", th);
            return null;
        } catch (NullPointerException e11) {
            e = e11;
            Throwable th2 = e;
            cg0 c82 = ag0.c(context);
            this.f26278c = c82;
            c82.a(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            w2.p.i("#007 Could not call remote method.", th2);
            return null;
        } catch (w2.s e12) {
            e = e12;
            Throwable th22 = e;
            cg0 c822 = ag0.c(context);
            this.f26278c = c822;
            c822.a(th22, "AdManagerCreator.newAdManagerByDynamiteLoader");
            w2.p.i("#007 Could not call remote method.", th22);
            return null;
        }
    }
}
