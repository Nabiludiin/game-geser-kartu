package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class ft3 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f8479a;

    /* renamed from: b, reason: collision with root package name */
    private final xt3 f8480b;

    ft3(xt3 xt3Var, Set set) {
        this.f8479a = set;
        this.f8480b = xt3Var;
    }

    public final void a(List list) {
        this.f8480b.a(list);
    }

    public final Map b() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f8479a.iterator();
        while (it.hasNext()) {
            ((it3) it.next()).c(hashMap);
        }
        return hashMap;
    }

    public final Map c(Context context, View view) {
        HashMap hashMap = new HashMap();
        Iterator it = this.f8479a.iterator();
        while (it.hasNext()) {
            ((it3) it.next()).d(hashMap, context, view);
        }
        return hashMap;
    }

    public final Map d() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f8479a.iterator();
        while (it.hasNext()) {
            ((it3) it.next()).b(hashMap);
        }
        return hashMap;
    }
}
