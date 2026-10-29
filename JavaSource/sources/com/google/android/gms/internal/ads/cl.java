package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class cl extends sz4 implements x05 {
    private static final cl zzf;
    private static volatile d15 zzg;
    private int zza;
    private qy4 zzb;
    private qy4 zzc;
    private qy4 zzd;
    private qy4 zze;

    static {
        cl clVar = new cl();
        zzf = clVar;
        sz4.U(cl.class, clVar);
    }

    private cl() {
        qy4 qy4Var = qy4.f14669r;
        this.zzb = qy4Var;
        this.zzc = qy4Var;
        this.zzd = qy4Var;
        this.zze = qy4Var;
    }

    public static cl h0(byte[] bArr, ez4 ez4Var) {
        return (cl) sz4.E(zzf, bArr, ez4Var);
    }

    public static bl i0() {
        return (bl) zzf.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new cl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new bl(bArr);
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
        synchronized (cl.class) {
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

    public final qy4 d0() {
        return this.zzb;
    }

    public final qy4 e0() {
        return this.zzc;
    }

    public final qy4 f0() {
        return this.zzd;
    }

    public final qy4 g0() {
        return this.zze;
    }

    final /* synthetic */ void j0(qy4 qy4Var) {
        this.zza |= 1;
        this.zzb = qy4Var;
    }

    final /* synthetic */ void k0(qy4 qy4Var) {
        this.zza |= 2;
        this.zzc = qy4Var;
    }

    final /* synthetic */ void l0(qy4 qy4Var) {
        this.zza |= 4;
        this.zzd = qy4Var;
    }

    final /* synthetic */ void m0(qy4 qy4Var) {
        this.zza |= 8;
        this.zze = qy4Var;
    }
}
