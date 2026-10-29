package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ko4 extends sz4 implements x05 {
    private static final ko4 zze;
    private static volatile d15 zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        ko4 ko4Var = new ko4();
        zze = ko4Var;
        sz4.U(ko4.class, ko4Var);
    }

    private ko4() {
    }

    public static jo4 d0() {
        return (jo4) zze.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new ko4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new jo4(bArr);
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
        synchronized (ko4.class) {
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

    final /* synthetic */ void e0(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void f0(int i7) {
        this.zzc = i7;
    }

    final /* synthetic */ void g0(uo4 uo4Var) {
        this.zzd = uo4Var.a();
    }

    final /* synthetic */ void i0(int i7) {
        this.zzb = yn4.a(i7);
    }
}
