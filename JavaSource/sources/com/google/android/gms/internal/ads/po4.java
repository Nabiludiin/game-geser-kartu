package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class po4 extends sz4 implements x05 {
    private static final po4 zzb;
    private static volatile d15 zzc;
    private String zza = "";

    static {
        po4 po4Var = new po4();
        zzb = po4Var;
        sz4.U(po4.class, po4Var);
    }

    private po4() {
    }

    public static po4 e0(qy4 qy4Var, ez4 ez4Var) {
        return (po4) sz4.C(zzb, qy4Var, ez4Var);
    }

    public static oo4 f0() {
        return (oo4) zzb.P();
    }

    public static po4 g0() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new po4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new oo4(bArr);
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
        synchronized (po4.class) {
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

    public final String d0() {
        return this.zza;
    }

    final /* synthetic */ void h0(String str) {
        str.getClass();
        this.zza = str;
    }
}
