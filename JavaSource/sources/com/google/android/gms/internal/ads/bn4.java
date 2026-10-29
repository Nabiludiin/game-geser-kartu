package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class bn4 extends sz4 implements x05 {
    private static final bn4 zzd;
    private static volatile d15 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        bn4 bn4Var = new bn4();
        zzd = bn4Var;
        sz4.U(bn4.class, bn4Var);
    }

    private bn4() {
    }

    public static an4 e0() {
        return (an4) zzd.P();
    }

    public static bn4 f0() {
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
            return sz4.V(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new bn4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new an4(bArr);
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
        synchronized (bn4.class) {
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

    final /* synthetic */ void g0(on4 on4Var) {
        this.zza = on4Var.a();
    }

    public final int i0() {
        int i7 = this.zzb;
        int i8 = i7 != 0 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }

    public final int j0() {
        int i7 = this.zzc;
        int i8 = i7 != 0 ? i7 != 1 ? i7 != 2 ? 0 : 4 : 3 : 2;
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }

    final /* synthetic */ void k0(int i7) {
        this.zzb = nn4.a(i7);
    }

    final /* synthetic */ void l0(int i7) {
        this.zzc = gn4.a(i7);
    }
}
