package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class i75 extends sz4 implements x05 {
    private static final i75 zzl;
    private static volatile d15 zzm;
    private int zza;
    private long zzd;
    private k75 zzi;
    private m75 zzj;
    private mw4 zzk;
    private qy4 zzb = qy4.f14669r;
    private xz4 zzc = sz4.u();
    private xz4 zze = sz4.u();
    private b05 zzf = sz4.y();
    private String zzg = "";
    private b05 zzh = sz4.y();

    static {
        i75 i75Var = new i75();
        zzl = i75Var;
        sz4.U(i75.class, i75Var);
    }

    private i75() {
    }

    public static i75 d0(byte[] bArr, ez4 ez4Var) {
        return (i75) sz4.E(zzl, bArr, ez4Var);
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", w65.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (ordinal == 3) {
            return new i75();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new h75(bArr);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzm;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (i75.class) {
            try {
                d15Var = zzm;
                if (d15Var == null) {
                    d15Var = new pz4(zzl);
                    zzm = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
