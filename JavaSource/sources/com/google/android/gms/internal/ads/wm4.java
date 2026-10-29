package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class wm4 extends sz4 implements x05 {
    private static final wm4 zza;
    private static volatile d15 zzb;

    static {
        wm4 wm4Var = new wm4();
        zza = wm4Var;
        sz4.U(wm4.class, wm4Var);
    }

    private wm4() {
    }

    public static wm4 d0(qy4 qy4Var, ez4 ez4Var) {
        return (wm4) sz4.C(zza, qy4Var, ez4Var);
    }

    public static wm4 e0() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (ordinal == 2) {
            return sz4.V(zza, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new wm4();
        }
        if (ordinal == 4) {
            return new vm4(bArr);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzb;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (wm4.class) {
            try {
                d15Var = zzb;
                if (d15Var == null) {
                    d15Var = new pz4(zza);
                    zzb = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
