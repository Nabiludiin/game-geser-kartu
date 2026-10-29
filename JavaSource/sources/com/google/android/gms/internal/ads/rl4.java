package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class rl4 extends sz4 implements x05 {
    private static final rl4 zzd;
    private static volatile d15 zze;
    private int zza;
    private int zzb;
    private tl4 zzc;

    static {
        rl4 rl4Var = new rl4();
        zzd = rl4Var;
        sz4.U(rl4.class, rl4Var);
    }

    private rl4() {
    }

    public static rl4 f0(qy4 qy4Var, ez4 ez4Var) {
        return (rl4) sz4.C(zzd, qy4Var, ez4Var);
    }

    public static ql4 g0() {
        return (ql4) zzd.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new rl4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ql4(bArr);
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
        synchronized (rl4.class) {
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

    public final int d0() {
        return this.zzb;
    }

    public final tl4 e0() {
        tl4 tl4Var = this.zzc;
        return tl4Var == null ? tl4.f0() : tl4Var;
    }

    final /* synthetic */ void h0(int i7) {
        this.zzb = i7;
    }

    final /* synthetic */ void i0(tl4 tl4Var) {
        tl4Var.getClass();
        this.zzc = tl4Var;
        this.zza |= 1;
    }
}
