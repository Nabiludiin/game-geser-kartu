package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class n63 extends sz4 implements x05 {
    private static final n63 zzb;
    private static volatile d15 zzc;
    private String zza = "";

    static {
        n63 n63Var = new n63();
        zzb = n63Var;
        sz4.U(n63.class, n63Var);
    }

    private n63() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new n63();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new m63(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzc;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (n63.class) {
            try {
                d15Var = zzc;
                if (d15Var == null) {
                    d15Var = new pz4(zzb);
                    zzc = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
