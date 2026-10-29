package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
public final class n5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f22395a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f22396b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22397c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p5 f22398d;

    n5(p5 p5Var, int i7, boolean z7, boolean z8) {
        Objects.requireNonNull(p5Var);
        this.f22398d = p5Var;
        this.f22395a = i7;
        this.f22396b = z7;
        this.f22397c = z8;
    }

    public final void a(String str) {
        this.f22398d.y(this.f22395a, this.f22396b, this.f22397c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f22398d.y(this.f22395a, this.f22396b, this.f22397c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f22398d.y(this.f22395a, this.f22396b, this.f22397c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f22398d.y(this.f22395a, this.f22396b, this.f22397c, str, obj, obj2, obj3);
    }
}
