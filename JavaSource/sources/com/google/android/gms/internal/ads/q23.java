package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class q23 {

    /* renamed from: a, reason: collision with root package name */
    private final p23 f14216a = new p23();

    /* renamed from: b, reason: collision with root package name */
    private int f14217b;

    /* renamed from: c, reason: collision with root package name */
    private int f14218c;

    /* renamed from: d, reason: collision with root package name */
    private int f14219d;

    /* renamed from: e, reason: collision with root package name */
    private int f14220e;

    /* renamed from: f, reason: collision with root package name */
    private int f14221f;

    q23() {
    }

    public final void a() {
        this.f14219d++;
    }

    public final void b() {
        this.f14220e++;
    }

    public final void c() {
        this.f14217b++;
        this.f14216a.f13641q = true;
    }

    public final void d() {
        this.f14218c++;
        this.f14216a.f13642r = true;
    }

    public final void e() {
        this.f14221f++;
    }

    public final p23 f() {
        p23 p23Var = this.f14216a;
        p23 clone = p23Var.clone();
        p23Var.f13641q = false;
        p23Var.f13642r = false;
        return clone;
    }

    public final String g() {
        return "\n\tPool does not exist: " + this.f14219d + "\n\tNew pools created: " + this.f14217b + "\n\tPools removed: " + this.f14218c + "\n\tEntries added: " + this.f14221f + "\n\tNo entries retrieved: " + this.f14220e + "\n";
    }
}
