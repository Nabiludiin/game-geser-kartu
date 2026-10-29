package s;

import java.util.Arrays;
import s.b;

/* compiled from: MyApplication */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f25979n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f25980a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f25981b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f25982c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f25983d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f25984e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f25985f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f25986g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f25987h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f25988i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f25989j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f25990k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f25991l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f25992m;

    j(b bVar, c cVar) {
        this.f25991l = bVar;
        this.f25992m = cVar;
        clear();
    }

    private void l(i iVar, int i7) {
        int[] iArr;
        int i8 = iVar.f25965s % this.f25982c;
        int[] iArr2 = this.f25983d;
        int i9 = iArr2[i8];
        if (i9 == -1) {
            iArr2[i8] = i7;
        } else {
            while (true) {
                iArr = this.f25984e;
                int i10 = iArr[i9];
                if (i10 == -1) {
                    break;
                } else {
                    i9 = i10;
                }
            }
            iArr[i9] = i7;
        }
        this.f25984e[i7] = -1;
    }

    private void m(int i7, i iVar, float f8) {
        this.f25985f[i7] = iVar.f25965s;
        this.f25986g[i7] = f8;
        this.f25987h[i7] = -1;
        this.f25988i[i7] = -1;
        iVar.c(this.f25991l);
        iVar.C++;
        this.f25989j++;
    }

    private int n() {
        for (int i7 = 0; i7 < this.f25981b; i7++) {
            if (this.f25985f[i7] == -1) {
                return i7;
            }
        }
        return -1;
    }

    private void o() {
        int i7 = this.f25981b * 2;
        this.f25985f = Arrays.copyOf(this.f25985f, i7);
        this.f25986g = Arrays.copyOf(this.f25986g, i7);
        this.f25987h = Arrays.copyOf(this.f25987h, i7);
        this.f25988i = Arrays.copyOf(this.f25988i, i7);
        this.f25984e = Arrays.copyOf(this.f25984e, i7);
        for (int i8 = this.f25981b; i8 < i7; i8++) {
            this.f25985f[i8] = -1;
            this.f25984e[i8] = -1;
        }
        this.f25981b = i7;
    }

    private void q(int i7, i iVar, float f8) {
        int n7 = n();
        m(n7, iVar, f8);
        if (i7 != -1) {
            this.f25987h[n7] = i7;
            int[] iArr = this.f25988i;
            iArr[n7] = iArr[i7];
            iArr[i7] = n7;
        } else {
            this.f25987h[n7] = -1;
            if (this.f25989j > 0) {
                this.f25988i[n7] = this.f25990k;
                this.f25990k = n7;
            } else {
                this.f25988i[n7] = -1;
            }
        }
        int i8 = this.f25988i[n7];
        if (i8 != -1) {
            this.f25987h[i8] = n7;
        }
        l(iVar, n7);
    }

    private void r(i iVar) {
        int[] iArr;
        int i7;
        int i8 = iVar.f25965s;
        int i9 = i8 % this.f25982c;
        int[] iArr2 = this.f25983d;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            return;
        }
        if (this.f25985f[i10] == i8) {
            int[] iArr3 = this.f25984e;
            iArr2[i9] = iArr3[i10];
            iArr3[i10] = -1;
            return;
        }
        while (true) {
            iArr = this.f25984e;
            i7 = iArr[i10];
            if (i7 == -1 || this.f25985f[i7] == i8) {
                break;
            } else {
                i10 = i7;
            }
        }
        if (i7 == -1 || this.f25985f[i7] != i8) {
            return;
        }
        iArr[i10] = iArr[i7];
        iArr[i7] = -1;
    }

    @Override // s.b.a
    public void a(i iVar, float f8) {
        float f9 = f25979n;
        if (f8 > (-f9) && f8 < f9) {
            d(iVar, true);
            return;
        }
        if (this.f25989j == 0) {
            m(0, iVar, f8);
            l(iVar, 0);
            this.f25990k = 0;
            return;
        }
        int p7 = p(iVar);
        if (p7 != -1) {
            this.f25986g[p7] = f8;
            return;
        }
        if (this.f25989j + 1 >= this.f25981b) {
            o();
        }
        int i7 = this.f25989j;
        int i8 = this.f25990k;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f25985f[i8];
            int i12 = iVar.f25965s;
            if (i11 == i12) {
                this.f25986g[i8] = f8;
                return;
            }
            if (i11 < i12) {
                i9 = i8;
            }
            i8 = this.f25988i[i8];
            if (i8 == -1) {
                break;
            }
        }
        q(i9, iVar, f8);
    }

    @Override // s.b.a
    public int b() {
        return this.f25989j;
    }

    @Override // s.b.a
    public float c(b bVar, boolean z7) {
        float f8 = f(bVar.f25915a);
        d(bVar.f25915a, z7);
        j jVar = (j) bVar.f25919e;
        int b8 = jVar.b();
        int i7 = 0;
        int i8 = 0;
        while (i7 < b8) {
            int i9 = jVar.f25985f[i8];
            if (i9 != -1) {
                k(this.f25992m.f25924d[i9], jVar.f25986g[i8] * f8, z7);
                i7++;
            }
            i8++;
        }
        return f8;
    }

    @Override // s.b.a
    public void clear() {
        int i7 = this.f25989j;
        for (int i8 = 0; i8 < i7; i8++) {
            i e8 = e(i8);
            if (e8 != null) {
                e8.k(this.f25991l);
            }
        }
        for (int i9 = 0; i9 < this.f25981b; i9++) {
            this.f25985f[i9] = -1;
            this.f25984e[i9] = -1;
        }
        for (int i10 = 0; i10 < this.f25982c; i10++) {
            this.f25983d[i10] = -1;
        }
        this.f25989j = 0;
        this.f25990k = -1;
    }

    @Override // s.b.a
    public float d(i iVar, boolean z7) {
        int p7 = p(iVar);
        if (p7 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f8 = this.f25986g[p7];
        if (this.f25990k == p7) {
            this.f25990k = this.f25988i[p7];
        }
        this.f25985f[p7] = -1;
        int[] iArr = this.f25987h;
        int i7 = iArr[p7];
        if (i7 != -1) {
            int[] iArr2 = this.f25988i;
            iArr2[i7] = iArr2[p7];
        }
        int i8 = this.f25988i[p7];
        if (i8 != -1) {
            iArr[i8] = iArr[p7];
        }
        this.f25989j--;
        iVar.C--;
        if (z7) {
            iVar.k(this.f25991l);
        }
        return f8;
    }

    @Override // s.b.a
    public i e(int i7) {
        int i8 = this.f25989j;
        if (i8 == 0) {
            return null;
        }
        int i9 = this.f25990k;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7 && i9 != -1) {
                return this.f25992m.f25924d[this.f25985f[i9]];
            }
            i9 = this.f25988i[i9];
            if (i9 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // s.b.a
    public float f(i iVar) {
        int p7 = p(iVar);
        if (p7 != -1) {
            return this.f25986g[p7];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public void g() {
        int i7 = this.f25989j;
        int i8 = this.f25990k;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f25986g;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.f25988i[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override // s.b.a
    public float h(int i7) {
        int i8 = this.f25989j;
        int i9 = this.f25990k;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7) {
                return this.f25986g[i9];
            }
            i9 = this.f25988i[i9];
            if (i9 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // s.b.a
    public boolean i(i iVar) {
        return p(iVar) != -1;
    }

    @Override // s.b.a
    public void j(float f8) {
        int i7 = this.f25989j;
        int i8 = this.f25990k;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f25986g;
            fArr[i8] = fArr[i8] / f8;
            i8 = this.f25988i[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override // s.b.a
    public void k(i iVar, float f8, boolean z7) {
        float f9 = f25979n;
        if (f8 <= (-f9) || f8 >= f9) {
            int p7 = p(iVar);
            if (p7 == -1) {
                a(iVar, f8);
                return;
            }
            float[] fArr = this.f25986g;
            float f10 = fArr[p7] + f8;
            fArr[p7] = f10;
            float f11 = f25979n;
            if (f10 <= (-f11) || f10 >= f11) {
                return;
            }
            fArr[p7] = 0.0f;
            d(iVar, z7);
        }
    }

    public int p(i iVar) {
        if (this.f25989j != 0 && iVar != null) {
            int i7 = iVar.f25965s;
            int i8 = this.f25983d[i7 % this.f25982c];
            if (i8 == -1) {
                return -1;
            }
            if (this.f25985f[i8] == i7) {
                return i8;
            }
            do {
                i8 = this.f25984e[i8];
                if (i8 == -1) {
                    break;
                }
            } while (this.f25985f[i8] != i7);
            if (i8 != -1 && this.f25985f[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i7 = this.f25989j;
        for (int i8 = 0; i8 < i7; i8++) {
            i e8 = e(i8);
            if (e8 != null) {
                String str2 = str + e8 + " = " + h(i8) + " ";
                int p7 = p(e8);
                String str3 = str2 + "[p: ";
                String str4 = (this.f25987h[p7] != -1 ? str3 + this.f25992m.f25924d[this.f25985f[this.f25987h[p7]]] : str3 + "none") + ", n: ";
                str = (this.f25988i[p7] != -1 ? str4 + this.f25992m.f25924d[this.f25985f[this.f25988i[p7]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
