package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class w4 extends xa implements yb {
    private static final w4 zzg;
    private int zzb;
    private String zzd = "";
    private db zze = xa.B();
    private boolean zzf;

    static {
        w4 w4Var = new w4();
        zzg = w4Var;
        xa.v(w4.class, w4Var);
    }

    private w4() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", g5.class, "zzf"});
        }
        if (i8 == 3) {
            return new w4();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new v4(bArr);
        }
        if (i8 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }
}
