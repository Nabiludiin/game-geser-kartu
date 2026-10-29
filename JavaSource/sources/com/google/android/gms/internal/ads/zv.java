package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class zv extends sz4 implements x05 {
    public static final int zza = 1;
    private static final zv zzd;
    private static volatile d15 zze;
    private int zzb;
    private int zzc;

    static {
        zv zvVar = new zv();
        zzd = zvVar;
        sz4.U(zv.class, zvVar);
    }

    private zv() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzc", xv.d()});
        }
        if (ordinal == 3) {
            return new zv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new wv(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zze;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (zv.class) {
            try {
                d15Var = zze;
                if (d15Var == null) {
                    d15Var = new pz4(zzd);
                    zze = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
