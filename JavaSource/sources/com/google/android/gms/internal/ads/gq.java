package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class gq extends sz4 implements x05 {
    private static final gq zzh;
    private static volatile d15 zzi;
    private int zza;
    private long zzc;
    private long zzf;
    private qy4 zzb = qy4.f14669r;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        gq gqVar = new gq();
        zzh = gqVar;
        sz4.U(gq.class, gqVar);
    }

    private gq() {
    }

    public static fq d0() {
        return (fq) zzh.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new gq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new fq(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzi;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (gq.class) {
            try {
                d15Var = zzi;
                if (d15Var == null) {
                    d15Var = new pz4(zzh);
                    zzi = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    final /* synthetic */ void e0(qy4 qy4Var) {
        this.zza |= 1;
        this.zzb = qy4Var;
    }

    final /* synthetic */ void f0(long j7) {
        this.zza |= 2;
        this.zzc = j7;
    }

    final /* synthetic */ void g0(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void h0(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void i0(long j7) {
        this.zza |= 16;
        this.zzf = j7;
    }

    final /* synthetic */ void j0(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }
}
