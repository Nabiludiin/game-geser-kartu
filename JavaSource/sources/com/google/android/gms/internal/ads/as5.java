package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class as5 {

    /* renamed from: d, reason: collision with root package name */
    public static final as5 f5277d = new as5(new b00[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f5278a;

    /* renamed from: b, reason: collision with root package name */
    private final w04 f5279b;

    /* renamed from: c, reason: collision with root package name */
    private int f5280c;

    static {
        String str = hi2.f9535a;
        Integer.toString(0, 36);
    }

    public as5(b00... b00VarArr) {
        this.f5279b = w04.v(b00VarArr);
        this.f5278a = b00VarArr.length;
        int i7 = 0;
        while (i7 < this.f5279b.size()) {
            int i8 = i7 + 1;
            for (int i9 = i8; i9 < this.f5279b.size(); i9++) {
                if (((b00) this.f5279b.get(i7)).equals(this.f5279b.get(i9))) {
                    gv1.f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i8;
        }
    }

    public final b00 a(int i7) {
        return (b00) this.f5279b.get(i7);
    }

    public final int b(b00 b00Var) {
        int indexOf = this.f5279b.indexOf(b00Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final w04 c() {
        return w04.u(x14.c(this.f5279b, zr5.f20312a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && as5.class == obj.getClass()) {
            as5 as5Var = (as5) obj;
            if (this.f5278a == as5Var.f5278a && this.f5279b.equals(as5Var.f5279b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f5280c;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = this.f5279b.hashCode();
        this.f5280c = hashCode;
        return hashCode;
    }

    public final String toString() {
        return this.f5279b.toString();
    }
}
