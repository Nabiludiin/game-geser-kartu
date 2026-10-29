package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class n7 extends d4 implements a5 {
    private static final n7 zzb;
    private int zzd;
    private i4 zze = d4.t();
    private String zzf = "";
    private boolean zzg;

    static {
        n7 n7Var = new n7();
        zzb = n7Var;
        d4.y(n7.class, n7Var);
    }

    private n7() {
    }

    static /* synthetic */ void B(n7 n7Var, boolean z7) {
        n7Var.zzd |= 2;
        n7Var.zzg = z7;
    }

    public static n7 D() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", l7.class, "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new n7();
        }
        m7 m7Var = null;
        if (i8 == 4) {
            return new i7(m7Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
