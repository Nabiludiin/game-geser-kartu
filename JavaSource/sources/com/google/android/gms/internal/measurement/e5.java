package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class e5 extends xa implements yb {
    private static final e5 zzi;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;
    private int zzg = 13;
    private int zzh = 11;

    static {
        e5 e5Var = new e5();
        zzi = e5Var;
        xa.v(e5.class, e5Var);
    }

    private e5() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new e5();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new d5(bArr);
        }
        if (i8 == 5) {
            return zzi;
        }
        throw null;
    }
}
