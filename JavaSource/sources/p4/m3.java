package p4;

import x4.c;

/* compiled from: MyApplication */
final class m3 {

    /* renamed from: a, reason: collision with root package name */
    private final n3 f25466a;

    /* renamed from: b, reason: collision with root package name */
    private final j1 f25467b;

    /* renamed from: c, reason: collision with root package name */
    private int f25468c = 0;

    /* renamed from: d, reason: collision with root package name */
    private c.EnumC0147c f25469d = c.EnumC0147c.UNKNOWN;

    m3(n3 n3Var, j1 j1Var) {
        this.f25466a = n3Var;
        this.f25467b = j1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final p4.c a() {
        /*
            r12 = this;
            p4.j1 r0 = r12.f25467b
            int r1 = r0.f25419f
            r2 = 8
            r3 = 0
            r4 = 1
            if (r1 != r2) goto Lc
            r2 = r4
            goto Ld
        Lc:
            r2 = r3
        Ld:
            p4.n3 r5 = r12.f25466a
            p4.r r6 = p4.n3.c(r5)
            r6.f(r2)
            int r2 = r1 + (-1)
            r6 = 0
            if (r1 == 0) goto Lcd
            r1 = 3
            java.lang.String r7 = "Invalid response from server."
            r8 = 2
            switch(r2) {
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L52;
                case 4: goto L4f;
                case 5: goto L4c;
                case 6: goto L3a;
                case 7: goto L28;
                default: goto L22;
            }
        L22:
            p4.u2 r0 = new p4.u2
            r0.<init>(r4, r7)
            throw r0
        L28:
            p4.u2 r2 = new p4.u2
            java.lang.String r0 = r0.f25416c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "Publisher misconfiguration: "
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r1, r0)
            throw r2
        L3a:
            p4.u2 r1 = new p4.u2
            java.lang.String r0 = r0.f25416c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Invalid response from server: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r4, r0)
            throw r1
        L4c:
            r12.f25468c = r4
            goto L54
        L4f:
            r12.f25468c = r8
            goto L54
        L52:
            r12.f25468c = r1
        L54:
            int r1 = r0.f25420g
            int r2 = r1 + (-1)
            if (r1 == 0) goto Lcc
            if (r2 == r4) goto L69
            if (r2 != r8) goto L63
            x4.c$c r1 = x4.c.EnumC0147c.NOT_REQUIRED
            r12.f25469d = r1
            goto L6d
        L63:
            p4.u2 r0 = new p4.u2
            r0.<init>(r4, r7)
            throw r0
        L69:
            x4.c$c r1 = x4.c.EnumC0147c.REQUIRED
            r12.f25469d = r1
        L6d:
            java.lang.String r1 = r0.f25414a
            if (r1 != 0) goto L73
            r2 = r6
            goto L7a
        L73:
            p4.n0 r2 = new p4.n0
            java.lang.String r7 = r0.f25415b
            r2.<init>(r7, r1)
        L7a:
            p4.r r1 = p4.n3.c(r5)
            java.util.HashSet r7 = new java.util.HashSet
            java.util.List r9 = r0.f25417d
            r7.<init>(r9)
            r1.h(r7)
            java.util.List r0 = r0.f25418e
            java.util.Iterator r0 = r0.iterator()
        L8e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc2
            java.lang.Object r1 = r0.next()
            p4.i1 r1 = (p4.i1) r1
            int r7 = r1.f25406b
            int r9 = r7 + (-1)
            if (r7 == 0) goto Lc1
            if (r9 == 0) goto La6
            if (r9 == r4) goto Lab
            if (r9 == r8) goto La8
        La6:
            r7 = r6
            goto Lad
        La8:
            java.lang.String r7 = "clear"
            goto Lad
        Lab:
            java.lang.String r7 = "write"
        Lad:
            if (r7 == 0) goto L8e
            p4.s2 r9 = p4.n3.a(r5)
            java.lang.String r1 = r1.f25405a
            p4.p r10 = p4.n3.b(r5)
            p4.y1[] r11 = new p4.y1[r4]
            r11[r3] = r10
            r9.b(r7, r1, r11)
            goto L8e
        Lc1:
            throw r6
        Lc2:
            p4.c r0 = new p4.c
            int r1 = r12.f25468c
            x4.c$c r3 = r12.f25469d
            r0.<init>(r1, r3, r2, r6)
            return r0
        Lcc:
            throw r6
        Lcd:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.m3.a():p4.c");
    }
}
