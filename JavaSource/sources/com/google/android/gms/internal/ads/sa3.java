package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: MyApplication */
public final class sa3 {

    /* renamed from: a, reason: collision with root package name */
    private final s93 f15518a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f15519b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f15520c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityQueue f15521d = new PriorityQueue();

    /* renamed from: e, reason: collision with root package name */
    private int f15522e = -1;

    /* renamed from: f, reason: collision with root package name */
    private r83 f15523f;

    public sa3(s93 s93Var) {
        this.f15518a = s93Var;
    }

    private final void f(int i7) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.f15521d;
            if (priorityQueue.size() <= i7) {
                return;
            }
            r83 r83Var = (r83) priorityQueue.poll();
            String str = hi2.f9535a;
            int i8 = 0;
            while (true) {
                list = r83Var.f14789q;
                if (i8 >= list.size()) {
                    break;
                }
                this.f15518a.a(r83Var.f14790r, (y82) list.get(i8));
                this.f15519b.push((y82) list.get(i8));
                i8++;
            }
            list.clear();
            r83 r83Var2 = this.f15523f;
            if (r83Var2 != null && r83Var2.f14790r == r83Var.f14790r) {
                this.f15523f = null;
            }
            this.f15520c.push(r83Var);
        }
    }

    public final void a(int i7) {
        rx3.h(i7 >= 0);
        this.f15522e = i7;
        f(i7);
    }

    public final int b() {
        return this.f15522e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r7 < r0.f14790r) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r7, com.google.android.gms.internal.ads.y82 r9) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L9b
            int r0 = r6.f15522e
            if (r0 == 0) goto L9c
            r1 = -1
            if (r0 == r1) goto L2a
            java.util.PriorityQueue r0 = r6.f15521d
            int r2 = r0.size()
            int r3 = r6.f15522e
            if (r2 < r3) goto L2a
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.r83 r0 = (com.google.android.gms.internal.ads.r83) r0
            java.lang.String r2 = com.google.android.gms.internal.ads.hi2.f9535a
            long r2 = r0.f14790r
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2a
            goto L9c
        L2a:
            java.util.ArrayDeque r0 = r6.f15519b
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L38
            com.google.android.gms.internal.ads.y82 r0 = new com.google.android.gms.internal.ads.y82
            r0.<init>()
            goto L3e
        L38:
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.y82 r0 = (com.google.android.gms.internal.ads.y82) r0
        L3e:
            int r2 = r9.C()
            r0.z(r2)
            byte[] r2 = r9.H()
            int r9 = r9.F()
            byte[] r3 = r0.H()
            r4 = 0
            int r5 = r0.C()
            java.lang.System.arraycopy(r2, r9, r3, r4, r5)
            com.google.android.gms.internal.ads.r83 r9 = r6.f15523f
            if (r9 == 0) goto L6a
            long r2 = r9.f14790r
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L64
            goto L6a
        L64:
            java.util.List r7 = r9.f14789q
            r7.add(r0)
            return
        L6a:
            java.util.ArrayDeque r9 = r6.f15520c
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L78
            com.google.android.gms.internal.ads.r83 r9 = new com.google.android.gms.internal.ads.r83
            r9.<init>()
            goto L7e
        L78:
            java.lang.Object r9 = r9.pop()
            com.google.android.gms.internal.ads.r83 r9 = (com.google.android.gms.internal.ads.r83) r9
        L7e:
            java.util.List r2 = r9.f14789q
            boolean r3 = r2.isEmpty()
            com.google.android.gms.internal.ads.rx3.h(r3)
            r9.f14790r = r7
            r2.add(r0)
            java.util.PriorityQueue r7 = r6.f15521d
            r7.add(r9)
            r6.f15523f = r9
            int r7 = r6.f15522e
            if (r7 == r1) goto L9a
            r6.f(r7)
        L9a:
            return
        L9b:
            r7 = r0
        L9c:
            com.google.android.gms.internal.ads.s93 r0 = r6.f15518a
            r0.a(r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sa3.c(long, com.google.android.gms.internal.ads.y82):void");
    }

    public final void d() {
        this.f15521d.clear();
    }

    public final void e() {
        f(0);
    }
}
