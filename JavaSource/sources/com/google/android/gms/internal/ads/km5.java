package com.google.android.gms.internal.ads;

import android.os.Build;
import android.util.SparseBooleanArray;

/* compiled from: MyApplication */
public final class km5 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f11126a;

    public final boolean a(int i7) {
        return this.f11126a.get(i7);
    }

    public final int b() {
        return this.f11126a.size();
    }

    public final int c(int i7) {
        SparseBooleanArray sparseBooleanArray = this.f11126a;
        rx3.m(i7, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km5)) {
            return false;
        }
        km5 km5Var = (km5) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f11126a.equals(km5Var.f11126a);
        }
        SparseBooleanArray sparseBooleanArray = this.f11126a;
        if (sparseBooleanArray.size() != km5Var.f11126a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            if (c(i7) != km5Var.c(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f11126a.hashCode();
        }
        SparseBooleanArray sparseBooleanArray = this.f11126a;
        int size = sparseBooleanArray.size();
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            size = (size * 31) + c(i7);
        }
        return size;
    }
}
