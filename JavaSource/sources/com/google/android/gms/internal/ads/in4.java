package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class in4 extends sz4 implements x05 {
    private static final in4 zzb;
    private static volatile d15 zzc;
    private int zza;

    static {
        in4 in4Var = new in4();
        zzb = in4Var;
        sz4.U(in4.class, in4Var);
    }

    private in4() {
    }

    public static in4 e0(qy4 qy4Var, ez4 ez4Var) {
        return (in4) sz4.C(zzb, qy4Var, ez4Var);
    }

    public static in4 f0() {
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
            return new in4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new hn4(bArr);
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
        synchronized (in4.class) {
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
