package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class h35 extends sz4 implements x05 {
    private static final h35 zzc;
    private static volatile d15 zzd;
    private xz4 zza = sz4.u();
    private xz4 zzb = sz4.u();

    static {
        h35 h35Var = new h35();
        zzc = h35Var;
        sz4.U(h35.class, h35Var);
    }

    private h35() {
    }

    public static h35 d0(byte[] bArr, ez4 ez4Var) {
        return (h35) sz4.E(zzc, bArr, ez4Var);
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new h35();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new g35(bArr);
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
        synchronized (h35.class) {
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
