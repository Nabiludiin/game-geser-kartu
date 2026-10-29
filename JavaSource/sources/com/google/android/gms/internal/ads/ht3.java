package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ht3 implements wk3 {

    /* renamed from: b, reason: collision with root package name */
    private kb4 f9686b;

    /* renamed from: c, reason: collision with root package name */
    private String f9687c;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9690f;

    /* renamed from: a, reason: collision with root package name */
    private final t44 f9685a = new t44();

    /* renamed from: d, reason: collision with root package name */
    private int f9688d = 8000;

    /* renamed from: e, reason: collision with root package name */
    private int f9689e = 8000;

    public final ht3 b(String str) {
        this.f9687c = str;
        return this;
    }

    public final ht3 c(int i7) {
        this.f9688d = i7;
        return this;
    }

    public final ht3 d(int i7) {
        this.f9689e = i7;
        return this;
    }

    public final ht3 e(boolean z7) {
        this.f9690f = true;
        return this;
    }

    public final ht3 f(kb4 kb4Var) {
        this.f9686b = kb4Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.wk3
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final nx3 a() {
        nx3 nx3Var = new nx3(this.f9687c, this.f9688d, this.f9689e, this.f9690f, false, this.f9685a, null, false, null);
        kb4 kb4Var = this.f9686b;
        if (kb4Var != null) {
            nx3Var.a(kb4Var);
        }
        return nx3Var;
    }
}
