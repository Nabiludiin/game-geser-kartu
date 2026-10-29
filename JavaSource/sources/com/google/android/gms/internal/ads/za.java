package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* compiled from: MyApplication */
final class za {

    /* renamed from: b, reason: collision with root package name */
    private boolean f20091b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20092c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f20093d;

    /* renamed from: e, reason: collision with root package name */
    private int f20094e;

    /* renamed from: f, reason: collision with root package name */
    private int f20095f;

    /* renamed from: g, reason: collision with root package name */
    private Rect f20096g;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f20090a = new int[4];

    /* renamed from: h, reason: collision with root package name */
    private int f20097h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f20098i = -1;

    private static int e(int[] iArr, int i7) {
        if (i7 >= iArr.length) {
            i7 = 0;
        }
        return iArr[i7];
    }

    private static int f(int i7, int i8) {
        return (i7 & 16777215) | ((i8 * 17) << 24);
    }

    private final void g(w72 w72Var, boolean z7, Rect rect, int[] iArr) {
        int i7;
        int i8;
        int i9 = !z7 ? 1 : 0;
        int width = rect.width();
        int i10 = i9 * width;
        int height = rect.height();
        while (true) {
            int i11 = 0;
            do {
                int i12 = 0;
                for (int i13 = 1; i12 < i13 && i13 <= 64; i13 <<= 2) {
                    if (w72Var.c() < 4) {
                        i7 = -1;
                        i8 = 0;
                        break;
                    }
                    i12 = (i12 << 4) | w72Var.j(4);
                }
                i7 = i12 & 3;
                i8 = i12 < 4 ? width : i12 >> 2;
                int min = Math.min(i8, width - i11);
                if (min > 0) {
                    int i14 = i10 + min;
                    Arrays.fill(iArr, i10, i14, this.f20090a[i7]);
                    i11 += min;
                    i10 = i14;
                }
            } while (i11 < width);
            i9 += 2;
            if (i9 >= height) {
                return;
            }
            i10 = i9 * width;
            w72Var.m();
        }
    }

    public final void a(String str) {
        int i7;
        String trim = str.trim();
        String str2 = hi2.f9535a;
        for (String str3 : trim.split("\\r?\\n", -1)) {
            if (str3.startsWith("palette: ")) {
                String[] split = str3.substring(9).split(",", -1);
                this.f20093d = new int[split.length];
                for (int i8 = 0; i8 < split.length; i8++) {
                    int[] iArr = this.f20093d;
                    try {
                        i7 = Integer.parseInt(split[i8].trim(), 16);
                    } catch (RuntimeException unused) {
                        i7 = 0;
                    }
                    iArr[i8] = i7;
                }
            } else if (str3.startsWith("size: ")) {
                String[] split2 = str3.substring(6).trim().split("x", -1);
                if (split2.length == 2) {
                    try {
                        this.f20094e = Integer.parseInt(split2[0]);
                        this.f20095f = Integer.parseInt(split2[1]);
                        this.f20091b = true;
                    } catch (RuntimeException e8) {
                        gv1.d("VobsubParser", "Parsing IDX failed", e8);
                    }
                }
            }
        }
    }

    public final void b(y82 y82Var) {
        int[] iArr = this.f20093d;
        if (iArr == null || !this.f20091b) {
            return;
        }
        y82Var.J(y82Var.S() - 2);
        int S = y82Var.S();
        while (y82Var.F() < S && y82Var.C() > 0) {
            switch (y82Var.R()) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (y82Var.C() >= 2) {
                        int R = y82Var.R();
                        int R2 = y82Var.R();
                        int[] iArr2 = this.f20090a;
                        iArr2[3] = e(iArr, R >> 4);
                        iArr2[2] = e(iArr, R & 15);
                        iArr2[1] = e(iArr, R2 >> 4);
                        iArr2[0] = e(iArr, R2 & 15);
                        this.f20092c = true;
                        break;
                    } else {
                        return;
                    }
                case 4:
                    if (y82Var.C() >= 2 && this.f20092c) {
                        int R3 = y82Var.R();
                        int R4 = y82Var.R();
                        int[] iArr3 = this.f20090a;
                        iArr3[3] = f(iArr3[3], R3 >> 4);
                        iArr3[2] = f(iArr3[2], R3 & 15);
                        iArr3[1] = f(iArr3[1], R4 >> 4);
                        iArr3[0] = f(iArr3[0], R4 & 15);
                        break;
                    } else {
                        return;
                    }
                    break;
                case 5:
                    if (y82Var.C() >= 6) {
                        int R5 = y82Var.R();
                        int R6 = y82Var.R();
                        int i7 = R6 >> 4;
                        int R7 = ((R6 & 15) << 8) | y82Var.R();
                        int R8 = y82Var.R();
                        int R9 = y82Var.R();
                        this.f20096g = new Rect((R5 << 4) | i7, (R8 << 4) | (R9 >> 4), R7 + 1, (((R9 & 15) << 8) | y82Var.R()) + 1);
                        break;
                    } else {
                        return;
                    }
                case 6:
                    if (y82Var.C() >= 4) {
                        this.f20097h = y82Var.S();
                        this.f20098i = y82Var.S();
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public final vw0 c(y82 y82Var) {
        Rect rect;
        if (this.f20093d == null || !this.f20091b || !this.f20092c || (rect = this.f20096g) == null || this.f20097h == -1 || this.f20098i == -1 || rect.width() < 2 || this.f20096g.height() < 2) {
            return null;
        }
        Rect rect2 = this.f20096g;
        int[] iArr = new int[rect2.width() * rect2.height()];
        w72 w72Var = new w72();
        y82Var.G(this.f20097h);
        w72Var.a(y82Var);
        g(w72Var, true, rect2, iArr);
        y82Var.G(this.f20098i);
        w72Var.a(y82Var);
        g(w72Var, false, rect2, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        uv0 uv0Var = new uv0();
        uv0Var.c(createBitmap);
        uv0Var.i(rect2.left / this.f20094e);
        uv0Var.j(0);
        uv0Var.f(rect2.top / this.f20095f, 0);
        uv0Var.g(0);
        uv0Var.m(rect2.width() / this.f20094e);
        uv0Var.n(rect2.height() / this.f20095f);
        return uv0Var.r();
    }

    public final void d() {
        this.f20092c = false;
        this.f20096g = null;
        this.f20097h = -1;
        this.f20098i = -1;
    }
}
