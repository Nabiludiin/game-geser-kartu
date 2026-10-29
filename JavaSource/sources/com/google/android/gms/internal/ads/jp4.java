package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class jp4 extends sz4 implements x05 {
    private static final jp4 zzd;
    private static volatile d15 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        jp4 jp4Var = new jp4();
        zzd = jp4Var;
        sz4.U(jp4.class, jp4Var);
    }

    private jp4() {
    }

    public static ip4 g0() {
        return (ip4) zzd.P();
    }

    public static jp4 h0() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new jp4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ip4(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zze;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (jp4.class) {
            try {
                d15Var = zze;
                if (d15Var == null) {
                    d15Var = new pz4(zzd);
                    zze = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final on4 d0() {
        on4 c8 = on4.c(this.zza);
        return c8 == null ? on4.UNRECOGNIZED : c8;
    }

    public final on4 e0() {
        on4 c8 = on4.c(this.zzb);
        return c8 == null ? on4.UNRECOGNIZED : c8;
    }

    public final int f0() {
        return this.zzc;
    }

    final /* synthetic */ void i0(on4 on4Var) {
        this.zza = on4Var.a();
    }

    final /* synthetic */ void j0(on4 on4Var) {
        this.zzb = on4Var.a();
    }

    final /* synthetic */ void k0(int i7) {
        this.zzc = i7;
    }
}
