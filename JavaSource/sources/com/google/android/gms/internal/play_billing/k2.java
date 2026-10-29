package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class k2 extends d4 implements a5 {
    private static final k2 zzb;
    private int zzd;
    private p2 zze;
    private p2 zzf;
    private int zzg;

    static {
        k2 k2Var = new k2();
        zzb = k2Var;
        d4.y(k2.class, k2Var);
    }

    private k2() {
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", s2.a()});
        }
        if (i8 == 3) {
            return new k2();
        }
        n2 n2Var = null;
        if (i8 == 4) {
            return new j2(n2Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
