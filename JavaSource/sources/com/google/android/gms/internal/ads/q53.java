package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public abstract /* synthetic */ class q53 {
    public static r53 a(Context context, int i7) {
        boolean booleanValue;
        if (e63.a()) {
            int i8 = i7 - 2;
            if (i8 == 20 || i8 == 21) {
                booleanValue = ((Boolean) p00.f13598e.e()).booleanValue();
            } else if (i8 != 110) {
                switch (i8) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) p00.f13596c.e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) p00.f13597d.e()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) p00.f13595b.e()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) s2.b0.c().d(uy.Q9)).booleanValue();
            }
            if (booleanValue) {
                return new t53(context, i7);
            }
        }
        return new t63();
    }

    public static r53 b(Context context, int i7, int i8, s2.b5 b5Var) {
        r53 a8 = a(context, i7);
        if (a8 instanceof t53) {
            a8.a();
            a8.i0(i8);
            a8.k0(b3.c.d(b5Var.C));
            String str = b5Var.F;
            if (a63.a(str)) {
                a8.y(str);
            }
        }
        return a8;
    }
}
