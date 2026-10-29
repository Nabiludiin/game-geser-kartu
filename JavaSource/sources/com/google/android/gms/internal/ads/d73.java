package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class d73 extends sz4 implements x05 {
    private static final d73 zzb;
    private static volatile d15 zzc;
    private b05 zza = sz4.y();

    static {
        d73 d73Var = new d73();
        zzb = d73Var;
        sz4.U(d73.class, d73Var);
    }

    private d73() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", b73.class});
        }
        if (ordinal == 3) {
            return new d73();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new c73(bArr);
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
        synchronized (d73.class) {
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
