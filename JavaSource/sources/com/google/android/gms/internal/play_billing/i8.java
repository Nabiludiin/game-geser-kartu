package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class i8 {

    /* renamed from: a, reason: collision with root package name */
    Object f21570a;

    /* renamed from: b, reason: collision with root package name */
    m8 f21571b;

    /* renamed from: c, reason: collision with root package name */
    private o8 f21572c = o8.i();

    /* renamed from: d, reason: collision with root package name */
    private boolean f21573d;

    i8() {
    }

    final void a() {
        this.f21570a = null;
        this.f21571b = null;
        this.f21572c.d(null);
    }

    public final boolean b(Object obj) {
        this.f21573d = true;
        m8 m8Var = this.f21571b;
        boolean z7 = m8Var != null && m8Var.a(obj);
        if (z7) {
            this.f21570a = null;
            this.f21571b = null;
            this.f21572c = null;
        }
        return z7;
    }

    protected final void finalize() {
        o8 o8Var;
        m8 m8Var = this.f21571b;
        if (m8Var != null && !m8Var.isDone()) {
            m8Var.b(new j8("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f21570a))));
        }
        if (this.f21573d || (o8Var = this.f21572c) == null) {
            return;
        }
        o8Var.d(null);
    }
}
