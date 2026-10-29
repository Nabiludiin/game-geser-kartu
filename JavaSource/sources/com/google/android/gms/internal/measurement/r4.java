package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class r4 extends xa implements yb {
    private static final r4 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        r4 r4Var = new r4();
        zzf = r4Var;
        xa.v(r4.class, r4Var);
    }

    private r4() {
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
            return new r4();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new q4(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }
}
