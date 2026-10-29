package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class li4 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f11619a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f11620b;

    /* synthetic */ li4(oi4 oi4Var, byte[] bArr) {
        this.f11619a = new HashMap(oi4Var.d());
        this.f11620b = new HashMap(oi4Var.e());
    }

    public final li4 a(ki4 ki4Var) {
        if (ki4Var == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        mi4 mi4Var = new mi4(ki4Var.b(), ki4Var.c(), null);
        Map map = this.f11619a;
        if (!map.containsKey(mi4Var)) {
            map.put(mi4Var, ki4Var);
            return this;
        }
        ki4 ki4Var2 = (ki4) map.get(mi4Var);
        if (ki4Var2.equals(ki4Var) && ki4Var.equals(ki4Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(mi4Var.toString()));
    }

    public final li4 b(qi4 qi4Var) {
        Map map = this.f11620b;
        Class a8 = qi4Var.a();
        if (!map.containsKey(a8)) {
            map.put(a8, qi4Var);
            return this;
        }
        qi4 qi4Var2 = (qi4) map.get(a8);
        if (qi4Var2.equals(qi4Var) && qi4Var.equals(qi4Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(a8.toString()));
    }

    public final oi4 c() {
        return new oi4(this, null);
    }

    final /* synthetic */ Map d() {
        return this.f11619a;
    }

    final /* synthetic */ Map e() {
        return this.f11620b;
    }

    /* synthetic */ li4(byte[] bArr) {
        this.f11619a = new HashMap();
        this.f11620b = new HashMap();
    }
}
