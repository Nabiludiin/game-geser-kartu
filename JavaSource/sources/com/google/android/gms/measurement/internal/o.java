package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* compiled from: MyApplication */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f22417a;

    o() {
        this.f22417a = new EnumMap(t4.v.class);
    }

    public static o d(String str) {
        EnumMap enumMap = new EnumMap(t4.v.class);
        if (str.length() >= t4.v.values().length) {
            int i7 = 0;
            if (str.charAt(0) == '1') {
                t4.v[] values = t4.v.values();
                int length = values.length;
                int i8 = 1;
                while (i7 < length) {
                    enumMap.put((EnumMap) values[i7], (t4.v) n.c(str.charAt(i8)));
                    i7++;
                    i8++;
                }
                return new o(enumMap);
            }
        }
        return new o();
    }

    public final n a(t4.v vVar) {
        n nVar = (n) this.f22417a.get(vVar);
        return nVar == null ? n.UNSET : nVar;
    }

    public final void b(t4.v vVar, int i7) {
        n nVar = n.UNSET;
        if (i7 != -30) {
            if (i7 != -20) {
                if (i7 == -10) {
                    nVar = n.MANIFEST;
                } else if (i7 != 0) {
                    if (i7 == 30) {
                        nVar = n.INITIALIZATION;
                    }
                }
            }
            nVar = n.API;
        } else {
            nVar = n.TCF;
        }
        this.f22417a.put((EnumMap) vVar, (t4.v) nVar);
    }

    public final void c(t4.v vVar, n nVar) {
        this.f22417a.put((EnumMap) vVar, (t4.v) nVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (t4.v vVar : t4.v.values()) {
            n nVar = (n) this.f22417a.get(vVar);
            if (nVar == null) {
                nVar = n.UNSET;
            }
            sb.append(nVar.d());
        }
        return sb.toString();
    }

    private o(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(t4.v.class);
        this.f22417a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
