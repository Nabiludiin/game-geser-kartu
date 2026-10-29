package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class uq extends sz4 implements x05 {
    private static final uq zzg;
    private static volatile d15 zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        uq uqVar = new uq();
        zzg = uqVar;
        sz4.U(uq.class, uqVar);
    }

    private uq() {
    }

    public static uq i0(qy4 qy4Var) {
        return (uq) sz4.B(zzg, qy4Var);
    }

    public static uq j0(qy4 qy4Var, ez4 ez4Var) {
        return (uq) sz4.C(zzg, qy4Var, ez4Var);
    }

    public static tq k0() {
        return (tq) zzg.P();
    }

    public static uq l0() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new uq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new tq(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzh;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (uq.class) {
            try {
                d15Var = zzh;
                if (d15Var == null) {
                    d15Var = new pz4(zzg);
                    zzh = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final String d0() {
        return this.zzb;
    }

    public final String e0() {
        return this.zzc;
    }

    public final long f0() {
        return this.zzd;
    }

    public final long g0() {
        return this.zze;
    }

    public final long h0() {
        return this.zzf;
    }

    final /* synthetic */ void m0(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void n0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void o0(long j7) {
        this.zza |= 4;
        this.zzd = j7;
    }

    final /* synthetic */ void p0(long j7) {
        this.zza |= 8;
        this.zze = j7;
    }

    final /* synthetic */ void q0(long j7) {
        this.zza |= 16;
        this.zzf = j7;
    }
}
