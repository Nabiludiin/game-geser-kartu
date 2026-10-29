package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class q extends k implements n {

    /* renamed from: s, reason: collision with root package name */
    protected final List f21242s;

    /* renamed from: t, reason: collision with root package name */
    protected final List f21243t;

    /* renamed from: u, reason: collision with root package name */
    protected o4 f21244u;

    private q(q qVar) {
        super(qVar.f21066q);
        ArrayList arrayList = new ArrayList(qVar.f21242s.size());
        this.f21242s = arrayList;
        arrayList.addAll(qVar.f21242s);
        ArrayList arrayList2 = new ArrayList(qVar.f21243t.size());
        this.f21243t = arrayList2;
        arrayList2.addAll(qVar.f21243t);
        this.f21244u = qVar.f21244u;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final r a(o4 o4Var, List list) {
        o4 c8 = this.f21244u.c();
        int i7 = 0;
        while (true) {
            List list2 = this.f21242s;
            if (i7 >= list2.size()) {
                break;
            }
            if (i7 < list.size()) {
                c8.f((String) list2.get(i7), o4Var.a((r) list.get(i7)));
            } else {
                c8.f((String) list2.get(i7), r.f21314f);
            }
            i7++;
        }
        for (r rVar : this.f21243t) {
            r a8 = c8.a(rVar);
            if (a8 instanceof s) {
                a8 = c8.a(rVar);
            }
            if (a8 instanceof h) {
                return ((h) a8).a();
            }
        }
        return r.f21314f;
    }

    @Override // com.google.android.gms.internal.measurement.k, com.google.android.gms.internal.measurement.r
    public final r r() {
        return new q(this);
    }

    public q(String str, List list, List list2, o4 o4Var) {
        super(str);
        this.f21242s = new ArrayList();
        this.f21244u = o4Var;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f21242s.add(((r) it.next()).d());
            }
        }
        this.f21243t = new ArrayList(list2);
    }
}
