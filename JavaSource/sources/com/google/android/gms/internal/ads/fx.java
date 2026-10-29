package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class fx extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final fx zzl;
    private static volatile d15 zzm;
    private int zzf;
    private String zzg = "";
    private b05 zzh = sz4.y();
    private int zzi = 1000;
    private int zzj = 1000;
    private int zzk = 1000;

    static {
        fx fxVar = new fx();
        zzl = fxVar;
        sz4.U(fx.class, fxVar);
    }

    private fx() {
    }

    public static fx d0() {
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void e0(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", bx.class, "zzi", ox.d(), "zzj", ox.d(), "zzk", ox.d()});
        }
        if (ordinal == 3) {
            return new fx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ex(bArr);
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
        synchronized (fx.class) {
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
