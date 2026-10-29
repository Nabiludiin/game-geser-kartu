package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class jj extends sz4 implements x05 {
    private static final jj zzo;
    private static volatile d15 zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private b05 zzm = sz4.y();

    static {
        jj jjVar = new jj();
        zzo = jjVar;
        sz4.U(jj.class, jjVar);
    }

    private jj() {
    }

    public static fj d0() {
        return (fj) zzo.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", hj.class, "zzn", ij.f10061a});
        }
        if (ordinal == 3) {
            return new jj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new fj(bArr);
        }
        if (ordinal == 5) {
            return zzo;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzp;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (jj.class) {
            try {
                d15Var = zzp;
                if (d15Var == null) {
                    d15Var = new pz4(zzo);
                    zzp = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    final /* synthetic */ void e0(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
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

    final /* synthetic */ void i0(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    final /* synthetic */ void j0(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    final /* synthetic */ void l0(int i7) {
        this.zzn = i7 - 1;
        this.zza |= 2048;
    }
}
