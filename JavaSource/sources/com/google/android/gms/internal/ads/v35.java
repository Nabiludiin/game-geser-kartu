package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class v35 extends sz4 implements x05 {
    private static final v35 zzy;
    private static volatile d15 zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private long zzu;
    private boolean zzw;
    private String zzd = "";
    private b05 zze = sz4.y();
    private String zzj = "";
    private b05 zzo = sz4.y();
    private xz4 zzv = sz4.u();
    private xz4 zzx = sz4.u();

    static {
        v35 v35Var = new v35();
        zzy = v35Var;
        sz4.U(v35.class, v35Var);
    }

    private v35() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", u35.f16573a, "zzc", "zzd", "zze", "zzf", s35.f15452a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", r35.class, "zzp", "zzu", "zzv", j35.a(), "zzw", "zzx", t35.f15965a});
        }
        if (ordinal == 3) {
            return new v35();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new o35(bArr);
        }
        if (ordinal == 5) {
            return zzy;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzz;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (v35.class) {
            try {
                d15Var = zzz;
                if (d15Var == null) {
                    d15Var = new pz4(zzy);
                    zzz = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
