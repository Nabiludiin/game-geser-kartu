package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class vw extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final vw zzf;
    private static volatile d15 zzg;
    private int zzc;
    private int zzd = 1000;
    private zv zze;

    static {
        vw vwVar = new vw();
        zzf = vwVar;
        sz4.U(vw.class, vwVar);
    }

    private vw() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", ox.d(), "zze"});
        }
        if (ordinal == 3) {
            return new vw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new uw(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzg;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (vw.class) {
            try {
                d15Var = zzg;
                if (d15Var == null) {
                    d15Var = new pz4(zzf);
                    zzg = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
