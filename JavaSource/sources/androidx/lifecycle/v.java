package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.g;

/* compiled from: MyApplication */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final l f2541a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f2542b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    private a f2543c;

    /* compiled from: MyApplication */
    static class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private final l f2544q;

        /* renamed from: r, reason: collision with root package name */
        final g.b f2545r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f2546s = false;

        a(l lVar, g.b bVar) {
            this.f2544q = lVar;
            this.f2545r = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2546s) {
                return;
            }
            this.f2544q.h(this.f2545r);
            this.f2546s = true;
        }
    }

    public v(k kVar) {
        this.f2541a = new l(kVar);
    }

    private void f(g.b bVar) {
        a aVar = this.f2543c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f2541a, bVar);
        this.f2543c = aVar2;
        this.f2542b.postAtFrontOfQueue(aVar2);
    }

    public g a() {
        return this.f2541a;
    }

    public void b() {
        f(g.b.ON_START);
    }

    public void c() {
        f(g.b.ON_CREATE);
    }

    public void d() {
        f(g.b.ON_STOP);
        f(g.b.ON_DESTROY);
    }

    public void e() {
        f(g.b.ON_START);
    }
}
