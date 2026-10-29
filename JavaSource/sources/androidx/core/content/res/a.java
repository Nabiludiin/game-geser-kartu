package androidx.core.content.res;

/* compiled from: MyApplication */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f1642a;

    /* renamed from: b, reason: collision with root package name */
    private final float f1643b;

    /* renamed from: c, reason: collision with root package name */
    private final float f1644c;

    /* renamed from: d, reason: collision with root package name */
    private final float f1645d;

    /* renamed from: e, reason: collision with root package name */
    private final float f1646e;

    /* renamed from: f, reason: collision with root package name */
    private final float f1647f;

    /* renamed from: g, reason: collision with root package name */
    private final float f1648g;

    /* renamed from: h, reason: collision with root package name */
    private final float f1649h;

    /* renamed from: i, reason: collision with root package name */
    private final float f1650i;

    a(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f1642a = f8;
        this.f1643b = f9;
        this.f1644c = f10;
        this.f1645d = f11;
        this.f1646e = f12;
        this.f1647f = f13;
        this.f1648g = f14;
        this.f1649h = f15;
        this.f1650i = f16;
    }

    private static a b(float f8, float f9, float f10) {
        float f11 = 100.0f;
        float f12 = 1000.0f;
        float f13 = 0.0f;
        a aVar = null;
        float f14 = 1000.0f;
        while (Math.abs(f13 - f11) > 0.01f) {
            float f15 = ((f11 - f13) / 2.0f) + f13;
            int p7 = e(f15, f9, f8).p();
            float b8 = b.b(p7);
            float abs = Math.abs(f10 - b8);
            if (abs < 0.2f) {
                a c8 = c(p7);
                float a8 = c8.a(e(c8.k(), c8.i(), f8));
                if (a8 <= 1.0f) {
                    aVar = c8;
                    f12 = abs;
                    f14 = a8;
                }
            }
            if (f12 == 0.0f && f14 == 0.0f) {
                return aVar;
            }
            if (b8 < f10) {
                f13 = f15;
            } else {
                f11 = f15;
            }
        }
        return aVar;
    }

    static a c(int i7) {
        return d(i7, l.f1687k);
    }

    static a d(int i7, l lVar) {
        float[] f8 = b.f(i7);
        float[][] fArr = b.f1651a;
        float f9 = f8[0];
        float[] fArr2 = fArr[0];
        float f10 = fArr2[0] * f9;
        float f11 = f8[1];
        float f12 = f10 + (fArr2[1] * f11);
        float f13 = f8[2];
        float f14 = f12 + (fArr2[2] * f13);
        float[] fArr3 = fArr[1];
        float f15 = (fArr3[0] * f9) + (fArr3[1] * f11) + (fArr3[2] * f13);
        float[] fArr4 = fArr[2];
        float f16 = (f9 * fArr4[0]) + (f11 * fArr4[1]) + (f13 * fArr4[2]);
        float f17 = lVar.i()[0] * f14;
        float f18 = lVar.i()[1] * f15;
        float f19 = lVar.i()[2] * f16;
        float pow = (float) Math.pow((lVar.c() * Math.abs(f17)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((lVar.c() * Math.abs(f18)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((lVar.c() * Math.abs(f19)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f17) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f18) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f19) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d8 = signum3;
        float f20 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d8)) / 11.0f;
        float f21 = ((float) ((signum + signum2) - (d8 * 2.0d))) / 9.0f;
        float f22 = signum2 * 20.0f;
        float f23 = (((signum * 20.0f) + f22) + (21.0f * signum3)) / 20.0f;
        float f24 = (((signum * 40.0f) + f22) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f25 = atan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float pow4 = ((float) Math.pow((f24 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        float b8 = (4.0f / lVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (lVar.a() + 4.0f) * lVar.d();
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f25) < 20.14d ? 360.0f + f25 : f25) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((f20 * f20) + (f21 * f21)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float d9 = pow5 * lVar.d();
        float sqrt = ((float) Math.sqrt((r2 * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f27 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d9) + 1.0f)) * 43.85965f;
        double d10 = f26;
        return new a(f25, pow5, pow4, b8, d9, sqrt, f27, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    private static a e(float f8, float f9, float f10) {
        return f(f8, f9, f10, l.f1687k);
    }

    private static a f(float f8, float f9, float f10, l lVar) {
        float b8 = (4.0f / lVar.b()) * ((float) Math.sqrt(f8 / 100.0d)) * (lVar.a() + 4.0f) * lVar.d();
        float d8 = lVar.d() * f9;
        float sqrt = ((float) Math.sqrt(((f9 / ((float) Math.sqrt(r4))) * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f11 = (1.7f * f8) / ((0.007f * f8) + 1.0f);
        float log = ((float) Math.log((d8 * 0.0228d) + 1.0d)) * 43.85965f;
        double d9 = (3.1415927f * f10) / 180.0f;
        return new a(f10, f9, f8, b8, d8, sqrt, f11, ((float) Math.cos(d9)) * log, log * ((float) Math.sin(d9)));
    }

    static int m(float f8, float f9, float f10) {
        return n(f8, f9, f10, l.f1687k);
    }

    static int n(float f8, float f9, float f10, l lVar) {
        if (f9 < 1.0d || Math.round(f10) <= 0.0d || Math.round(f10) >= 100.0d) {
            return b.a(f10);
        }
        float min = f8 < 0.0f ? 0.0f : Math.min(360.0f, f8);
        a aVar = null;
        boolean z7 = true;
        float f11 = 0.0f;
        float f12 = f9;
        while (Math.abs(f11 - f9) >= 0.4f) {
            a b8 = b(min, f12, f10);
            if (!z7) {
                if (b8 == null) {
                    f9 = f12;
                } else {
                    f11 = f12;
                    aVar = b8;
                }
                f12 = ((f9 - f11) / 2.0f) + f11;
            } else {
                if (b8 != null) {
                    return b8.o(lVar);
                }
                f12 = ((f9 - f11) / 2.0f) + f11;
                z7 = false;
            }
        }
        return aVar == null ? b.a(f10) : aVar.o(lVar);
    }

    float a(a aVar) {
        float l7 = l() - aVar.l();
        float g8 = g() - aVar.g();
        float h8 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((l7 * l7) + (g8 * g8) + (h8 * h8)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f1649h;
    }

    float h() {
        return this.f1650i;
    }

    float i() {
        return this.f1643b;
    }

    float j() {
        return this.f1642a;
    }

    float k() {
        return this.f1644c;
    }

    float l() {
        return this.f1648g;
    }

    int o(l lVar) {
        float pow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double j7 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j7) + 3.8d)) * 0.25f;
        float a8 = lVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / lVar.b()) / lVar.j()));
        float g8 = cos * 3846.1538f * lVar.g() * lVar.h();
        float f8 = a8 / lVar.f();
        float sin = (float) Math.sin(j7);
        float cos2 = (float) Math.cos(j7);
        float f9 = (((0.305f + f8) * 23.0f) * pow) / (((g8 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f10 = cos2 * f9;
        float f11 = f9 * sin;
        float f12 = f8 * 460.0f;
        float f13 = (((451.0f * f10) + f12) + (288.0f * f11)) / 1403.0f;
        float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
        float signum = Math.signum(f13) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
        float signum2 = Math.signum(f14) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
        float signum3 = Math.signum(((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f15 = signum / lVar.i()[0];
        float f16 = signum2 / lVar.i()[1];
        float f17 = signum3 / lVar.i()[2];
        float[][] fArr = b.f1652b;
        float[] fArr2 = fArr[0];
        float f18 = (fArr2[0] * f15) + (fArr2[1] * f16) + (fArr2[2] * f17);
        float[] fArr3 = fArr[1];
        float f19 = (fArr3[0] * f15) + (fArr3[1] * f16) + (fArr3[2] * f17);
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.a(f18, f19, (f15 * fArr4[0]) + (f16 * fArr4[1]) + (f17 * fArr4[2]));
    }

    int p() {
        return o(l.f1687k);
    }
}
