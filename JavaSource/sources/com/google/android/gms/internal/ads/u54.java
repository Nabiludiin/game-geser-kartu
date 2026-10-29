package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* compiled from: MyApplication */
abstract class u54 extends a54 {
    private static final x64 A = new x64(u54.class);

    /* renamed from: z, reason: collision with root package name */
    private static final r54 f16601z;

    /* renamed from: x, reason: collision with root package name */
    volatile Set f16602x = null;

    /* renamed from: y, reason: collision with root package name */
    volatile int f16603y;

    static {
        Throwable th;
        r54 t54Var;
        byte[] bArr = null;
        try {
            t54Var = new s54(bArr);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            t54Var = new t54(bArr);
        }
        f16601z = t54Var;
        if (th != null) {
            A.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    u54(int i7) {
        this.f16603y = i7;
    }

    final Set C() {
        Set set = this.f16602x;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        E(newSetFromMap);
        f16601z.a(this, null, newSetFromMap);
        Set set2 = this.f16602x;
        Objects.requireNonNull(set2);
        return set2;
    }

    final int D() {
        return f16601z.b(this);
    }

    abstract void E(Set set);
}
