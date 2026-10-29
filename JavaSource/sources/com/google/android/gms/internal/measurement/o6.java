package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class o6 extends xa implements yb {
    private static final o6 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private s5 zzf;

    static {
        o6 o6Var = new o6();
        zzg = o6Var;
        xa.v(o6.class, o6Var);
    }

    private o6() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new o6();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new n6(bArr);
        }
        if (i8 == 5) {
            return zzg;
        }
        throw null;
    }
}
