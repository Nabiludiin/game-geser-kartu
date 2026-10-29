package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class cf {

    /* renamed from: a, reason: collision with root package name */
    public final int f6403a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6404b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6405c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6406d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6407e;

    private cf(int i7, byte[] bArr, Map map, List list, boolean z7, long j7) {
        this.f6403a = i7;
        this.f6404b = bArr;
        this.f6405c = map;
        this.f6406d = list == null ? null : Collections.unmodifiableList(list);
        this.f6407e = z7;
    }

    private static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new ye((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public cf(int i7, byte[] bArr, Map map, boolean z7, long j7) {
        this(i7, bArr, map, a(map), z7, j7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cf(int r13, byte[] r14, boolean r15, long r16, java.util.List r18) {
        /*
            r12 = this;
            if (r18 != 0) goto Ld
            r0 = 0
        L3:
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r10 = r16
            r8 = r18
            r7 = r0
            goto L39
        Ld:
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L16
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            goto L3
        L16:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r18.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.ye r2 = (com.google.android.gms.internal.ads.ye) r2
            java.lang.String r3 = r2.a()
            java.lang.String r2 = r2.b()
            r0.put(r3, r2)
            goto L21
        L39:
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cf.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    public cf(byte[] bArr, Map map) {
        this(200, bArr, map, a(map), false, 0L);
    }
}
