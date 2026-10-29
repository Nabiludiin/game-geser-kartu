package k;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.k0;
import androidx.core.view.l0;
import androidx.core.view.m0;
import java.util.ArrayList;

/* compiled from: MyApplication */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f24320c;

    /* renamed from: d, reason: collision with root package name */
    l0 f24321d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24322e;

    /* renamed from: b, reason: collision with root package name */
    private long f24319b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final m0 f24323f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f24318a = new ArrayList();

    /* compiled from: MyApplication */
    class a extends m0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f24324a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f24325b = 0;

        a() {
        }

        @Override // androidx.core.view.l0
        public void b(View view) {
            int i7 = this.f24325b + 1;
            this.f24325b = i7;
            if (i7 == h.this.f24318a.size()) {
                l0 l0Var = h.this.f24321d;
                if (l0Var != null) {
                    l0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.m0, androidx.core.view.l0
        public void c(View view) {
            if (this.f24324a) {
                return;
            }
            this.f24324a = true;
            l0 l0Var = h.this.f24321d;
            if (l0Var != null) {
                l0Var.c(null);
            }
        }

        void d() {
            this.f24325b = 0;
            this.f24324a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f24322e) {
            ArrayList arrayList = this.f24318a;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((k0) obj).c();
            }
            this.f24322e = false;
        }
    }

    void b() {
        this.f24322e = false;
    }

    public h c(k0 k0Var) {
        if (!this.f24322e) {
            this.f24318a.add(k0Var);
        }
        return this;
    }

    public h d(k0 k0Var, k0 k0Var2) {
        this.f24318a.add(k0Var);
        k0Var2.i(k0Var.d());
        this.f24318a.add(k0Var2);
        return this;
    }

    public h e(long j7) {
        if (!this.f24322e) {
            this.f24319b = j7;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f24322e) {
            this.f24320c = interpolator;
        }
        return this;
    }

    public h g(l0 l0Var) {
        if (!this.f24322e) {
            this.f24321d = l0Var;
        }
        return this;
    }

    public void h() {
        if (this.f24322e) {
            return;
        }
        ArrayList arrayList = this.f24318a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            k0 k0Var = (k0) obj;
            long j7 = this.f24319b;
            if (j7 >= 0) {
                k0Var.e(j7);
            }
            Interpolator interpolator = this.f24320c;
            if (interpolator != null) {
                k0Var.f(interpolator);
            }
            if (this.f24321d != null) {
                k0Var.g(this.f24323f);
            }
            k0Var.k();
        }
        this.f24322e = true;
    }
}
