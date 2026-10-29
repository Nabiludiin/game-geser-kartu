package k;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* compiled from: MyApplication */
public abstract class b {

    /* renamed from: q, reason: collision with root package name */
    private Object f24263q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f24264r;

    /* compiled from: MyApplication */
    public interface a {
        boolean a(b bVar, MenuItem menuItem);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, Menu menu);

        void d(b bVar);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f24263q;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f24264r;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i7);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f24263q = obj;
    }

    public abstract void q(int i7);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z7) {
        this.f24264r = z7;
    }
}
