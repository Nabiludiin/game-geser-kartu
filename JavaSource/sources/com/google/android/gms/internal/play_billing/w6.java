package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class w6 extends d4 implements a5 {
    private static final w6 zzb;
    private int zzd;
    private int zzf;
    private n6 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private h4 zzg = d4.s();
    private i4 zzh = d4.t();

    static {
        w6 w6Var = new w6();
        zzb = w6Var;
        d4.y(w6.class, w6Var);
    }

    private w6() {
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", u6.f21755a, "zzg", r6.f21728a, "zzh", t7.class, "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new w6();
        }
        v6 v6Var = null;
        if (i8 == 4) {
            return new t6(v6Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
