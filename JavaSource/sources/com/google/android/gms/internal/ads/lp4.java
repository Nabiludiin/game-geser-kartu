package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class lp4 extends sz4 implements x05 {
    private static final lp4 zzj;
    private static volatile d15 zzk;
    private int zza;
    private int zzb;
    private np4 zzc;
    private qy4 zzd;
    private qy4 zze;
    private qy4 zzf;
    private qy4 zzg;
    private qy4 zzh;
    private qy4 zzi;

    static {
        lp4 lp4Var = new lp4();
        zzj = lp4Var;
        sz4.U(lp4.class, lp4Var);
    }

    private lp4() {
        qy4 qy4Var = qy4.f14669r;
        this.zzd = qy4Var;
        this.zze = qy4Var;
        this.zzf = qy4Var;
        this.zzg = qy4Var;
        this.zzh = qy4Var;
        this.zzi = qy4Var;
    }

    public static lp4 l0(qy4 qy4Var, ez4 ez4Var) {
        return (lp4) sz4.C(zzj, qy4Var, ez4Var);
    }

    public static kp4 m0() {
        return (kp4) zzj.P();
    }

    public static d15 n0() {
        return zzj.p();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new lp4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new kp4(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzk;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (lp4.class) {
            try {
                d15Var = zzk;
                if (d15Var == null) {
                    d15Var = new pz4(zzj);
                    zzk = d15Var;
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

    public final np4 e0() {
        np4 np4Var = this.zzc;
        return np4Var == null ? np4.j0() : np4Var;
    }

    public final qy4 f0() {
        return this.zzd;
    }

    public final qy4 g0() {
        return this.zze;
    }

    public final qy4 h0() {
        return this.zzf;
    }

    public final qy4 i0() {
        return this.zzg;
    }

    public final qy4 j0() {
        return this.zzh;
    }

    public final qy4 k0() {
        return this.zzi;
    }

    final /* synthetic */ void o0(int i7) {
        this.zzb = 0;
    }

    final /* synthetic */ void p0(np4 np4Var) {
        np4Var.getClass();
        this.zzc = np4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void q0(qy4 qy4Var) {
        this.zzd = qy4Var;
    }

    final /* synthetic */ void r0(qy4 qy4Var) {
        this.zze = qy4Var;
    }

    final /* synthetic */ void s0(qy4 qy4Var) {
        this.zzf = qy4Var;
    }

    final /* synthetic */ void t0(qy4 qy4Var) {
        this.zzg = qy4Var;
    }

    final /* synthetic */ void u0(qy4 qy4Var) {
        this.zzh = qy4Var;
    }

    final /* synthetic */ void v0(qy4 qy4Var) {
        this.zzi = qy4Var;
    }
}
