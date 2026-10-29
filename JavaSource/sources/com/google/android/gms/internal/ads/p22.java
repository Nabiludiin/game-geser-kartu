package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class p22 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f13638a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f13639b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v62 f13640c;

    public p22(v62 v62Var, m02 m02Var, Executor executor) {
        Objects.requireNonNull(v62Var);
        this.f13640c = v62Var;
        this.f13638a = new WeakReference(m02Var);
        this.f13639b = executor;
    }

    public final boolean a() {
        return this.f13638a.get() == null;
    }

    public final void b() {
        this.f13639b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.n12
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                p22.this.c();
            }
        });
    }

    final /* synthetic */ void c() {
        m02 m02Var = (m02) this.f13638a.get();
        if (m02Var != null) {
            m02Var.L(this.f13640c.c());
        }
    }
}
