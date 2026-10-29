package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class mx3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f12477a;

    /* renamed from: b, reason: collision with root package name */
    private final lx3 f12478b;

    /* renamed from: c, reason: collision with root package name */
    private lx3 f12479c;

    /* synthetic */ mx3(String str, byte[] bArr) {
        lx3 lx3Var = new lx3();
        this.f12478b = lx3Var;
        this.f12479c = lx3Var;
        str.getClass();
        this.f12477a = str;
    }

    public final mx3 a(Object obj) {
        lx3 lx3Var = new lx3();
        this.f12479c.f11934b = lx3Var;
        this.f12479c = lx3Var;
        lx3Var.f11933a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f12477a);
        sb.append('{');
        lx3 lx3Var = this.f12478b.f11934b;
        String str = "";
        while (lx3Var != null) {
            Object obj = lx3Var.f11933a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            lx3Var = lx3Var.f11934b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
