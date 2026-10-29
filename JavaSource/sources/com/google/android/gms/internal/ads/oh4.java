package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class oh4 {

    /* renamed from: b, reason: collision with root package name */
    private static final oh4 f13331b = new oh4();

    /* renamed from: a, reason: collision with root package name */
    private final Map f13332a = new HashMap();

    public static oh4 a() {
        return f13331b;
    }

    public final synchronized void b(nh4 nh4Var, Class cls) {
        try {
            Map map = this.f13332a;
            nh4 nh4Var2 = (nh4) map.get(cls);
            if (nh4Var2 != null && !nh4Var2.equals(nh4Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, nh4Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
