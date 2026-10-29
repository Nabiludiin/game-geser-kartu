package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: MyApplication */
public final class f implements Iterable, r, n {

    /* renamed from: q, reason: collision with root package name */
    final SortedMap f20934q;

    /* renamed from: r, reason: collision with root package name */
    final Map f20935r;

    public f() {
        this.f20934q = new TreeMap();
        this.f20935r = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final boolean V0(String str) {
        return "length".equals(str) || this.f20935r.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final void W0(String str, r rVar) {
        if (rVar == null) {
            this.f20935r.remove(str);
        } else {
            this.f20935r.put(str, rVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String d() {
        return t(",");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator e() {
        return new d(this, this.f20934q.keySet().iterator(), this.f20935r.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (k() != fVar.k()) {
            return false;
        }
        SortedMap sortedMap = this.f20934q;
        if (sortedMap.isEmpty()) {
            return fVar.f20934q.isEmpty();
        }
        for (int intValue = ((Integer) sortedMap.firstKey()).intValue(); intValue <= ((Integer) sortedMap.lastKey()).intValue(); intValue++) {
            if (!m(intValue).equals(fVar.m(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r g(String str, o4 o4Var, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? e0.a(str, this, o4Var, list) : m.a(this, new v(str), o4Var, list);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double h() {
        SortedMap sortedMap = this.f20934q;
        return sortedMap.size() == 1 ? m(0).h() : sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final r h0(String str) {
        r rVar;
        return "length".equals(str) ? new j(Double.valueOf(k())) : (!V0(str) || (rVar = (r) this.f20935r.get(str)) == null) ? r.f21314f : rVar;
    }

    public final int hashCode() {
        return this.f20934q.hashCode() * 31;
    }

    public final List i() {
        ArrayList arrayList = new ArrayList(k());
        for (int i7 = 0; i7 < k(); i7++) {
            arrayList.add(m(i7));
        }
        return arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this);
    }

    public final Iterator j() {
        return this.f20934q.keySet().iterator();
    }

    public final int k() {
        SortedMap sortedMap = this.f20934q;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final int l() {
        return this.f20934q.size();
    }

    public final r m(int i7) {
        r rVar;
        if (i7 < k()) {
            return (!o(i7) || (rVar = (r) this.f20934q.get(Integer.valueOf(i7))) == null) ? r.f21314f : rVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void n(int i7, r rVar) {
        if (i7 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i7);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (rVar == null) {
            this.f20934q.remove(Integer.valueOf(i7));
        } else {
            this.f20934q.put(Integer.valueOf(i7), rVar);
        }
    }

    public final boolean o(int i7) {
        if (i7 >= 0) {
            SortedMap sortedMap = this.f20934q;
            if (i7 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i7));
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i7);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void p() {
        this.f20934q.clear();
    }

    public final void q(int i7, r rVar) {
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 21);
            sb.append("Invalid value index: ");
            sb.append(i7);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i7 >= k()) {
            n(i7, rVar);
            return;
        }
        SortedMap sortedMap = this.f20934q;
        for (int intValue = ((Integer) sortedMap.lastKey()).intValue(); intValue >= i7; intValue--) {
            Integer valueOf = Integer.valueOf(intValue);
            r rVar2 = (r) sortedMap.get(valueOf);
            if (rVar2 != null) {
                n(intValue + 1, rVar2);
                sortedMap.remove(valueOf);
            }
        }
        n(i7, rVar);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r r() {
        f fVar = new f();
        for (Map.Entry entry : this.f20934q.entrySet()) {
            if (entry.getValue() instanceof n) {
                fVar.f20934q.put((Integer) entry.getKey(), (r) entry.getValue());
            } else {
                fVar.f20934q.put((Integer) entry.getKey(), ((r) entry.getValue()).r());
            }
        }
        return fVar;
    }

    public final void s(int i7) {
        SortedMap sortedMap = this.f20934q;
        int intValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i7 > intValue || i7 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i7));
        if (i7 == intValue) {
            int i8 = i7 - 1;
            Integer valueOf = Integer.valueOf(i8);
            if (sortedMap.containsKey(valueOf) || i8 < 0) {
                return;
            }
            sortedMap.put(valueOf, r.f21314f);
            return;
        }
        while (true) {
            i7++;
            if (i7 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer valueOf2 = Integer.valueOf(i7);
            r rVar = (r) sortedMap.get(valueOf2);
            if (rVar != null) {
                sortedMap.put(Integer.valueOf(i7 - 1), rVar);
                sortedMap.remove(valueOf2);
            }
        }
    }

    public final String t(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f20934q.isEmpty()) {
            int i7 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i7 >= k()) {
                    break;
                }
                r m7 = m(i7);
                sb.append(str2);
                if (!(m7 instanceof w) && !(m7 instanceof p)) {
                    sb.append(m7.d());
                }
                i7++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final String toString() {
        return t(",");
    }

    public f(List list) {
        this();
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                n(i7, (r) list.get(i7));
            }
        }
    }
}
