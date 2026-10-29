package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class p75 extends sz4 implements x05 {
    private static final p75 zze;
    private static volatile d15 zzf;
    private int zza;
    private String zzb = "";
    private int zzc;
    private int zzd;

    static {
        p75 p75Var = new p75();
        zze = p75Var;
        sz4.U(p75.class, p75Var);
    }

    private p75() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zza", "zzb", "zzc", s75.f15485a, "zzd"});
        }
        if (ordinal == 3) {
            return new p75();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new o75(bArr);
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
        synchronized (p75.class) {
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
