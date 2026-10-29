package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: MyApplication */
public final class ka3 {

    /* renamed from: c, reason: collision with root package name */
    private static final ka3 f10940c = new ka3();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f10941a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f10942b = new ArrayList();

    private ka3() {
    }

    public static ka3 a() {
        return f10940c;
    }

    public final void b(q93 q93Var) {
        this.f10941a.add(q93Var);
    }

    public final void c(q93 q93Var) {
        ArrayList arrayList = this.f10942b;
        boolean g8 = g();
        arrayList.add(q93Var);
        if (g8) {
            return;
        }
        ta3.a().c();
    }

    public final void d(q93 q93Var) {
        ArrayList arrayList = this.f10941a;
        boolean g8 = g();
        arrayList.remove(q93Var);
        this.f10942b.remove(q93Var);
        if (!g8 || g()) {
            return;
        }
        ta3.a().d();
    }

    public final Collection e() {
        return Collections.unmodifiableCollection(this.f10941a);
    }

    public final Collection f() {
        return Collections.unmodifiableCollection(this.f10942b);
    }

    public final boolean g() {
        return this.f10942b.size() > 0;
    }
}
