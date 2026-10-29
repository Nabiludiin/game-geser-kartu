package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class kn4 extends sz4 implements x05 {
    private static final kn4 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb;
    private qy4 zzc = qy4.f14669r;
    private mn4 zzd;

    static {
        kn4 kn4Var = new kn4();
        zze = kn4Var;
        sz4.U(kn4.class, kn4Var);
    }

    private kn4() {
    }

    public static kn4 g0(qy4 qy4Var, ez4 ez4Var) {
        return (kn4) sz4.C(zze, qy4Var, ez4Var);
    }

    public static jn4 h0() {
        return (jn4) zze.P();
    }

    public static d15 i0() {
        return zze.p();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new kn4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new jn4(bArr);
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
        synchronized (kn4.class) {
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

    public final qy4 e0() {
        return this.zzc;
    }

    public final mn4 f0() {
        mn4 mn4Var = this.zzd;
        return mn4Var == null ? mn4.h0() : mn4Var;
    }

    final /* synthetic */ void j0(qy4 qy4Var) {
        this.zzc = qy4Var;
    }

    final /* synthetic */ void k0(mn4 mn4Var) {
        mn4Var.getClass();
        this.zzd = mn4Var;
        this.zza |= 1;
    }
}
