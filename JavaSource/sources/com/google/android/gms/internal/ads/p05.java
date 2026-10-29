package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class p05 extends LinkedHashMap {

    /* renamed from: r, reason: collision with root package name */
    private static final p05 f13621r;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13622q;

    static {
        p05 p05Var = new p05();
        f13621r = p05Var;
        p05Var.f13622q = false;
    }

    private p05() {
        this.f13622q = true;
    }

    public static p05 a() {
        return f13621r;
    }

    private static int k(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof uz4) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int c8 = c05.c(length, bArr, 0, length);
        if (c8 == 0) {
            return 1;
        }
        return c8;
    }

    private final void l() {
        if (!this.f13622q) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(p05 p05Var) {
        l();
        if (p05Var.isEmpty()) {
            return;
        }
        putAll(p05Var);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        super.clear();
    }

    public final p05 d() {
        return isEmpty() ? new p05() : new p05(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final void g() {
        this.f13622q = false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i7 += k(entry.getValue()) ^ k(entry.getKey());
        }
        return i7;
    }

    public final boolean i() {
        return this.f13622q;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        l();
        byte[] bArr = c05.f6204b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        l();
        for (Object obj : map.keySet()) {
            byte[] bArr = c05.f6204b;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l();
        return super.remove(obj);
    }

    private p05(Map map) {
        super(map);
        this.f13622q = true;
    }
}
