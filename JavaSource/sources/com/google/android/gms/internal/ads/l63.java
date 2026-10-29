package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class l63 extends sz4 implements x05 {
    private static final l63 zzb;
    private static volatile d15 zzc;
    private b05 zza = sz4.y();

    static {
        l63 l63Var = new l63();
        zzb = l63Var;
        sz4.U(l63.class, l63Var);
    }

    private l63() {
    }

    public static i63 e0() {
        return (i63) zzb.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", k63.class});
        }
        if (ordinal == 3) {
            return new l63();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new i63(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzc;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (l63.class) {
            try {
                d15Var = zzc;
                if (d15Var == null) {
                    d15Var = new pz4(zzb);
                    zzc = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final int d0() {
        return this.zza.size();
    }

    final /* synthetic */ void f0(k63 k63Var) {
        k63Var.getClass();
        b05 b05Var = this.zza;
        if (!b05Var.a()) {
            this.zza = sz4.z(b05Var);
        }
        this.zza.add(k63Var);
    }

    final /* synthetic */ void g0() {
        this.zza = sz4.y();
    }
}
