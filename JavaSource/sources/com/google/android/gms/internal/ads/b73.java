package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class b73 extends sz4 implements x05 {
    private static final b73 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzc;
    private String zzb = "";
    private String zzd = "";

    static {
        b73 b73Var = new b73();
        zze = b73Var;
        sz4.U(b73.class, b73Var);
    }

    private b73() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new b73();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new a73(bArr);
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
        synchronized (b73.class) {
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
