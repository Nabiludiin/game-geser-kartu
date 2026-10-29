package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class wk extends sz4 implements x05 {
    private static final wk zzj;
    private static volatile d15 zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        wk wkVar = new wk();
        zzj = wkVar;
        sz4.U(wk.class, wkVar);
    }

    private wk() {
    }

    public static vk d0() {
        return (vk) zzj.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new wk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new vk(bArr);
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
        synchronized (wk.class) {
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

    final /* synthetic */ void e0(long j7) {
        this.zza |= 1;
        this.zzb = j7;
    }

    final /* synthetic */ void f0(long j7) {
        this.zza |= 4;
        this.zzd = j7;
    }

    final /* synthetic */ void g0(long j7) {
        this.zza |= 8;
        this.zze = j7;
    }

    final /* synthetic */ void h0(long j7) {
        this.zza |= 16;
        this.zzf = j7;
    }

    final /* synthetic */ void i0(long j7) {
        this.zza |= 32;
        this.zzg = j7;
    }
}
