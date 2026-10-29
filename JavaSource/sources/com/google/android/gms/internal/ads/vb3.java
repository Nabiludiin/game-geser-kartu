package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class vb3 implements wa3 {

    /* renamed from: h, reason: collision with root package name */
    private static final vb3 f17520h = new vb3();

    /* renamed from: i, reason: collision with root package name */
    private static final Handler f17521i = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    private static Handler f17522j = null;

    /* renamed from: k, reason: collision with root package name */
    private static final Runnable f17523k = new sb3();

    /* renamed from: l, reason: collision with root package name */
    private static final Runnable f17524l = new tb3();

    /* renamed from: b, reason: collision with root package name */
    private int f17526b;

    /* renamed from: g, reason: collision with root package name */
    private long f17531g;

    /* renamed from: a, reason: collision with root package name */
    private final List f17525a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f17527c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final pb3 f17529e = new pb3();

    /* renamed from: d, reason: collision with root package name */
    private final ya3 f17528d = new ya3();

    /* renamed from: f, reason: collision with root package name */
    private final qb3 f17530f = new qb3(new yb3());

    vb3() {
    }

    public static vb3 b() {
        return f17520h;
    }

    private final void k(View view, xa3 xa3Var, JSONObject jSONObject, int i7, boolean z7) {
        xa3Var.b(view, jSONObject, this, i7 == 1, z7);
    }

    private static final void l() {
        Handler handler = f17522j;
        if (handler != null) {
            handler.removeCallbacks(f17524l);
            f17522j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.wa3
    public final void a(View view, xa3 xa3Var, JSONObject jSONObject, boolean z7) {
        pb3 pb3Var;
        int l7;
        boolean z8;
        vb3 vb3Var;
        View view2;
        xa3 xa3Var2;
        boolean z9;
        if (mb3.a(view) != null || (l7 = (pb3Var = this.f17529e).l(view)) == 3) {
            return;
        }
        JSONObject a8 = xa3Var.a(view);
        hb3.e(jSONObject, a8);
        String g8 = pb3Var.g(view);
        if (g8 != null) {
            hb3.d(a8, g8);
            try {
                a8.put("hasWindowFocus", Boolean.valueOf(this.f17529e.j(view)));
            } catch (JSONException e8) {
                ib3.a("Error with setting has window focus", e8);
            }
            boolean k7 = this.f17529e.k(g8);
            Boolean valueOf = Boolean.valueOf(k7);
            if (k7) {
                try {
                    a8.put("isPipActive", valueOf);
                } catch (JSONException e9) {
                    ib3.a("Error with setting is picture-in-picture active", e9);
                }
            }
            this.f17529e.f();
            vb3Var = this;
        } else {
            nb3 i7 = pb3Var.i(view);
            if (i7 != null) {
                na3 b8 = i7.b();
                JSONArray jSONArray = new JSONArray();
                ArrayList c8 = i7.c();
                int size = c8.size();
                for (int i8 = 0; i8 < size; i8++) {
                    jSONArray.put((String) c8.get(i8));
                }
                try {
                    a8.put("isFriendlyObstructionFor", jSONArray);
                    a8.put("friendlyObstructionClass", b8.b());
                    a8.put("friendlyObstructionPurpose", b8.c());
                    a8.put("friendlyObstructionReason", b8.d());
                } catch (JSONException e10) {
                    ib3.a("Error with setting friendly obstruction", e10);
                }
                z8 = true;
            } else {
                z8 = false;
            }
            if (z7 || z8) {
                vb3Var = this;
                view2 = view;
                xa3Var2 = xa3Var;
                z9 = true;
            } else {
                view2 = view;
                xa3Var2 = xa3Var;
                z9 = false;
                vb3Var = this;
            }
            vb3Var.k(view2, xa3Var2, a8, l7, z9);
        }
        vb3Var.f17526b++;
    }

    public final void c() {
        if (f17522j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f17522j = handler;
            handler.post(f17523k);
            f17522j.postDelayed(f17524l, 200L);
        }
    }

    public final void d() {
        l();
        this.f17525a.clear();
        f17521i.post(new rb3(this));
    }

    public final void e() {
        l();
    }

    final /* synthetic */ void f() {
        vb3 vb3Var;
        this.f17526b = 0;
        this.f17527c.clear();
        for (q93 q93Var : ka3.a().f()) {
        }
        this.f17531g = System.nanoTime();
        pb3 pb3Var = this.f17529e;
        pb3Var.d();
        ya3 ya3Var = this.f17528d;
        long nanoTime = System.nanoTime();
        xa3 a8 = ya3Var.a();
        if (pb3Var.b().size() > 0) {
            Iterator it = pb3Var.b().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject a9 = a8.a(null);
                View h8 = pb3Var.h(str);
                xa3 b8 = ya3Var.b();
                String c8 = pb3Var.c(str);
                if (c8 != null) {
                    JSONObject a10 = b8.a(h8);
                    hb3.d(a10, str);
                    try {
                        a10.put("notVisibleReason", c8);
                    } catch (JSONException e8) {
                        ib3.a("Error with setting not visible reason", e8);
                    }
                    hb3.e(a9, a10);
                }
                hb3.f(a9);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.f17530f.b(a9, hashSet, nanoTime);
            }
        }
        pb3 pb3Var2 = this.f17529e;
        if (pb3Var2.a().size() > 0) {
            JSONObject a11 = a8.a(null);
            vb3Var = this;
            vb3Var.k(null, a8, a11, 1, false);
            hb3.f(a11);
            vb3Var.f17530f.a(a11, pb3Var2.a(), nanoTime);
        } else {
            vb3Var = this;
            vb3Var.f17530f.c();
        }
        pb3Var2.e();
        long nanoTime2 = System.nanoTime() - vb3Var.f17531g;
        List list = vb3Var.f17525a;
        if (list.size() > 0) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                throw null;
            }
        }
        va3.a().c();
    }

    final /* synthetic */ qb3 h() {
        return this.f17530f;
    }
}
