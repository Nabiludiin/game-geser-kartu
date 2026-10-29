package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class dn4 extends sz4 implements x05 {
    private static final dn4 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb;
    private fn4 zzc;
    private qy4 zzd = qy4.f14669r;

    static {
        dn4 dn4Var = new dn4();
        zze = dn4Var;
        sz4.U(dn4.class, dn4Var);
    }

    private dn4() {
    }

    public static dn4 g0(qy4 qy4Var, ez4 ez4Var) {
        return (dn4) sz4.C(zze, qy4Var, ez4Var);
    }

    public static cn4 h0() {
        return (cn4) zze.P();
    }

    public static d15 i0() {
        return zze.p();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new dn4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new cn4(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzf;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (dn4.class) {
            try {
                d15Var = zzf;
                if (d15Var == null) {
                    d15Var = new pz4(zze);
                    zzf = d15Var;
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

    public final fn4 e0() {
        fn4 fn4Var = this.zzc;
        return fn4Var == null ? fn4.j0() : fn4Var;
    }

    public final qy4 f0() {
        return this.zzd;
    }

    final /* synthetic */ void j0(fn4 fn4Var) {
        fn4Var.getClass();
        this.zzc = fn4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void k0(qy4 qy4Var) {
        this.zzd = qy4Var;
    }
}
