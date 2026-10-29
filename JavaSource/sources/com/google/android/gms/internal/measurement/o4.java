package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final o4 f21203a;

    /* renamed from: b, reason: collision with root package name */
    final z f21204b;

    /* renamed from: c, reason: collision with root package name */
    final Map f21205c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Map f21206d = new HashMap();

    public o4(o4 o4Var, z zVar) {
        this.f21203a = o4Var;
        this.f21204b = zVar;
    }

    public final r a(r rVar) {
        return this.f21204b.b(this, rVar);
    }

    public final r b(f fVar) {
        r rVar = r.f21314f;
        Iterator j7 = fVar.j();
        while (j7.hasNext()) {
            rVar = this.f21204b.b(this, fVar.m(((Integer) j7.next()).intValue()));
            if (rVar instanceof h) {
                break;
            }
        }
        return rVar;
    }

    public final o4 c() {
        return new o4(this, this.f21204b);
    }

    public final boolean d(String str) {
        if (this.f21205c.containsKey(str)) {
            return true;
        }
        o4 o4Var = this.f21203a;
        if (o4Var != null) {
            return o4Var.d(str);
        }
        return false;
    }

    public final void e(String str, r rVar) {
        o4 o4Var;
        Map map = this.f21205c;
        if (!map.containsKey(str) && (o4Var = this.f21203a) != null && o4Var.d(str)) {
            o4Var.e(str, rVar);
        } else {
            if (this.f21206d.containsKey(str)) {
                return;
            }
            if (rVar == null) {
                map.remove(str);
            } else {
                map.put(str, rVar);
            }
        }
    }

    public final void f(String str, r rVar) {
        if (this.f21206d.containsKey(str)) {
            return;
        }
        if (rVar == null) {
            this.f21205c.remove(str);
        } else {
            this.f21205c.put(str, rVar);
        }
    }

    public final void g(String str, r rVar) {
        f(str, rVar);
        this.f21206d.put(str, Boolean.TRUE);
    }

    public final r h(String str) {
        Map map = this.f21205c;
        if (map.containsKey(str)) {
            return (r) map.get(str);
        }
        o4 o4Var = this.f21203a;
        if (o4Var != null) {
            return o4Var.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
