package s;

import java.util.ArrayList;
import s.d;
import s.i;

/* compiled from: MyApplication */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f25919e;

    /* renamed from: a, reason: collision with root package name */
    i f25915a = null;

    /* renamed from: b, reason: collision with root package name */
    float f25916b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f25917c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f25918d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    boolean f25920f = false;

    /* compiled from: MyApplication */
    public interface a {
        void a(i iVar, float f8);

        int b();

        float c(b bVar, boolean z7);

        void clear();

        float d(i iVar, boolean z7);

        i e(int i7);

        float f(i iVar);

        void g();

        float h(int i7);

        boolean i(i iVar);

        void j(float f8);

        void k(i iVar, float f8, boolean z7);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.C <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int b8 = this.f25919e.b();
        i iVar2 = null;
        float f8 = 0.0f;
        for (int i7 = 0; i7 < b8; i7++) {
            float h8 = this.f25919e.h(i7);
            if (h8 < 0.0f) {
                i e8 = this.f25919e.e(i7);
                if ((zArr == null || !zArr[e8.f25965s]) && e8 != iVar && (((aVar = e8.f25972z) == i.a.SLACK || aVar == i.a.ERROR) && h8 < f8)) {
                    f8 = h8;
                    iVar2 = e8;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z7) {
        if (iVar == null || !iVar.f25969w) {
            return;
        }
        this.f25916b += iVar.f25968v * this.f25919e.f(iVar);
        this.f25919e.d(iVar, z7);
        if (z7) {
            iVar.k(this);
        }
        if (d.f25927t && this.f25919e.b() == 0) {
            this.f25920f = true;
            dVar.f25933a = true;
        }
    }

    public void B(d dVar, b bVar, boolean z7) {
        this.f25916b += bVar.f25916b * this.f25919e.c(bVar, z7);
        if (z7) {
            bVar.f25915a.k(this);
        }
        if (d.f25927t && this.f25915a != null && this.f25919e.b() == 0) {
            this.f25920f = true;
            dVar.f25933a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z7) {
        if (iVar == null || !iVar.D) {
            return;
        }
        float f8 = this.f25919e.f(iVar);
        this.f25916b += iVar.F * f8;
        this.f25919e.d(iVar, z7);
        if (z7) {
            iVar.k(this);
        }
        this.f25919e.k(dVar.f25946n.f25924d[iVar.E], f8, z7);
        if (d.f25927t && this.f25919e.b() == 0) {
            this.f25920f = true;
            dVar.f25933a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f25939g.length == 0) {
            return;
        }
        boolean z7 = false;
        while (!z7) {
            int b8 = this.f25919e.b();
            for (int i7 = 0; i7 < b8; i7++) {
                i e8 = this.f25919e.e(i7);
                if (e8.f25966t != -1 || e8.f25969w || e8.D) {
                    this.f25918d.add(e8);
                }
            }
            int size = this.f25918d.size();
            if (size > 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    i iVar = (i) this.f25918d.get(i8);
                    if (iVar.f25969w) {
                        A(dVar, iVar, true);
                    } else if (iVar.D) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f25939g[iVar.f25966t], true);
                    }
                }
                this.f25918d.clear();
            } else {
                z7 = true;
            }
        }
        if (d.f25927t && this.f25915a != null && this.f25919e.b() == 0) {
            this.f25920f = true;
            dVar.f25933a = true;
        }
    }

    @Override // s.d.a
    public void a(i iVar) {
        int i7 = iVar.f25967u;
        float f8 = 1.0f;
        if (i7 != 1) {
            if (i7 == 2) {
                f8 = 1000.0f;
            } else if (i7 == 3) {
                f8 = 1000000.0f;
            } else if (i7 == 4) {
                f8 = 1.0E9f;
            } else if (i7 == 5) {
                f8 = 1.0E12f;
            }
        }
        this.f25919e.a(iVar, f8);
    }

    @Override // s.d.a
    public i b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // s.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f25915a = null;
            this.f25919e.clear();
            for (int i7 = 0; i7 < bVar.f25919e.b(); i7++) {
                this.f25919e.k(bVar.f25919e.e(i7), bVar.f25919e.h(i7), true);
            }
        }
    }

    @Override // s.d.a
    public void clear() {
        this.f25919e.clear();
        this.f25915a = null;
        this.f25916b = 0.0f;
    }

    public b d(d dVar, int i7) {
        this.f25919e.a(dVar.o(i7, "ep"), 1.0f);
        this.f25919e.a(dVar.o(i7, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i7) {
        this.f25919e.a(iVar, i7);
        return this;
    }

    boolean f(d dVar) {
        boolean z7;
        i g8 = g(dVar);
        if (g8 == null) {
            z7 = true;
        } else {
            x(g8);
            z7 = false;
        }
        if (this.f25919e.b() == 0) {
            this.f25920f = true;
        }
        return z7;
    }

    i g(d dVar) {
        boolean u7;
        boolean u8;
        int b8 = this.f25919e.b();
        i iVar = null;
        float f8 = 0.0f;
        float f9 = 0.0f;
        boolean z7 = false;
        boolean z8 = false;
        i iVar2 = null;
        for (int i7 = 0; i7 < b8; i7++) {
            float h8 = this.f25919e.h(i7);
            i e8 = this.f25919e.e(i7);
            if (e8.f25972z == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u8 = u(e8, dVar);
                } else if (f8 > h8) {
                    u8 = u(e8, dVar);
                } else if (!z7 && u(e8, dVar)) {
                    f8 = h8;
                    iVar = e8;
                    z7 = true;
                }
                z7 = u8;
                f8 = h8;
                iVar = e8;
            } else if (iVar == null && h8 < 0.0f) {
                if (iVar2 == null) {
                    u7 = u(e8, dVar);
                } else if (f9 > h8) {
                    u7 = u(e8, dVar);
                } else if (!z8 && u(e8, dVar)) {
                    f9 = h8;
                    iVar2 = e8;
                    z8 = true;
                }
                z8 = u7;
                f9 = h8;
                iVar2 = e8;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // s.d.a
    public i getKey() {
        return this.f25915a;
    }

    b h(i iVar, i iVar2, int i7, float f8, i iVar3, i iVar4, int i8) {
        if (iVar2 == iVar3) {
            this.f25919e.a(iVar, 1.0f);
            this.f25919e.a(iVar4, 1.0f);
            this.f25919e.a(iVar2, -2.0f);
            return this;
        }
        if (f8 == 0.5f) {
            this.f25919e.a(iVar, 1.0f);
            this.f25919e.a(iVar2, -1.0f);
            this.f25919e.a(iVar3, -1.0f);
            this.f25919e.a(iVar4, 1.0f);
            if (i7 > 0 || i8 > 0) {
                this.f25916b = (-i7) + i8;
                return this;
            }
        } else {
            if (f8 <= 0.0f) {
                this.f25919e.a(iVar, -1.0f);
                this.f25919e.a(iVar2, 1.0f);
                this.f25916b = i7;
                return this;
            }
            if (f8 >= 1.0f) {
                this.f25919e.a(iVar4, -1.0f);
                this.f25919e.a(iVar3, 1.0f);
                this.f25916b = -i8;
                return this;
            }
            float f9 = 1.0f - f8;
            this.f25919e.a(iVar, f9 * 1.0f);
            this.f25919e.a(iVar2, f9 * (-1.0f));
            this.f25919e.a(iVar3, (-1.0f) * f8);
            this.f25919e.a(iVar4, 1.0f * f8);
            if (i7 > 0 || i8 > 0) {
                this.f25916b = ((-i7) * f9) + (i8 * f8);
                return this;
            }
        }
        return this;
    }

    b i(i iVar, int i7) {
        this.f25915a = iVar;
        float f8 = i7;
        iVar.f25968v = f8;
        this.f25916b = f8;
        this.f25920f = true;
        return this;
    }

    @Override // s.d.a
    public boolean isEmpty() {
        return this.f25915a == null && this.f25916b == 0.0f && this.f25919e.b() == 0;
    }

    b j(i iVar, i iVar2, float f8) {
        this.f25919e.a(iVar, -1.0f);
        this.f25919e.a(iVar2, f8);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f8) {
        this.f25919e.a(iVar, -1.0f);
        this.f25919e.a(iVar2, 1.0f);
        this.f25919e.a(iVar3, f8);
        this.f25919e.a(iVar4, -f8);
        return this;
    }

    public b l(float f8, float f9, float f10, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f25916b = 0.0f;
        if (f9 == 0.0f || f8 == f10) {
            this.f25919e.a(iVar, 1.0f);
            this.f25919e.a(iVar2, -1.0f);
            this.f25919e.a(iVar4, 1.0f);
            this.f25919e.a(iVar3, -1.0f);
            return this;
        }
        if (f8 == 0.0f) {
            this.f25919e.a(iVar, 1.0f);
            this.f25919e.a(iVar2, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f25919e.a(iVar3, 1.0f);
            this.f25919e.a(iVar4, -1.0f);
            return this;
        }
        float f11 = (f8 / f9) / (f10 / f9);
        this.f25919e.a(iVar, 1.0f);
        this.f25919e.a(iVar2, -1.0f);
        this.f25919e.a(iVar4, f11);
        this.f25919e.a(iVar3, -f11);
        return this;
    }

    public b m(i iVar, int i7) {
        if (i7 < 0) {
            this.f25916b = i7 * (-1);
            this.f25919e.a(iVar, 1.0f);
            return this;
        }
        this.f25916b = i7;
        this.f25919e.a(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i7) {
        boolean z7 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z7 = true;
            }
            this.f25916b = i7;
        }
        if (z7) {
            this.f25919e.a(iVar, 1.0f);
            this.f25919e.a(iVar2, -1.0f);
            return this;
        }
        this.f25919e.a(iVar, -1.0f);
        this.f25919e.a(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i7) {
        boolean z7 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z7 = true;
            }
            this.f25916b = i7;
        }
        if (z7) {
            this.f25919e.a(iVar, 1.0f);
            this.f25919e.a(iVar2, -1.0f);
            this.f25919e.a(iVar3, -1.0f);
            return this;
        }
        this.f25919e.a(iVar, -1.0f);
        this.f25919e.a(iVar2, 1.0f);
        this.f25919e.a(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i7) {
        boolean z7 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z7 = true;
            }
            this.f25916b = i7;
        }
        if (z7) {
            this.f25919e.a(iVar, 1.0f);
            this.f25919e.a(iVar2, -1.0f);
            this.f25919e.a(iVar3, 1.0f);
            return this;
        }
        this.f25919e.a(iVar, -1.0f);
        this.f25919e.a(iVar2, 1.0f);
        this.f25919e.a(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f8) {
        this.f25919e.a(iVar3, 0.5f);
        this.f25919e.a(iVar4, 0.5f);
        this.f25919e.a(iVar, -0.5f);
        this.f25919e.a(iVar2, -0.5f);
        this.f25916b = -f8;
        return this;
    }

    void r() {
        float f8 = this.f25916b;
        if (f8 < 0.0f) {
            this.f25916b = f8 * (-1.0f);
            this.f25919e.g();
        }
    }

    boolean s() {
        i iVar = this.f25915a;
        if (iVar != null) {
            return iVar.f25972z == i.a.UNRESTRICTED || this.f25916b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f25919e.i(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f25915a;
        if (iVar2 != null) {
            this.f25919e.a(iVar2, -1.0f);
            this.f25915a.f25966t = -1;
            this.f25915a = null;
        }
        float d8 = this.f25919e.d(iVar, true) * (-1.0f);
        this.f25915a = iVar;
        if (d8 == 1.0f) {
            return;
        }
        this.f25916b /= d8;
        this.f25919e.j(d8);
    }

    public void y() {
        this.f25915a = null;
        this.f25919e.clear();
        this.f25916b = 0.0f;
        this.f25920f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f25919e = new s.a(this, cVar);
    }
}
