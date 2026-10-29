package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
final class yf {

    /* renamed from: a, reason: collision with root package name */
    long f19537a;

    /* renamed from: b, reason: collision with root package name */
    final String f19538b;

    /* renamed from: c, reason: collision with root package name */
    final String f19539c;

    /* renamed from: d, reason: collision with root package name */
    final long f19540d;

    /* renamed from: e, reason: collision with root package name */
    final long f19541e;

    /* renamed from: f, reason: collision with root package name */
    final long f19542f;

    /* renamed from: g, reason: collision with root package name */
    final long f19543g;

    /* renamed from: h, reason: collision with root package name */
    final List f19544h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    yf(java.lang.String r14, com.google.android.gms.internal.ads.pe r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f13844b
            long r3 = r15.f13845c
            long r5 = r15.f13846d
            long r7 = r15.f13847e
            long r9 = r15.f13848f
            java.util.List r0 = r15.f13850h
            if (r0 == 0) goto L12
        Le:
            r1 = r14
            r11 = r0
            r0 = r13
            goto L46
        L12:
            java.util.Map r15 = r15.f13849g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L25:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.ye r11 = new com.google.android.gms.internal.ads.ye
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L25
        L46:
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yf.<init>(java.lang.String, com.google.android.gms.internal.ads.pe):void");
    }

    static yf a(zf zfVar) {
        if (bg.i(zfVar) != 538247942) {
            throw new IOException();
        }
        String m7 = bg.m(zfVar);
        String m8 = bg.m(zfVar);
        long k7 = bg.k(zfVar);
        long k8 = bg.k(zfVar);
        long k9 = bg.k(zfVar);
        long k10 = bg.k(zfVar);
        int i7 = bg.i(zfVar);
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 20);
            sb.append("readHeaderList size=");
            sb.append(i7);
            throw new IOException(sb.toString());
        }
        List arrayList = i7 == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add(new ye(bg.m(zfVar).intern(), bg.m(zfVar).intern()));
        }
        return new yf(m7, m8, k7, k8, k9, k10, arrayList);
    }

    private yf(String str, String str2, long j7, long j8, long j9, long j10, List list) {
        this.f19538b = str;
        this.f19539c = true == "".equals(str2) ? null : str2;
        this.f19540d = j7;
        this.f19541e = j8;
        this.f19542f = j9;
        this.f19543g = j10;
        this.f19544h = list;
    }
}
