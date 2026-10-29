package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class mw4 extends sz4 implements x05 {
    private static final mw4 zzf;
    private static volatile d15 zzg;
    private int zza;
    private qy4 zzb = qy4.f14669r;
    private String zzc = "";
    private b05 zzd = sz4.y();
    private boolean zze;

    static {
        mw4 mw4Var = new mw4();
        zzf = mw4Var;
        sz4.U(mw4.class, mw4Var);
    }

    private mw4() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (ordinal == 3) {
            return new mw4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new lw4(bArr);
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
        synchronized (mw4.class) {
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
