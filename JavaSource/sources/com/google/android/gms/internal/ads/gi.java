package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* compiled from: MyApplication */
public final /* synthetic */ class gi implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f8931a;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ gi f8930c = new gi(1);

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ gi f8929b = new gi(0);

    private /* synthetic */ gi(int i7) {
        this.f8931a = i7;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.f8931a != 0 ? zi.a(null) : new ji();
    }
}
