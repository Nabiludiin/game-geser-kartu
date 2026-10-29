package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class cy1 {

    /* renamed from: e, reason: collision with root package name */
    private final String f6854e;

    /* renamed from: f, reason: collision with root package name */
    private final wx1 f6855f;

    /* renamed from: b, reason: collision with root package name */
    private final List f6851b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f6852c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6853d = false;

    /* renamed from: a, reason: collision with root package name */
    private final v2.p1 f6850a = r2.t.l().q();

    public cy1(String str, wx1 wx1Var) {
        this.f6854e = str;
        this.f6855f = wx1Var;
    }

    private final Map g() {
        Map j7 = this.f6855f.j();
        j7.put("tms", Long.toString(r2.t.o().b(), 10));
        j7.put("tid", this.f6850a.H() ? "" : this.f6854e);
        return j7;
    }

    public final synchronized void a(String str) {
        if (((Boolean) s2.b0.c().d(uy.f17184q2)).booleanValue()) {
            Map g8 = g();
            g8.put("action", "adapter_init_started");
            g8.put("ancn", str);
            this.f6851b.add(g8);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) s2.b0.c().d(uy.f17184q2)).booleanValue()) {
            Map g8 = g();
            g8.put("action", "adapter_init_finished");
            g8.put("ancn", str);
            this.f6851b.add(g8);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) s2.b0.c().d(uy.f17184q2)).booleanValue()) {
            Map g8 = g();
            g8.put("action", "adapter_init_finished");
            g8.put("ancn", str);
            g8.put("rqe", str2);
            this.f6851b.add(g8);
        }
    }

    public final synchronized void d(String str) {
        if (((Boolean) s2.b0.c().d(uy.f17184q2)).booleanValue()) {
            Map g8 = g();
            g8.put("action", "aaia");
            g8.put("aair", "MalformedJson");
            this.f6851b.add(g8);
        }
    }

    public final synchronized void e() {
        if (((Boolean) s2.b0.c().d(uy.f17184q2)).booleanValue() && !this.f6852c) {
            Map g8 = g();
            g8.put("action", "init_started");
            this.f6851b.add(g8);
            this.f6852c = true;
        }
    }

    public final synchronized void f() {
        try {
            if (((Boolean) s2.b0.c().d(uy.f17184q2)).booleanValue() && !this.f6853d) {
                Map g8 = g();
                g8.put("action", "init_finished");
                List list = this.f6851b;
                list.add(g8);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f6855f.b((Map) it.next());
                }
                this.f6853d = true;
            }
        } finally {
        }
    }
}
