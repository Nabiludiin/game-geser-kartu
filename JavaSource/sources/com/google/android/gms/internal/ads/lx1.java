package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
public final class lx1 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f11924a;

    /* renamed from: b, reason: collision with root package name */
    private final tl0 f11925b;

    /* renamed from: c, reason: collision with root package name */
    private final w03 f11926c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11927d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11928e;

    /* renamed from: f, reason: collision with root package name */
    private final fn f11929f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f11930g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private final Context f11931h;

    public lx1(Context context, wx1 wx1Var, tl0 tl0Var, w03 w03Var, String str, String str2, fn fnVar) {
        ActivityManager.MemoryInfo n7;
        ConcurrentHashMap d8 = wx1Var.d();
        this.f11924a = d8;
        this.f11925b = tl0Var;
        this.f11926c = w03Var;
        this.f11927d = str;
        this.f11928e = str2;
        this.f11929f = fnVar;
        this.f11931h = context;
        d8.put("ad_format", str2.toUpperCase(Locale.ROOT));
        g();
        if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            d("rt_f", String.valueOf(runtime.freeMemory()));
            d("rt_m", String.valueOf(runtime.maxMemory()));
            d("rt_t", String.valueOf(runtime.totalMemory()));
            d("wv_c", String.valueOf(r2.t.l().n()));
            if (((Boolean) s2.b0.c().d(uy.D2)).booleanValue() && (n7 = w2.g.n(context)) != null) {
                d("mem_avl", String.valueOf(n7.availMem));
                d("mem_tt", String.valueOf(n7.totalMem));
                d("low_m", true != n7.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) s2.b0.c().d(uy.F2)).booleanValue()) {
            d("ad_unit_id", w03Var.f17961g);
        }
        if (((Boolean) s2.b0.c().d(uy.w7)).booleanValue()) {
            int g8 = b3.c.g(w03Var) - 1;
            if (g8 == 0) {
                d8.put("request_id", str);
                d8.put("scar", "false");
                return;
            }
            if (g8 == 1) {
                d8.put("request_id", str);
                d8.put("se", "query_g");
            } else if (g8 == 2) {
                d8.put("se", "r_adinfo");
            } else if (g8 != 3) {
                d8.put("se", "r_both");
            } else {
                d8.put("se", "r_adstring");
            }
            d8.put("scar", "true");
            d("ragent", w03Var.f17958d.F);
            d("rtype", b3.c.b(b3.c.c(w03Var.f17958d)));
        }
    }

    public final void a(o03 o03Var) {
        n03 n03Var = o03Var.f13137b;
        List list = n03Var.f12529a;
        if (!list.isEmpty()) {
            int i7 = ((c03) list.get(0)).f6152b;
            d("ad_format", c03.a(i7));
            if (i7 == 6) {
                this.f11924a.put("as", true != this.f11925b.k() ? "0" : "1");
            }
        }
        if (((Boolean) s2.b0.c().d(uy.f17240x2)).booleanValue()) {
            d("mwl", Integer.toString(list.size()));
        }
        d("gqi", n03Var.f12530b.f7926b);
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            d("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            d("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map c() {
        return this.f11924a;
    }

    public final void d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f11924a.put(str, str2);
    }

    public final Bundle e() {
        return this.f11930g;
    }

    public final void f() {
        if (((Boolean) s2.b0.c().d(uy.pe)).booleanValue()) {
            d("brr", true != this.f11926c.f17971q ? "0" : "1");
        }
    }

    public final void g() {
        if (((Boolean) s2.b0.c().d(uy.Ba)).booleanValue()) {
            zm b8 = this.f11929f.b();
            if (b8 instanceof r2.k) {
                this.f11924a.put("asv", ((r2.k) b8).c());
            } else if (b8 instanceof fu0) {
                this.f11924a.put("asv", ((fu0) b8).a());
            } else {
                this.f11924a.put("asv", "NA");
            }
        }
    }
}
