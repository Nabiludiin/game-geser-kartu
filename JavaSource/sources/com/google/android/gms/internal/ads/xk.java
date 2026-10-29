package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class xk extends sz4 implements x05 {
    private static final xk zzbe;
    private static volatile d15 zzbf;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private al zzO;
    private int zza;
    private sk zzaF;
    private qk zzaG;
    private long zzaM;
    private long zzaN;
    private ik zzaQ;
    private kk zzaR;
    private int zzaU;
    private long zzaV;
    private boolean zzaY;
    private uk zzag;
    private wk zzai;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private nl zzax;
    private int zzb;
    private long zzba;
    private ll zzbb;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = "";
    private String zzf = "";
    private String zzu = "";
    private String zzE = "";
    private String zzF = "D";
    private String zzG = "";
    private String zzK = "";
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = "D";
    private String zzW = "D";
    private long zzX = -1;
    private int zzY = 1000;
    private int zzZ = 1000;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = 1000;
    private b05 zzah = sz4.y();
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private long zzaq = -1;
    private String zzar = "D";
    private long zzas = -1;
    private long zzay = -1;
    private int zzaz = 1000;
    private int zzaA = 1000;
    private String zzaB = "D";
    private b05 zzaC = sz4.y();
    private int zzaD = 1000;
    private b05 zzaE = sz4.y();
    private String zzaH = "";
    private long zzaI = -1;
    private long zzaJ = -1;
    private long zzaK = -1;
    private long zzaL = -1;
    private long zzaO = -1;
    private String zzaP = "";
    private long zzaS = -1;
    private long zzaT = -1;
    private String zzaW = "";
    private int zzaX = 2;
    private String zzaZ = "";
    private long zzbc = -1;
    private String zzbd = "";

    static {
        xk xkVar = new xk();
        zzbe = xkVar;
        sz4.U(xk.class, xkVar);
    }

    private xk() {
    }

    public static xk f1(byte[] bArr, ez4 ez4Var) {
        return (xk) sz4.E(zzbe, bArr, ez4Var);
    }

    public static ak g1() {
        return (ak) zzbe.P();
    }

    public static xk h1() {
        return zzbe;
    }

    final /* synthetic */ void A0(long j7) {
        this.zzb |= 1048576;
        this.zzaj = j7;
    }

    final /* synthetic */ void B0(long j7) {
        this.zzb |= 2097152;
        this.zzak = j7;
    }

    final /* synthetic */ void C0(long j7) {
        this.zzb |= 4194304;
        this.zzal = j7;
    }

    public final boolean D0() {
        return (this.zza & 4194304) != 0;
    }

    final /* synthetic */ void E0(long j7) {
        this.zzb |= 8388608;
        this.zzam = j7;
    }

    final /* synthetic */ void F0(long j7) {
        this.zzb |= 16777216;
        this.zzan = j7;
    }

    final /* synthetic */ void G0(long j7) {
        this.zzb |= 67108864;
        this.zzap = j7;
    }

    final /* synthetic */ void H0(long j7) {
        this.zzb |= 134217728;
        this.zzaq = j7;
    }

    final /* synthetic */ void I0(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    final /* synthetic */ void J0(String str) {
        str.getClass();
        this.zzc |= 1024;
        this.zzaH = str;
    }

    final /* synthetic */ void K0(long j7) {
        this.zzc |= 2048;
        this.zzaI = j7;
    }

    final /* synthetic */ void L0(long j7) {
        this.zzc |= 4096;
        this.zzaJ = j7;
    }

    final /* synthetic */ void M0(long j7) {
        this.zzc |= 8192;
        this.zzaK = j7;
    }

    final /* synthetic */ void N0(long j7) {
        this.zzc |= 16384;
        this.zzaL = j7;
    }

    final /* synthetic */ void O0(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    final /* synthetic */ void P0(long j7) {
        this.zzc |= 4194304;
        this.zzaT = j7;
    }

    final /* synthetic */ void Q0(long j7) {
        this.zzc |= 536870912;
        this.zzba = j7;
    }

    final /* synthetic */ void R0(ll llVar) {
        llVar.getClass();
        this.zzbb = llVar;
        this.zzc |= 1073741824;
    }

    final /* synthetic */ void T0(int i7) {
        this.zzY = i7 - 1;
        this.zzb |= 1024;
    }

    final /* synthetic */ void U0(int i7) {
        this.zzZ = i7 - 1;
        this.zzb |= 2048;
    }

    final /* synthetic */ void V0(int i7) {
        this.zzaf = i7 - 1;
        this.zzb |= 131072;
    }

    final /* synthetic */ void W0(int i7) {
        this.zzaz = i7 - 1;
        this.zzc |= 16;
    }

    final /* synthetic */ void X0(int i7) {
        this.zzaA = i7 - 1;
        this.zzc |= 32;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            wz4 wz4Var = gl.f9001a;
            return sz4.V(zzbe, "\u0001d\u0000\u0004\u0001Įd\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂX\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈY\u0019ဂ]\u001a᠌Z\u001bဈ\u0016\u001cဇ[\u001dဈ\u0018\u001eဈ\\\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉS[ဉT\\ဂU]ဂV^᠌W_᠌@`ဉIaဂPÉဉ^ĭဂ_Įဈ`", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzaV", "zzC", "zzD", "zzaW", "zzba", "zzaX", ek.f7661a, "zzE", "zzaY", "zzG", "zzaZ", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", uk.class, "zzT", "zzU", "zzV", "zzW", "zzY", wz4Var, "zzZ", wz4Var, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", wz4Var, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", fl.f8308a, "zzau", jl.f10596a, "zzar", "zzaw", bk.f5835a, "zzax", "zzay", "zzan", "zzao", "zzaz", wz4Var, "zzX", "zzF", "zzaA", wz4Var, "zzaB", "zzaC", ok.class, "zzaD", wz4Var, "zzaE", dk.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", "zzaT", "zzaU", lk.f11632a, "zzav", fk.f8292a, "zzaG", "zzaN", "zzbb", "zzbc", "zzbd"});
        }
        if (ordinal == 3) {
            return new xk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ak(bArr);
        }
        if (ordinal == 5) {
            return zzbe;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzbf;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (xk.class) {
            try {
                d15Var = zzbf;
                if (d15Var == null) {
                    d15Var = new pz4(zzbe);
                    zzbf = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    final /* synthetic */ void Y0(int i7) {
        this.zzaU = i7 - 1;
        this.zzc |= 8388608;
    }

    public final String Z0() {
        return this.zzE;
    }

    public final boolean a1() {
        return (this.zzb & 1048576) != 0;
    }

    public final long b1() {
        return this.zzaj;
    }

    public final long c1() {
        return this.zzan;
    }

    final /* synthetic */ void d0(String str) {
        str.getClass();
        this.zza |= 16777216;
        this.zzG = str;
    }

    public final boolean d1() {
        return (this.zzc & 1073741824) != 0;
    }

    final /* synthetic */ void e0(long j7) {
        this.zza |= 33554432;
        this.zzH = j7;
    }

    public final ll e1() {
        ll llVar = this.zzbb;
        return llVar == null ? ll.h0() : llVar;
    }

    final /* synthetic */ void f0(long j7) {
        this.zza |= 67108864;
        this.zzI = j7;
    }

    final /* synthetic */ void g0(long j7) {
        this.zza |= 134217728;
        this.zzJ = j7;
    }

    final /* synthetic */ void h0(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    final /* synthetic */ void i0(long j7) {
        this.zza |= 536870912;
        this.zzL = j7;
    }

    final /* synthetic */ void i1(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    final /* synthetic */ void j0(long j7) {
        this.zza |= 1073741824;
        this.zzM = j7;
    }

    final /* synthetic */ void j1(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    final /* synthetic */ void k0(long j7) {
        this.zza |= Integer.MIN_VALUE;
        this.zzN = j7;
    }

    final /* synthetic */ void k1(long j7) {
        this.zza |= 4;
        this.zzg = j7;
    }

    final /* synthetic */ void l0(long j7) {
        this.zzb |= 2;
        this.zzP = j7;
    }

    final /* synthetic */ void l1(long j7) {
        this.zza |= 16;
        this.zzi = j7;
    }

    final /* synthetic */ void m0(long j7) {
        this.zzb |= 4;
        this.zzQ = j7;
    }

    final /* synthetic */ void m1(long j7) {
        this.zza |= 32;
        this.zzj = j7;
    }

    final /* synthetic */ void n0(long j7) {
        this.zzb |= 8;
        this.zzR = j7;
    }

    final /* synthetic */ void n1(long j7) {
        this.zza |= 1024;
        this.zzo = j7;
    }

    final /* synthetic */ void o0(long j7) {
        this.zzb |= 16;
        this.zzS = j7;
    }

    final /* synthetic */ void o1(long j7) {
        this.zza |= 2048;
        this.zzp = j7;
    }

    final /* synthetic */ void p0(long j7) {
        this.zzb |= 32;
        this.zzT = j7;
    }

    final /* synthetic */ void p1(long j7) {
        this.zza |= 8192;
        this.zzv = j7;
    }

    final /* synthetic */ void q0(long j7) {
        this.zzb |= 64;
        this.zzU = j7;
    }

    final /* synthetic */ void q1(long j7) {
        this.zza |= 16384;
        this.zzw = j7;
    }

    final /* synthetic */ void r0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    final /* synthetic */ void r1(long j7) {
        this.zza |= 32768;
        this.zzx = j7;
    }

    final /* synthetic */ void s0(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzW = str;
    }

    final /* synthetic */ void s1(long j7) {
        this.zza |= 65536;
        this.zzy = j7;
    }

    final /* synthetic */ void t0(long j7) {
        this.zzb |= 4096;
        this.zzaa = j7;
    }

    final /* synthetic */ void t1(long j7) {
        this.zza |= 524288;
        this.zzB = j7;
    }

    final /* synthetic */ void u0(long j7) {
        this.zzb |= 8192;
        this.zzab = j7;
    }

    final /* synthetic */ void u1(long j7) {
        this.zza |= 1048576;
        this.zzC = j7;
    }

    final /* synthetic */ void v0(long j7) {
        this.zzb |= 16384;
        this.zzac = j7;
    }

    final /* synthetic */ void v1(long j7) {
        this.zza |= 2097152;
        this.zzD = j7;
    }

    final /* synthetic */ void w0(uk ukVar) {
        ukVar.getClass();
        this.zzag = ukVar;
        this.zzb |= 262144;
    }

    final /* synthetic */ void w1(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }

    final /* synthetic */ void x0(uk ukVar) {
        ukVar.getClass();
        b05 b05Var = this.zzah;
        if (!b05Var.a()) {
            this.zzah = sz4.z(b05Var);
        }
        this.zzah.add(ukVar);
    }

    final /* synthetic */ void y0() {
        this.zzah = sz4.y();
    }

    final /* synthetic */ void z0(wk wkVar) {
        wkVar.getClass();
        this.zzai = wkVar;
        this.zzb |= 524288;
    }
}
