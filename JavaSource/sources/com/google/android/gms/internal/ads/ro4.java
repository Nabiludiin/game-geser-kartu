package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ro4 extends sz4 implements x05 {
    private static final ro4 zzd;
    private static volatile d15 zze;
    private int zza;
    private int zzb;
    private to4 zzc;

    static {
        ro4 ro4Var = new ro4();
        zzd = ro4Var;
        sz4.U(ro4.class, ro4Var);
    }

    private ro4() {
    }

    public static ro4 f0(qy4 qy4Var, ez4 ez4Var) {
        return (ro4) sz4.C(zzd, qy4Var, ez4Var);
    }

    public static qo4 g0() {
        return (qo4) zzd.P();
    }

    public static d15 h0() {
        return zzd.p();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new ro4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new qo4(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zze;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (ro4.class) {
            try {
                d15Var = zze;
                if (d15Var == null) {
                    d15Var = new pz4(zzd);
                    zze = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final int d0() {
        return this.zzb;
    }

    public final to4 e0() {
        to4 to4Var = this.zzc;
        return to4Var == null ? to4.h0() : to4Var;
    }

    final /* synthetic */ void i0(to4 to4Var) {
        to4Var.getClass();
        this.zzc = to4Var;
        this.zza |= 1;
    }
}
