package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class w65 extends sz4 implements x05 {
    private static final w65 zzn;
    private static volatile d15 zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private b75 zzk;
    private v65 zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        w65 w65Var = new w65();
        zzn = w65Var;
        sz4.U(w65.class, w65Var);
    }

    private w65() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", g75.f8693a, "zze", f75.f8055a, "zzf", "zzg", "zzh", "zzi", "zzj", x65.f18638a, "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new w65();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new t65(bArr);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzo;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (w65.class) {
            try {
                d15Var = zzo;
                if (d15Var == null) {
                    d15Var = new pz4(zzn);
                    zzo = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
