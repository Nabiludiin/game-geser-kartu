package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class kk0 {

    /* renamed from: a, reason: collision with root package name */
    static kk0 f11084a;

    public static synchronized kk0 b(Context context) {
        synchronized (kk0.class) {
            try {
                kk0 kk0Var = f11084a;
                if (kk0Var != null) {
                    return kk0Var;
                }
                Context applicationContext = context.getApplicationContext();
                uy.a(applicationContext);
                v2.p1 q7 = r2.t.l().q();
                q7.h(applicationContext);
                ek0 ek0Var = new ek0(null);
                ek0Var.a(applicationContext);
                ek0Var.b(r2.t.o());
                ek0Var.c(q7);
                ek0Var.d(r2.t.d());
                kk0 e8 = ek0Var.e();
                f11084a = e8;
                ((wj0) ((fk0) e8).f8296e.b()).a();
                final pk0 pk0Var = (pk0) ((fk0) f11084a).f8301j.b();
                if (((Boolean) s2.b0.c().d(uy.M0)).booleanValue()) {
                    r2.t.g();
                    final Map l02 = v2.f2.l0((String) s2.b0.c().d(uy.N0));
                    Iterator it = l02.keySet().iterator();
                    while (it.hasNext()) {
                        pk0Var.b((String) it.next());
                    }
                    pk0Var.a(new nk0() { // from class: com.google.android.gms.internal.ads.ok0
                        @Override // com.google.android.gms.internal.ads.nk0
                        public final /* synthetic */ void a(SharedPreferences sharedPreferences, String str, String str2) {
                            pk0.this.c(l02, sharedPreferences, str, str2);
                        }
                    });
                }
                return f11084a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    abstract ak0 a();
}
