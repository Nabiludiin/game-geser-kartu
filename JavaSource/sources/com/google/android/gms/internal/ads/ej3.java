package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ej3 extends sz4 implements x05 {
    private static final ej3 zzf;
    private static volatile d15 zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = 60000;

    static {
        ej3 ej3Var = new ej3();
        zzf = ej3Var;
        sz4.U(ej3.class, ej3Var);
    }

    private ej3() {
    }

    public static dj3 h0() {
        return (dj3) zzf.P();
    }

    public static ej3 i0() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new ej3();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new dj3(bArr);
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
        synchronized (ej3.class) {
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

    public final String d0() {
        return this.zzb;
    }

    public final float e0() {
        return this.zzc;
    }

    public final long f0() {
        return this.zzd;
    }

    public final long g0() {
        return this.zze;
    }

    final /* synthetic */ void j0(float f8) {
        this.zza |= 2;
        this.zzc = f8;
    }
}
