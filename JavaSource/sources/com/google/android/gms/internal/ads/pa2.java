package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class pa2 {

    /* renamed from: c, reason: collision with root package name */
    private final String f13763c;

    /* renamed from: d, reason: collision with root package name */
    private f03 f13764d = null;

    /* renamed from: e, reason: collision with root package name */
    private c03 f13765e = null;

    /* renamed from: f, reason: collision with root package name */
    private s2.k5 f13766f = null;

    /* renamed from: b, reason: collision with root package name */
    private final Map f13762b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final List f13761a = Collections.synchronizedList(new ArrayList());

    public pa2(String str) {
        this.f13763c = str;
    }

    private final synchronized void j(c03 c03Var, int i7) {
        Map map = this.f13762b;
        String l7 = l(c03Var);
        if (map.containsKey(l7)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = c03Var.f6192v;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        s2.k5 k5Var = new s2.k5(c03Var.E, 0L, null, bundle, c03Var.F, c03Var.G, c03Var.H, c03Var.I);
        try {
            this.f13761a.add(i7, k5Var);
        } catch (IndexOutOfBoundsException e8) {
            r2.t.l().i(e8, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.f13762b.put(l7, k5Var);
    }

    private final void k(c03 c03Var, long j7, s2.x2 x2Var, boolean z7) {
        Map map = this.f13762b;
        String l7 = l(c03Var);
        if (map.containsKey(l7)) {
            if (this.f13765e == null) {
                this.f13765e = c03Var;
            }
            s2.k5 k5Var = (s2.k5) map.get(l7);
            k5Var.f26157r = j7;
            k5Var.f26158s = x2Var;
            if (((Boolean) s2.b0.c().d(uy.n7)).booleanValue() && z7) {
                this.f13766f = k5Var;
            }
        }
    }

    private static String l(c03 c03Var) {
        return ((Boolean) s2.b0.c().d(uy.f17086e4)).booleanValue() ? c03Var.f6181p0 : c03Var.f6194w;
    }

    public final void a(f03 f03Var) {
        this.f13764d = f03Var;
    }

    public final void b(c03 c03Var) {
        j(c03Var, this.f13761a.size());
    }

    public final synchronized void c(String str, List list) {
        Map map = this.f13762b;
        if (map.containsKey(str)) {
            s2.k5 k5Var = (s2.k5) map.get(str);
            List list2 = this.f13761a;
            int indexOf = list2.indexOf(k5Var);
            try {
                list2.remove(indexOf);
            } catch (IndexOutOfBoundsException e8) {
                r2.t.l().i(e8, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.f13762b.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j((c03) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void d(c03 c03Var, long j7, s2.x2 x2Var) {
        k(c03Var, j7, null, true);
    }

    public final void e(c03 c03Var, long j7, s2.x2 x2Var) {
        k(c03Var, j7, x2Var, false);
    }

    public final p91 f() {
        return new p91(this.f13765e, "", this, this.f13764d, this.f13763c);
    }

    public final s2.k5 g() {
        return this.f13766f;
    }

    public final List h() {
        return this.f13761a;
    }

    public final void i(c03 c03Var) {
        Map map = this.f13762b;
        Object obj = map.get(l(c03Var));
        List list = this.f13761a;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.f13766f);
        }
        if (indexOf < 0 || indexOf >= map.size()) {
            return;
        }
        this.f13766f = (s2.k5) list.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= list.size()) {
                return;
            }
            s2.k5 k5Var = (s2.k5) list.get(indexOf);
            k5Var.f26157r = 0L;
            k5Var.f26158s = null;
        }
    }
}
