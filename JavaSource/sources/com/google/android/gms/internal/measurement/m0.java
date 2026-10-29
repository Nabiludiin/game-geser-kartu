package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class m0 extends y {
    @Override // com.google.android.gms.internal.measurement.y
    public final r a(String str, o4 o4Var, List list) {
        if (str == null || str.isEmpty() || !o4Var.d(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        r h8 = o4Var.h(str);
        if (h8 instanceof k) {
            return ((k) h8).a(o4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
