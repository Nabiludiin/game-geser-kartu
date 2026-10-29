package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class b8 {

    /* renamed from: a, reason: collision with root package name */
    public final a4 f5609a;

    /* renamed from: d, reason: collision with root package name */
    public s8 f5612d;

    /* renamed from: e, reason: collision with root package name */
    public x7 f5613e;

    /* renamed from: f, reason: collision with root package name */
    public int f5614f;

    /* renamed from: g, reason: collision with root package name */
    public int f5615g;

    /* renamed from: h, reason: collision with root package name */
    public int f5616h;

    /* renamed from: i, reason: collision with root package name */
    public int f5617i;

    /* renamed from: j, reason: collision with root package name */
    private final eq5 f5618j;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5621m;

    /* renamed from: b, reason: collision with root package name */
    public final r8 f5610b = new r8();

    /* renamed from: c, reason: collision with root package name */
    public final y82 f5611c = new y82();

    /* renamed from: k, reason: collision with root package name */
    private final y82 f5619k = new y82(1);

    /* renamed from: l, reason: collision with root package name */
    private final y82 f5620l = new y82();

    public b8(a4 a4Var, s8 s8Var, x7 x7Var, eq5 eq5Var) {
        this.f5609a = a4Var;
        this.f5612d = s8Var;
        this.f5613e = x7Var;
        this.f5618j = eq5Var;
        a(s8Var, x7Var);
    }

    public final void a(s8 s8Var, x7 x7Var) {
        this.f5612d = s8Var;
        this.f5613e = x7Var;
        this.f5609a.c(this.f5618j);
        c();
    }

    public final void b(uj5 uj5Var) {
        p8 p8Var = this.f5612d.f15486a;
        x7 x7Var = this.f5610b.f14770a;
        String str = hi2.f9535a;
        q8 a8 = p8Var.a(x7Var.f18639a);
        uj5 f8 = uj5Var.f(a8 != null ? a8.f14287b : null);
        xn5 a9 = this.f5618j.a();
        a9.p0(f8);
        this.f5609a.c(a9.m());
    }

    public final void c() {
        r8 r8Var = this.f5610b;
        r8Var.f14773d = 0;
        r8Var.f14785p = 0L;
        r8Var.f14786q = false;
        r8Var.f14780k = false;
        r8Var.f14784o = false;
        r8Var.f14782m = null;
        this.f5614f = 0;
        this.f5616h = 0;
        this.f5615g = 0;
        this.f5617i = 0;
        this.f5621m = false;
    }

    public final long d() {
        if (!this.f5621m) {
            return this.f5612d.f15491f[this.f5614f];
        }
        r8 r8Var = this.f5610b;
        return r8Var.f14778i[this.f5614f];
    }

    public final long e() {
        return !this.f5621m ? this.f5612d.f15488c[this.f5614f] : this.f5610b.f14775f[this.f5616h];
    }

    public final int f() {
        return !this.f5621m ? this.f5612d.f15489d[this.f5614f] : this.f5610b.f14777h[this.f5614f];
    }

    public final int g() {
        int i7 = !this.f5621m ? this.f5612d.f15492g[this.f5614f] : this.f5610b.f14779j[this.f5614f] ? 1 : 0;
        return j() != null ? i7 | 1073741824 : i7;
    }

    public final boolean h() {
        this.f5614f++;
        if (!this.f5621m) {
            return false;
        }
        int i7 = this.f5615g + 1;
        this.f5615g = i7;
        int[] iArr = this.f5610b.f14776g;
        int i8 = this.f5616h;
        if (i7 != iArr[i8]) {
            return true;
        }
        this.f5616h = i8 + 1;
        this.f5615g = 0;
        return false;
    }

    public final int i(int i7, int i8) {
        y82 y82Var;
        q8 j7 = j();
        if (j7 == null) {
            return 0;
        }
        int i9 = j7.f14289d;
        if (i9 != 0) {
            y82Var = this.f5610b.f14783n;
        } else {
            byte[] bArr = j7.f14290e;
            String str = hi2.f9535a;
            y82 y82Var2 = this.f5620l;
            int length = bArr.length;
            y82Var2.A(bArr, length);
            y82Var = y82Var2;
            i9 = length;
        }
        r8 r8Var = this.f5610b;
        boolean b8 = r8Var.b(this.f5614f);
        boolean z7 = b8 || i8 != 0;
        y82 y82Var3 = this.f5619k;
        y82Var3.H()[0] = (byte) ((true != z7 ? 0 : 128) | i9);
        y82Var3.G(0);
        a4 a4Var = this.f5609a;
        a4Var.d(y82Var3, 1, 1);
        a4Var.d(y82Var, i9, 1);
        if (!z7) {
            return i9 + 1;
        }
        if (!b8) {
            y82 y82Var4 = this.f5611c;
            y82Var4.z(8);
            byte[] H = y82Var4.H();
            H[0] = 0;
            H[1] = 1;
            H[2] = 0;
            H[3] = (byte) i8;
            H[4] = (byte) ((i7 >> 24) & 255);
            H[5] = (byte) ((i7 >> 16) & 255);
            H[6] = (byte) ((i7 >> 8) & 255);
            H[7] = (byte) (i7 & 255);
            a4Var.d(y82Var4, 8, 1);
            return i9 + 9;
        }
        int i10 = i9 + 1;
        y82 y82Var5 = r8Var.f14783n;
        int S = y82Var5.S();
        y82Var5.J(-2);
        int i11 = (S * 6) + 2;
        if (i8 != 0) {
            y82 y82Var6 = this.f5611c;
            y82Var6.z(i11);
            byte[] H2 = y82Var6.H();
            y82Var5.L(H2, 0, i11);
            int i12 = (((H2[2] & 255) << 8) | (H2[3] & 255)) + i8;
            H2[2] = (byte) ((i12 >> 8) & 255);
            H2[3] = (byte) (i12 & 255);
            y82Var5 = y82Var6;
        }
        a4Var.d(y82Var5, i11, 1);
        return i10 + i11;
    }

    public final q8 j() {
        if (!this.f5621m) {
            return null;
        }
        r8 r8Var = this.f5610b;
        x7 x7Var = r8Var.f14770a;
        String str = hi2.f9535a;
        int i7 = x7Var.f18639a;
        q8 q8Var = r8Var.f14782m;
        if (q8Var == null) {
            q8Var = this.f5612d.f15486a.a(i7);
        }
        if (q8Var == null || !q8Var.f14286a) {
            return null;
        }
        return q8Var;
    }

    final /* synthetic */ boolean k() {
        return this.f5621m;
    }

    final /* synthetic */ void l(boolean z7) {
        this.f5621m = true;
    }
}
