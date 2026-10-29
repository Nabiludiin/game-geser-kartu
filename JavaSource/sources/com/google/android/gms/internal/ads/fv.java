package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class fv extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final fv zzv;
    private static volatile d15 zzw;
    private int zzi;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzp;
    private int zzu;
    private b05 zzj = sz4.y();
    private String zzn = "";
    private String zzo = "";

    static {
        fv fvVar = new fv();
        zzv = fvVar;
        sz4.U(fv.class, fvVar);
    }

    private fv() {
    }

    public static cv d0() {
        return (cv) zzv.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void m0(long j7) {
        this.zzi |= 32;
        this.zzp = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void n0(int i7) {
        this.zzi |= 64;
        this.zzu = i7;
    }

    private void p0() {
        b05 b05Var = this.zzj;
        if (b05Var.a()) {
            return;
        }
        this.zzj = sz4.z(b05Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void e0(Iterable iterable) {
        p0();
        ay4.j(iterable, this.zzj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void f0(int i7) {
        this.zzi |= 1;
        this.zzk = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public void g0(int i7) {
        this.zzi |= 2;
        this.zzl = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void h0(long j7) {
        this.zzi |= 4;
        this.zzm = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public void i0(String str) {
        str.getClass();
        this.zzi |= 8;
        this.zzn = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void l0(String str) {
        str.getClass();
        this.zzi |= 16;
        this.zzo = str;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", av.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }
        if (ordinal == 3) {
            return new fv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new cv(bArr);
        }
        if (ordinal == 5) {
            return zzv;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzw;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (fv.class) {
            try {
                d15Var = zzw;
                if (d15Var == null) {
                    d15Var = new pz4(zzv);
                    zzw = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
