package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: MyApplication */
final class g5 {

    /* renamed from: c, reason: collision with root package name */
    private static final g5 f21535c = new g5();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f21536d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f21538b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final k5 f21537a = new s4();

    private g5() {
    }

    public static g5 a() {
        return f21535c;
    }

    public final j5 b(Class cls) {
        j4.c(cls, "messageType");
        ConcurrentMap concurrentMap = this.f21538b;
        j5 j5Var = (j5) concurrentMap.get(cls);
        if (j5Var == null) {
            j5Var = this.f21537a.a(cls);
            j4.c(cls, "messageType");
            j5 j5Var2 = (j5) concurrentMap.putIfAbsent(cls, j5Var);
            if (j5Var2 != null) {
                return j5Var2;
            }
        }
        return j5Var;
    }
}
