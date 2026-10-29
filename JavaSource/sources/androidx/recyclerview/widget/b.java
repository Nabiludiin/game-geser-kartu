package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.e0;
import androidx.recyclerview.widget.c;

/* compiled from: MyApplication */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final c.b f2677a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b f2678b;

    /* renamed from: c, reason: collision with root package name */
    androidx.recyclerview.widget.c f2679c;

    /* renamed from: d, reason: collision with root package name */
    androidx.recyclerview.widget.c f2680d;

    /* renamed from: e, reason: collision with root package name */
    boolean f2681e;

    /* renamed from: f, reason: collision with root package name */
    boolean f2682f;

    /* renamed from: g, reason: collision with root package name */
    boolean f2683g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f2684h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2685i;

    /* compiled from: MyApplication */
    class a implements c.b {
        a() {
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    class C0045b implements c.b {
        C0045b() {
        }
    }

    /* compiled from: MyApplication */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f2688a;

        /* renamed from: b, reason: collision with root package name */
        public int f2689b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2690c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2691d;
    }

    public b() {
        a aVar = new a();
        this.f2677a = aVar;
        C0045b c0045b = new C0045b();
        this.f2678b = c0045b;
        this.f2679c = new androidx.recyclerview.widget.c(aVar);
        this.f2680d = new androidx.recyclerview.widget.c(c0045b);
        this.f2681e = false;
        this.f2682f = false;
        this.f2683g = false;
        this.f2684h = true;
        this.f2685i = true;
    }

    public static c f(Context context, AttributeSet attributeSet, int i7, int i8) {
        c cVar = new c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0.a.f25998f, i7, i8);
        cVar.f2688a = obtainStyledAttributes.getInt(s0.a.f25999g, 1);
        cVar.f2689b = obtainStyledAttributes.getInt(s0.a.f26001i, 1);
        cVar.f2690c = obtainStyledAttributes.getBoolean(s0.a.f26000h, false);
        cVar.f2691d = obtainStyledAttributes.getBoolean(s0.a.f26002j, false);
        obtainStyledAttributes.recycle();
        return cVar;
    }

    public View b(int i7) {
        return null;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return e0.r(null);
    }

    public int e(View view) {
        android.support.v4.media.session.b.a(view.getLayoutParams());
        throw null;
    }

    public boolean g() {
        return this.f2682f;
    }

    public void i() {
        this.f2681e = true;
    }

    public void h() {
    }

    public void a(String str) {
    }
}
