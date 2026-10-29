package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class l35 extends sz4 implements x05 {
    private static final l35 zzd;
    private static volatile d15 zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        l35 l35Var = new l35();
        zzd = l35Var;
        sz4.U(l35.class, l35Var);
    }

    private l35() {
    }

    public static k35 d0() {
        return (k35) zzd.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new l35();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new k35(bArr);
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
        synchronized (l35.class) {
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

    final /* synthetic */ void e0(int i7) {
        this.zza = i7;
    }

    final /* synthetic */ void f0(long j7) {
        this.zzb = j7;
    }

    final /* synthetic */ void g0(long j7) {
        this.zzc = j7;
    }
}
