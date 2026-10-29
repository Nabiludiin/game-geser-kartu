package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class lw extends sz4 implements x05 {
    public static final int zza = 1;
    private static final lw zzc;
    private static volatile d15 zzd;
    private b05 zzb = sz4.y();

    static {
        lw lwVar = new lw();
        zzc = lwVar;
        sz4.U(lw.class, lwVar);
    }

    private lw() {
    }

    private void e0() {
        b05 b05Var = this.zzb;
        if (b05Var.a()) {
            return;
        }
        this.zzb = sz4.z(b05Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void h0(dw dwVar) {
        dwVar.getClass();
        e0();
        this.zzb.add(dwVar);
    }

    public static ew g0() {
        return (ew) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", dw.class});
        }
        if (ordinal == 3) {
            return new lw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ew(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzd;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (lw.class) {
            try {
                d15Var = zzd;
                if (d15Var == null) {
                    d15Var = new pz4(zzc);
                    zzd = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
