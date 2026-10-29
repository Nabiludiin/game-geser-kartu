package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class h63 extends sz4 implements x05 {
    private static final h63 zzaw;
    private static volatile d15 zzax;
    private int zzD;
    private int zzE;
    private int zzF;
    private long zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private int zzK;
    private int zzR;
    private int zzS;
    private int zzU;
    private int zza;
    private long zzae;
    private int zzag;
    private int zzah;
    private int zzai;
    private h73 zzaj;
    private int zzak;
    private d73 zzal;
    private n63 zzam;
    private s63 zzan;
    private q63 zzao;
    private f73 zzap;
    private z63 zzaq;
    private v63 zzar;
    private h35 zzas;
    private j73 zzau;
    private x63 zzav;
    private int zzb;
    private int zzc;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzz;
    private String zzd = "";
    private xz4 zzh = sz4.u();
    private String zzo = "";
    private String zzp = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzA = "";
    private String zzB = "";
    private zz4 zzC = sz4.w();
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzT = "";
    private String zzV = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzab = "";
    private String zzac = "";
    private String zzad = "";
    private String zzaf = "";
    private String zzat = "";

    static {
        h63 h63Var = new h63();
        zzaw = h63Var;
        sz4.U(h63.class, h63Var);
    }

    private h63() {
    }

    public static f63 f0() {
        return (f63) zzaw.P();
    }

    final /* synthetic */ void A0(String str) {
        this.zzat = str;
    }

    final /* synthetic */ void C0(int i7) {
        this.zzb = i7 - 2;
    }

    final /* synthetic */ void D0(int i7) {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzaw, "\u0004E\u0000\u0001\u0001EE\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\n", new Object[]{"zza", "zzb", "zzi", "zzj", "zzn", "zzo", "zzw", "zzy", "zzz", "zzD", "zzF", "zzG", "zzK", "zzL", "zzM", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzp", "zzu", "zzA", "zzB", "zzC", "zzN", "zzO", "zzW", "zzae", "zzd", "zze", "zzf", "zzg", "zzk", "zzl", "zzm", "zzh", "zzah", "zzai", "zzc", "zzal", "zzam", "zzR", "zzT", "zzQ", "zzP", "zzak", "zzS", "zzU", "zzV", "zzx", "zzan", "zzE", "zzao", "zzaf", "zzag", "zzaj", "zzap", "zzaq", "zzX", "zzar", "zzas", "zzat", "zzv", "zzau", "zzH", "zzI", "zzJ", "zzav"});
        }
        if (ordinal == 3) {
            return new h63();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new f63(bArr);
        }
        if (ordinal == 5) {
            return zzaw;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzax;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (h63.class) {
            try {
                d15Var = zzax;
                if (d15Var == null) {
                    d15Var = new pz4(zzaw);
                    zzax = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    final /* synthetic */ void d0(int i7) {
        if (i7 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzD = i7 - 2;
    }

    final /* synthetic */ void e0(int i7) {
        if (i7 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzK = i7 - 2;
    }

    final /* synthetic */ void g0(boolean z7) {
        this.zzi = z7;
    }

    final /* synthetic */ void h0(long j7) {
        this.zzj = j7;
    }

    final /* synthetic */ void i0(long j7) {
        this.zzk = j7;
    }

    final /* synthetic */ void j0(String str) {
        str.getClass();
        this.zzo = str;
    }

    final /* synthetic */ void k0(String str) {
        str.getClass();
        this.zzw = str;
    }

    final /* synthetic */ void l0(String str) {
        str.getClass();
        this.zzy = str;
    }

    final /* synthetic */ void m0(int i7) {
        this.zzz = i7;
    }

    final /* synthetic */ void n0(Iterable iterable) {
        zz4 zz4Var = this.zzC;
        if (!zz4Var.a()) {
            this.zzC = sz4.x(zz4Var);
        }
        ay4.j(iterable, this.zzC);
    }

    final /* synthetic */ void o0(int i7) {
        this.zzF = i7;
    }

    final /* synthetic */ void p0(long j7) {
        this.zzG = j7;
    }

    final /* synthetic */ void q0(String str) {
        str.getClass();
        this.zzL = str;
    }

    final /* synthetic */ void r0(String str) {
        str.getClass();
        this.zzM = str;
    }

    final /* synthetic */ void s0(String str) {
        str.getClass();
        this.zzY = str;
    }

    final /* synthetic */ void t0(String str) {
        this.zzZ = str;
    }

    final /* synthetic */ void u0(String str) {
        str.getClass();
        this.zzaa = str;
    }

    final /* synthetic */ void v0(String str) {
        str.getClass();
        this.zzab = str;
    }

    final /* synthetic */ void w0(String str) {
        str.getClass();
        this.zzac = str;
    }

    final /* synthetic */ void x0(String str) {
        str.getClass();
        this.zzad = str;
    }

    final /* synthetic */ void y0(g63 g63Var) {
        this.zzak = g63Var.a();
    }

    final /* synthetic */ void z0(h35 h35Var) {
        this.zzas = h35Var;
        this.zza |= 256;
    }
}
