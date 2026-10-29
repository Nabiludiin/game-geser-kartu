package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class i5 extends xa implements yb {
    private static final i5 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        i5 i5Var = new i5();
        zzf = i5Var;
        xa.v(i5.class, i5Var);
    }

    private i5() {
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
            return new i5();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new h5(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }
}
