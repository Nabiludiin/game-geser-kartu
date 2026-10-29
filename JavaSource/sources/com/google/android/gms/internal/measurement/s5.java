package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class s5 extends xa implements yb {
    private static final s5 zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        s5 s5Var = new s5();
        zzk = s5Var;
        xa.v(s5.class, s5Var);
    }

    private s5() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new s5();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new r5(bArr);
        }
        if (i8 == 5) {
            return zzk;
        }
        throw null;
    }
}
