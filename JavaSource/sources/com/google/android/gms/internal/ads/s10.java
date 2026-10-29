package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class s10 extends d20 {
    static final int A;

    /* renamed from: y, reason: collision with root package name */
    private static final int f15418y;

    /* renamed from: z, reason: collision with root package name */
    static final int f15419z;

    /* renamed from: q, reason: collision with root package name */
    private final String f15420q;

    /* renamed from: r, reason: collision with root package name */
    private final List f15421r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private final List f15422s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private final int f15423t;

    /* renamed from: u, reason: collision with root package name */
    private final int f15424u;

    /* renamed from: v, reason: collision with root package name */
    private final int f15425v;

    /* renamed from: w, reason: collision with root package name */
    private final int f15426w;

    /* renamed from: x, reason: collision with root package name */
    private final int f15427x;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f15418y = rgb;
        f15419z = Color.rgb(204, 204, 204);
        A = rgb;
    }

    public s10(String str, List list, Integer num, Integer num2, Integer num3, int i7, int i8, boolean z7) {
        this.f15420q = str;
        for (int i9 = 0; i9 < list.size(); i9++) {
            v10 v10Var = (v10) list.get(i9);
            this.f15421r.add(v10Var);
            this.f15422s.add(v10Var);
        }
        this.f15423t = num != null ? num.intValue() : f15419z;
        this.f15424u = num2 != null ? num2.intValue() : A;
        this.f15425v = num3 != null ? num3.intValue() : 12;
        this.f15426w = i7;
        this.f15427x = i8;
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final String b() {
        return this.f15420q;
    }

    public final int c() {
        return this.f15423t;
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final List d() {
        return this.f15422s;
    }

    public final int e() {
        return this.f15424u;
    }

    public final List h() {
        return this.f15421r;
    }

    public final int j() {
        return this.f15427x;
    }

    public final int k8() {
        return this.f15425v;
    }

    public final int l8() {
        return this.f15426w;
    }
}
