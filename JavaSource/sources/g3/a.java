package g3;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.kj0;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.uy;
import k2.g;
import k2.p;
import k2.u;
import p3.o;
import s2.b0;

/* compiled from: MyApplication */
public abstract class a {
    public static void b(final Context context, final String str, final g gVar, final b bVar) {
        o.n(context, "Context cannot be null.");
        o.n(str, "AdUnitId cannot be null.");
        o.n(gVar, "AdRequest cannot be null.");
        o.n(bVar, "LoadCallback cannot be null.");
        o.f("#008 Must be called on the main UI thread.");
        uy.a(context);
        if (((Boolean) u00.f16534k.e()).booleanValue()) {
            if (((Boolean) b0.c().d(uy.jc)).booleanValue()) {
                w2.c.f27059b.execute(new Runnable() { // from class: g3.c
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        b bVar2 = bVar;
                        g gVar2 = gVar;
                        Context context2 = context;
                        try {
                            new kj0(context2, str).d(gVar2.a(), bVar2);
                        } catch (IllegalStateException e8) {
                            ag0.c(context2).a(e8, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new kj0(context, str).d(gVar.a(), bVar);
    }

    public abstract u a();

    public abstract void c(Activity activity, p pVar);
}
