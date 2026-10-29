package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class rx extends sz4 implements x05 {
    private static final rx zzF;
    private static volatile d15 zzG = null;
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private xu zzA;
    private ru zzB;
    private fv zzC;
    private xw zzD;
    private lw zzE;
    private int zzn;
    private int zzo;
    private int zzu;
    private rv zzw;
    private jx zzy;
    private nx zzz;
    private String zzp = "";
    private int zzv = 1000;
    private zz4 zzx = sz4.w();

    static {
        rx rxVar = new rx();
        zzF = rxVar;
        sz4.U(rx.class, rxVar);
    }

    private rx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void e0(String str) {
        str.getClass();
        this.zzn |= 2;
        this.zzp = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void o0(xw xwVar) {
        xwVar.getClass();
        this.zzD = xwVar;
        this.zzn |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void g0(lw lwVar) {
        lwVar.getClass();
        this.zzE = lwVar;
        this.zzn |= 2048;
    }

    private void r0() {
        zz4 zz4Var = this.zzx;
        if (zz4Var.a()) {
            return;
        }
        this.zzx = sz4.x(zz4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public void j0(Iterable iterable) {
        r0();
        ay4.j(iterable, this.zzx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void k0() {
        this.zzx = sz4.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void l0(jx jxVar) {
        jxVar.getClass();
        this.zzy = jxVar;
        this.zzn |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void m0(ru ruVar) {
        ruVar.getClass();
        this.zzB = ruVar;
        this.zzn |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void n0(fv fvVar) {
        fvVar.getClass();
        this.zzC = fvVar;
        this.zzn |= 512;
    }

    public static qx y0() {
        return (qx) zzF.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", ox.d(), "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }
        if (ordinal == 3) {
            return new rx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new qx(bArr);
        }
        if (ordinal == 5) {
            return zzF;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzG;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (rx.class) {
            try {
                d15Var = zzG;
                if (d15Var == null) {
                    d15Var = new pz4(zzF);
                    zzG = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public jx d0() {
        jx jxVar = this.zzy;
        return jxVar == null ? jx.d0() : jxVar;
    }

    public ru f0() {
        ru ruVar = this.zzB;
        return ruVar == null ? ru.d0() : ruVar;
    }

    public String x0() {
        return this.zzp;
    }
}
