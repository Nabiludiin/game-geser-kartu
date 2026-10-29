package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class np4 extends sz4 implements x05 {
    private static final np4 zzf;
    private static volatile d15 zzg;
    private int zza;
    private int zzb;
    private jp4 zzc;
    private qy4 zzd;
    private qy4 zze;

    static {
        np4 np4Var = new np4();
        zzf = np4Var;
        sz4.U(np4.class, np4Var);
    }

    private np4() {
        qy4 qy4Var = qy4.f14669r;
        this.zzd = qy4Var;
        this.zze = qy4Var;
    }

    public static np4 h0(qy4 qy4Var, ez4 ez4Var) {
        return (np4) sz4.C(zzf, qy4Var, ez4Var);
    }

    public static mp4 i0() {
        return (mp4) zzf.P();
    }

    public static np4 j0() {
        return zzf;
    }

    public static d15 k0() {
        return zzf.p();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new np4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new mp4(bArr);
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
        synchronized (np4.class) {
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

    public final int d0() {
        return this.zzb;
    }

    public final jp4 e0() {
        jp4 jp4Var = this.zzc;
        return jp4Var == null ? jp4.h0() : jp4Var;
    }

    public final qy4 f0() {
        return this.zzd;
    }

    public final qy4 g0() {
        return this.zze;
    }

    final /* synthetic */ void l0(int i7) {
        this.zzb = 0;
    }

    final /* synthetic */ void m0(jp4 jp4Var) {
        jp4Var.getClass();
        this.zzc = jp4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void n0(qy4 qy4Var) {
        this.zzd = qy4Var;
    }

    final /* synthetic */ void o0(qy4 qy4Var) {
        this.zze = qy4Var;
    }
}
