package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class w55 extends sz4 implements x05 {
    private static final w55 zzd;
    private static volatile d15 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        w55 w55Var = new w55();
        zzd = w55Var;
        sz4.U(w55.class, w55Var);
    }

    private w55() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            wz4 wz4Var = v55.f17395a;
            return sz4.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", wz4Var, "zzc", wz4Var});
        }
        if (ordinal == 3) {
            return new w55();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new u55(bArr);
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
        synchronized (w55.class) {
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
