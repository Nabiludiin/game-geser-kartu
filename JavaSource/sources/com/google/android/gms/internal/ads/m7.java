package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class m7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12096a;

    /* renamed from: b, reason: collision with root package name */
    public int f12097b;

    /* renamed from: c, reason: collision with root package name */
    public int f12098c;

    /* renamed from: d, reason: collision with root package name */
    public long f12099d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f12100e;

    /* renamed from: f, reason: collision with root package name */
    private final y82 f12101f;

    /* renamed from: g, reason: collision with root package name */
    private final y82 f12102g;

    /* renamed from: h, reason: collision with root package name */
    private int f12103h;

    /* renamed from: i, reason: collision with root package name */
    private int f12104i;

    public m7(y82 y82Var, y82 y82Var2, boolean z7) {
        this.f12102g = y82Var;
        this.f12101f = y82Var2;
        this.f12100e = z7;
        y82Var2.G(12);
        this.f12096a = y82Var2.h();
        y82Var.G(12);
        this.f12104i = y82Var.h();
        q2.a(y82Var.b() == 1, "first_chunk must be 1");
        this.f12097b = -1;
    }

    public final boolean a() {
        int i7 = this.f12097b + 1;
        this.f12097b = i7;
        if (i7 == this.f12096a) {
            return false;
        }
        this.f12099d = this.f12100e ? this.f12101f.j() : this.f12101f.Y();
        if (this.f12097b == this.f12103h) {
            y82 y82Var = this.f12102g;
            this.f12098c = y82Var.h();
            y82Var.J(4);
            int i8 = this.f12104i - 1;
            this.f12104i = i8;
            this.f12103h = i8 > 0 ? (-1) + y82Var.h() : -1;
        }
        return true;
    }
}
