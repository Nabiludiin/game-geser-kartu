package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class ta3 implements la3 {

    /* renamed from: d, reason: collision with root package name */
    private static ta3 f16069d;

    /* renamed from: a, reason: collision with root package name */
    private float f16070a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private ga3 f16071b;

    /* renamed from: c, reason: collision with root package name */
    private ka3 f16072c;

    public ta3(ha3 ha3Var, da3 da3Var) {
    }

    public static ta3 a() {
        if (f16069d == null) {
            f16069d = new ta3(new ha3(), new da3());
        }
        return f16069d;
    }

    public final void b(Context context) {
        this.f16071b = new ga3(new Handler(), context, new ca3(), this);
    }

    public final void c() {
        ja3.i().g(this);
        ja3.i().e();
        vb3.b().c();
        this.f16071b.a();
    }

    public final void d() {
        vb3.b().d();
        ja3.i().f();
        this.f16071b.b();
    }

    @Override // com.google.android.gms.internal.ads.la3
    public final void e(boolean z7) {
        if (z7) {
            vb3.b().c();
        } else {
            vb3.b().e();
        }
    }

    public final void f(float f8) {
        this.f16070a = f8;
        if (this.f16072c == null) {
            this.f16072c = ka3.a();
        }
        Iterator it = this.f16072c.f().iterator();
        while (it.hasNext()) {
            ((q93) it.next()).g().o(f8);
        }
    }

    public final float g() {
        return this.f16070a;
    }
}
