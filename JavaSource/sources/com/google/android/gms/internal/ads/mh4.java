package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class mh4 {

    /* renamed from: b, reason: collision with root package name */
    private static final kh4 f12259b = lh4.f11616a;

    /* renamed from: c, reason: collision with root package name */
    private static final mh4 f12260c = d();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f12261d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f12262a = new HashMap();

    public static mh4 a() {
        return f12260c;
    }

    private static mh4 d() {
        mh4 mh4Var = new mh4();
        try {
            mh4Var.b(f12259b, dh4.class);
            return mh4Var;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException("unexpected error.", e8);
        }
    }

    private final synchronized b84 e(s84 s84Var, Integer num) {
        kh4 kh4Var;
        kh4Var = (kh4) this.f12262a.get(s84Var.getClass());
        if (kh4Var == null) {
            String obj = s84Var.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 86);
            sb.append("Cannot create a new key for parameters ");
            sb.append(obj);
            sb.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb.toString());
        }
        return kh4Var.a(s84Var, num);
    }

    public final synchronized void b(kh4 kh4Var, Class cls) {
        try {
            Map map = this.f12262a;
            kh4 kh4Var2 = (kh4) map.get(cls);
            if (kh4Var2 != null && !kh4Var2.equals(kh4Var)) {
                String obj = cls.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(obj);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, kh4Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final b84 c(s84 s84Var, Integer num) {
        return e(s84Var, num);
    }
}
