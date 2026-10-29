package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class mm4 extends sz4 implements x05 {
    private static final mm4 zzc;
    private static volatile d15 zzd;
    private int zza;
    private qy4 zzb = qy4.f14669r;

    static {
        mm4 mm4Var = new mm4();
        zzc = mm4Var;
        sz4.U(mm4.class, mm4Var);
    }

    private mm4() {
    }

    public static mm4 f0(qy4 qy4Var, ez4 ez4Var) {
        return (mm4) sz4.C(zzc, qy4Var, ez4Var);
    }

    public static lm4 g0() {
        return (lm4) zzc.P();
    }

    public static d15 h0() {
        return zzc.p();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new mm4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new lm4(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzd;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (mm4.class) {
            try {
                d15Var = zzd;
                if (d15Var == null) {
                    d15Var = new pz4(zzc);
                    zzd = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final int d0() {
        return this.zza;
    }

    public final qy4 e0() {
        return this.zzb;
    }

    final /* synthetic */ void i0(qy4 qy4Var) {
        this.zzb = qy4Var;
    }
}
