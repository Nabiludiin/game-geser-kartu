package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class xn4 extends sz4 implements x05 {
    private static final xn4 zzd;
    private static volatile d15 zze;
    private String zza = "";
    private qy4 zzb = qy4.f14669r;
    private int zzc;

    static {
        xn4 xn4Var = new xn4();
        zzd = xn4Var;
        sz4.U(xn4.class, xn4Var);
    }

    private xn4() {
    }

    public static vn4 g0() {
        return (vn4) zzd.P();
    }

    public static xn4 h0() {
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
            return sz4.V(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new xn4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new vn4(bArr);
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
        synchronized (xn4.class) {
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
        return this.zza;
    }

    public final qy4 e0() {
        return this.zzb;
    }

    public final wn4 f0() {
        int i7 = this.zzc;
        wn4 wn4Var = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? null : wn4.REMOTE : wn4.ASYMMETRIC_PUBLIC : wn4.ASYMMETRIC_PRIVATE : wn4.SYMMETRIC : wn4.UNKNOWN_KEYMATERIAL;
        return wn4Var == null ? wn4.UNRECOGNIZED : wn4Var;
    }

    final /* synthetic */ void i0(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void j0(qy4 qy4Var) {
        qy4Var.getClass();
        this.zzb = qy4Var;
    }

    final /* synthetic */ void k0(wn4 wn4Var) {
        this.zzc = wn4Var.a();
    }
}
