package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class n35 extends sz4 implements x05 {
    private static final n35 zzb;
    private static volatile d15 zzc;
    private b05 zza = sz4.y();

    static {
        n35 n35Var = new n35();
        zzb = n35Var;
        sz4.U(n35.class, n35Var);
    }

    private n35() {
    }

    public static m35 d0() {
        return (m35) zzb.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", l35.class});
        }
        if (ordinal == 3) {
            return new n35();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new m35(bArr);
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
        synchronized (n35.class) {
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

    final /* synthetic */ void e0(l35 l35Var) {
        l35Var.getClass();
        b05 b05Var = this.zza;
        if (!b05Var.a()) {
            this.zza = sz4.z(b05Var);
        }
        this.zza.add(l35Var);
    }
}
