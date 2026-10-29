package e3;

import android.content.Context;
import com.google.android.gms.internal.ads.tf0;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.uy;
import k2.g;
import s2.b0;
import s2.i3;
import s2.w3;

/* compiled from: MyApplication */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final w3 f23223a;

    public a(w3 w3Var) {
        this.f23223a = w3Var;
    }

    public static void a(Context context, k2.c cVar, g gVar, b bVar) {
        c(context, cVar, gVar, null, bVar);
    }

    private static void c(final Context context, final k2.c cVar, final g gVar, final String str, final b bVar) {
        uy.a(context);
        if (((Boolean) u00.f16533j.e()).booleanValue()) {
            if (((Boolean) b0.c().d(uy.jc)).booleanValue()) {
                w2.c.f27059b.execute(new Runnable() { // from class: e3.c
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        g gVar2 = gVar;
                        i3 a8 = gVar2 == null ? null : gVar2.a();
                        new tf0(context, cVar, a8, str).b(bVar);
                    }
                });
                return;
            }
        }
        new tf0(context, cVar, gVar == null ? null : gVar.a(), str).b(bVar);
    }

    public String b() {
        return this.f23223a.a();
    }
}
