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
final class p extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f26205b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f26206c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kb0 f26207d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ w f26208e;

    p(w wVar, Context context, String str, kb0 kb0Var) {
        this.f26205b = context;
        this.f26206c = str;
        this.f26207d = kb0Var;
        Objects.requireNonNull(wVar);
        this.f26208e = wVar;
    }

    @Override // s2.y
    protected final /* bridge */ /* synthetic */ Object a() {
        w.k(this.f26205b, "native_ad");
        return new d4();
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object b() {
        Context context = this.f26205b;
        uy.a(context);
        if (!((Boolean) b0.c().d(uy.Jb)).booleanValue()) {
            return this.f26208e.m().c(this.f26205b, this.f26206c, this.f26207d);
        }
        try {
            IBinder D2 = ((s0) w2.t.a(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", o.f26199a)).D2(w3.b.C1(context), this.f26206c, this.f26207d, ModuleDescriptor.MODULE_VERSION);
            if (D2 == null) {
                return null;
            }
            IInterface queryLocalInterface = D2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new p0(D2);
        } catch (RemoteException e8) {
            e = e8;
            w wVar = this.f26208e;
            wVar.r(ag0.c(this.f26205b));
            wVar.q().a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e9) {
            e = e9;
            w wVar2 = this.f26208e;
            wVar2.r(ag0.c(this.f26205b));
            wVar2.q().a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (w2.s e10) {
            e = e10;
            w wVar22 = this.f26208e;
            wVar22.r(ag0.c(this.f26205b));
            wVar22.q().a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        return o1Var.x1(w3.b.C1(this.f26205b), this.f26206c, this.f26207d, ModuleDescriptor.MODULE_VERSION);
    }
}
