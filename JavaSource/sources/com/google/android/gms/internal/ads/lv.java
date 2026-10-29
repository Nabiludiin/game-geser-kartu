package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class lv extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final lv zzf;
    private static volatile d15 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        lv lvVar = new lv();
        zzf = lvVar;
        sz4.U(lv.class, lvVar);
    }

    private lv() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new lv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new kv(bArr);
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
        synchronized (lv.class) {
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
