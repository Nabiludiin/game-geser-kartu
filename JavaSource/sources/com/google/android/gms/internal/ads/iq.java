package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class iq extends sz4 implements x05 {
    private static final iq zzc;
    private static volatile d15 zzd;
    private int zza;
    private qq zzb;

    static {
        iq iqVar = new iq();
        zzc = iqVar;
        sz4.U(iq.class, iqVar);
    }

    private iq() {
    }

    public static iq e0(byte[] bArr, ez4 ez4Var) {
        return (iq) sz4.E(zzc, bArr, ez4Var);
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new iq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new hq(bArr);
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
        synchronized (iq.class) {
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

    public final qq d0() {
        qq qqVar = this.zzb;
        return qqVar == null ? qq.h0() : qqVar;
    }
}
