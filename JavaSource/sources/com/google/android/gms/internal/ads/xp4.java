package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class xp4 extends sz4 implements x05 {
    private static final xp4 zzb;
    private static volatile d15 zzc;
    private int zza;

    static {
        xp4 xp4Var = new xp4();
        zzb = xp4Var;
        sz4.U(xp4.class, xp4Var);
    }

    private xp4() {
    }

    public static xp4 e0(qy4 qy4Var, ez4 ez4Var) {
        return (xp4) sz4.C(zzb, qy4Var, ez4Var);
    }

    public static xp4 f0() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new xp4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new wp4(bArr);
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
        synchronized (xp4.class) {
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

    public final int d0() {
        return this.zza;
    }
}
