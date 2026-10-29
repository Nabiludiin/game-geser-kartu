package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class f {

    /* renamed from: c, reason: collision with root package name */
    private boolean f7897c;

    /* renamed from: e, reason: collision with root package name */
    private int f7899e;

    /* renamed from: a, reason: collision with root package name */
    private e f7895a = new e();

    /* renamed from: b, reason: collision with root package name */
    private e f7896b = new e();

    /* renamed from: d, reason: collision with root package name */
    private long f7898d = -9223372036854775807L;

    public final void a() {
        this.f7895a.a();
        this.f7896b.a();
        this.f7897c = false;
        this.f7898d = -9223372036854775807L;
        this.f7899e = 0;
    }

    public final void b(long j7) {
        this.f7895a.f(j7);
        if (this.f7895a.b()) {
            this.f7897c = false;
        } else if (this.f7898d != -9223372036854775807L) {
            if (!this.f7897c || this.f7896b.c()) {
                this.f7896b.a();
                this.f7896b.f(this.f7898d);
            }
            this.f7897c = true;
            this.f7896b.f(j7);
        }
        if (this.f7897c && this.f7896b.b()) {
            e eVar = this.f7895a;
            this.f7895a = this.f7896b;
            this.f7896b = eVar;
            this.f7897c = false;
        }
        this.f7898d = j7;
        this.f7899e = this.f7895a.b() ? 0 : this.f7899e + 1;
    }

    public final boolean c() {
        return this.f7895a.b();
    }

    public final int d() {
        return this.f7899e;
    }

    public final long e() {
        if (this.f7895a.b()) {
            return this.f7895a.d();
        }
        return -9223372036854775807L;
    }

    public final long f() {
        if (this.f7895a.b()) {
            return this.f7895a.e();
        }
        return -9223372036854775807L;
    }

    public final float g() {
        if (this.f7895a.b()) {
            return (float) (1.0E9d / this.f7895a.e());
        }
        return -1.0f;
    }
}
