package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class ta extends k {

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ lc f21385s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ta(kb kbVar, String str, lc lcVar) {
        super("getValue");
        this.f21385s = lcVar;
        Objects.requireNonNull(kbVar);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final r a(o4 o4Var, List list) {
        p5.a("getValue", 2, list);
        r a8 = o4Var.a((r) list.get(0));
        r a9 = o4Var.a((r) list.get(1));
        String b8 = this.f21385s.b(a8.d());
        return b8 != null ? new v(b8) : a9;
    }
}
