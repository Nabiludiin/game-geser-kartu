package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class cm4 extends sz4 implements x05 {
    private static final cm4 zzd;
    private static volatile d15 zze;
    private int zza;
    private em4 zzb;
    private int zzc;

    static {
        cm4 cm4Var = new cm4();
        zzd = cm4Var;
        sz4.U(cm4.class, cm4Var);
    }

    private cm4() {
    }

    public static bm4 f0() {
        return (bm4) zzd.P();
    }

    public static cm4 g0() {
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
            return sz4.V(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new cm4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new bm4(bArr);
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
        synchronized (cm4.class) {
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

    public final em4 d0() {
        em4 em4Var = this.zzb;
        return em4Var == null ? em4.f0() : em4Var;
    }

    public final int e0() {
        return this.zzc;
    }

    final /* synthetic */ void h0(em4 em4Var) {
        em4Var.getClass();
        this.zzb = em4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void i0(int i7) {
        this.zzc = i7;
    }
}
