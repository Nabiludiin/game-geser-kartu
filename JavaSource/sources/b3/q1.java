package b3;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.lx1;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.wx1;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class q1 {

    /* renamed from: h, reason: collision with root package name */
    private final wx1 f3335h;

    /* renamed from: i, reason: collision with root package name */
    private Map f3336i;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque f3333f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f3334g = new ArrayDeque();

    /* renamed from: a, reason: collision with root package name */
    private final int f3328a = ((Integer) s2.b0.c().d(uy.u7)).intValue();

    /* renamed from: b, reason: collision with root package name */
    private final long f3329b = ((Long) s2.b0.c().d(uy.v7)).longValue();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3330c = ((Boolean) s2.b0.c().d(uy.z7)).booleanValue();

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3331d = ((Boolean) s2.b0.c().d(uy.y7)).booleanValue();

    /* renamed from: e, reason: collision with root package name */
    private final Map f3332e = Collections.synchronizedMap(new n1(this));

    public q1(wx1 wx1Var) {
        this.f3335h = wx1Var;
    }

    private final synchronized void i() {
        long a8 = r2.t.o().a();
        try {
            Iterator it = this.f3332e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (a8 - ((o1) entry.getValue()).f3313a.longValue() <= this.f3329b) {
                    break;
                }
                this.f3334g.add(new Pair((String) entry.getKey(), ((o1) entry.getValue()).f3314b));
                it.remove();
            }
        } catch (ConcurrentModificationException e8) {
            r2.t.l().i(e8, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private final synchronized void j(final lx1 lx1Var) {
        if (this.f3330c) {
            ArrayDeque arrayDeque = this.f3334g;
            final ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f3333f;
            final ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            cm0.f6500a.execute(new Runnable() { // from class: b3.p1
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    q1.this.f(lx1Var, clone, clone2);
                }
            });
        }
    }

    private final void k(lx1 lx1Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(lx1Var.c());
            this.f3336i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f3336i.put("e_r", str);
            this.f3336i.put("e_id", (String) pair2.first);
            if (this.f3331d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(c.b(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                l(this.f3336i, "e_type", (String) pair.first);
                l(this.f3336i, "e_agent", (String) pair.second);
            }
            this.f3335h.b(this.f3336i);
        }
    }

    private static final void l(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized void a(String str, String str2, lx1 lx1Var) {
        this.f3332e.put(str, new o1(Long.valueOf(r2.t.o().a()), str2, new HashSet()));
        i();
        j(lx1Var);
    }

    public final synchronized String b(String str, lx1 lx1Var) {
        o1 o1Var = (o1) this.f3332e.get(str);
        lx1Var.c().put("request_id", str);
        if (o1Var == null) {
            lx1Var.c().put("mhit", "false");
            return null;
        }
        lx1Var.c().put("mhit", "true");
        return o1Var.f3314b;
    }

    public final synchronized void c(String str) {
        this.f3332e.remove(str);
    }

    public final synchronized boolean d(String str, String str2) {
        o1 o1Var = (o1) this.f3332e.get(str);
        if (o1Var != null) {
            if (o1Var.f3315c.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean e(String str, String str2, int i7) {
        o1 o1Var = (o1) this.f3332e.get(str);
        if (o1Var == null) {
            return false;
        }
        Set set = o1Var.f3315c;
        set.add(str2);
        return set.size() < i7;
    }

    final /* synthetic */ void f(lx1 lx1Var, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        k(lx1Var, arrayDeque, "to");
        k(lx1Var, arrayDeque2, "of");
    }

    final /* synthetic */ int g() {
        return this.f3328a;
    }

    final /* synthetic */ ArrayDeque h() {
        return this.f3333f;
    }
}
