package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class t55 extends sz4 implements x05 {
    private static final t55 zzf;
    private static volatile d15 zzg;
    private int zza;
    private String zzb = "";
    private b05 zzc = sz4.y();
    private b05 zzd = sz4.y();
    private String zze = "";

    static {
        t55 t55Var = new t55();
        zzf = t55Var;
        sz4.U(t55.class, t55Var);
    }

    private t55() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new t55();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new s55(bArr);
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
        synchronized (t55.class) {
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
}
