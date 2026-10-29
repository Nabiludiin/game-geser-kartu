package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
final class pb implements n9 {

    /* renamed from: a, reason: collision with root package name */
    private final List f13774a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f13775b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f13776c;

    public pb(List list) {
        this.f13774a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.f13775b = new long[size + size];
        for (int i7 = 0; i7 < list.size(); i7++) {
            eb ebVar = (eb) list.get(i7);
            long[] jArr = this.f13775b;
            int i8 = i7 + i7;
            jArr[i8] = ebVar.f7519b;
            jArr[i8 + 1] = ebVar.f7520c;
        }
        long[] jArr2 = this.f13775b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f13776c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.gms.internal.ads.n9
    public final int a() {
        return this.f13776c.length;
    }

    @Override // com.google.android.gms.internal.ads.n9
    public final long b(int i7) {
        rx3.a(i7 >= 0);
        long[] jArr = this.f13776c;
        rx3.a(i7 < jArr.length);
        return jArr[i7];
    }

    @Override // com.google.android.gms.internal.ads.n9
    public final List c(long j7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = this.f13774a;
            if (i7 >= list.size()) {
                break;
            }
            long[] jArr = this.f13775b;
            int i8 = i7 + i7;
            if (jArr[i8] <= j7 && j7 < jArr[i8 + 1]) {
                eb ebVar = (eb) list.get(i7);
                vw0 vw0Var = ebVar.f7518a;
                if (vw0Var.f17879e == -3.4028235E38f) {
                    arrayList2.add(ebVar);
                } else {
                    arrayList.add(vw0Var);
                }
            }
            i7++;
        }
        Collections.sort(arrayList2, ob.f13264q);
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            uv0 a8 = ((eb) arrayList2.get(i9)).f7518a.a();
            a8.f((-1) - i9, 1);
            arrayList.add(a8.r());
        }
        return arrayList;
    }
}
