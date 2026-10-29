package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private b f20846a;

    /* renamed from: b, reason: collision with root package name */
    private b f20847b;

    /* renamed from: c, reason: collision with root package name */
    private final List f20848c;

    public c() {
        this.f20846a = new b("", 0L, null);
        this.f20847b = new b("", 0L, null);
        this.f20848c = new ArrayList();
    }

    public final b a() {
        return this.f20846a;
    }

    public final void b(b bVar) {
        this.f20846a = bVar;
        this.f20847b = bVar.clone();
        this.f20848c.clear();
    }

    public final b c() {
        return this.f20847b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        c cVar = new c(this.f20846a.clone());
        Iterator it = this.f20848c.iterator();
        while (it.hasNext()) {
            cVar.f20848c.add(((b) it.next()).clone());
        }
        return cVar;
    }

    public final void d(b bVar) {
        this.f20847b = bVar;
    }

    public final void e(String str, long j7, Map map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, b.h(str2, this.f20846a.e(str2), map.get(str2)));
        }
        this.f20848c.add(new b(str, j7, hashMap));
    }

    public final List f() {
        return this.f20848c;
    }

    public c(b bVar) {
        this.f20846a = bVar;
        this.f20847b = bVar.clone();
        this.f20848c = new ArrayList();
    }
}
