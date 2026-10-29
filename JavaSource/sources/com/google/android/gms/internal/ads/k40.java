package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class k40 {

    /* renamed from: a, reason: collision with root package name */
    private final n2.l f10881a;

    /* renamed from: b, reason: collision with root package name */
    private final n2.k f10882b;

    /* renamed from: c, reason: collision with root package name */
    private f30 f10883c;

    public k40(n2.l lVar, n2.k kVar) {
        this.f10881a = lVar;
        this.f10882b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized f30 e(e30 e30Var) {
        f30 f30Var = this.f10883c;
        if (f30Var != null) {
            return f30Var;
        }
        f30 f30Var2 = new f30(e30Var);
        this.f10883c = f30Var2;
        return f30Var2;
    }

    public final r30 a() {
        return new j40(this, null);
    }

    public final o30 b() {
        if (this.f10882b == null) {
            return null;
        }
        return new i40(this, null);
    }

    final /* synthetic */ n2.l c() {
        return this.f10881a;
    }

    final /* synthetic */ n2.k d() {
        return this.f10882b;
    }
}
