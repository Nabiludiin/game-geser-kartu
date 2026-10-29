package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.of;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
final class i6 implements of {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o6 f22239a;

    i6(o6 o6Var) {
        Objects.requireNonNull(o6Var);
        this.f22239a = o6Var;
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final void a(int i7, String str, List list, boolean z7, boolean z8) {
        int i8 = i7 - 1;
        n5 u7 = i8 != 0 ? i8 != 1 ? i8 != 3 ? i8 != 4 ? this.f22239a.f22928a.a().u() : z7 ? this.f22239a.f22928a.a().s() : !z8 ? this.f22239a.f22928a.a().t() : this.f22239a.f22928a.a().r() : this.f22239a.f22928a.a().w() : z7 ? this.f22239a.f22928a.a().p() : !z8 ? this.f22239a.f22928a.a().q() : this.f22239a.f22928a.a().o() : this.f22239a.f22928a.a().v();
        int size = list.size();
        if (size == 1) {
            u7.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            u7.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            u7.a(str);
        } else {
            u7.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
