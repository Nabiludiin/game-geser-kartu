package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class mn4 extends sz4 implements x05 {
    private static final mn4 zzc;
    private static volatile d15 zzd;
    private int zza;
    private qy4 zzb = qy4.f14669r;

    static {
        mn4 mn4Var = new mn4();
        zzc = mn4Var;
        sz4.U(mn4.class, mn4Var);
    }

    private mn4() {
    }

    public static mn4 f0(qy4 qy4Var, ez4 ez4Var) {
        return (mn4) sz4.C(zzc, qy4Var, ez4Var);
    }

    public static ln4 g0() {
        return (ln4) zzc.P();
    }

    public static mn4 h0() {
        return zzc;
    }

    public static d15 i0() {
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
            return new mn4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ln4(bArr);
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
        synchronized (mn4.class) {
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

    final /* synthetic */ void j0(qy4 qy4Var) {
        this.zzb = qy4Var;
    }
}
