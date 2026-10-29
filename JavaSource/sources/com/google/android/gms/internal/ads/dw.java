package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class dw extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final dw zzh;
    private static volatile d15 zzi;
    private int zzd;
    private int zze;
    private iw zzf;
    private kw zzg;

    static {
        dw dwVar = new dw();
        zzh = dwVar;
        sz4.U(dw.class, dwVar);
    }

    private dw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void j0(fw fwVar) {
        this.zze = fwVar.a();
        this.zzd |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void k0(iw iwVar) {
        iwVar.getClass();
        this.zzf = iwVar;
        this.zzd |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void d0(kw kwVar) {
        kwVar.getClass();
        this.zzg = kwVar;
        this.zzd |= 4;
    }

    public static cw i0() {
        return (cw) zzh.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", fw.d(), "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new dw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new cw(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzi;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (dw.class) {
            try {
                d15Var = zzi;
                if (d15Var == null) {
                    d15Var = new pz4(zzh);
                    zzi = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
