package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class pp4 extends sz4 implements x05 {
    private static final pp4 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb;
    private tp4 zzc;
    private qy4 zzd = qy4.f14669r;

    static {
        pp4 pp4Var = new pp4();
        zze = pp4Var;
        sz4.U(pp4.class, pp4Var);
    }

    private pp4() {
    }

    public static pp4 g0(qy4 qy4Var, ez4 ez4Var) {
        return (pp4) sz4.C(zze, qy4Var, ez4Var);
    }

    public static op4 h0() {
        return (op4) zze.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new pp4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new op4(bArr);
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
        synchronized (pp4.class) {
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

    public final int d0() {
        return this.zzb;
    }

    public final tp4 e0() {
        tp4 tp4Var = this.zzc;
        return tp4Var == null ? tp4.f0() : tp4Var;
    }

    public final qy4 f0() {
        return this.zzd;
    }

    final /* synthetic */ void i0(tp4 tp4Var) {
        tp4Var.getClass();
        this.zzc = tp4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void j0(qy4 qy4Var) {
        this.zzd = qy4Var;
    }
}
