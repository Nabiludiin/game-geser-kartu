package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public abstract class a63 {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) s2.b0.c().d(uy.I9), str);
    }

    public static void b(a5.d dVar, r53 r53Var) {
        if (((Boolean) p00.f13596c.e()).booleanValue()) {
            p64.r(h64.C(dVar), new w53(r53Var), cm0.f6506g);
        }
    }

    public static j43 c(final r53 r53Var) {
        return new j43() { // from class: com.google.android.gms.internal.ads.z53
            @Override // com.google.android.gms.internal.ads.j43
            public final /* synthetic */ Object d(Object obj) {
                if (((Boolean) p00.f13596c.e()).booleanValue()) {
                    r53.this.a();
                }
                return obj;
            }
        };
    }

    public static void d(a5.d dVar, b63 b63Var, r53 r53Var) {
        h(dVar, b63Var, r53Var, false);
    }

    public static void e(a5.d dVar, b63 b63Var, r53 r53Var) {
        h(dVar, b63Var, r53Var, true);
    }

    public static void f(a5.d dVar, b63 b63Var, r53 r53Var) {
        if (((Boolean) p00.f13596c.e()).booleanValue()) {
            p64.r(h64.C(dVar), new y53(b63Var, r53Var), cm0.f6506g);
        }
    }

    public static int g(w03 w03Var) {
        int g8 = b3.c.g(w03Var) - 1;
        return (g8 == 0 || g8 == 1) ? 7 : 23;
    }

    private static void h(a5.d dVar, b63 b63Var, r53 r53Var, boolean z7) {
        if (((Boolean) p00.f13596c.e()).booleanValue()) {
            p64.r(h64.C(dVar), new x53(b63Var, r53Var, z7), cm0.f6506g);
        }
    }
}
