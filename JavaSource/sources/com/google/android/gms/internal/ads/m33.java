package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class m33 {

    /* renamed from: a, reason: collision with root package name */
    private final long f12057a;

    /* renamed from: c, reason: collision with root package name */
    private long f12059c;

    /* renamed from: b, reason: collision with root package name */
    private final k33 f12058b = new k33();

    /* renamed from: d, reason: collision with root package name */
    private int f12060d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f12061e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f12062f = 0;

    public m33() {
        long a8 = r2.t.o().a();
        this.f12057a = a8;
        this.f12059c = a8;
    }

    public final void a() {
        this.f12059c = r2.t.o().a();
        this.f12060d++;
    }

    public final void b() {
        this.f12061e++;
        this.f12058b.f10877q = true;
    }

    public final void c() {
        this.f12062f++;
        this.f12058b.f10878r++;
    }

    public final long d() {
        return this.f12057a;
    }

    public final long e() {
        return this.f12059c;
    }

    public final int f() {
        return this.f12060d;
    }

    public final k33 g() {
        k33 k33Var = this.f12058b;
        k33 clone = k33Var.clone();
        k33Var.f10877q = false;
        k33Var.f10878r = 0;
        return clone;
    }

    public final String h() {
        return "Created: " + this.f12057a + " Last accessed: " + this.f12059c + " Accesses: " + this.f12060d + "\nEntries retrieved: Valid: " + this.f12061e + " Stale: " + this.f12062f;
    }
}
