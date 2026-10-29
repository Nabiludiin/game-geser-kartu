package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: MyApplication */
final class ls5 extends pt5 implements Comparable {
    private final int A;
    private final int B;
    private final int C;
    private final boolean D;
    private final int E;
    private final int F;
    private final boolean G;
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private final boolean L;
    private final boolean M;
    private final boolean N;

    /* renamed from: u, reason: collision with root package name */
    private final int f11783u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f11784v;

    /* renamed from: w, reason: collision with root package name */
    private final String f11785w;

    /* renamed from: x, reason: collision with root package name */
    private final zs5 f11786x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f11787y;

    /* renamed from: z, reason: collision with root package name */
    private final int f11788z;

    public ls5(int i7, b00 b00Var, int i8, zs5 zs5Var, int i9, boolean z7, sx3 sx3Var, int i10) {
        super(i7, b00Var, i8);
        int i11;
        int i12;
        int hashCode;
        String[] strArr;
        int i13;
        boolean z8;
        LocaleList locales;
        String languageTags;
        this.f11786x = zs5Var;
        int i14 = 1;
        int i15 = true != zs5Var.S ? 16 : 24;
        this.f11785w = xt5.n(this.f14107t.f7764d);
        this.f11787y = rc5.a(i9, false);
        int i16 = 0;
        while (true) {
            i11 = Integer.MAX_VALUE;
            if (i16 >= zs5Var.f4753q.size()) {
                i12 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                i12 = xt5.o(this.f14107t, (String) zs5Var.f4753q.get(i16), false);
                if (i12 > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.A = i16;
        this.f11788z = i12;
        this.B = xt5.r(this.f14107t.f7766f, 0);
        this.C = xt5.s(this.f14107t, zs5Var.f4754r);
        eq5 eq5Var = this.f14107t;
        int i17 = eq5Var.f7766f;
        this.D = i17 == 0 || (i17 & 1) != 0;
        this.G = 1 == (eq5Var.f7765e & 1);
        String str = eq5Var.f7775o;
        this.N = str != null && ((hashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(hashCode == 187078297 ? !str.equals("audio/ac4") : !(hashCode == 1504698186 && str.equals("audio/iamf"))));
        int i18 = eq5Var.G;
        this.H = i18;
        this.I = eq5Var.H;
        int i19 = eq5Var.f7770j;
        this.J = i19;
        this.f11784v = (i19 == -1 || i19 <= zs5Var.f4757u) && (i18 == -1 || i18 <= zs5Var.f4756t) && sx3Var.d(eq5Var);
        String str2 = hi2.f9535a;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            strArr = new String[]{configuration.locale.toLanguageTag()};
        }
        for (int i20 = 0; i20 < strArr.length; i20++) {
            strArr[i20] = hi2.E(strArr[i20]);
        }
        int i21 = 0;
        while (true) {
            if (i21 >= strArr.length) {
                i13 = 0;
                i21 = Integer.MAX_VALUE;
                break;
            } else {
                i13 = xt5.o(this.f14107t, strArr[i21], false);
                if (i13 > 0) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.E = i21;
        this.F = i13;
        int i22 = 0;
        while (true) {
            if (i22 >= zs5Var.f4758v.size()) {
                break;
            }
            String str3 = this.f14107t.f7775o;
            if (str3 != null && str3.equals(zs5Var.f4758v.get(i22))) {
                i11 = i22;
                break;
            }
            i22++;
        }
        this.K = i11;
        this.L = (i9 & 384) == 128;
        this.M = (i9 & 64) == 64;
        zs5 zs5Var2 = this.f11786x;
        if (rc5.a(i9, zs5Var2.U) && ((z8 = this.f11784v) || zs5Var2.N)) {
            int i23 = zs5Var2.f4759w.f5518a;
            if (rc5.a(i9, false) && z8 && this.f14107t.f7770j != -1 && ((zs5Var2.W || !z7) && (i15 & i9) != 0)) {
                i14 = 2;
            }
        } else {
            i14 = 0;
        }
        this.f11783u = i14;
    }

    @Override // com.google.android.gms.internal.ads.pt5
    public final int a() {
        return this.f11783u;
    }

    @Override // com.google.android.gms.internal.ads.pt5
    public final /* bridge */ /* synthetic */ boolean c(pt5 pt5Var) {
        String str;
        int i7;
        ls5 ls5Var = (ls5) pt5Var;
        boolean z7 = this.f11786x.Q;
        eq5 eq5Var = this.f14107t;
        int i8 = eq5Var.G;
        if (i8 == -1) {
            return false;
        }
        eq5 eq5Var2 = ls5Var.f14107t;
        return i8 == eq5Var2.G && (str = eq5Var.f7775o) != null && TextUtils.equals(str, eq5Var2.f7775o) && (i7 = eq5Var.H) != -1 && i7 == eq5Var2.H && this.L == ls5Var.L && this.M == ls5Var.M;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ls5 ls5Var) {
        p24 p24Var;
        p24 a8;
        boolean z7 = this.f11784v;
        if (z7 && this.f11787y) {
            a8 = xt5.f19028k;
        } else {
            p24Var = xt5.f19028k;
            a8 = p24Var.a();
        }
        j04 a9 = j04.f().d(this.f11787y, ls5Var.f11787y).a(Integer.valueOf(this.A), Integer.valueOf(ls5Var.A), p24.b().a()).b(this.f11788z, ls5Var.f11788z).b(this.B, ls5Var.B).a(Integer.valueOf(this.C), Integer.valueOf(ls5Var.C), p24.b().a()).d(this.G, ls5Var.G).d(this.D, ls5Var.D).a(Integer.valueOf(this.E), Integer.valueOf(ls5Var.E), p24.b().a()).b(this.F, ls5Var.F).d(z7, ls5Var.f11784v).a(Integer.valueOf(this.K), Integer.valueOf(ls5Var.K), p24.b().a());
        boolean z8 = this.f11786x.F;
        j04 a10 = a9.d(this.L, ls5Var.L).d(this.M, ls5Var.M).d(this.N, ls5Var.N).a(Integer.valueOf(this.H), Integer.valueOf(ls5Var.H), a8).a(Integer.valueOf(this.I), Integer.valueOf(ls5Var.I), a8);
        if (Objects.equals(this.f11785w, ls5Var.f11785w)) {
            a10 = a10.a(Integer.valueOf(this.J), Integer.valueOf(ls5Var.J), a8);
        }
        return a10.e();
    }
}
