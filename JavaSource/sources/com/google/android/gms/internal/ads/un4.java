package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class un4 extends sz4 implements x05 {
    private static final un4 zzc;
    private static volatile d15 zzd;
    private int zza;
    private int zzb;

    static {
        un4 un4Var = new un4();
        zzc = un4Var;
        sz4.U(un4.class, un4Var);
    }

    private un4() {
    }

    public static tn4 f0() {
        return (tn4) zzc.P();
    }

    public static un4 g0() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new un4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new tn4(bArr);
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
        synchronized (un4.class) {
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

    public final on4 d0() {
        on4 c8 = on4.c(this.zza);
        return c8 == null ? on4.UNRECOGNIZED : c8;
    }

    public final int e0() {
        return this.zzb;
    }

    final /* synthetic */ void h0(on4 on4Var) {
        this.zza = on4Var.a();
    }

    final /* synthetic */ void i0(int i7) {
        this.zzb = i7;
    }
}
