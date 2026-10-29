package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class rb extends LinkedHashMap {

    /* renamed from: r, reason: collision with root package name */
    private static final rb f21363r;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21364q;

    static {
        rb rbVar = new rb();
        f21363r = rbVar;
        rbVar.f21364q = false;
    }

    private rb() {
        this.f21364q = true;
    }

    public static rb a() {
        return f21363r;
    }

    private static int k(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof za) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int c8 = eb.c(length, bArr, 0, length);
        if (c8 == 0) {
            return 1;
        }
        return c8;
    }

    private final void l() {
        if (!this.f21364q) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(rb rbVar) {
        l();
        if (rbVar.isEmpty()) {
            return;
        }
        putAll(rbVar);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        super.clear();
    }

    public final rb d() {
        return isEmpty() ? new rb() : new rb(this);
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
        this.f21364q = false;
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
        return this.f21364q;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        l();
        byte[] bArr = eb.f20914b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        l();
        for (Object obj : map.keySet()) {
            byte[] bArr = eb.f20914b;
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

    private rb(Map map) {
        super(map);
        this.f21364q = true;
    }
}
