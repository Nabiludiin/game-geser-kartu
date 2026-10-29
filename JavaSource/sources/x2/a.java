package x2;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.p80;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.uy;
import k2.g;
import k2.l;
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
        if (((Boolean) u00.f16532i.e()).booleanValue()) {
            if (((Boolean) b0.c().d(uy.jc)).booleanValue()) {
                w2.c.f27059b.execute(new Runnable() { // from class: x2.c
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        b bVar2 = bVar;
                        g gVar2 = gVar;
                        Context context2 = context;
                        try {
                            new p80(context2, str).f(gVar2.a(), bVar2);
                        } catch (IllegalStateException e8) {
                            ag0.c(context2).a(e8, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new p80(context, str).f(gVar.a(), bVar);
    }

    public abstract u a();

    public abstract void c(l lVar);

    public abstract void d(boolean z7);

    public abstract void e(Activity activity);
}
