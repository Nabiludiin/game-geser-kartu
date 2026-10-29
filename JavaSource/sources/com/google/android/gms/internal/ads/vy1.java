package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
public final class vy1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f17919a = new ConcurrentHashMap();

    vy1() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:3:0x0001, B:9:0x0015, B:17:0x0036, B:19:0x006d, B:21:0x0077, B:22:0x007f, B:23:0x0086, B:25:0x008c, B:27:0x0090, B:29:0x00a5, B:30:0x00ae, B:32:0x00b4, B:35:0x00c2, B:38:0x00c8, B:39:0x00da, B:41:0x00e0, B:44:0x00f2, B:47:0x00fa, B:59:0x010b, B:62:0x0113, B:65:0x0119, B:68:0x0122, B:77:0x012b, B:80:0x004a, B:81:0x005b), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(long r8, int r10, long r11) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vy1.a(long, int, long):void");
    }

    public final synchronized Map b() {
        HashMap hashMap;
        hashMap = new HashMap();
        if (((Boolean) s2.b0.c().d(uy.u8)).booleanValue()) {
            c();
            for (Map.Entry entry : this.f17919a.entrySet()) {
                hashMap.put((yy1) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void c() {
        /*
            r9 = this;
            com.google.android.gms.common.util.e r0 = r2.t.o()
            long r0 = r0.a()
            java.util.Map r2 = r9.f17919a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.ads.yy1 r4 = (com.google.android.gms.internal.ads.yy1) r4
            java.lang.Object r3 = r3.getValue()
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            int r4 = r4.b()
            r5 = 0
            if (r4 == 0) goto L3b
            r7 = 1
            if (r4 == r7) goto L5f
            r7 = 2
            if (r4 == r7) goto L4e
            r7 = 3
            if (r4 == r7) goto L3d
        L3b:
            r7 = r5
            goto L6f
        L3d:
            com.google.android.gms.internal.ads.ly r4 = com.google.android.gms.internal.ads.uy.z8
            com.google.android.gms.internal.ads.sy r7 = s2.b0.c()
            java.lang.Object r4 = r7.d(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L6f
        L4e:
            com.google.android.gms.internal.ads.ly r4 = com.google.android.gms.internal.ads.uy.y8
            com.google.android.gms.internal.ads.sy r7 = s2.b0.c()
            java.lang.Object r4 = r7.d(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
            goto L6f
        L5f:
            com.google.android.gms.internal.ads.ly r4 = com.google.android.gms.internal.ads.uy.x8
            com.google.android.gms.internal.ads.sy r7 = s2.b0.c()
            java.lang.Object r4 = r7.d(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r7 = r4.longValue()
        L6f:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L77
            r2.remove()
            r7 = r5
        L77:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L12
            java.util.Iterator r4 = r3.iterator()
        L7f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L99
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = r0 - r5
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L99
            r4.remove()
            goto L7f
        L99:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L12
            r2.remove()
            goto L12
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vy1.c():void");
    }
}
