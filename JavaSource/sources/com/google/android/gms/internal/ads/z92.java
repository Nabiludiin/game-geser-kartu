package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class z92 {

    /* renamed from: c, reason: collision with root package name */
    public static final z92 f20075c = new z92(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    private final int f20076a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20077b;

    static {
        new z92(0, 0);
    }

    public z92(int i7, int i8) {
        boolean z7 = false;
        if ((i7 == -1 || i7 >= 0) && (i8 == -1 || i8 >= 0)) {
            z7 = true;
        }
        rx3.a(z7);
        this.f20076a = i7;
        this.f20077b = i8;
    }

    public final int a() {
        return this.f20076a;
    }

    public final int b() {
        return this.f20077b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof z92) {
            z92 z92Var = (z92) obj;
            if (this.f20076a == z92Var.f20076a && this.f20077b == z92Var.f20077b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f20076a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f20077b;
    }

    public final String toString() {
        int i7 = this.f20076a;
        int length = String.valueOf(i7).length();
        int i8 = this.f20077b;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i8).length());
        sb.append(i7);
        sb.append("x");
        sb.append(i8);
        return sb.toString();
    }
}
