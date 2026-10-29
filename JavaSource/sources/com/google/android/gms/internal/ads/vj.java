package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class vj extends sz4 implements x05 {
    private static final vj zzi;
    private static volatile d15 zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        vj vjVar = new vj();
        zzi = vjVar;
        sz4.U(vj.class, vjVar);
    }

    private vj() {
    }

    public static uj d0() {
        return (uj) zzi.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", wj.f18261a, "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new vj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new uj(bArr);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzj;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (vj.class) {
            try {
                d15Var = zzj;
                if (d15Var == null) {
                    d15Var = new pz4(zzi);
                    zzj = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    final /* synthetic */ void e0(long j7) {
        this.zza |= 1;
        this.zzb = j7;
    }

    final /* synthetic */ void f0(long j7) {
        this.zza |= 2;
        this.zzc = j7;
    }

    final /* synthetic */ void g0(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void h0(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    final /* synthetic */ void i0(long j7) {
        this.zza |= 32;
        this.zzg = j7;
    }

    final /* synthetic */ void j0(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    final /* synthetic */ void l0(int i7) {
        this.zzd = i7 - 1;
        this.zza |= 4;
    }
}
