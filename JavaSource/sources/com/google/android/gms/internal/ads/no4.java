package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class no4 extends sz4 implements x05 {
    private static final no4 zzd;
    private static volatile d15 zze;
    private int zza;
    private int zzb;
    private po4 zzc;

    static {
        no4 no4Var = new no4();
        zzd = no4Var;
        sz4.U(no4.class, no4Var);
    }

    private no4() {
    }

    public static no4 f0(qy4 qy4Var, ez4 ez4Var) {
        return (no4) sz4.C(zzd, qy4Var, ez4Var);
    }

    public static mo4 g0() {
        return (mo4) zzd.P();
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
            return new no4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new mo4(bArr);
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
        synchronized (no4.class) {
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

    public final po4 e0() {
        po4 po4Var = this.zzc;
        return po4Var == null ? po4.g0() : po4Var;
    }

    final /* synthetic */ void i0(po4 po4Var) {
        po4Var.getClass();
        this.zzc = po4Var;
        this.zza |= 1;
    }
}
