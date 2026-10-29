package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class rh4 {

    /* renamed from: b, reason: collision with root package name */
    private static final rh4 f14906b = new rh4();

    /* renamed from: a, reason: collision with root package name */
    private final Map f14907a = new HashMap();

    rh4() {
    }

    public static rh4 a() {
        return f14906b;
    }

    public final synchronized void b(String str, s84 s84Var) {
        try {
            Map map = this.f14907a;
            if (!map.containsKey(str)) {
                map.put(str, s84Var);
                return;
            }
            if (((s84) map.get(str)).equals(s84Var)) {
                return;
            }
            String valueOf = String.valueOf(map.get(str));
            String valueOf2 = String.valueOf(s84Var);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + valueOf.length() + 17 + valueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(valueOf);
            sb.append("), cannot insert ");
            sb.append(valueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized s84 c(String str) {
        Map map;
        map = this.f14907a;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (s84) map.get("AES128_GCM");
    }

    public final synchronized void d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            b((String) entry.getKey(), (s84) entry.getValue());
        }
    }
}
