package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: MyApplication */
public final class w5 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f18032b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18033c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18034d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f18035e;

    /* renamed from: f, reason: collision with root package name */
    private final d6[] f18036f;

    public w5(String str, boolean z7, boolean z8, String[] strArr, d6[] d6VarArr) {
        super("CTOC");
        this.f18032b = str;
        this.f18033c = z7;
        this.f18034d = z8;
        this.f18035e = strArr;
        this.f18036f = d6VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w5.class == obj.getClass()) {
            w5 w5Var = (w5) obj;
            if (this.f18033c == w5Var.f18033c && this.f18034d == w5Var.f18034d && Objects.equals(this.f18032b, w5Var.f18032b) && Arrays.equals(this.f18035e, w5Var.f18035e) && Arrays.equals(this.f18036f, w5Var.f18036f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f18033c ? 1 : 0) + 527) * 31) + (this.f18034d ? 1 : 0)) * 31) + this.f18032b.hashCode();
    }
}
