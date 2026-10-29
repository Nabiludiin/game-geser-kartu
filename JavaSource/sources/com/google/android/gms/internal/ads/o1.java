package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f13142a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13143b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13144c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13145d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13146e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13147f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13148g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13149h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13150i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13151j;

    /* renamed from: k, reason: collision with root package name */
    public final float f13152k;

    /* renamed from: l, reason: collision with root package name */
    public final String f13153l;

    private o1(List list, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, float f8, String str) {
        this.f13142a = list;
        this.f13143b = i7;
        this.f13144c = i8;
        this.f13145d = i9;
        this.f13146e = i10;
        this.f13147f = i11;
        this.f13148g = i12;
        this.f13149h = i13;
        this.f13150i = i14;
        this.f13151j = i15;
        this.f13152k = f8;
        this.f13153l = str;
    }

    public static o1 a(y82 y82Var) {
        String str;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f8;
        int i13;
        int i14;
        try {
            y82Var.J(4);
            int R = (y82Var.R() & 3) + 1;
            if (R == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int R2 = y82Var.R() & 31;
            for (int i15 = 0; i15 < R2; i15++) {
                arrayList.add(b(y82Var));
            }
            int R3 = y82Var.R();
            for (int i16 = 0; i16 < R3; i16++) {
                arrayList.add(b(y82Var));
            }
            if (R2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = p63.f13680a;
                n53 d8 = p63.d(bArr2, 5, bArr.length);
                int i17 = d8.f12583e;
                int i18 = d8.f12584f;
                int i19 = d8.f12586h + 8;
                int i20 = d8.f12587i + 8;
                int i21 = d8.f12588j;
                int i22 = d8.f12589k;
                int i23 = d8.f12590l;
                int i24 = d8.f12591m;
                float f9 = d8.f12585g;
                str = qe1.a(d8.f12579a, d8.f12580b, d8.f12581c);
                i11 = i23;
                i12 = i24;
                f8 = f9;
                i10 = i20;
                i13 = i21;
                i14 = i22;
                i7 = i17;
                i8 = i18;
                i9 = i19;
            } else {
                str = null;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                i11 = -1;
                i12 = 16;
                f8 = 1.0f;
                i13 = -1;
                i14 = -1;
            }
            return new o1(arrayList, R, i7, i8, i9, i10, i13, i14, i11, i12, f8, str);
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw wi.b("Error parsing AVC config", e8);
        }
    }

    private static byte[] b(y82 y82Var) {
        int S = y82Var.S();
        int F = y82Var.F();
        y82Var.J(S);
        return qe1.f(y82Var.H(), F, S);
    }
}
