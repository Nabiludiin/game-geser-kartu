package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class go4 extends sz4 implements x05 {
    private static final go4 zzf;
    private static volatile d15 zzg;
    private int zza;
    private xn4 zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        go4 go4Var = new go4();
        zzf = go4Var;
        sz4.U(go4.class, go4Var);
    }

    private go4() {
    }

    public static fo4 h0() {
        return (fo4) zzf.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new go4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new fo4(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzg;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (go4.class) {
            try {
                d15Var = zzg;
                if (d15Var == null) {
                    d15Var = new pz4(zzf);
                    zzg = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final boolean d0() {
        return (this.zza & 1) != 0;
    }

    public final xn4 e0() {
        xn4 xn4Var = this.zzb;
        return xn4Var == null ? xn4.h0() : xn4Var;
    }

    public final int f0() {
        return this.zzd;
    }

    public final uo4 g0() {
        uo4 c8 = uo4.c(this.zze);
        return c8 == null ? uo4.UNRECOGNIZED : c8;
    }

    final /* synthetic */ void i0(xn4 xn4Var) {
        xn4Var.getClass();
        this.zzb = xn4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void j0(int i7) {
        this.zzd = i7;
    }

    final /* synthetic */ void k0(uo4 uo4Var) {
        this.zze = uo4Var.a();
    }

    public final int m0() {
        int i7 = this.zzc;
        int i8 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }

    final /* synthetic */ void n0(int i7) {
        this.zzc = yn4.a(i7);
    }
}
