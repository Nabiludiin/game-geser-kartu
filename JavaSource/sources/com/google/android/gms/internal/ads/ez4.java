package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
public final class ez4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile ez4 f7892b;

    /* renamed from: c, reason: collision with root package name */
    static final ez4 f7893c = new ez4(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f7894a = Collections.EMPTY_MAP;

    ez4(boolean z7) {
    }

    public static ez4 a() {
        int i7 = dy4.f7358a;
        return f7893c;
    }

    public static ez4 b() {
        ez4 ez4Var = f7892b;
        if (ez4Var != null) {
            return ez4Var;
        }
        synchronized (ez4.class) {
            try {
                ez4 ez4Var2 = f7892b;
                if (ez4Var2 != null) {
                    return ez4Var2;
                }
                int i7 = dy4.f7358a;
                ez4 a8 = mz4.a(ez4.class);
                f7892b = a8;
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final qz4 c(v05 v05Var, int i7) {
        android.support.v4.media.session.b.a(this.f7894a.get(new dz4(v05Var, i7)));
        return null;
    }
}
