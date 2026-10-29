package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class o65 extends sz4 implements x05 {
    private static final o65 zzp;
    private static volatile d15 zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private b05 zze = sz4.y();
    private String zzf = "";
    private String zzg = "";
    private b05 zzj = sz4.y();

    static {
        o65 o65Var = new o65();
        zzp = o65Var;
        sz4.U(o65.class, o65Var);
    }

    private o65() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", n65.f12600a, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", m65.class, "zzc", "zzk", k65.f10911a, "zzl", "zzm", "zzn", "zzo"});
        }
        if (ordinal == 3) {
            return new o65();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new j65(bArr);
        }
        if (ordinal == 5) {
            return zzp;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzu;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (o65.class) {
            try {
                d15Var = zzu;
                if (d15Var == null) {
                    d15Var = new pz4(zzp);
                    zzu = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
