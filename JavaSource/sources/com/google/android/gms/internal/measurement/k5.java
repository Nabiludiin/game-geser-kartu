package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class k5 extends xa implements yb {
    private static final k5 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        k5 k5Var = new k5();
        zzi = k5Var;
        xa.v(k5.class, k5Var);
    }

    private k5() {
    }

    public static k5 J() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new k5();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new j5(bArr);
        }
        if (i8 == 5) {
            return zzi;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }

    public final int H() {
        return this.zzg;
    }

    public final String I() {
        return this.zzh;
    }
}
