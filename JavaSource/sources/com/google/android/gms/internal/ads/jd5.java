package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class jd5 extends IllegalStateException {

    /* renamed from: q, reason: collision with root package name */
    public final int f10515q;

    /* renamed from: r, reason: collision with root package name */
    public final int f10516r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jd5(int r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = " ms"
            if (r4 == 0) goto L8a
            r1 = 1
            if (r4 == r1) goto L6b
            r1 = 2
            if (r4 == r1) goto L4c
            r1 = 3
            if (r4 == r1) goto L2d
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 31
            r2.<init>(r1)
            java.lang.String r1 = "Player stuck suppressed for "
            r2.append(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto La8
        L2d:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 43
            r2.<init>(r1)
            java.lang.String r1 = "Player stuck playing without ending for "
            r2.append(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto La8
        L4c:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 45
            r2.<init>(r1)
            java.lang.String r1 = "Player stuck playing with no progress for "
            r2.append(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto La8
        L6b:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 47
            r2.<init>(r1)
            java.lang.String r1 = "Player stuck buffering with no progress for "
            r2.append(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto La8
        L8a:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 46
            r2.<init>(r1)
            java.lang.String r1 = "Player stuck buffering and not loading for "
            r2.append(r1)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        La8:
            r3.<init>(r0)
            r3.f10515q = r4
            r3.f10516r = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jd5.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jd5.class == obj.getClass()) {
            jd5 jd5Var = (jd5) obj;
            if (this.f10515q == jd5Var.f10515q && this.f10516r == jd5Var.f10516r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10515q + 527) * 31) + this.f10516r;
    }
}
