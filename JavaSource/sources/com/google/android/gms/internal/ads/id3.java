package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class id3 extends sz4 implements x05 {
    private static final id3 zzf;
    private static volatile d15 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private fd3 zze;

    static {
        id3 id3Var = new id3();
        zzf = id3Var;
        sz4.U(id3.class, id3Var);
    }

    private id3() {
    }

    public static gd3 d0() {
        return (gd3) zzf.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", hd3.f9450a, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new id3();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new gd3(bArr);
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
        synchronized (id3.class) {
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
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void f0(fd3 fd3Var) {
        fd3Var.getClass();
        this.zze = fd3Var;
        this.zza |= 8;
    }

    final /* synthetic */ void h0(int i7) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
