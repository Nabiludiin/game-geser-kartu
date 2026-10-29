package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class nk3 extends sz4 implements x05 {
    private static final nk3 zzd;
    private static volatile d15 zze;
    private int zza;
    private b05 zzb = sz4.y();
    private b35 zzc;

    static {
        nk3 nk3Var = new nk3();
        zzd = nk3Var;
        sz4.U(nk3.class, nk3Var);
    }

    private nk3() {
    }

    public static mk3 d0() {
        return (mk3) zzd.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", lk3.class, "zzc"});
        }
        if (ordinal == 3) {
            return new nk3();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new mk3(bArr);
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
        synchronized (nk3.class) {
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

    final /* synthetic */ void e0(lk3 lk3Var) {
        lk3Var.getClass();
        b05 b05Var = this.zzb;
        if (!b05Var.a()) {
            this.zzb = sz4.z(b05Var);
        }
        this.zzb.add(lk3Var);
    }

    final /* synthetic */ void f0(b35 b35Var) {
        b35Var.getClass();
        this.zzc = b35Var;
        this.zza |= 1;
    }
}
