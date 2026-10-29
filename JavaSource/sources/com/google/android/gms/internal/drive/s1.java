package com.google.android.gms.internal.drive;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class s1 {

    /* renamed from: c, reason: collision with root package name */
    private static final s1 f20740c = new s1();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f20742b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final v1 f20741a = new y0();

    private s1() {
    }

    public static s1 a() {
        return f20740c;
    }

    public final u1 b(Class cls) {
        m0.d(cls, "messageType");
        u1 u1Var = (u1) this.f20742b.get(cls);
        if (u1Var == null) {
            u1Var = this.f20741a.a(cls);
            m0.d(cls, "messageType");
            m0.d(u1Var, "schema");
            u1 u1Var2 = (u1) this.f20742b.putIfAbsent(cls, u1Var);
            if (u1Var2 != null) {
                return u1Var2;
            }
        }
        return u1Var;
    }

    public final u1 c(Object obj) {
        return b(obj.getClass());
    }
}
