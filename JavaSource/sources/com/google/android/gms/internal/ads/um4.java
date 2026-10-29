package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class um4 extends sz4 implements x05 {
    private static final um4 zzc;
    private static volatile d15 zzd;
    private int zza;
    private qy4 zzb = qy4.f14669r;

    static {
        um4 um4Var = new um4();
        zzc = um4Var;
        sz4.U(um4.class, um4Var);
    }

    private um4() {
    }

    public static um4 f0(qy4 qy4Var, ez4 ez4Var) {
        return (um4) sz4.C(zzc, qy4Var, ez4Var);
    }

    public static tm4 g0() {
        return (tm4) zzc.P();
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
            return sz4.V(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new um4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new tm4(bArr);
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
        synchronized (um4.class) {
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
