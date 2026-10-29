package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class tp4 extends sz4 implements x05 {
    private static final tp4 zzb;
    private static volatile d15 zzc;
    private int zza;

    static {
        tp4 tp4Var = new tp4();
        zzb = tp4Var;
        sz4.U(tp4.class, tp4Var);
    }

    private tp4() {
    }

    public static sp4 e0() {
        return (sp4) zzb.P();
    }

    public static tp4 f0() {
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
            return new tp4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new sp4(bArr);
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
        synchronized (tp4.class) {
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
