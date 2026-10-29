package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class xu extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final xu zzf;
    private static volatile d15 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        xu xuVar = new xu();
        zzf = xuVar;
        sz4.U(xu.class, xuVar);
    }

    private xu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void g0(tu tuVar) {
        this.zze = tuVar.a();
        this.zzc |= 2;
    }

    public static su e0() {
        return (su) zzf.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void f0(vu vuVar) {
        this.zzd = vuVar.a();
        this.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", vu.d(), "zze", tu.d()});
        }
        if (ordinal == 3) {
            return new xu();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new su(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzg;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (xu.class) {
            try {
                d15Var = zzg;
                if (d15Var == null) {
                    d15Var = new pz4(zzf);
                    zzg = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
