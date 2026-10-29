package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.uy;
import java.util.Objects;

/* compiled from: MyApplication */
final class t extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f26232b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f26233c;

    t(w wVar, Context context) {
        this.f26232b = context;
        Objects.requireNonNull(wVar);
        this.f26233c = wVar;
    }

    @Override // s2.y
    protected final /* bridge */ /* synthetic */ Object a() {
        w.k(this.f26232b, "mobile_ads_settings");
        return new h4();
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object b() {
        Context context = this.f26232b;
        uy.a(context);
        if (!((Boolean) b0.c().d(uy.Jb)).booleanValue()) {
            return this.f26233c.n().c(this.f26232b);
        }
        try {
            IBinder D2 = ((a2) w2.t.a(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", s.f26217a)).D2(w3.b.C1(context), ModuleDescriptor.MODULE_VERSION);
            if (D2 == null) {
                return null;
            }
            IInterface queryLocalInterface = D2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof z1 ? (z1) queryLocalInterface : new w1(D2);
        } catch (RemoteException e8) {
            e = e8;
            w wVar = this.f26233c;
            wVar.r(ag0.c(this.f26232b));
            wVar.q().a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e9) {
            e = e9;
            w wVar2 = this.f26233c;
            wVar2.r(ag0.c(this.f26232b));
            wVar2.q().a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (w2.s e10) {
            e = e10;
            w wVar22 = this.f26233c;
            wVar22.r(ag0.c(this.f26232b));
            wVar22.q().a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        return o1Var.p2(w3.b.C1(this.f26232b), ModuleDescriptor.MODULE_VERSION);
    }
}
