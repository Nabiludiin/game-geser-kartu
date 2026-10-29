package androidx.activity;

import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: MyApplication */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f129a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque f130b = new ArrayDeque();

    /* compiled from: MyApplication */
    private class LifecycleOnBackPressedCancellable implements i, androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final g f131a;

        /* renamed from: b, reason: collision with root package name */
        private final b f132b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.a f133c;

        LifecycleOnBackPressedCancellable(g gVar, b bVar) {
            this.f131a = gVar;
            this.f132b = bVar;
            gVar.a(this);
        }

        @Override // androidx.lifecycle.i
        public void c(k kVar, g.b bVar) {
            if (bVar == g.b.ON_START) {
                this.f133c = OnBackPressedDispatcher.this.b(this.f132b);
                return;
            }
            if (bVar != g.b.ON_STOP) {
                if (bVar == g.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f133c;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f131a.c(this);
            this.f132b.e(this);
            androidx.activity.a aVar = this.f133c;
            if (aVar != null) {
                aVar.cancel();
                this.f133c = null;
            }
        }
    }

    /* compiled from: MyApplication */
    private class a implements androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f135a;

        a(b bVar) {
            this.f135a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f130b.remove(this.f135a);
            this.f135a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f129a = runnable;
    }

    public void a(k kVar, b bVar) {
        g t7 = kVar.t();
        if (t7.b() == g.c.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(t7, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f130b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator descendingIterator = this.f130b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b bVar = (b) descendingIterator.next();
            if (bVar.c()) {
                bVar.b();
                return;
            }
        }
        Runnable runnable = this.f129a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
