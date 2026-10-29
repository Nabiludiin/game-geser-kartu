package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: MyApplication */
public class j14 extends e14 implements e24 {

    /* renamed from: v, reason: collision with root package name */
    private final transient g14 f10301v;

    /* renamed from: w, reason: collision with root package name */
    private transient g14 f10302w;

    j14(z04 z04Var, int i7, Comparator comparator) {
        super(z04Var, i7);
        this.f10301v = w24.f17997y;
    }

    public final g14 j() {
        g14 g14Var = this.f10302w;
        if (g14Var != null) {
            return g14Var;
        }
        i14 i14Var = new i14(this);
        this.f10302w = i14Var;
        return i14Var;
    }
}
