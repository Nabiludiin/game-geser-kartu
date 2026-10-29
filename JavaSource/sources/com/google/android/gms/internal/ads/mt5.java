package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class mt5 extends pt5 implements Comparable {
    private final int A;
    private final int B;
    private final int C;
    private final boolean D;

    /* renamed from: u, reason: collision with root package name */
    private final int f12418u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f12419v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f12420w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f12421x;

    /* renamed from: y, reason: collision with root package name */
    private final int f12422y;

    /* renamed from: z, reason: collision with root package name */
    private final int f12423z;

    public mt5(int i7, b00 b00Var, int i8, zs5 zs5Var, int i9, String str, String str2) {
        super(i7, b00Var, i8);
        int i10;
        int i11 = 0;
        this.f12419v = rc5.a(i9, false);
        int i12 = this.f14107t.f7765e;
        int i13 = zs5Var.C;
        this.f12420w = 1 == (i12 & 1);
        this.f12421x = (i12 & 2) != 0;
        w04 n7 = str2 != null ? w04.n(str2) : zs5Var.f4761y.isEmpty() ? w04.n("") : zs5Var.f4761y;
        int i14 = 0;
        while (true) {
            if (i14 >= n7.size()) {
                i10 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                i10 = xt5.o(this.f14107t, (String) n7.get(i14), false);
                if (i10 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f12422y = i14;
        this.f12423z = i10;
        int r7 = xt5.r(this.f14107t.f7766f, str2 != null ? 1088 : 0);
        this.A = r7;
        eq5 eq5Var = this.f14107t;
        this.D = (1088 & eq5Var.f7766f) != 0;
        int s7 = xt5.s(eq5Var, zs5Var.f4762z);
        this.B = s7;
        int o7 = xt5.o(this.f14107t, str, xt5.n(str) == null);
        this.C = o7;
        boolean z7 = i10 > 0 || (zs5Var.f4761y.isEmpty() && r7 > 0) || ((zs5Var.f4761y.isEmpty() && s7 != Integer.MAX_VALUE) || this.f12420w || (this.f12421x && o7 > 0));
        if (rc5.a(i9, zs5Var.U) && z7) {
            i11 = 1;
        }
        this.f12418u = i11;
    }

    @Override // com.google.android.gms.internal.ads.pt5
    public final int a() {
        return this.f12418u;
    }

    @Override // com.google.android.gms.internal.ads.pt5
    public final /* bridge */ /* synthetic */ boolean c(pt5 pt5Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(mt5 mt5Var) {
        j04 a8 = j04.f().d(this.f12419v, mt5Var.f12419v).a(Integer.valueOf(this.f12422y), Integer.valueOf(mt5Var.f12422y), p24.b().a());
        int i7 = this.f12423z;
        j04 b8 = a8.b(i7, mt5Var.f12423z);
        int i8 = this.A;
        j04 b9 = b8.b(i8, mt5Var.A).a(Integer.valueOf(this.B), Integer.valueOf(mt5Var.B), p24.b().a()).d(this.f12420w, mt5Var.f12420w).a(Boolean.valueOf(this.f12421x), Boolean.valueOf(mt5Var.f12421x), i7 == 0 ? p24.b() : p24.b().a()).b(this.C, mt5Var.C);
        if (i8 == 0) {
            b9 = b9.c(this.D, mt5Var.D);
        }
        return b9.e();
    }
}
