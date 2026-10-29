package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class il extends sz4 implements x05 {
    private static final il zzh;
    private static volatile d15 zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    static {
        il ilVar = new il();
        zzh = ilVar;
        sz4.U(il.class, ilVar);
    }

    private il() {
    }

    public static hl d0() {
        return (hl) zzh.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new il();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new hl(bArr);
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
        synchronized (il.class) {
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

    final /* synthetic */ void e0(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void f0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void g0(long j7) {
        this.zza |= 4;
        this.zzd = j7;
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

    final /* synthetic */ void j0(long j7) {
        this.zza |= 32;
        this.zzg = j7;
    }
}
