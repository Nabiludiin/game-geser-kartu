package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class sm4 extends sz4 implements x05 {
    private static final sm4 zzc;
    private static volatile d15 zzd;
    private int zza;
    private int zzb;

    static {
        sm4 sm4Var = new sm4();
        zzc = sm4Var;
        sz4.U(sm4.class, sm4Var);
    }

    private sm4() {
    }

    public static sm4 f0(qy4 qy4Var, ez4 ez4Var) {
        return (sm4) sz4.C(zzc, qy4Var, ez4Var);
    }

    public static rm4 g0() {
        return (rm4) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (ordinal == 3) {
            return new sm4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new rm4(bArr);
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
        synchronized (sm4.class) {
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

    public final int e0() {
        return this.zzb;
    }

    final /* synthetic */ void h0(int i7) {
        this.zza = i7;
    }
}
