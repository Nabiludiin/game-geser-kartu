package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* compiled from: MyApplication */
public final class eq5 {
    public static final /* synthetic */ int P = 0;
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final w25 E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    private int O;

    /* renamed from: a, reason: collision with root package name */
    public final String f7761a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7762b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7763c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7764d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7765e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7766f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7767g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7768h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7769i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7770j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7771k;

    /* renamed from: l, reason: collision with root package name */
    public final le f7772l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f7773m;

    /* renamed from: n, reason: collision with root package name */
    public final String f7774n;

    /* renamed from: o, reason: collision with root package name */
    public final String f7775o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7776p;

    /* renamed from: q, reason: collision with root package name */
    public final int f7777q;

    /* renamed from: r, reason: collision with root package name */
    public final List f7778r;

    /* renamed from: s, reason: collision with root package name */
    public final uj5 f7779s;

    /* renamed from: t, reason: collision with root package name */
    public final long f7780t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f7781u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7782v;

    /* renamed from: w, reason: collision with root package name */
    public final int f7783w;

    /* renamed from: x, reason: collision with root package name */
    public final int f7784x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7785y;

    /* renamed from: z, reason: collision with root package name */
    public final float f7786z;

    static {
        new eq5(new xn5());
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
    }

    /* synthetic */ eq5(xn5 xn5Var, byte[] bArr) {
        this(xn5Var);
    }

    public static String e(eq5 eq5Var) {
        String str;
        int i7;
        int i8;
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(eq5Var.f7761a);
        sb.append(", mimeType=");
        sb.append(eq5Var.f7775o);
        String str2 = eq5Var.f7774n;
        if (str2 != null) {
            sb.append(", container=");
            sb.append(str2);
        }
        int i9 = eq5Var.f7770j;
        if (i9 != -1) {
            sb.append(", bitrate=");
            sb.append(i9);
        }
        String str3 = eq5Var.f7771k;
        if (str3 != null) {
            sb.append(", codecs=");
            sb.append(str3);
        }
        uj5 uj5Var = eq5Var.f7779s;
        if (uj5Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i10 = 0; i10 < uj5Var.f16797t; i10++) {
                UUID uuid = uj5Var.a(i10).f10057r;
                if (uuid.equals(vk3.f17658b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(vk3.f17659c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(vk3.f17661e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(vk3.f17660d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(vk3.f17657a)) {
                    linkedHashSet.add("universal");
                } else {
                    String obj = uuid.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 10);
                    sb2.append("unknown (");
                    sb2.append(obj);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sb.append(", drm=[");
            kx3.b(sb, linkedHashSet, ",");
            sb.append(']');
        }
        int i11 = eq5Var.f7782v;
        if (i11 != -1 && (i8 = eq5Var.f7783w) != -1) {
            sb.append(", res=");
            sb.append(i11);
            sb.append("x");
            sb.append(i8);
        }
        int i12 = eq5Var.f7784x;
        if (i12 != -1 && (i7 = eq5Var.f7785y) != -1) {
            sb.append(", decRes=");
            sb.append(i12);
            sb.append("x");
            sb.append(i7);
        }
        float f8 = eq5Var.B;
        int i13 = b44.f5569a;
        double d8 = f8;
        if (Math.copySign((-1.0d) + d8, 1.0d) > 0.001d && d8 != 1.0d && (!Double.isNaN(d8) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f8)};
            String str4 = hi2.f9535a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        w25 w25Var = eq5Var.E;
        if (w25Var != null && (w25Var.e() || w25Var.f())) {
            sb.append(", color=");
            sb.append(w25Var.g());
        }
        float f9 = eq5Var.f7786z;
        if (f9 != -1.0f) {
            sb.append(", fps=");
            sb.append(f9);
        }
        int i14 = eq5Var.F;
        if (i14 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i14);
        }
        int i15 = eq5Var.G;
        if (i15 != -1) {
            sb.append(", channels=");
            sb.append(i15);
        }
        int i16 = eq5Var.H;
        if (i16 != -1) {
            sb.append(", sample_rate=");
            sb.append(i16);
        }
        String str5 = eq5Var.f7764d;
        if (str5 != null) {
            sb.append(", language=");
            sb.append(str5);
        }
        List list = eq5Var.f7763c;
        if (!list.isEmpty()) {
            sb.append(", labels=[");
            kx3.b(sb, x14.c(list, cp5.f6559a), ",");
            sb.append("]");
        }
        int i17 = eq5Var.f7765e;
        if (i17 != 0) {
            sb.append(", selectionFlags=[");
            String str6 = hi2.f9535a;
            ArrayList arrayList = new ArrayList();
            if ((i17 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i17 & 2) != 0) {
                arrayList.add("forced");
            }
            kx3.b(sb, arrayList, ",");
            sb.append("]");
        }
        int i18 = eq5Var.f7766f;
        if (i18 != 0) {
            sb.append(", roleFlags=[");
            int i19 = i18 & 32768;
            String str7 = hi2.f9535a;
            ArrayList arrayList2 = new ArrayList();
            if ((i18 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i18 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i18 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i18 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i18 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i18 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i18 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i18 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i18 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i18 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i18 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i18 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i18 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i18 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i18 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i19 != 0) {
                arrayList2.add("auxiliary");
            }
            kx3.b(sb, arrayList2, ",");
            sb.append("]");
        }
        if ((i18 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i20 = eq5Var.f7767g;
            String str8 = hi2.f9535a;
            if (i20 == 0) {
                str = "undefined";
            } else if (i20 == 1) {
                str = "original";
            } else if (i20 == 2) {
                str = "depth-linear";
            } else if (i20 == 3) {
                str = "depth-inverse";
            } else {
                if (i20 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final xn5 a() {
        return new xn5(this, null);
    }

    public final eq5 b(int i7) {
        xn5 xn5Var = new xn5(this, null);
        xn5Var.l(i7);
        return new eq5(xn5Var);
    }

    public final int c() {
        int i7;
        int i8 = this.f7782v;
        if (i8 == -1 || (i7 = this.f7783w) == -1) {
            return -1;
        }
        return i8 * i7;
    }

    public final boolean d(eq5 eq5Var) {
        List list = this.f7778r;
        int size = list.size();
        List list2 = eq5Var.f7778r;
        if (size != list2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj != null && eq5.class == obj.getClass()) {
            eq5 eq5Var = (eq5) obj;
            int i8 = this.O;
            if ((i8 == 0 || (i7 = eq5Var.O) == 0 || i8 == i7) && this.f7765e == eq5Var.f7765e && this.f7766f == eq5Var.f7766f && this.f7767g == eq5Var.f7767g && this.f7768h == eq5Var.f7768h && this.f7769i == eq5Var.f7769i && this.f7776p == eq5Var.f7776p && this.f7780t == eq5Var.f7780t && this.f7782v == eq5Var.f7782v && this.f7783w == eq5Var.f7783w && this.f7784x == eq5Var.f7784x && this.f7785y == eq5Var.f7785y && this.A == eq5Var.A && this.D == eq5Var.D && this.F == eq5Var.F && this.G == eq5Var.G && this.H == eq5Var.H && this.I == eq5Var.I && this.J == eq5Var.J && this.K == eq5Var.K && this.L == eq5Var.L && this.N == eq5Var.N && Float.compare(this.f7786z, eq5Var.f7786z) == 0 && Float.compare(this.B, eq5Var.B) == 0 && Objects.equals(this.f7761a, eq5Var.f7761a) && Objects.equals(this.f7762b, eq5Var.f7762b) && this.f7763c.equals(eq5Var.f7763c) && Objects.equals(this.f7771k, eq5Var.f7771k) && Objects.equals(this.f7774n, eq5Var.f7774n) && Objects.equals(this.f7775o, eq5Var.f7775o) && Objects.equals(this.f7764d, eq5Var.f7764d) && Arrays.equals(this.C, eq5Var.C) && Objects.equals(this.f7772l, eq5Var.f7772l) && Objects.equals(this.E, eq5Var.E) && Objects.equals(this.f7779s, eq5Var.f7779s) && d(eq5Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.O;
        if (i7 != 0) {
            return i7;
        }
        String str = this.f7761a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f7762b;
        int hashCode2 = ((((hashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f7763c.hashCode();
        String str3 = this.f7764d;
        int hashCode3 = ((((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f7765e) * 31) + this.f7766f) * 31) + this.f7767g) * 31) + this.f7768h) * 31) + this.f7769i) * 31;
        String str4 = this.f7771k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        le leVar = this.f7772l;
        int hashCode5 = hashCode4 + (leVar == null ? 0 : leVar.hashCode());
        String str5 = this.f7774n;
        int hashCode6 = ((hashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        int hashCode7 = ((((((((((((((((((((((((((((((((((((((((hashCode6 + (this.f7775o != null ? r2.hashCode() : 0)) * 31) + this.f7776p) * 31) + ((int) this.f7780t)) * 31) + this.f7782v) * 31) + this.f7783w) * 31) + this.f7784x) * 31) + this.f7785y) * 31) + Float.floatToIntBits(this.f7786z)) * 31) + this.A) * 31) + Float.floatToIntBits(this.B)) * 31) + this.D) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) - 1) * 31) - 1) * 31) + this.N;
        this.O = hashCode7;
        return hashCode7;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.E);
        String str = this.f7761a;
        int length = String.valueOf(str).length();
        String str2 = this.f7762b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f7774n;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f7775o;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f7771k;
        int length5 = String.valueOf(str5).length();
        int i7 = this.f7770j;
        int length6 = String.valueOf(i7).length();
        String str6 = this.f7764d;
        int length7 = String.valueOf(str6).length();
        int i8 = this.f7782v;
        int length8 = String.valueOf(i8).length();
        int i9 = this.f7783w;
        int length9 = String.valueOf(i9).length();
        float f8 = this.f7786z;
        int length10 = String.valueOf(f8).length();
        int length11 = valueOf.length();
        int i10 = this.G;
        int length12 = String.valueOf(i10).length();
        int i11 = this.H;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + String.valueOf(i11).length() + 2);
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i7);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(f8);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("], [");
        sb.append(i10);
        sb.append(", ");
        sb.append(i11);
        sb.append("])");
        return sb.toString();
    }

    private eq5(xn5 xn5Var) {
        boolean z7;
        String str;
        this.f7761a = xn5Var.n();
        String E = hi2.E(xn5Var.q());
        this.f7764d = E;
        if (xn5Var.p().isEmpty() && xn5Var.o() != null) {
            this.f7763c = w04.n(new es5(E, xn5Var.o()));
            this.f7762b = xn5Var.o();
        } else if (xn5Var.p().isEmpty() || xn5Var.o() != null) {
            if (!xn5Var.p().isEmpty() || xn5Var.o() != null) {
                for (int i7 = 0; i7 < xn5Var.p().size(); i7++) {
                    if (!((es5) xn5Var.p().get(i7)).f7810b.equals(xn5Var.o())) {
                    }
                }
                z7 = false;
                rx3.h(z7);
                this.f7763c = xn5Var.p();
                this.f7762b = xn5Var.o();
            }
            z7 = true;
            rx3.h(z7);
            this.f7763c = xn5Var.p();
            this.f7762b = xn5Var.o();
        } else {
            this.f7763c = xn5Var.p();
            List p7 = xn5Var.p();
            Iterator it = p7.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((es5) p7.get(0)).f7810b;
                    break;
                }
                es5 es5Var = (es5) it.next();
                if (TextUtils.equals(es5Var.f7809a, E)) {
                    str = es5Var.f7810b;
                    break;
                }
            }
            this.f7762b = str;
        }
        this.f7765e = xn5Var.r();
        rx3.i(xn5Var.t() == 0 || (xn5Var.s() & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f7766f = xn5Var.s();
        this.f7767g = xn5Var.t();
        int u7 = xn5Var.u();
        this.f7768h = u7;
        int v7 = xn5Var.v();
        this.f7769i = v7;
        this.f7770j = v7 != -1 ? v7 : u7;
        this.f7771k = xn5Var.w();
        this.f7772l = xn5Var.x();
        this.f7773m = null;
        this.f7774n = xn5Var.y();
        this.f7775o = xn5Var.z();
        this.f7776p = xn5Var.B();
        this.f7777q = xn5Var.C();
        this.f7778r = xn5Var.D() == null ? Collections.EMPTY_LIST : xn5Var.D();
        uj5 E2 = xn5Var.E();
        this.f7779s = E2;
        this.f7780t = xn5Var.F();
        this.f7781u = xn5Var.G();
        this.f7782v = xn5Var.H();
        this.f7783w = xn5Var.I();
        this.f7784x = xn5Var.J();
        this.f7785y = xn5Var.K();
        this.f7786z = xn5Var.L();
        this.A = xn5Var.M() == -1 ? 0 : xn5Var.M();
        this.B = xn5Var.N() == -1.0f ? 1.0f : xn5Var.N();
        this.C = xn5Var.O();
        this.D = xn5Var.P();
        this.E = xn5Var.Q();
        this.F = xn5Var.R();
        this.G = xn5Var.S();
        this.H = xn5Var.T();
        this.I = xn5Var.U();
        this.J = xn5Var.V() == -1 ? 0 : xn5Var.V();
        this.K = xn5Var.W() != -1 ? xn5Var.W() : 0;
        this.L = xn5Var.X();
        this.M = xn5Var.Y();
        if (xn5Var.Z() != 0 || E2 == null) {
            this.N = xn5Var.Z();
        } else {
            this.N = 1;
        }
    }
}
