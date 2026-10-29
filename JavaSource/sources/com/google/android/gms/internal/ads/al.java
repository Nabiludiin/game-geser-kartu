package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class al extends sz4 implements x05 {
    private static final al zzl;
    private static volatile d15 zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private xz4 zze = sz4.u();
    private b05 zzh = sz4.y();

    static {
        al alVar = new al();
        zzl = alVar;
        sz4.U(al.class, alVar);
    }

    private al() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\b᠌\u0005\t᠌\u0006\n᠌\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", el.class, "zzi", ww3.a(), "zzj", f35.a(), "zzk", d35.a()});
        }
        if (ordinal == 3) {
            return new al();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zk(bArr);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzm;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (al.class) {
            try {
                d15Var = zzm;
                if (d15Var == null) {
                    d15Var = new pz4(zzl);
                    zzm = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
