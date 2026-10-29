package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class im4 extends sz4 implements x05 {
    private static final im4 zzd;
    private static volatile d15 zze;
    private int zza;
    private km4 zzb;
    private int zzc;

    static {
        im4 im4Var = new im4();
        zzd = im4Var;
        sz4.U(im4.class, im4Var);
    }

    private im4() {
    }

    public static im4 f0(qy4 qy4Var, ez4 ez4Var) {
        return (im4) sz4.C(zzd, qy4Var, ez4Var);
    }

    public static hm4 g0() {
        return (hm4) zzd.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new im4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new hm4(bArr);
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
        synchronized (im4.class) {
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

    public final km4 d0() {
        km4 km4Var = this.zzb;
        return km4Var == null ? km4.f0() : km4Var;
    }

    public final int e0() {
        return this.zzc;
    }

    final /* synthetic */ void h0(km4 km4Var) {
        km4Var.getClass();
        this.zzb = km4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void i0(int i7) {
        this.zzc = i7;
    }
}
