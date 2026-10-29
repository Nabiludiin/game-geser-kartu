package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ap4 extends sz4 implements x05 {
    private static final ap4 zzb;
    private static volatile d15 zzc;
    private int zza;

    static {
        ap4 ap4Var = new ap4();
        zzb = ap4Var;
        sz4.U(ap4.class, ap4Var);
    }

    private ap4() {
    }

    public static zo4 e0() {
        return (zo4) zzb.P();
    }

    public static ap4 f0() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new ap4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zo4(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzc;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (ap4.class) {
            try {
                d15Var = zzc;
                if (d15Var == null) {
                    d15Var = new pz4(zzb);
                    zzc = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final on4 d0() {
        on4 c8 = on4.c(this.zza);
        return c8 == null ? on4.UNRECOGNIZED : c8;
    }

    final /* synthetic */ void g0(on4 on4Var) {
        this.zza = on4Var.a();
    }
}
