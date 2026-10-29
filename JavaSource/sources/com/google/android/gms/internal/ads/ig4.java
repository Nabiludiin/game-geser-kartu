package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: MyApplication */
public final class ig4 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f10033a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f10034b;

    /* synthetic */ ig4(Map map, Map map2, byte[] bArr) {
        this.f10033a = map;
        this.f10034b = map2;
    }

    public static hg4 a() {
        return new hg4(null);
    }

    public final Enum b(Object obj) {
        Enum r02 = (Enum) this.f10034b.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(Enum r32) {
        Object obj = this.f10033a.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}
