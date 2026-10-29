package s;

import java.util.Arrays;
import java.util.Comparator;
import s.b;

/* compiled from: MyApplication */
public class h extends s.b {

    /* renamed from: g, reason: collision with root package name */
    private int f25953g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f25954h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f25955i;

    /* renamed from: j, reason: collision with root package name */
    private int f25956j;

    /* renamed from: k, reason: collision with root package name */
    b f25957k;

    /* renamed from: l, reason: collision with root package name */
    c f25958l;

    /* compiled from: MyApplication */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f25965s - iVar2.f25965s;
        }
    }

    /* compiled from: MyApplication */
    class b {

        /* renamed from: a, reason: collision with root package name */
        i f25960a;

        /* renamed from: b, reason: collision with root package name */
        h f25961b;

        public b(h hVar) {
            this.f25961b = hVar;
        }

        public boolean a(i iVar, float f8) {
            boolean z7 = true;
            if (!this.f25960a.f25963q) {
                for (int i7 = 0; i7 < 9; i7++) {
                    float f9 = iVar.f25971y[i7];
                    if (f9 != 0.0f) {
                        float f10 = f9 * f8;
                        if (Math.abs(f10) < 1.0E-4f) {
                            f10 = 0.0f;
                        }
                        this.f25960a.f25971y[i7] = f10;
                    } else {
                        this.f25960a.f25971y[i7] = 0.0f;
                    }
                }
                return true;
            }
            for (int i8 = 0; i8 < 9; i8++) {
                float[] fArr = this.f25960a.f25971y;
                float f11 = fArr[i8] + (iVar.f25971y[i8] * f8);
                fArr[i8] = f11;
                if (Math.abs(f11) < 1.0E-4f) {
                    this.f25960a.f25971y[i8] = 0.0f;
                } else {
                    z7 = false;
                }
            }
            if (z7) {
                h.this.G(this.f25960a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f25960a = iVar;
        }

        public final boolean c() {
            for (int i7 = 8; i7 >= 0; i7--) {
                float f8 = this.f25960a.f25971y[i7];
                if (f8 > 0.0f) {
                    return false;
                }
                if (f8 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i7 = 8;
            while (true) {
                if (i7 < 0) {
                    break;
                }
                float f8 = iVar.f25971y[i7];
                float f9 = this.f25960a.f25971y[i7];
                if (f9 == f8) {
                    i7--;
                } else if (f9 < f8) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f25960a.f25971y, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f25960a != null) {
                for (int i7 = 0; i7 < 9; i7++) {
                    str = str + this.f25960a.f25971y[i7] + " ";
                }
            }
            return str + "] " + this.f25960a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f25953g = 128;
        this.f25954h = new i[128];
        this.f25955i = new i[128];
        this.f25956j = 0;
        this.f25957k = new b(this);
        this.f25958l = cVar;
    }

    private final void F(i iVar) {
        int i7;
        int i8 = this.f25956j + 1;
        i[] iVarArr = this.f25954h;
        if (i8 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f25954h = iVarArr2;
            this.f25955i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f25954h;
        int i9 = this.f25956j;
        iVarArr3[i9] = iVar;
        int i10 = i9 + 1;
        this.f25956j = i10;
        if (i10 > 1 && iVarArr3[i9].f25965s > iVar.f25965s) {
            int i11 = 0;
            while (true) {
                i7 = this.f25956j;
                if (i11 >= i7) {
                    break;
                }
                this.f25955i[i11] = this.f25954h[i11];
                i11++;
            }
            Arrays.sort(this.f25955i, 0, i7, new a());
            for (int i12 = 0; i12 < this.f25956j; i12++) {
                this.f25954h[i12] = this.f25955i[i12];
            }
        }
        iVar.f25963q = true;
        iVar.c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i7 = 0;
        while (i7 < this.f25956j) {
            if (this.f25954h[i7] == iVar) {
                while (true) {
                    int i8 = this.f25956j;
                    if (i7 >= i8 - 1) {
                        this.f25956j = i8 - 1;
                        iVar.f25963q = false;
                        return;
                    } else {
                        i[] iVarArr = this.f25954h;
                        int i9 = i7 + 1;
                        iVarArr[i7] = iVarArr[i9];
                        i7 = i9;
                    }
                }
            } else {
                i7++;
            }
        }
    }

    @Override // s.b
    public void B(d dVar, s.b bVar, boolean z7) {
        i iVar = bVar.f25915a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f25919e;
        int b8 = aVar.b();
        for (int i7 = 0; i7 < b8; i7++) {
            i e8 = aVar.e(i7);
            float h8 = aVar.h(i7);
            this.f25957k.b(e8);
            if (this.f25957k.a(iVar, h8)) {
                F(e8);
            }
            this.f25916b += bVar.f25916b * h8;
        }
        G(iVar);
    }

    @Override // s.b, s.d.a
    public void a(i iVar) {
        this.f25957k.b(iVar);
        this.f25957k.e();
        iVar.f25971y[iVar.f25967u] = 1.0f;
        F(iVar);
    }

    @Override // s.b, s.d.a
    public i b(d dVar, boolean[] zArr) {
        int i7 = -1;
        for (int i8 = 0; i8 < this.f25956j; i8++) {
            i iVar = this.f25954h[i8];
            if (!zArr[iVar.f25965s]) {
                this.f25957k.b(iVar);
                if (i7 == -1) {
                    if (!this.f25957k.c()) {
                    }
                    i7 = i8;
                } else {
                    if (!this.f25957k.d(this.f25954h[i7])) {
                    }
                    i7 = i8;
                }
            }
        }
        if (i7 == -1) {
            return null;
        }
        return this.f25954h[i7];
    }

    @Override // s.b, s.d.a
    public void clear() {
        this.f25956j = 0;
        this.f25916b = 0.0f;
    }

    @Override // s.b, s.d.a
    public boolean isEmpty() {
        return this.f25956j == 0;
    }

    @Override // s.b
    public String toString() {
        String str = " goal -> (" + this.f25916b + ") : ";
        for (int i7 = 0; i7 < this.f25956j; i7++) {
            this.f25957k.b(this.f25954h[i7]);
            str = str + this.f25957k + " ";
        }
        return str;
    }
}
