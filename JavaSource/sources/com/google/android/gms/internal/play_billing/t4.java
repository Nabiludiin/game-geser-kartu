package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class t4 extends LinkedHashMap {

    /* renamed from: r, reason: collision with root package name */
    private static final t4 f21749r;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21750q;

    static {
        t4 t4Var = new t4();
        f21749r = t4Var;
        t4Var.f21750q = false;
    }

    private t4() {
        this.f21750q = true;
    }

    public static t4 a() {
        return f21749r;
    }

    private static int k(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof f4) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int b8 = j4.b(length, bArr, 0, length);
        if (b8 == 0) {
            return 1;
        }
        return b8;
    }

    private final void l() {
        if (!this.f21750q) {
            throw new UnsupportedOperationException();
        }
    }

    public final t4 b() {
        return isEmpty() ? new t4() : new t4(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        super.clear();
    }

    public final void d() {
        this.f21750q = false;
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

    public final void g(t4 t4Var) {
        l();
        if (t4Var.isEmpty()) {
            return;
        }
        putAll(t4Var);
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
        return this.f21750q;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        l();
        byte[] bArr = j4.f21586b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        l();
        for (Object obj : map.keySet()) {
            byte[] bArr = j4.f21586b;
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

    private t4(Map map) {
        super(map);
        this.f21750q = true;
    }
}
