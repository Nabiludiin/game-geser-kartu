package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
public final class t3 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile t3 f21746b;

    /* renamed from: c, reason: collision with root package name */
    static final t3 f21747c = new t3(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f21748a = Collections.EMPTY_MAP;

    t3(boolean z7) {
    }

    public static t3 a() {
        t3 t3Var = f21746b;
        if (t3Var != null) {
            return t3Var;
        }
        synchronized (t3.class) {
            try {
                t3 t3Var2 = f21746b;
                if (t3Var2 != null) {
                    return t3Var2;
                }
                int i7 = g5.f21536d;
                t3 a8 = z3.a(t3.class);
                f21746b = a8;
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c4 b(z4 z4Var, int i7) {
        android.support.v4.media.session.b.a(this.f21748a.get(new s3(z4Var, i7)));
        return null;
    }
}
