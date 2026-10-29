package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* compiled from: MyApplication */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final g.c f1768a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f1769b;

    /* compiled from: MyApplication */
    /* renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    class RunnableC0028a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ g.c f1770q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Typeface f1771r;

        RunnableC0028a(g.c cVar, Typeface typeface) {
            this.f1770q = cVar;
            this.f1771r = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1770q.b(this.f1771r);
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ g.c f1773q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f1774r;

        b(g.c cVar, int i7) {
            this.f1773q = cVar;
            this.f1774r = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1773q.a(this.f1774r);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f1768a = cVar;
        this.f1769b = handler;
    }

    private void a(int i7) {
        this.f1769b.post(new b(this.f1768a, i7));
    }

    private void c(Typeface typeface) {
        this.f1769b.post(new RunnableC0028a(this.f1768a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f1797a);
        } else {
            a(eVar.f1798b);
        }
    }
}
