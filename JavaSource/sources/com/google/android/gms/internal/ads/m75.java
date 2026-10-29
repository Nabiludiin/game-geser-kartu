package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class m75 extends sz4 implements x05 {
    private static final m75 zzf;
    private static volatile d15 zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private b05 zze = sz4.y();

    static {
        m75 m75Var = new m75();
        zzf = m75Var;
        sz4.U(m75.class, m75Var);
    }

    private m75() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new m75();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new l75(bArr);
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
        synchronized (m75.class) {
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
