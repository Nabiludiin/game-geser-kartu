package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class p53 extends sz4 implements x05 {
    private static final p53 zzc;
    private static volatile d15 zzd;
    private int zza;
    private long zzb;

    static {
        p53 p53Var = new p53();
        zzc = p53Var;
        sz4.U(p53.class, p53Var);
    }

    private p53() {
    }

    public static o53 d0() {
        return (o53) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new p53();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new o53(bArr);
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
        synchronized (p53.class) {
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

    final /* synthetic */ void e0(long j7) {
        this.zzb = j7;
    }

    final /* synthetic */ void g0(int i7) {
        this.zza = i7 - 2;
    }
}
