package androidx.core.content.res;

/* compiled from: MyApplication */
final class l {

    /* renamed from: k, reason: collision with root package name */
    static final l f1687k = k(b.f1653c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    private final float f1688a;

    /* renamed from: b, reason: collision with root package name */
    private final float f1689b;

    /* renamed from: c, reason: collision with root package name */
    private final float f1690c;

    /* renamed from: d, reason: collision with root package name */
    private final float f1691d;

    /* renamed from: e, reason: collision with root package name */
    private final float f1692e;

    /* renamed from: f, reason: collision with root package name */
    private final float f1693f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f1694g;

    /* renamed from: h, reason: collision with root package name */
    private final float f1695h;

    /* renamed from: i, reason: collision with root package name */
    private final float f1696i;

    /* renamed from: j, reason: collision with root package name */
    private final float f1697j;

    private l(float f8, float f9, float f10, float f11, float f12, float f13, float[] fArr, float f14, float f15, float f16) {
        this.f1693f = f8;
        this.f1688a = f9;
        this.f1689b = f10;
        this.f1690c = f11;
        this.f1691d = f12;
        this.f1692e = f13;
        this.f1694g = fArr;
        this.f1695h = f14;
        this.f1696i = f15;
        this.f1697j = f16;
    }

    static l k(float[] fArr, float f8, float f9, float f10, boolean z7) {
        float[][] fArr2 = b.f1651a;
        float f11 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f12 = fArr3[0] * f11;
        float f13 = fArr[1];
        float f14 = f12 + (fArr3[1] * f13);
        float f15 = fArr[2];
        float f16 = f14 + (fArr3[2] * f15);
        float[] fArr4 = fArr2[1];
        float f17 = (fArr4[0] * f11) + (fArr4[1] * f13) + (fArr4[2] * f15);
        float[] fArr5 = fArr2[2];
        float f18 = (f11 * fArr5[0]) + (f13 * fArr5[1]) + (f15 * fArr5[2]);
        float f19 = (f10 / 10.0f) + 0.8f;
        float d8 = ((double) f19) >= 0.9d ? b.d(0.59f, 0.69f, (f19 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f19 - 0.8f) * 10.0f);
        float exp = z7 ? 1.0f : (1.0f - (((float) Math.exp(((-f8) - 42.0f) / 92.0f)) * 0.2777778f)) * f19;
        double d9 = exp;
        if (d9 > 1.0d) {
            exp = 1.0f;
        } else if (d9 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp};
        float f20 = 1.0f / ((5.0f * f8) + 1.0f);
        float f21 = f20 * f20 * f20 * f20;
        float f22 = 1.0f - f21;
        float cbrt = (f21 * f8) + (0.1f * f22 * f22 * ((float) Math.cbrt(f8 * 5.0d)));
        float h8 = b.h(f9) / fArr[1];
        double d10 = h8;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f17) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f18) / 100.0d, 0.42d)};
        float f23 = fArr7[0];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[1];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[2];
        float[] fArr8 = {f24, f26, (400.0f * f27) / (f27 + 27.13f)};
        return new l(h8, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, d8, f19, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    float a() {
        return this.f1688a;
    }

    float b() {
        return this.f1691d;
    }

    float c() {
        return this.f1695h;
    }

    float d() {
        return this.f1696i;
    }

    float e() {
        return this.f1693f;
    }

    float f() {
        return this.f1689b;
    }

    float g() {
        return this.f1692e;
    }

    float h() {
        return this.f1690c;
    }

    float[] i() {
        return this.f1694g;
    }

    float j() {
        return this.f1697j;
    }
}
