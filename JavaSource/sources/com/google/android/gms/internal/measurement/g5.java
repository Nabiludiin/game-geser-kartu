package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class g5 extends xa implements yb {
    private static final g5 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        g5 g5Var = new g5();
        zzf = g5Var;
        xa.v(g5.class, g5Var);
    }

    private g5() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i8 == 3) {
            return new g5();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new f5(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }
}
