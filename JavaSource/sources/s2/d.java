package s2;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.uy;
import java.util.Objects;

/* compiled from: MyApplication */
final class d extends y {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f26082b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f26083c;

    d(w wVar, Activity activity) {
        this.f26082b = activity;
        Objects.requireNonNull(wVar);
        this.f26083c = wVar;
    }

    @Override // s2.y
    protected final /* bridge */ /* synthetic */ Object a() {
        w.k(this.f26082b, "ad_overlay");
        return null;
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object b() {
        Activity activity = this.f26082b;
        uy.a(activity);
        if (!((Boolean) b0.c().d(uy.Jb)).booleanValue()) {
            w wVar = this.f26083c;
            return wVar.p().c(this.f26082b);
        }
        try {
            return bf0.j8(((ff0) w2.t.a(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", c.f26066a)).Y(w3.b.C1(activity)));
        } catch (RemoteException | NullPointerException | w2.s e8) {
            w wVar2 = this.f26083c;
            wVar2.r(ag0.c(this.f26082b.getApplicationContext()));
            wVar2.q().a(e8, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }

    @Override // s2.y
    public final /* bridge */ /* synthetic */ Object c(o1 o1Var) {
        return o1Var.q0(w3.b.C1(this.f26082b));
    }
}
