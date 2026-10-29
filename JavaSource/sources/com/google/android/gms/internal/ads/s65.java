package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class s65 extends sz4 implements x05 {
    private static final s65 zzb;
    private static volatile d15 zzc;
    private b05 zza = sz4.y();

    static {
        s65 s65Var = new s65();
        zzb = s65Var;
        sz4.U(s65.class, s65Var);
    }

    private s65() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", q65.class});
        }
        if (ordinal == 3) {
            return new s65();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new r65(bArr);
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
        synchronized (s65.class) {
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
