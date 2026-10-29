package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f19953a = new LinkedHashMap();

    public final void a(y1 y1Var) {
        long[] jArr = y1Var.f19335e;
        if (jArr.length > 0) {
            Map map = this.f19953a;
            if (map.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(Long.valueOf(jArr[0]), y1Var);
        }
    }

    public final y1 b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (y1 y1Var : this.f19953a.values()) {
            arrayList.add(y1Var.f19332b);
            arrayList2.add(y1Var.f19333c);
            arrayList3.add(y1Var.f19334d);
            arrayList4.add(y1Var.f19335e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j7 = 0;
        for (int[] iArr2 : iArr) {
            j7 += iArr2.length;
        }
        int i7 = (int) j7;
        rx3.e(j7 == ((long) i7), "the total number of elements (%s) in the arrays must fit in an int", j7);
        int[] iArr3 = new int[i7];
        int i8 = 0;
        for (int[] iArr4 : iArr) {
            int length = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i8, length);
            i8 += length;
        }
        return new y1(iArr3, p44.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), p44.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), p44.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
