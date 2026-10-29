package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class wo4 extends sz4 implements x05 {
    public static final /* synthetic */ int zza = 0;
    private static final wo4 zzd;
    private static volatile d15 zze;
    private String zzb = "";
    private b05 zzc = sz4.y();

    static {
        wo4 wo4Var = new wo4();
        zzd = wo4Var;
        sz4.U(wo4.class, wo4Var);
    }

    private wo4() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", do4.class});
        }
        if (ordinal == 3) {
            return new wo4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new vo4(bArr);
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
        synchronized (wo4.class) {
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
}
