package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class k6 extends xa implements yb {
    private static final k6 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        k6 k6Var = new k6();
        zzf = k6Var;
        xa.v(k6.class, k6Var);
    }

    private k6() {
    }

    public static j6 F() {
        return (j6) zzf.r();
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i8 == 3) {
            return new k6();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new j6(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }

    final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void H(long j7) {
        this.zzb |= 2;
        this.zze = j7;
    }
}
