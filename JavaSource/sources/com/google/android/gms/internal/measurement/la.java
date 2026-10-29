package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
public final class la {

    /* renamed from: b, reason: collision with root package name */
    private static volatile la f21113b;

    /* renamed from: c, reason: collision with root package name */
    static final la f21114c = new la(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f21115a = Collections.EMPTY_MAP;

    la(boolean z7) {
    }

    public static la a() {
        la laVar = f21113b;
        if (laVar != null) {
            return laVar;
        }
        synchronized (la.class) {
            try {
                la laVar2 = f21113b;
                if (laVar2 != null) {
                    return laVar2;
                }
                int i7 = fc.f20950d;
                la a8 = sa.a(la.class);
                f21113b = a8;
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final wa b(xb xbVar, int i7) {
        android.support.v4.media.session.b.a(this.f21115a.get(new ka(xbVar, i7)));
        return null;
    }
}
