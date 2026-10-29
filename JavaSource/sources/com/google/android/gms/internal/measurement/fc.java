package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: MyApplication */
final class fc {

    /* renamed from: c, reason: collision with root package name */
    private static final fc f20949c = new fc();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f20950d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f20952b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final jc f20951a = new ob();

    private fc() {
    }

    public static fc a() {
        return f20949c;
    }

    public final ic b(Class cls) {
        eb.a(cls, "messageType");
        ConcurrentMap concurrentMap = this.f20952b;
        ic icVar = (ic) concurrentMap.get(cls);
        if (icVar == null) {
            icVar = this.f20951a.a(cls);
            eb.a(cls, "messageType");
            ic icVar2 = (ic) concurrentMap.putIfAbsent(cls, icVar);
            if (icVar2 != null) {
                return icVar2;
            }
        }
        return icVar;
    }
}
