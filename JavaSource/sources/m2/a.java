package m2;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.uy;
import k2.e;
import k2.g;
import k2.u;
import m2.a;
import p3.o;
import s2.b0;
import w2.c;

/* compiled from: MyApplication */
public abstract class a {

    /* compiled from: MyApplication */
    /* renamed from: m2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0112a extends e {
    }

    public static void b(final Context context, final String str, final g gVar, final AbstractC0112a abstractC0112a) {
        o.n(context, "Context cannot be null.");
        o.n(str, "adUnitId cannot be null.");
        o.n(gVar, "AdRequest cannot be null.");
        o.f("#008 Must be called on the main UI thread.");
        uy.a(context);
        if (((Boolean) u00.f16527d.e()).booleanValue()) {
            if (((Boolean) b0.c().d(uy.jc)).booleanValue()) {
                c.f27059b.execute(new Runnable() { // from class: m2.b
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        a.AbstractC0112a abstractC0112a2 = abstractC0112a;
                        g gVar2 = gVar;
                        Context context2 = context;
                        try {
                            new jt(context2, str, gVar2.a(), abstractC0112a2).a();
                        } catch (IllegalStateException e8) {
                            ag0.c(context2).a(e8, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new jt(context, str, gVar.a(), abstractC0112a).a();
    }

    public abstract u a();

    public abstract void c(Activity activity);
}
