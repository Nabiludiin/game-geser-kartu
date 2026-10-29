package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class tl4 extends sz4 implements x05 {
    private static final tl4 zzb;
    private static volatile d15 zzc;
    private int zza;

    static {
        tl4 tl4Var = new tl4();
        zzb = tl4Var;
        sz4.U(tl4.class, tl4Var);
    }

    private tl4() {
    }

    public static sl4 e0() {
        return (sl4) zzb.P();
    }

    public static tl4 f0() {
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
            return sz4.V(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new tl4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new sl4(bArr);
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
        synchronized (tl4.class) {
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

    public final int d0() {
        return this.zza;
    }

    final /* synthetic */ void g0(int i7) {
        this.zza = i7;
    }
}
