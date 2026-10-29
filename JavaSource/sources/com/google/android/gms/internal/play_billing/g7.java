package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class g7 extends d4 implements a5 {
    private static final g7 zzb;
    private int zzd;
    private int zze;

    static {
        g7 g7Var = new g7();
        zzb = g7Var;
        d4.y(g7.class, g7Var);
    }

    private g7() {
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", e7.f21525a});
        }
        if (i8 == 3) {
            return new g7();
        }
        f7 f7Var = null;
        if (i8 == 4) {
            return new d7(f7Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
