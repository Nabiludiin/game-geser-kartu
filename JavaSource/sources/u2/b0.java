package u2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.rx1;
import com.google.android.gms.internal.ads.uy;
import v2.f2;

/* compiled from: MyApplication */
public final class b0 {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z7, rx1 rx1Var) {
        if (adOverlayInfoParcel.A == 4 && adOverlayInfoParcel.f4342s == null) {
            s2.a aVar = adOverlayInfoParcel.f4341r;
            if (aVar != null) {
                aVar.c0();
            }
            pi1 pi1Var = adOverlayInfoParcel.K;
            if (pi1Var != null) {
                pi1Var.z();
            }
            Activity i7 = adOverlayInfoParcel.f4343t.i();
            m mVar = adOverlayInfoParcel.f4340q;
            Context context2 = (mVar == null || !mVar.f26534z || i7 == null) ? context : i7;
            r2.t.e();
            a.b(context2, mVar, adOverlayInfoParcel.f4348y, mVar != null ? mVar.f26533y : null, rx1Var, adOverlayInfoParcel.G);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.C.f27054t);
        intent.putExtra("shouldCallOnOverlayOpened", z7);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) s2.b0.c().d(uy.ge)).booleanValue()) {
            r2.t.g();
            f2.E(context, intent, rx1Var, adOverlayInfoParcel.G);
        } else {
            r2.t.g();
            f2.z(context, intent);
        }
    }
}
