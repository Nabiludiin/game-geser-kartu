package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public abstract class b4 extends t2 {

    /* renamed from: q, reason: collision with root package name */
    private final d4 f21487q;

    /* renamed from: r, reason: collision with root package name */
    protected d4 f21488r;

    protected b4(d4 d4Var) {
        this.f21487q = d4Var;
        if (d4Var.A()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f21488r = d4Var.q();
    }

    private static void b(Object obj, Object obj2) {
        g5.a().b(obj.getClass()).g(obj, obj2);
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final b4 clone() {
        b4 b4Var = (b4) this.f21487q.h(5, null, null);
        b4Var.f21488r = f();
        return b4Var;
    }

    public final b4 k(d4 d4Var) {
        if (!this.f21487q.equals(d4Var)) {
            if (!this.f21488r.A()) {
                o();
            }
            b(this.f21488r, d4Var);
        }
        return this;
    }

    public final d4 l() {
        d4 f8 = f();
        if (f8.m()) {
            return f8;
        }
        throw new o5(f8);
    }

    @Override // com.google.android.gms.internal.play_billing.y4
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public d4 f() {
        if (!this.f21488r.A()) {
            return this.f21488r;
        }
        this.f21488r.w();
        return this.f21488r;
    }

    protected final void n() {
        if (this.f21488r.A()) {
            return;
        }
        o();
    }

    protected void o() {
        d4 q7 = this.f21487q.q();
        b(q7, this.f21488r);
        this.f21488r = q7;
    }
}
