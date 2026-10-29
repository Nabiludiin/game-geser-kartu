package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class kz {

    /* renamed from: a, reason: collision with root package name */
    private final List f11298a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private final Map f11299b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f11300c;

    public kz(boolean z7, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f11299b = linkedHashMap;
        this.f11300c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final hz f() {
        return new hz(r2.t.o().b(), null, null);
    }

    public final void a(kz kzVar) {
        synchronized (this.f11300c) {
        }
    }

    public final boolean b(hz hzVar, long j7, String... strArr) {
        synchronized (this.f11300c) {
            this.f11298a.add(new hz(j7, strArr[0], hzVar));
        }
        return true;
    }

    public final jz c() {
        jz jzVar;
        boolean booleanValue = ((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f11300c) {
            try {
                List<hz> list = this.f11298a;
                for (hz hzVar : list) {
                    long a8 = hzVar.a();
                    String b8 = hzVar.b();
                    hz c8 = hzVar.c();
                    if (c8 != null && a8 > 0) {
                        long a9 = a8 - c8.a();
                        sb.append(b8);
                        sb.append('.');
                        sb.append(a9);
                        sb.append(',');
                        if (booleanValue) {
                            if (hashMap.containsKey(Long.valueOf(c8.a()))) {
                                StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(c8.a()));
                                sb2.append('+');
                                sb2.append(b8);
                            } else {
                                hashMap.put(Long.valueOf(c8.a()), new StringBuilder(b8));
                            }
                        }
                    }
                }
                list.clear();
                String str = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (booleanValue) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(r2.t.o().a() + (((Long) entry.getKey()).longValue() - r2.t.o().b()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    str = sb3.toString();
                }
                jzVar = new jz(sb.toString(), str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jzVar;
    }

    public final void d(String str, String str2) {
        zy c8;
        if (TextUtils.isEmpty(str2) || (c8 = r2.t.l().c()) == null) {
            return;
        }
        synchronized (this.f11300c) {
            gz d8 = c8.d(str);
            Map map = this.f11299b;
            map.put(str, d8.a((String) map.get(str), str2));
        }
    }

    public final Map e() {
        Map map;
        synchronized (this.f11300c) {
            r2.t.l().c();
            map = this.f11299b;
        }
        return map;
    }
}
