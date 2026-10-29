package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: MyApplication */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f1710e = new f(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1711a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1712b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1713c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1714d;

    /* compiled from: MyApplication */
    static class a {
        static Insets a(int i7, int i8, int i9, int i10) {
            return Insets.of(i7, i8, i9, i10);
        }
    }

    private f(int i7, int i8, int i9, int i10) {
        this.f1711a = i7;
        this.f1712b = i8;
        this.f1713c = i9;
        this.f1714d = i10;
    }

    public static f a(f fVar, f fVar2) {
        return b(Math.max(fVar.f1711a, fVar2.f1711a), Math.max(fVar.f1712b, fVar2.f1712b), Math.max(fVar.f1713c, fVar2.f1713c), Math.max(fVar.f1714d, fVar2.f1714d));
    }

    public static f b(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f1710e : new f(i7, i8, i9, i10);
    }

    public static f c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static f d(Insets insets) {
        int i7;
        int i8;
        int i9;
        int i10;
        i7 = insets.left;
        i8 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return b(i7, i8, i9, i10);
    }

    public Insets e() {
        return a.a(this.f1711a, this.f1712b, this.f1713c, this.f1714d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f1714d == fVar.f1714d && this.f1711a == fVar.f1711a && this.f1713c == fVar.f1713c && this.f1712b == fVar.f1712b;
    }

    public int hashCode() {
        return (((((this.f1711a * 31) + this.f1712b) * 31) + this.f1713c) * 31) + this.f1714d;
    }

    public String toString() {
        return "Insets{left=" + this.f1711a + ", top=" + this.f1712b + ", right=" + this.f1713c + ", bottom=" + this.f1714d + '}';
    }
}
