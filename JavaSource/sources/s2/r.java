package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.uy;
import java.util.Objects;

/* compiled from: MyApplication */
final class r extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f26213b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kb0 f26214c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f26215d;

    r(w wVar, Context context, kb0 kb0Var) {
        this.f26213b = context;
        this.f26214c = kb0Var;
        Objects.requireNonNull(wVar);
        this.f26215d = wVar;
    }

    @Override // s2.y
    protected final /* bridge */ /* synthetic */ Object a() {
        w.k(this.f26213b, "ads_preloader");
        return null;
    }

    @Override // s2.y
    protected final /* bridge */ /* synthetic */ Object b() {
        h1 f1Var;
        Context context = this.f26213b;
        w3.a C1 = w3.b.C1(context);
        uy.a(context);
        if (!((Boolean) b0.c().d(uy.Jb)).booleanValue()) {
            return this.f26215d.s().c(this.f26213b, this.f26214c);
        }
        try {
            i1 i1Var = (i1) w2.t.a(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", q.f26210a);
            kb0 kb0Var = this.f26214c;
            IBinder D2 = i1Var.D2(C1, kb0Var, ModuleDescriptor.MODULE_VERSION);
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
            w wVar = this.f26215d;
            wVar.r(ag0.c(this.f26213b));
            wVar.q().a(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e9) {
            e = e9;
            w wVar2 = this.f26215d;
            wVar2.r(ag0.c(this.f26213b));
            wVar2.q().a(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (w2.s e10) {
            e = e10;
            w wVar22 = this.f26215d;
            wVar22.r(ag0.c(this.f26213b));
            wVar22.q().a(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        w3.a C1 = w3.b.C1(this.f26213b);
        kb0 kb0Var = this.f26214c;
        h1 n32 = o1Var.n3(C1, kb0Var, ModuleDescriptor.MODULE_VERSION);
        n32.Y4(kb0Var);
        return n32;
    }
}
