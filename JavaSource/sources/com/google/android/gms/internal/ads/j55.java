package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class j55 extends sz4 implements x05 {
    private static final j55 zzf;
    private static volatile d15 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private qy4 zzd;
    private qy4 zze;

    static {
        j55 j55Var = new j55();
        zzf = j55Var;
        sz4.U(j55.class, j55Var);
    }

    private j55() {
        qy4 qy4Var = qy4.f14669r;
        this.zzd = qy4Var;
        this.zze = qy4Var;
    }

    public static h55 d0() {
        return (h55) zzf.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", i55.f9844a, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new j55();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new h55(bArr);
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
        synchronized (j55.class) {
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

    final /* synthetic */ void e0(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    final /* synthetic */ void f0(qy4 qy4Var) {
        qy4Var.getClass();
        this.zza |= 4;
        this.zzd = qy4Var;
    }

    final /* synthetic */ void h0(int i7) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
