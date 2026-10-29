package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final z4.k f20826d = z4.k.q("_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    private String f20827a;

    /* renamed from: b, reason: collision with root package name */
    private final long f20828b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f20829c;

    public b(String str, long j7, Map map) {
        this.f20827a = str;
        this.f20828b = j7;
        HashMap hashMap = new HashMap();
        this.f20829c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object h(String str, Object obj, Object obj2) {
        if (f20826d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.f20828b;
    }

    public final String b() {
        return this.f20827a;
    }

    public final void c(String str) {
        this.f20827a = str;
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f20829c.remove(str);
        } else {
            Map map = this.f20829c;
            map.put(str, h(str, map.get(str), obj));
        }
    }

    public final Object e(String str) {
        Map map = this.f20829c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f20828b == bVar.f20828b && this.f20827a.equals(bVar.f20827a)) {
            return this.f20829c.equals(bVar.f20829c);
        }
        return false;
    }

    public final Map f() {
        return this.f20829c;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f20827a, this.f20828b, new HashMap(this.f20829c));
    }

    public final int hashCode() {
        int hashCode = this.f20827a.hashCode() * 31;
        long j7 = this.f20828b;
        return ((hashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f20829c.hashCode();
    }

    public final String toString() {
        String str = this.f20827a;
        String obj = this.f20829c.toString();
        int length = String.valueOf(str).length();
        long j7 = this.f20828b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j7).length() + 9 + obj.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j7);
        sb.append(", params=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
