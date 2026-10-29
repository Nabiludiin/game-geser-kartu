package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class b75 extends sz4 implements x05 {
    private static final b75 zzc;
    private static volatile d15 zzd;
    private int zza;
    private z65 zzb;

    static {
        b75 b75Var = new b75();
        zzc = b75Var;
        sz4.U(b75.class, b75Var);
    }

    private b75() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new b75();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new a75(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzd;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (b75.class) {
            try {
                d15Var = zzd;
                if (d15Var == null) {
                    d15Var = new pz4(zzc);
                    zzd = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
