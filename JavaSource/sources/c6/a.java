package c6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import c6.t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    final t f3542a;

    /* renamed from: b, reason: collision with root package name */
    final w f3543b;

    /* renamed from: c, reason: collision with root package name */
    final WeakReference f3544c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f3545d;

    /* renamed from: e, reason: collision with root package name */
    final int f3546e;

    /* renamed from: f, reason: collision with root package name */
    final int f3547f;

    /* renamed from: g, reason: collision with root package name */
    final int f3548g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable f3549h;

    /* renamed from: i, reason: collision with root package name */
    final String f3550i;

    /* renamed from: j, reason: collision with root package name */
    final Object f3551j;

    /* renamed from: k, reason: collision with root package name */
    boolean f3552k;

    /* renamed from: l, reason: collision with root package name */
    boolean f3553l;

    /* compiled from: MyApplication */
    /* renamed from: c6.a$a, reason: collision with other inner class name */
    static class C0067a extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        final a f3554a;

        public C0067a(a aVar, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f3554a = aVar;
        }
    }

    a(t tVar, Object obj, w wVar, int i7, int i8, int i9, Drawable drawable, String str, Object obj2, boolean z7) {
        this.f3542a = tVar;
        this.f3543b = wVar;
        this.f3544c = obj == null ? null : new C0067a(this, obj, tVar.f3678j);
        this.f3546e = i7;
        this.f3547f = i8;
        this.f3545d = z7;
        this.f3548g = i9;
        this.f3549h = drawable;
        this.f3550i = str;
        this.f3551j = obj2 == null ? this : obj2;
    }

    void a() {
        this.f3553l = true;
    }

    abstract void b(Bitmap bitmap, t.e eVar);

    abstract void c();

    String d() {
        return this.f3550i;
    }

    int e() {
        return this.f3546e;
    }

    int f() {
        return this.f3547f;
    }

    t g() {
        return this.f3542a;
    }

    t.f h() {
        return this.f3543b.f3733r;
    }

    w i() {
        return this.f3543b;
    }

    Object j() {
        return this.f3551j;
    }

    Object k() {
        WeakReference weakReference = this.f3544c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    boolean l() {
        return this.f3553l;
    }

    boolean m() {
        return this.f3552k;
    }
}
