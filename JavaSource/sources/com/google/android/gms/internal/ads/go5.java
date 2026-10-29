package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: MyApplication */
final class go5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9056a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9057b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9058c;

    public go5(String str, boolean z7, boolean z8) {
        this.f9056a = str;
        this.f9057b = z7;
        this.f9058c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == go5.class) {
            go5 go5Var = (go5) obj;
            if (TextUtils.equals(this.f9056a, go5Var.f9056a) && this.f9057b == go5Var.f9057b && this.f9058c == go5Var.f9058c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f9056a.hashCode() + 31) * 31) + (true != this.f9057b ? 1237 : 1231)) * 31) + (true != this.f9058c ? 1237 : 1231);
    }
}
