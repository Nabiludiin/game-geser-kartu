package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class to4 extends sz4 implements x05 {
    private static final to4 zzd;
    private static volatile d15 zze;
    private int zza;
    private String zzb = "";
    private bo4 zzc;

    static {
        to4 to4Var = new to4();
        zzd = to4Var;
        sz4.U(to4.class, to4Var);
    }

    private to4() {
    }

    public static to4 f0(qy4 qy4Var, ez4 ez4Var) {
        return (to4) sz4.C(zzd, qy4Var, ez4Var);
    }

    public static so4 g0() {
        return (so4) zzd.P();
    }

    public static to4 h0() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new to4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new so4(bArr);
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
        synchronized (to4.class) {
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

    public final String d0() {
        return this.zzb;
    }

    public final bo4 e0() {
        bo4 bo4Var = this.zzc;
        return bo4Var == null ? bo4.i0() : bo4Var;
    }

    final /* synthetic */ void i0(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void j0(bo4 bo4Var) {
        bo4Var.getClass();
        this.zzc = bo4Var;
        this.zza |= 1;
    }
}
