package f3;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.ti0;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.uy;
import k2.g;
import k2.l;
import k2.u;
import p3.o;
import s2.b0;
import w2.p;

/* compiled from: MyApplication */
public abstract class c {
    public static void b(final Context context, final String str, final g gVar, final d dVar) {
        o.n(context, "Context cannot be null.");
        o.n(str, "AdUnitId cannot be null.");
        o.n(gVar, "AdRequest cannot be null.");
        o.n(dVar, "LoadCallback cannot be null.");
        o.f("#008 Must be called on the main UI thread.");
        uy.a(context);
        if (((Boolean) u00.f16534k.e()).booleanValue()) {
            if (((Boolean) b0.c().d(uy.jc)).booleanValue()) {
                w2.c.f27059b.execute(new Runnable() { // from class: f3.e
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        d dVar2 = dVar;
                        g gVar2 = gVar;
                        Context context2 = context;
                        try {
                            new ti0(context2, str).e(gVar2.a(), dVar2);
                        } catch (IllegalStateException e8) {
                            ag0.c(context2).a(e8, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        p.a("Loading on UI thread");
        new ti0(context, str).e(gVar.a(), dVar);
    }

    public abstract u a();

    public abstract void c(l lVar);

    public abstract void d(Activity activity, k2.p pVar);
}
