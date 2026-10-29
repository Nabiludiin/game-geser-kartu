package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class c7 extends d4 implements a5 {
    private static final c7 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        c7 c7Var = new c7();
        zzb = c7Var;
        d4.y(c7.class, c7Var);
    }

    private c7() {
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new c7();
        }
        b7 b7Var = null;
        if (i8 == 4) {
            return new a7(b7Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
