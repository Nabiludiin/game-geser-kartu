package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
public final class d8 {

    /* renamed from: c, reason: collision with root package name */
    public static final d8 f22051c = new d8(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f22052a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22053b;

    public d8(Boolean bool, Boolean bool2, int i7) {
        EnumMap enumMap = new EnumMap(t4.v.class);
        this.f22052a = enumMap;
        enumMap.put((EnumMap) t4.v.AD_STORAGE, (t4.v) h(null));
        enumMap.put((EnumMap) t4.v.ANALYTICS_STORAGE, (t4.v) h(null));
        this.f22053b = i7;
    }

    public static d8 a(t4.u uVar, t4.u uVar2, int i7) {
        EnumMap enumMap = new EnumMap(t4.v.class);
        enumMap.put((EnumMap) t4.v.AD_STORAGE, (t4.v) uVar);
        enumMap.put((EnumMap) t4.v.ANALYTICS_STORAGE, (t4.v) uVar2);
        return new d8(enumMap, -10);
    }

    static String d(int i7) {
        return i7 != -30 ? i7 != -20 ? i7 != -10 ? i7 != 0 ? i7 != 30 ? i7 != 90 ? i7 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static d8 e(Bundle bundle, int i7) {
        if (bundle == null) {
            return new d8(null, null, i7);
        }
        EnumMap enumMap = new EnumMap(t4.v.class);
        for (t4.v vVar : c8.STORAGE.d()) {
            enumMap.put((EnumMap) vVar, (t4.v) g(bundle.getString(vVar.f26428q)));
        }
        return new d8(enumMap, i7);
    }

    public static d8 f(String str, int i7) {
        EnumMap enumMap = new EnumMap(t4.v.class);
        t4.v[] c8 = c8.STORAGE.c();
        for (int i8 = 0; i8 < c8.length; i8++) {
            String str2 = str == null ? "" : str;
            t4.v vVar = c8[i8];
            int i9 = i8 + 2;
            if (i9 < str2.length()) {
                enumMap.put((EnumMap) vVar, (t4.v) j(str2.charAt(i9)));
            } else {
                enumMap.put((EnumMap) vVar, (t4.v) t4.u.UNINITIALIZED);
            }
        }
        return new d8(enumMap, i7);
    }

    static t4.u g(String str) {
        return str == null ? t4.u.UNINITIALIZED : str.equals("granted") ? t4.u.GRANTED : str.equals("denied") ? t4.u.DENIED : t4.u.UNINITIALIZED;
    }

    static t4.u h(Boolean bool) {
        return bool == null ? t4.u.UNINITIALIZED : bool.booleanValue() ? t4.u.GRANTED : t4.u.DENIED;
    }

    static String i(t4.u uVar) {
        int ordinal = uVar.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    static t4.u j(char c8) {
        return c8 != '+' ? c8 != '0' ? c8 != '1' ? t4.u.UNINITIALIZED : t4.u.GRANTED : t4.u.DENIED : t4.u.POLICY;
    }

    static char m(t4.u uVar) {
        if (uVar == null) {
            return '-';
        }
        int ordinal = uVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean u(int i7, int i8) {
        int i9 = -30;
        if (i7 == -20) {
            if (i8 == -30) {
                return true;
            }
            i7 = -20;
        }
        if (i7 != -30) {
            i9 = i7;
        } else if (i8 == -20) {
            return true;
        }
        return i9 == i8 || i7 < i8;
    }

    public final int b() {
        return this.f22053b;
    }

    public final boolean c() {
        Iterator it = this.f22052a.values().iterator();
        while (it.hasNext()) {
            if (((t4.u) it.next()) != t4.u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        for (t4.v vVar : c8.STORAGE.d()) {
            if (this.f22052a.get(vVar) != d8Var.f22052a.get(vVar)) {
                return false;
            }
        }
        return this.f22053b == d8Var.f22053b;
    }

    public final int hashCode() {
        Iterator it = this.f22052a.values().iterator();
        int i7 = this.f22053b * 17;
        while (it.hasNext()) {
            i7 = (i7 * 31) + ((t4.u) it.next()).hashCode();
        }
        return i7;
    }

    public final String k() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (t4.v vVar : c8.STORAGE.c()) {
            t4.u uVar = (t4.u) this.f22052a.get(vVar);
            char c8 = '-';
            if (uVar != null && (ordinal = uVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c8 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c8 = '1';
            }
            sb.append(c8);
        }
        return sb.toString();
    }

    public final String l() {
        StringBuilder sb = new StringBuilder("G1");
        for (t4.v vVar : c8.STORAGE.c()) {
            sb.append(m((t4.u) this.f22052a.get(vVar)));
        }
        return sb.toString();
    }

    public final Bundle n() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f22052a.entrySet()) {
            String i7 = i((t4.u) entry.getValue());
            if (i7 != null) {
                bundle.putString(((t4.v) entry.getKey()).f26428q, i7);
            }
        }
        return bundle;
    }

    public final boolean o(t4.v vVar) {
        return ((t4.u) this.f22052a.get(vVar)) != t4.u.DENIED;
    }

    public final t4.u p() {
        t4.u uVar = (t4.u) this.f22052a.get(t4.v.AD_STORAGE);
        return uVar == null ? t4.u.UNINITIALIZED : uVar;
    }

    public final t4.u q() {
        t4.u uVar = (t4.u) this.f22052a.get(t4.v.ANALYTICS_STORAGE);
        return uVar == null ? t4.u.UNINITIALIZED : uVar;
    }

    public final boolean r(d8 d8Var) {
        EnumMap enumMap = this.f22052a;
        for (t4.v vVar : (t4.v[]) enumMap.keySet().toArray(new t4.v[0])) {
            t4.u uVar = (t4.u) enumMap.get(vVar);
            t4.u uVar2 = (t4.u) d8Var.f22052a.get(vVar);
            t4.u uVar3 = t4.u.DENIED;
            if (uVar == uVar3 && uVar2 != uVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.d8 s(com.google.android.gms.measurement.internal.d8 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<t4.v> r1 = t4.v.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.c8 r1 = com.google.android.gms.measurement.internal.c8.STORAGE
            t4.v[] r1 = r1.d()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f22052a
            java.lang.Object r5 = r5.get(r4)
            t4.u r5 = (t4.u) r5
            java.util.EnumMap r6 = r9.f22052a
            java.lang.Object r6 = r6.get(r4)
            t4.u r6 = (t4.u) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            t4.u r7 = t4.u.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            t4.u r7 = t4.u.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            t4.u r7 = t4.u.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            t4.u r5 = t4.u.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            com.google.android.gms.measurement.internal.d8 r9 = new com.google.android.gms.measurement.internal.d8
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d8.s(com.google.android.gms.measurement.internal.d8):com.google.android.gms.measurement.internal.d8");
    }

    public final d8 t(d8 d8Var) {
        EnumMap enumMap = new EnumMap(t4.v.class);
        for (t4.v vVar : c8.STORAGE.d()) {
            t4.u uVar = (t4.u) this.f22052a.get(vVar);
            if (uVar == t4.u.UNINITIALIZED) {
                uVar = (t4.u) d8Var.f22052a.get(vVar);
            }
            if (uVar != null) {
                enumMap.put((EnumMap) vVar, (t4.v) uVar);
            }
        }
        return new d8(enumMap, this.f22053b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(d(this.f22053b));
        for (t4.v vVar : c8.STORAGE.d()) {
            sb.append(",");
            sb.append(vVar.f26428q);
            sb.append("=");
            t4.u uVar = (t4.u) this.f22052a.get(vVar);
            if (uVar == null) {
                uVar = t4.u.UNINITIALIZED;
            }
            sb.append(uVar);
        }
        return sb.toString();
    }

    private d8(EnumMap enumMap, int i7) {
        EnumMap enumMap2 = new EnumMap(t4.v.class);
        this.f22052a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f22053b = i7;
    }
}
