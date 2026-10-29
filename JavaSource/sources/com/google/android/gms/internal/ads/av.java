package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: MyApplication */
public final class av extends sz4 implements x05 {
    private static final av zzG;
    private static volatile d15 zzH = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final yz4 zzx = new a();
    private int zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzu;
    private long zzv;
    private xz4 zzw = sz4.u();
    private xu zzy;
    private int zzz;

    /* compiled from: MyApplication */
    class a implements yz4 {
        a() {
        }
    }

    static {
        av avVar = new av();
        zzG = avVar;
        sz4.U(av.class, avVar);
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public void p0(ox oxVar) {
        this.zzA = oxVar.a();
        this.zzn |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public void q0(ox oxVar) {
        this.zzB = oxVar.a();
        this.zzn |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public void r0(int i7) {
        this.zzn |= 256;
        this.zzC = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public void s0(ox oxVar) {
        this.zzD = oxVar.a();
        this.zzn |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public void t0(dv dvVar) {
        this.zzE = dvVar.a();
        this.zzn |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public void u0(long j7) {
        this.zzn |= 2048;
        this.zzF = j7;
    }

    public static av H0(byte[] bArr) {
        return (av) sz4.D(zzG, bArr);
    }

    public static bv I0() {
        return (bv) zzG.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void g0(long j7) {
        this.zzn |= 8;
        this.zzv = j7;
    }

    private void j0() {
        xz4 xz4Var = this.zzw;
        if (xz4Var.a()) {
            return;
        }
        this.zzw = sz4.v(xz4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void h0(Iterable iterable) {
        j0();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzw.I(((yw) it.next()).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void n0(xu xuVar) {
        xuVar.getClass();
        this.zzy = xuVar;
        this.zzn |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void o0(ox oxVar) {
        this.zzz = oxVar.a();
        this.zzn |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void d0(long j7) {
        this.zzn |= 1;
        this.zzo = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void e0(ox oxVar) {
        this.zzp = oxVar.a();
        this.zzn |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public void f0(long j7) {
        this.zzn |= 4;
        this.zzu = j7;
    }

    public ox G0() {
        ox c8 = ox.c(this.zzp);
        return c8 == null ? ox.ENUM_FALSE : c8;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", ox.d(), "zzu", "zzv", "zzw", yw.d(), "zzy", "zzz", ox.d(), "zzA", ox.d(), "zzB", ox.d(), "zzC", "zzD", ox.d(), "zzE", dv.d(), "zzF"});
        }
        if (ordinal == 3) {
            return new av();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new bv(bArr);
        }
        if (ordinal == 5) {
            return zzG;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzH;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (av.class) {
            try {
                d15Var = zzH;
                if (d15Var == null) {
                    d15Var = new pz4(zzG);
                    zzH = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public long z0() {
        return this.zzo;
    }
}
