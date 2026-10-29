package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class z35 extends sz4 implements x05 {
    private static final z35 zzc;
    private static volatile d15 zzd;
    private int zza;
    private String zzb = "";

    static {
        z35 z35Var = new z35();
        zzc = z35Var;
        sz4.U(z35.class, z35Var);
    }

    private z35() {
    }

    public static y35 d0() {
        return (y35) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new z35();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new y35(bArr);
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
        synchronized (z35.class) {
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

    final /* synthetic */ void e0(String str) {
        this.zza |= 1;
        this.zzb = str;
    }
}
