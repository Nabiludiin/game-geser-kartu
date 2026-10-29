package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    final List f21443a = new ArrayList();

    protected y() {
    }

    public abstract r a(String str, o4 o4Var, List list);

    final r b(String str) {
        if (this.f21443a.contains(p5.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
