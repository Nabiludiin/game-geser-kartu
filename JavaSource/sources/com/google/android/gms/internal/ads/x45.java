package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class x45 extends sz4 implements x05 {
    private static final x45 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb;
    private w45 zzc;
    private w45 zzd;

    static {
        x45 x45Var = new x45();
        zze = x45Var;
        sz4.U(x45.class, x45Var);
    }

    private x45() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zza", "zzb", u45.f16582a, "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new x45();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new t45(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzf;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (x45.class) {
            try {
                d15Var = zzf;
                if (d15Var == null) {
                    d15Var = new pz4(zze);
                    zzf = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
