package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class lo4 extends sz4 implements x05 {
    private static final lo4 zzc;
    private static volatile d15 zzd;
    private int zza;
    private b05 zzb = sz4.y();

    static {
        lo4 lo4Var = new lo4();
        zzc = lo4Var;
        sz4.U(lo4.class, lo4Var);
    }

    private lo4() {
    }

    public static io4 d0() {
        return (io4) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", ko4.class});
        }
        if (ordinal == 3) {
            return new lo4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new io4(bArr);
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
        synchronized (lo4.class) {
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

    final /* synthetic */ void e0(int i7) {
        this.zza = i7;
    }

    final /* synthetic */ void f0(ko4 ko4Var) {
        ko4Var.getClass();
        b05 b05Var = this.zzb;
        if (!b05Var.a()) {
            this.zzb = sz4.z(b05Var);
        }
        this.zzb.add(ko4Var);
    }
}
