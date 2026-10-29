package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: MyApplication */
public final class pg4 {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f13881c = Logger.getLogger(pg4.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final pg4 f13882d = new pg4();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f13883a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f13884b = new ConcurrentHashMap();

    public static pg4 a() {
        return f13882d;
    }

    private final synchronized c84 g(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.f13883a;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (c84) concurrentMap.get(str);
    }

    private final synchronized void h(c84 c84Var, boolean z7, boolean z8) {
        try {
            String b8 = c84Var.b();
            if (z8) {
                ConcurrentMap concurrentMap = this.f13884b;
                if (concurrentMap.containsKey(b8) && !((Boolean) concurrentMap.get(b8)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(b8));
                }
            }
            ConcurrentMap concurrentMap2 = this.f13883a;
            c84 c84Var2 = (c84) concurrentMap2.get(b8);
            if (c84Var2 != null && !c84Var2.getClass().equals(c84Var.getClass())) {
                f13881c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(b8));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", b8, c84Var2.getClass().getName(), c84Var.getClass().getName()));
            }
            concurrentMap2.putIfAbsent(b8, c84Var);
            this.f13884b.put(b8, Boolean.valueOf(z8));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(c84 c84Var, boolean z7) {
        f(c84Var, 1, z7);
    }

    public final c84 c(String str, Class cls) {
        c84 g8 = g(str);
        if (g8.d().equals(cls)) {
            return g8;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(g8.getClass());
        String obj = g8.d().toString();
        StringBuilder sb = new StringBuilder(name.length() + 53 + valueOf.length() + 23 + obj.length());
        sb.append("Primitive type ");
        sb.append(name);
        sb.append(" not supported by key manager of type ");
        sb.append(valueOf);
        sb.append(", which only supports: ");
        sb.append(obj);
        throw new GeneralSecurityException(sb.toString());
    }

    public final c84 d(String str) {
        return g(str);
    }

    public final boolean e(String str) {
        return ((Boolean) this.f13884b.get(str)).booleanValue();
    }

    public final synchronized void f(c84 c84Var, int i7, boolean z7) {
        if (!nf4.a(i7)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        h(c84Var, false, z7);
    }
}
