package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class bo4 extends sz4 implements x05 {
    private static final bo4 zzd;
    private static volatile d15 zze;
    private String zza = "";
    private qy4 zzb = qy4.f14669r;
    private int zzc;

    static {
        bo4 bo4Var = new bo4();
        zzd = bo4Var;
        sz4.U(bo4.class, bo4Var);
    }

    private bo4() {
    }

    public static bo4 g0(byte[] bArr, ez4 ez4Var) {
        return (bo4) sz4.E(zzd, bArr, ez4Var);
    }

    public static zn4 h0() {
        return (zn4) zzd.P();
    }

    public static bo4 i0() {
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
            return new bo4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zn4(bArr);
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
        synchronized (bo4.class) {
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

    public final uo4 f0() {
        uo4 c8 = uo4.c(this.zzc);
        return c8 == null ? uo4.UNRECOGNIZED : c8;
    }

    final /* synthetic */ void j0(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void k0(qy4 qy4Var) {
        qy4Var.getClass();
        this.zzb = qy4Var;
    }

    final /* synthetic */ void l0(uo4 uo4Var) {
        this.zzc = uo4Var.a();
    }
}
