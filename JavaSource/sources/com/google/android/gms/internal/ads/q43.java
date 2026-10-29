package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public abstract class q43 {
    public static final w43 a(a5.d dVar, Object obj, x43 x43Var) {
        a5.d dVar2;
        dVar2 = x43.f18533d;
        return new w43(x43Var, obj, null, dVar2, Collections.EMPTY_LIST, dVar, null);
    }

    public static final w43 b(Callable callable, Object obj, x43 x43Var) {
        return c(callable, x43Var.e(), obj, x43Var);
    }

    public static final w43 c(Callable callable, z64 z64Var, Object obj, x43 x43Var) {
        a5.d dVar;
        dVar = x43.f18533d;
        return new w43(x43Var, obj, null, dVar, Collections.EMPTY_LIST, z64Var.B0(callable), null);
    }

    public static final w43 d(final k43 k43Var, z64 z64Var, Object obj, x43 x43Var) {
        return c(new Callable() { // from class: com.google.android.gms.internal.ads.p43
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                k43.this.a();
                return null;
            }
        }, z64Var, obj, x43Var);
    }
}
