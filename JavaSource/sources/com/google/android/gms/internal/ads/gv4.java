package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class gv4 {

    /* renamed from: b, reason: collision with root package name */
    public static final gv4 f9169b = new gv4(new iv4());

    /* renamed from: c, reason: collision with root package name */
    public static final gv4 f9170c = new gv4(new mv4());

    /* renamed from: d, reason: collision with root package name */
    public static final gv4 f9171d = new gv4(new ov4());

    /* renamed from: e, reason: collision with root package name */
    public static final gv4 f9172e = new gv4(new nv4());

    /* renamed from: f, reason: collision with root package name */
    public static final gv4 f9173f;

    /* renamed from: g, reason: collision with root package name */
    public static final gv4 f9174g;

    /* renamed from: a, reason: collision with root package name */
    private final fv4 f9175a;

    static {
        new gv4(new jv4());
        f9173f = new gv4(new lv4());
        f9174g = new gv4(new kv4());
    }

    public gv4(pv4 pv4Var) {
        this.f9175a = !of4.a() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new cv4(pv4Var, null) : new dv4(pv4Var, null) : new ev4(pv4Var, null);
    }

    public static List a(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object b(String str) {
        return this.f9175a.b(str);
    }
}
