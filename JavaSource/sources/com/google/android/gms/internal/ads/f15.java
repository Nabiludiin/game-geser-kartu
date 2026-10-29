package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: MyApplication */
final class f15 {

    /* renamed from: c, reason: collision with root package name */
    private static final f15 f7970c = new f15();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f7972b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final o15 f7971a = new m05();

    private f15() {
    }

    public static f15 a() {
        return f7970c;
    }

    public final n15 b(Class cls) {
        c05.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.f7972b;
        n15 n15Var = (n15) concurrentMap.get(cls);
        if (n15Var == null) {
            n15Var = this.f7971a.a(cls);
            c05.a(cls, "messageType");
            n15 n15Var2 = (n15) concurrentMap.putIfAbsent(cls, n15Var);
            if (n15Var2 != null) {
                return n15Var2;
            }
        }
        return n15Var;
    }
}
