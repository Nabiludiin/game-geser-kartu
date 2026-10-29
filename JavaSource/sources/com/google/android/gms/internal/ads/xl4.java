package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class xl4 extends sz4 implements x05 {
    private static final xl4 zzd;
    private static volatile d15 zze;
    private int zza;
    private cm4 zzb;
    private sn4 zzc;

    static {
        xl4 xl4Var = new xl4();
        zzd = xl4Var;
        sz4.U(xl4.class, xl4Var);
    }

    private xl4() {
    }

    public static xl4 f0(qy4 qy4Var, ez4 ez4Var) {
        return (xl4) sz4.C(zzd, qy4Var, ez4Var);
    }

    public static wl4 g0() {
        return (wl4) zzd.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new xl4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new wl4(bArr);
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
        synchronized (xl4.class) {
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

    public final cm4 d0() {
        cm4 cm4Var = this.zzb;
        return cm4Var == null ? cm4.g0() : cm4Var;
    }

    public final sn4 e0() {
        sn4 sn4Var = this.zzc;
        return sn4Var == null ? sn4.i0() : sn4Var;
    }

    final /* synthetic */ void h0(cm4 cm4Var) {
        cm4Var.getClass();
        this.zzb = cm4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void i0(sn4 sn4Var) {
        sn4Var.getClass();
        this.zzc = sn4Var;
        this.zza |= 2;
    }
}
