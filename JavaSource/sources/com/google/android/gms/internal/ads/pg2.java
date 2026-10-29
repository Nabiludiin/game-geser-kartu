package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
public final class pg2 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f13877a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ev1 f13878b;

    public pg2(ev1 ev1Var) {
        this.f13878b = ev1Var;
    }

    public final void a(String str) {
        try {
            this.f13877a.put(str, this.f13878b.b(str));
        } catch (RemoteException e8) {
            v2.n1.l("Couldn't create RTB adapter : ", e8);
        }
    }

    public final id0 b(String str) {
        ConcurrentHashMap concurrentHashMap = this.f13877a;
        if (concurrentHashMap.containsKey(str)) {
            return (id0) concurrentHashMap.get(str);
        }
        return null;
    }
}
