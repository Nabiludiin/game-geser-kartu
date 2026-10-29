package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public class wj1 {

    /* renamed from: a, reason: collision with root package name */
    private final il1 f18267a;

    /* renamed from: b, reason: collision with root package name */
    private final mr0 f18268b;

    public wj1(il1 il1Var, mr0 mr0Var) {
        this.f18267a = il1Var;
        this.f18268b = mr0Var;
    }

    public final il1 a() {
        return this.f18267a;
    }

    public final mr0 b() {
        return this.f18268b;
    }

    public final View c() {
        mr0 mr0Var = this.f18268b;
        if (mr0Var != null) {
            return mr0Var.Q();
        }
        return null;
    }

    public final View d() {
        mr0 mr0Var = this.f18268b;
        if (mr0Var == null) {
            return null;
        }
        return mr0Var.Q();
    }

    public Set e(m81 m81Var) {
        return Collections.singleton(new hi1(m81Var, cm0.f6506g));
    }

    public Set f(m81 m81Var) {
        return Collections.singleton(new hi1(m81Var, cm0.f6506g));
    }

    public final hi1 g(Executor executor) {
        final mr0 mr0Var = this.f18268b;
        return new hi1(new cf1() { // from class: com.google.android.gms.internal.ads.tj1
            @Override // com.google.android.gms.internal.ads.cf1
            public final /* synthetic */ void a() {
                u2.a0 O;
                mr0 mr0Var2 = mr0.this;
                if (mr0Var2 == null || (O = mr0Var2.O()) == null) {
                    return;
                }
                O.b();
            }
        }, executor);
    }
}
