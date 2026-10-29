package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
public final class y {

    /* renamed from: f, reason: collision with root package name */
    public static final y f22867f = new y((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    private final int f22868a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22869b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f22870c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22871d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumMap f22872e;

    y(Boolean bool, int i7, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(t4.v.class);
        this.f22872e = enumMap;
        enumMap.put((EnumMap) t4.v.AD_USER_DATA, (t4.v) d8.h(bool));
        this.f22868a = i7;
        this.f22869b = l();
        this.f22870c = bool2;
        this.f22871d = str;
    }

    static y a(t4.u uVar, int i7) {
        EnumMap enumMap = new EnumMap(t4.v.class);
        enumMap.put((EnumMap) t4.v.AD_USER_DATA, (t4.v) uVar);
        return new y(enumMap, -10, (Boolean) null, (String) null);
    }

    public static y g(String str) {
        if (str == null || str.length() <= 0) {
            return f22867f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(t4.v.class);
        t4.v[] c8 = c8.DMA.c();
        int length = c8.length;
        int i7 = 1;
        int i8 = 0;
        while (i8 < length) {
            enumMap.put((EnumMap) c8[i8], (t4.v) d8.j(split[i7].charAt(0)));
            i8++;
            i7++;
        }
        return new y(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static y h(Bundle bundle, int i7) {
        if (bundle == null) {
            return new y((Boolean) null, i7, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(t4.v.class);
        for (t4.v vVar : c8.DMA.c()) {
            enumMap.put((EnumMap) vVar, (t4.v) d8.g(bundle.getString(vVar.f26428q)));
        }
        return new y(enumMap, i7, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static Boolean i(Bundle bundle) {
        t4.u g8;
        if (bundle == null || (g8 = d8.g(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int ordinal = g8.ordinal();
        if (ordinal == 2) {
            return Boolean.FALSE;
        }
        if (ordinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22868a);
        for (t4.v vVar : c8.DMA.c()) {
            sb.append(":");
            sb.append(d8.m((t4.u) this.f22872e.get(vVar)));
        }
        return sb.toString();
    }

    public final int b() {
        return this.f22868a;
    }

    public final t4.u c() {
        t4.u uVar = (t4.u) this.f22872e.get(t4.v.AD_USER_DATA);
        return uVar == null ? t4.u.UNINITIALIZED : uVar;
    }

    public final boolean d() {
        Iterator it = this.f22872e.values().iterator();
        while (it.hasNext()) {
            if (((t4.u) it.next()) != t4.u.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        return this.f22869b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f22869b.equalsIgnoreCase(yVar.f22869b) && Objects.equals(this.f22870c, yVar.f22870c)) {
            return Objects.equals(this.f22871d, yVar.f22871d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f22872e.entrySet()) {
            String i7 = d8.i((t4.u) entry.getValue());
            if (i7 != null) {
                bundle.putString(((t4.v) entry.getKey()).f26428q, i7);
            }
        }
        Boolean bool = this.f22870c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f22871d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final int hashCode() {
        Boolean bool = this.f22870c;
        int i7 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f22871d;
        return this.f22869b.hashCode() + (i7 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Boolean j() {
        return this.f22870c;
    }

    public final String k() {
        return this.f22871d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(d8.d(this.f22868a));
        for (t4.v vVar : c8.DMA.c()) {
            sb.append(",");
            sb.append(vVar.f26428q);
            sb.append("=");
            t4.u uVar = (t4.u) this.f22872e.get(vVar);
            if (uVar == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = uVar.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f22870c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f22871d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    private y(EnumMap enumMap, int i7, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(t4.v.class);
        this.f22872e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f22868a = i7;
        this.f22869b = l();
        this.f22870c = bool;
        this.f22871d = str;
    }
}
