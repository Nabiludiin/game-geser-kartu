package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class yi4 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f19604a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f19605b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f19606c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f19607d;

    public yi4() {
        this.f19604a = new HashMap();
        this.f19605b = new HashMap();
        this.f19606c = new HashMap();
        this.f19607d = new HashMap();
    }

    public final yi4 a(wg4 wg4Var) {
        aj4 aj4Var = new aj4(wg4Var.b(), wg4Var.c(), null);
        Map map = this.f19604a;
        if (!map.containsKey(aj4Var)) {
            map.put(aj4Var, wg4Var);
            return this;
        }
        wg4 wg4Var2 = (wg4) map.get(aj4Var);
        if (wg4Var2.equals(wg4Var) && wg4Var.equals(wg4Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(aj4Var.toString()));
    }

    public final yi4 b(sg4 sg4Var) {
        zi4 zi4Var = new zi4(sg4Var.c(), sg4Var.b(), null);
        Map map = this.f19605b;
        if (!map.containsKey(zi4Var)) {
            map.put(zi4Var, sg4Var);
            return this;
        }
        sg4 sg4Var2 = (sg4) map.get(zi4Var);
        if (sg4Var2.equals(sg4Var) && sg4Var.equals(sg4Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zi4Var.toString()));
    }

    public final yi4 c(di4 di4Var) {
        aj4 aj4Var = new aj4(di4Var.b(), di4Var.c(), null);
        Map map = this.f19606c;
        if (!map.containsKey(aj4Var)) {
            map.put(aj4Var, di4Var);
            return this;
        }
        di4 di4Var2 = (di4) map.get(aj4Var);
        if (di4Var2.equals(di4Var) && di4Var.equals(di4Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(aj4Var.toString()));
    }

    public final yi4 d(ai4 ai4Var) {
        zi4 zi4Var = new zi4(ai4Var.c(), ai4Var.b(), null);
        Map map = this.f19607d;
        if (!map.containsKey(zi4Var)) {
            map.put(zi4Var, ai4Var);
            return this;
        }
        ai4 ai4Var2 = (ai4) map.get(zi4Var);
        if (ai4Var2.equals(ai4Var) && ai4Var.equals(ai4Var2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zi4Var.toString()));
    }

    final /* synthetic */ Map e() {
        return this.f19604a;
    }

    final /* synthetic */ Map f() {
        return this.f19605b;
    }

    final /* synthetic */ Map g() {
        return this.f19606c;
    }

    final /* synthetic */ Map h() {
        return this.f19607d;
    }

    public yi4(bj4 bj4Var) {
        this.f19604a = new HashMap(bj4Var.g());
        this.f19605b = new HashMap(bj4Var.h());
        this.f19606c = new HashMap(bj4Var.i());
        this.f19607d = new HashMap(bj4Var.j());
    }
}
