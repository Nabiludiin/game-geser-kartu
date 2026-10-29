package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class t7 extends d4 implements a5 {
    private static final t7 zzb;
    private int zzd;
    private int zzf;
    private i4 zze = d4.t();
    private String zzg = "";

    static {
        t7 t7Var = new t7();
        zzb = t7Var;
        d4.y(t7.class, t7Var);
    }

    private t7() {
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new t7();
        }
        s7 s7Var = null;
        if (i8 == 4) {
            return new r7(s7Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
