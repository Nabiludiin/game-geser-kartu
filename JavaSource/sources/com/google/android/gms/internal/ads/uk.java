package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class uk extends sz4 implements x05 {
    private static final uk zzA;
    private static volatile d15 zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        uk ukVar = new uk();
        zzA = ukVar;
        sz4.U(uk.class, ukVar);
    }

    private uk() {
    }

    public static tk d0() {
        return (tk) zzA.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            wz4 wz4Var = gl.f9001a;
            return sz4.V(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", wz4Var, "zzi", "zzj", "zzk", "zzl", wz4Var, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (ordinal == 3) {
            return new uk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new tk(bArr);
        }
        if (ordinal == 5) {
            return zzA;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzB;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (uk.class) {
            try {
                d15Var = zzB;
                if (d15Var == null) {
                    d15Var = new pz4(zzA);
                    zzB = d15Var;
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

    final /* synthetic */ void g0(long j7) {
        this.zza |= 4;
        this.zzd = j7;
    }

    final /* synthetic */ void h0(long j7) {
        this.zza |= 8;
        this.zze = j7;
    }

    final /* synthetic */ void i0() {
        this.zza &= -9;
        this.zze = -1L;
    }

    final /* synthetic */ void j0(long j7) {
        this.zza |= 16;
        this.zzf = j7;
    }

    final /* synthetic */ void k0(long j7) {
        this.zza |= 32;
        this.zzg = j7;
    }

    final /* synthetic */ void l0(long j7) {
        this.zza |= 128;
        this.zzi = j7;
    }

    final /* synthetic */ void m0(long j7) {
        this.zza |= 256;
        this.zzj = j7;
    }

    final /* synthetic */ void n0(long j7) {
        this.zza |= 512;
        this.zzk = j7;
    }

    final /* synthetic */ void o0(long j7) {
        this.zza |= 2048;
        this.zzm = j7;
    }

    final /* synthetic */ void p0(long j7) {
        this.zza |= 4096;
        this.zzn = j7;
    }

    final /* synthetic */ void q0(long j7) {
        this.zza |= 8192;
        this.zzo = j7;
    }

    final /* synthetic */ void r0(long j7) {
        this.zza |= 16384;
        this.zzp = j7;
    }

    final /* synthetic */ void s0(long j7) {
        this.zza |= 32768;
        this.zzu = j7;
    }

    final /* synthetic */ void t0(long j7) {
        this.zza |= 65536;
        this.zzv = j7;
    }

    final /* synthetic */ void u0(long j7) {
        this.zza |= 131072;
        this.zzw = j7;
    }

    final /* synthetic */ void v0(long j7) {
        this.zza |= 262144;
        this.zzx = j7;
    }

    final /* synthetic */ void x0(int i7) {
        this.zzh = i7 - 1;
        this.zza |= 64;
    }

    final /* synthetic */ void y0(int i7) {
        this.zzl = i7 - 1;
        this.zza |= 1024;
    }
}
