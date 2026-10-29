package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class hp4 extends sz4 implements x05 {
    private static final hp4 zze;
    private static volatile d15 zzf;
    private int zza;
    private jp4 zzb;
    private int zzc;
    private qy4 zzd = qy4.f14669r;

    static {
        hp4 hp4Var = new hp4();
        zze = hp4Var;
        sz4.U(hp4.class, hp4Var);
    }

    private hp4() {
    }

    public static hp4 g0(qy4 qy4Var, ez4 ez4Var) {
        return (hp4) sz4.C(zze, qy4Var, ez4Var);
    }

    public static gp4 h0() {
        return (gp4) zze.P();
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
            return new hp4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new gp4(bArr);
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
        synchronized (hp4.class) {
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

    public final jp4 d0() {
        jp4 jp4Var = this.zzb;
        return jp4Var == null ? jp4.h0() : jp4Var;
    }

    public final int e0() {
        return this.zzc;
    }

    public final qy4 f0() {
        return this.zzd;
    }

    final /* synthetic */ void i0(jp4 jp4Var) {
        jp4Var.getClass();
        this.zzb = jp4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void j0(int i7) {
        this.zzc = i7;
    }

    final /* synthetic */ void k0(qy4 qy4Var) {
        this.zzd = qy4Var;
    }
}
