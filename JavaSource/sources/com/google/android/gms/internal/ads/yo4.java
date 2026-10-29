package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class yo4 extends sz4 implements x05 {
    private static final yo4 zze;
    private static volatile d15 zzf;
    private int zza;
    private ap4 zzb;
    private int zzc;
    private qy4 zzd = qy4.f14669r;

    static {
        yo4 yo4Var = new yo4();
        zze = yo4Var;
        sz4.U(yo4.class, yo4Var);
    }

    private yo4() {
    }

    public static yo4 g0(qy4 qy4Var, ez4 ez4Var) {
        return (yo4) sz4.C(zze, qy4Var, ez4Var);
    }

    public static xo4 h0() {
        return (xo4) zze.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new yo4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new xo4(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzf;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (yo4.class) {
            try {
                d15Var = zzf;
                if (d15Var == null) {
                    d15Var = new pz4(zze);
                    zzf = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final ap4 d0() {
        ap4 ap4Var = this.zzb;
        return ap4Var == null ? ap4.f0() : ap4Var;
    }

    public final int e0() {
        return this.zzc;
    }

    public final qy4 f0() {
        return this.zzd;
    }

    final /* synthetic */ void i0(ap4 ap4Var) {
        ap4Var.getClass();
        this.zzb = ap4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void j0(int i7) {
        this.zzc = i7;
    }

    final /* synthetic */ void k0(qy4 qy4Var) {
        this.zzd = qy4Var;
    }
}
