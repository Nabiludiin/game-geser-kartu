package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class fd3 extends sz4 implements x05 {
    private static final fd3 zzf;
    private static volatile d15 zzg;
    private int zza;
    private xz4 zzb = sz4.u();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        fd3 fd3Var = new fd3();
        zzf = fd3Var;
        sz4.U(fd3.class, fd3Var);
    }

    private fd3() {
    }

    public static ed3 d0() {
        return (ed3) zzf.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", dd3.f7062a, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new fd3();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ed3(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzg;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (fd3.class) {
            try {
                d15Var = zzg;
                if (d15Var == null) {
                    d15Var = new pz4(zzf);
                    zzg = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    final /* synthetic */ void e0(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    final /* synthetic */ void g0(int i7) {
        xz4 xz4Var = this.zzb;
        if (!xz4Var.a()) {
            this.zzb = sz4.v(xz4Var);
        }
        this.zzb.I(2);
    }
}
