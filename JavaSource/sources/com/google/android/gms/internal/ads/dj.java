package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class dj extends sz4 implements x05 {
    private static final dj zzn;
    private static volatile d15 zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private b05 zzb = sz4.y();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    static {
        dj djVar = new dj();
        zzn = djVar;
        sz4.U(dj.class, djVar);
    }

    private dj() {
    }

    public static cj d0() {
        return (cj) zzn.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", vj.class, "zzc", "zzd", "zze", "zzf", "zzg", tj.f16218a, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new dj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new cj(bArr);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzo;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (dj.class) {
            try {
                d15Var = zzo;
                if (d15Var == null) {
                    d15Var = new pz4(zzn);
                    zzo = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    final /* synthetic */ void e0(vj vjVar) {
        vjVar.getClass();
        b05 b05Var = this.zzb;
        if (!b05Var.a()) {
            this.zzb = sz4.z(b05Var);
        }
        this.zzb.add(vjVar);
    }

    final /* synthetic */ void f0() {
        this.zzb = sz4.y();
    }

    final /* synthetic */ void g0(long j7) {
        this.zza |= 1;
        this.zzc = j7;
    }

    final /* synthetic */ void h0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    final /* synthetic */ void i0(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    final /* synthetic */ void j0(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    final /* synthetic */ void k0(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    final /* synthetic */ void l0(long j7) {
        this.zza |= 64;
        this.zzi = j7;
    }

    final /* synthetic */ void m0(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    final /* synthetic */ void n0(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    final /* synthetic */ void o0(long j7) {
        this.zza |= 512;
        this.zzl = j7;
    }

    final /* synthetic */ void p0(long j7) {
        this.zza |= 1024;
        this.zzm = j7;
    }

    final /* synthetic */ void r0(int i7) {
        this.zzg = i7 - 1;
        this.zza |= 16;
    }
}
