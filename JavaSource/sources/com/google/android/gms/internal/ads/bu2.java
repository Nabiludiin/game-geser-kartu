package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class bu2 implements mr {

    /* renamed from: a, reason: collision with root package name */
    protected final yx f6007a = new yx();

    protected bu2() {
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final boolean a() {
        return g() == 3 && l() && j() == 0;
    }

    @Override // com.google.android.gms.internal.ads.mr
    public final void b(long j7) {
        i(p(), j7, 5, false);
    }

    protected abstract void i(int i7, long j7, int i8, boolean z7);
}
