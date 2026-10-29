package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: MyApplication */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1855a;

    /* renamed from: b, reason: collision with root package name */
    private a f1856b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0031b f1857c;

    /* compiled from: MyApplication */
    public interface a {
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0031b {
        void onActionProviderVisibilityChanged(boolean z7);
    }

    public b(Context context) {
        this.f1855a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f1857c = null;
        this.f1856b = null;
    }

    public void h(a aVar) {
        this.f1856b = aVar;
    }

    public abstract void i(InterfaceC0031b interfaceC0031b);
}
