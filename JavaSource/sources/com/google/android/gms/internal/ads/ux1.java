package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public final class ux1 implements g53 {

    /* renamed from: r, reason: collision with root package name */
    private final lx1 f17034r;

    /* renamed from: s, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f17035s;

    /* renamed from: q, reason: collision with root package name */
    private final Map f17033q = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    private final Map f17036t = new HashMap();

    public ux1(lx1 lx1Var, Set set, com.google.android.gms.common.util.e eVar) {
        this.f17034r = lx1Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            tx1 tx1Var = (tx1) it.next();
            this.f17036t.put(tx1Var.c(), tx1Var);
        }
        this.f17035s = eVar;
    }

    private final void a(z43 z43Var, boolean z7) {
        tx1 tx1Var = (tx1) this.f17036t.get(z43Var);
        if (tx1Var == null) {
            return;
        }
        String str = true != z7 ? "f." : "s.";
        Map map = this.f17033q;
        z43 b8 = tx1Var.b();
        if (map.containsKey(b8)) {
            long b9 = this.f17035s.b() - ((Long) map.get(b8)).longValue();
            lx1 lx1Var = this.f17034r;
            String a8 = tx1Var.a();
            int length = str.length();
            Map c8 = lx1Var.c();
            StringBuilder sb = new StringBuilder(length + String.valueOf(b9).length());
            sb.append(str);
            sb.append(b9);
            c8.put("label.".concat(a8), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void k(z43 z43Var, String str) {
        this.f17033q.put(z43Var, Long.valueOf(this.f17035s.b()));
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void s(z43 z43Var, String str, Throwable th) {
        Map map = this.f17033q;
        if (map.containsKey(z43Var)) {
            long b8 = this.f17035s.b() - ((Long) map.get(z43Var)).longValue();
            this.f17034r.c().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(b8))));
        }
        if (this.f17036t.containsKey(z43Var)) {
            a(z43Var, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void t(z43 z43Var, String str) {
        Map map = this.f17033q;
        if (map.containsKey(z43Var)) {
            long b8 = this.f17035s.b() - ((Long) map.get(z43Var)).longValue();
            this.f17034r.c().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(b8))));
        }
        if (this.f17036t.containsKey(z43Var)) {
            a(z43Var, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.g53
    public final void q(z43 z43Var, String str) {
    }
}
