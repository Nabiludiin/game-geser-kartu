package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class he {

    /* renamed from: a, reason: collision with root package name */
    private String f22212a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f22213b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.z6 f22214c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f22215d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f22216e;

    /* renamed from: f, reason: collision with root package name */
    private Map f22217f;

    /* renamed from: g, reason: collision with root package name */
    private Map f22218g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ e f22219h;

    /* synthetic */ he(e eVar, String str, com.google.android.gms.internal.measurement.z6 z6Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f22219h = eVar;
        this.f22212a = str;
        this.f22215d = bitSet;
        this.f22216e = bitSet2;
        this.f22217f = map;
        this.f22218g = new r.a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f22218g.put(num, arrayList);
        }
        this.f22213b = false;
        this.f22214c = z6Var;
    }

    final void a(c cVar) {
        int a8 = cVar.a();
        if (cVar.f21914c != null) {
            this.f22216e.set(a8, true);
        }
        Boolean bool = cVar.f21915d;
        if (bool != null) {
            this.f22215d.set(a8, bool.booleanValue());
        }
        if (cVar.f21916e != null) {
            Map map = this.f22217f;
            Integer valueOf = Integer.valueOf(a8);
            Long l7 = (Long) map.get(valueOf);
            long longValue = cVar.f21916e.longValue() / 1000;
            if (l7 == null || longValue > l7.longValue()) {
                this.f22217f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (cVar.f21917f != null) {
            Map map2 = this.f22218g;
            Integer valueOf2 = Integer.valueOf(a8);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f22218g.put(valueOf2, list);
            }
            if (cVar.b()) {
                list.clear();
            }
            com.google.android.gms.internal.measurement.ge.a();
            w6 w6Var = this.f22219h.f22928a;
            m w7 = w6Var.w();
            String str = this.f22212a;
            b5 b5Var = c5.G0;
            if (w7.H(str, b5Var) && cVar.c()) {
                list.clear();
            }
            com.google.android.gms.internal.measurement.ge.a();
            if (!w6Var.w().H(this.f22212a, b5Var)) {
                list.add(Long.valueOf(cVar.f21917f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(cVar.f21917f.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    final com.google.android.gms.internal.measurement.w5 b(int i7) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.v5 M = com.google.android.gms.internal.measurement.w5.M();
        M.x(i7);
        M.A(this.f22213b);
        com.google.android.gms.internal.measurement.z6 z6Var = this.f22214c;
        if (z6Var != null) {
            M.z(z6Var);
        }
        com.google.android.gms.internal.measurement.y6 N = com.google.android.gms.internal.measurement.z6.N();
        N.z(td.Q(this.f22215d));
        N.x(td.Q(this.f22216e));
        Map map = this.f22217f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f22217f.keySet()) {
                int intValue = num.intValue();
                Long l7 = (Long) this.f22217f.get(num);
                if (l7 != null) {
                    com.google.android.gms.internal.measurement.f6 J = com.google.android.gms.internal.measurement.g6.J();
                    J.x(intValue);
                    J.y(l7.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.g6) J.s());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            N.B(arrayList);
        }
        Map map2 = this.f22218g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f22218g.keySet()) {
                com.google.android.gms.internal.measurement.a7 K = com.google.android.gms.internal.measurement.b7.K();
                K.x(num2.intValue());
                List list2 = (List) this.f22218g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    K.y(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.b7) K.s());
            }
            list = arrayList3;
        }
        N.D(list);
        M.y(N);
        return (com.google.android.gms.internal.measurement.w5) M.s();
    }

    final /* synthetic */ BitSet c() {
        return this.f22215d;
    }

    /* synthetic */ he(e eVar, String str, byte[] bArr) {
        Objects.requireNonNull(eVar);
        this.f22219h = eVar;
        this.f22212a = str;
        this.f22213b = true;
        this.f22215d = new BitSet();
        this.f22216e = new BitSet();
        this.f22217f = new r.a();
        this.f22218g = new r.a();
    }
}
