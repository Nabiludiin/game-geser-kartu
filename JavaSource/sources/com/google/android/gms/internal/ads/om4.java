package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class om4 extends sz4 implements x05 {
    private static final om4 zzc;
    private static volatile d15 zzd;
    private int zza;
    private int zzb;

    static {
        om4 om4Var = new om4();
        zzc = om4Var;
        sz4.U(om4.class, om4Var);
    }

    private om4() {
    }

    public static om4 f0(qy4 qy4Var, ez4 ez4Var) {
        return (om4) sz4.C(zzc, qy4Var, ez4Var);
    }

    public static nm4 g0() {
        return (nm4) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new om4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new nm4(bArr);
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
        synchronized (om4.class) {
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

    public final int d0() {
        return this.zza;
    }

    public final int e0() {
        return this.zzb;
    }

    final /* synthetic */ void h0(int i7) {
        this.zza = i7;
    }
}
