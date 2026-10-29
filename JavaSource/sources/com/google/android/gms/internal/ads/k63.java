package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class k63 extends sz4 implements x05 {
    private static final k63 zzc;
    private static volatile d15 zzd;
    private int zza;
    private h63 zzb;

    static {
        k63 k63Var = new k63();
        zzc = k63Var;
        sz4.U(k63.class, k63Var);
    }

    private k63() {
    }

    public static j63 d0() {
        return (j63) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new k63();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new j63(bArr);
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
        synchronized (k63.class) {
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

    final /* synthetic */ void e0(h63 h63Var) {
        h63Var.getClass();
        this.zzb = h63Var;
        this.zza |= 1;
    }
}
