package s;

import java.util.Arrays;
import s.b;

/* compiled from: MyApplication */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f25903l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f25905b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f25906c;

    /* renamed from: a, reason: collision with root package name */
    int f25904a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f25907d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f25908e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f25909f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f25910g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f25911h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f25912i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f25913j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25914k = false;

    a(b bVar, c cVar) {
        this.f25905b = bVar;
        this.f25906c = cVar;
    }

    @Override // s.b.a
    public final void a(i iVar, float f8) {
        if (f8 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i7 = this.f25912i;
        if (i7 == -1) {
            this.f25912i = 0;
            this.f25911h[0] = f8;
            this.f25909f[0] = iVar.f25965s;
            this.f25910g[0] = -1;
            iVar.C++;
            iVar.c(this.f25905b);
            this.f25904a++;
            if (this.f25914k) {
                return;
            }
            int i8 = this.f25913j + 1;
            this.f25913j = i8;
            int[] iArr = this.f25909f;
            if (i8 >= iArr.length) {
                this.f25914k = true;
                this.f25913j = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i7 != -1 && i10 < this.f25904a; i10++) {
            int i11 = this.f25909f[i7];
            int i12 = iVar.f25965s;
            if (i11 == i12) {
                this.f25911h[i7] = f8;
                return;
            }
            if (i11 < i12) {
                i9 = i7;
            }
            i7 = this.f25910g[i7];
        }
        int i13 = this.f25913j;
        int i14 = i13 + 1;
        if (this.f25914k) {
            int[] iArr2 = this.f25909f;
            if (iArr2[i13] != -1) {
                i13 = iArr2.length;
            }
        } else {
            i13 = i14;
        }
        int[] iArr3 = this.f25909f;
        if (i13 >= iArr3.length && this.f25904a < iArr3.length) {
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f25909f;
                if (i15 >= iArr4.length) {
                    break;
                }
                if (iArr4[i15] == -1) {
                    i13 = i15;
                    break;
                }
                i15++;
            }
        }
        int[] iArr5 = this.f25909f;
        if (i13 >= iArr5.length) {
            i13 = iArr5.length;
            int i16 = this.f25907d * 2;
            this.f25907d = i16;
            this.f25914k = false;
            this.f25913j = i13 - 1;
            this.f25911h = Arrays.copyOf(this.f25911h, i16);
            this.f25909f = Arrays.copyOf(this.f25909f, this.f25907d);
            this.f25910g = Arrays.copyOf(this.f25910g, this.f25907d);
        }
        this.f25909f[i13] = iVar.f25965s;
        this.f25911h[i13] = f8;
        if (i9 != -1) {
            int[] iArr6 = this.f25910g;
            iArr6[i13] = iArr6[i9];
            iArr6[i9] = i13;
        } else {
            this.f25910g[i13] = this.f25912i;
            this.f25912i = i13;
        }
        iVar.C++;
        iVar.c(this.f25905b);
        int i17 = this.f25904a + 1;
        this.f25904a = i17;
        if (!this.f25914k) {
            this.f25913j++;
        }
        int[] iArr7 = this.f25909f;
        if (i17 >= iArr7.length) {
            this.f25914k = true;
        }
        if (this.f25913j >= iArr7.length) {
            this.f25914k = true;
            this.f25913j = iArr7.length - 1;
        }
    }

    @Override // s.b.a
    public int b() {
        return this.f25904a;
    }

    @Override // s.b.a
    public float c(b bVar, boolean z7) {
        float f8 = f(bVar.f25915a);
        d(bVar.f25915a, z7);
        b.a aVar = bVar.f25919e;
        int b8 = aVar.b();
        for (int i7 = 0; i7 < b8; i7++) {
            i e8 = aVar.e(i7);
            k(e8, aVar.f(e8) * f8, z7);
        }
        return f8;
    }

    @Override // s.b.a
    public final void clear() {
        int i7 = this.f25912i;
        for (int i8 = 0; i7 != -1 && i8 < this.f25904a; i8++) {
            i iVar = this.f25906c.f25924d[this.f25909f[i7]];
            if (iVar != null) {
                iVar.k(this.f25905b);
            }
            i7 = this.f25910g[i7];
        }
        this.f25912i = -1;
        this.f25913j = -1;
        this.f25914k = false;
        this.f25904a = 0;
    }

    @Override // s.b.a
    public final float d(i iVar, boolean z7) {
        if (this.f25908e == iVar) {
            this.f25908e = null;
        }
        int i7 = this.f25912i;
        if (i7 == -1) {
            return 0.0f;
        }
        int i8 = 0;
        int i9 = -1;
        while (i7 != -1 && i8 < this.f25904a) {
            if (this.f25909f[i7] == iVar.f25965s) {
                if (i7 == this.f25912i) {
                    this.f25912i = this.f25910g[i7];
                } else {
                    int[] iArr = this.f25910g;
                    iArr[i9] = iArr[i7];
                }
                if (z7) {
                    iVar.k(this.f25905b);
                }
                iVar.C--;
                this.f25904a--;
                this.f25909f[i7] = -1;
                if (this.f25914k) {
                    this.f25913j = i7;
                }
                return this.f25911h[i7];
            }
            i8++;
            i9 = i7;
            i7 = this.f25910g[i7];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public i e(int i7) {
        int i8 = this.f25912i;
        for (int i9 = 0; i8 != -1 && i9 < this.f25904a; i9++) {
            if (i9 == i7) {
                return this.f25906c.f25924d[this.f25909f[i8]];
            }
            i8 = this.f25910g[i8];
        }
        return null;
    }

    @Override // s.b.a
    public final float f(i iVar) {
        int i7 = this.f25912i;
        for (int i8 = 0; i7 != -1 && i8 < this.f25904a; i8++) {
            if (this.f25909f[i7] == iVar.f25965s) {
                return this.f25911h[i7];
            }
            i7 = this.f25910g[i7];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public void g() {
        int i7 = this.f25912i;
        for (int i8 = 0; i7 != -1 && i8 < this.f25904a; i8++) {
            float[] fArr = this.f25911h;
            fArr[i7] = fArr[i7] * (-1.0f);
            i7 = this.f25910g[i7];
        }
    }

    @Override // s.b.a
    public float h(int i7) {
        int i8 = this.f25912i;
        for (int i9 = 0; i8 != -1 && i9 < this.f25904a; i9++) {
            if (i9 == i7) {
                return this.f25911h[i8];
            }
            i8 = this.f25910g[i8];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public boolean i(i iVar) {
        int i7 = this.f25912i;
        if (i7 == -1) {
            return false;
        }
        for (int i8 = 0; i7 != -1 && i8 < this.f25904a; i8++) {
            if (this.f25909f[i7] == iVar.f25965s) {
                return true;
            }
            i7 = this.f25910g[i7];
        }
        return false;
    }

    @Override // s.b.a
    public void j(float f8) {
        int i7 = this.f25912i;
        for (int i8 = 0; i7 != -1 && i8 < this.f25904a; i8++) {
            float[] fArr = this.f25911h;
            fArr[i7] = fArr[i7] / f8;
            i7 = this.f25910g[i7];
        }
    }

    @Override // s.b.a
    public void k(i iVar, float f8, boolean z7) {
        float f9 = f25903l;
        if (f8 <= (-f9) || f8 >= f9) {
            int i7 = this.f25912i;
            if (i7 == -1) {
                this.f25912i = 0;
                this.f25911h[0] = f8;
                this.f25909f[0] = iVar.f25965s;
                this.f25910g[0] = -1;
                iVar.C++;
                iVar.c(this.f25905b);
                this.f25904a++;
                if (this.f25914k) {
                    return;
                }
                int i8 = this.f25913j + 1;
                this.f25913j = i8;
                int[] iArr = this.f25909f;
                if (i8 >= iArr.length) {
                    this.f25914k = true;
                    this.f25913j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i7 != -1 && i10 < this.f25904a; i10++) {
                int i11 = this.f25909f[i7];
                int i12 = iVar.f25965s;
                if (i11 == i12) {
                    float[] fArr = this.f25911h;
                    float f10 = fArr[i7] + f8;
                    float f11 = f25903l;
                    if (f10 > (-f11) && f10 < f11) {
                        f10 = 0.0f;
                    }
                    fArr[i7] = f10;
                    if (f10 == 0.0f) {
                        if (i7 == this.f25912i) {
                            this.f25912i = this.f25910g[i7];
                        } else {
                            int[] iArr2 = this.f25910g;
                            iArr2[i9] = iArr2[i7];
                        }
                        if (z7) {
                            iVar.k(this.f25905b);
                        }
                        if (this.f25914k) {
                            this.f25913j = i7;
                        }
                        iVar.C--;
                        this.f25904a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i7;
                }
                i7 = this.f25910g[i7];
            }
            int i13 = this.f25913j;
            int i14 = i13 + 1;
            if (this.f25914k) {
                int[] iArr3 = this.f25909f;
                if (iArr3[i13] != -1) {
                    i13 = iArr3.length;
                }
            } else {
                i13 = i14;
            }
            int[] iArr4 = this.f25909f;
            if (i13 >= iArr4.length && this.f25904a < iArr4.length) {
                int i15 = 0;
                while (true) {
                    int[] iArr5 = this.f25909f;
                    if (i15 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i15] == -1) {
                        i13 = i15;
                        break;
                    }
                    i15++;
                }
            }
            int[] iArr6 = this.f25909f;
            if (i13 >= iArr6.length) {
                i13 = iArr6.length;
                int i16 = this.f25907d * 2;
                this.f25907d = i16;
                this.f25914k = false;
                this.f25913j = i13 - 1;
                this.f25911h = Arrays.copyOf(this.f25911h, i16);
                this.f25909f = Arrays.copyOf(this.f25909f, this.f25907d);
                this.f25910g = Arrays.copyOf(this.f25910g, this.f25907d);
            }
            this.f25909f[i13] = iVar.f25965s;
            this.f25911h[i13] = f8;
            if (i9 != -1) {
                int[] iArr7 = this.f25910g;
                iArr7[i13] = iArr7[i9];
                iArr7[i9] = i13;
            } else {
                this.f25910g[i13] = this.f25912i;
                this.f25912i = i13;
            }
            iVar.C++;
            iVar.c(this.f25905b);
            this.f25904a++;
            if (!this.f25914k) {
                this.f25913j++;
            }
            int i17 = this.f25913j;
            int[] iArr8 = this.f25909f;
            if (i17 >= iArr8.length) {
                this.f25914k = true;
                this.f25913j = iArr8.length - 1;
            }
        }
    }

    public String toString() {
        int i7 = this.f25912i;
        String str = "";
        for (int i8 = 0; i7 != -1 && i8 < this.f25904a; i8++) {
            str = ((str + " -> ") + this.f25911h[i7] + " : ") + this.f25906c.f25924d[this.f25909f[i7]];
            i7 = this.f25910g[i7];
        }
        return str;
    }
}
