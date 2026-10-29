package t0;

import android.graphics.Rect;

/* compiled from: MyApplication */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final androidx.recyclerview.widget.b f26287a;

    /* renamed from: b, reason: collision with root package name */
    private int f26288b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f26289c;

    /* compiled from: MyApplication */
    /* renamed from: t0.a$a, reason: collision with other inner class name */
    class C0133a extends a {
        C0133a(androidx.recyclerview.widget.b bVar) {
            super(bVar, null);
        }
    }

    /* compiled from: MyApplication */
    class b extends a {
        b(androidx.recyclerview.widget.b bVar) {
            super(bVar, null);
        }
    }

    /* synthetic */ a(androidx.recyclerview.widget.b bVar, C0133a c0133a) {
        this(bVar);
    }

    public static a a(androidx.recyclerview.widget.b bVar) {
        return new C0133a(bVar);
    }

    public static a b(androidx.recyclerview.widget.b bVar, int i7) {
        if (i7 == 0) {
            return a(bVar);
        }
        if (i7 == 1) {
            return c(bVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static a c(androidx.recyclerview.widget.b bVar) {
        return new b(bVar);
    }

    private a(androidx.recyclerview.widget.b bVar) {
        this.f26288b = Integer.MIN_VALUE;
        this.f26289c = new Rect();
        this.f26287a = bVar;
    }
}
