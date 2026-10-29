package k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.b;

/* compiled from: MyApplication */
public class e extends b implements e.a {

    /* renamed from: s, reason: collision with root package name */
    private Context f24270s;

    /* renamed from: t, reason: collision with root package name */
    private ActionBarContextView f24271t;

    /* renamed from: u, reason: collision with root package name */
    private b.a f24272u;

    /* renamed from: v, reason: collision with root package name */
    private WeakReference f24273v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f24274w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f24275x;

    /* renamed from: y, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f24276y;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z7) {
        this.f24270s = context;
        this.f24271t = actionBarContextView;
        this.f24272u = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f24276y = S;
        S.R(this);
        this.f24275x = z7;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f24272u.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f24271t.l();
    }

    @Override // k.b
    public void c() {
        if (this.f24274w) {
            return;
        }
        this.f24274w = true;
        this.f24272u.d(this);
    }

    @Override // k.b
    public View d() {
        WeakReference weakReference = this.f24273v;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.b
    public Menu e() {
        return this.f24276y;
    }

    @Override // k.b
    public MenuInflater f() {
        return new g(this.f24271t.getContext());
    }

    @Override // k.b
    public CharSequence g() {
        return this.f24271t.getSubtitle();
    }

    @Override // k.b
    public CharSequence i() {
        return this.f24271t.getTitle();
    }

    @Override // k.b
    public void k() {
        this.f24272u.c(this, this.f24276y);
    }

    @Override // k.b
    public boolean l() {
        return this.f24271t.j();
    }

    @Override // k.b
    public void m(View view) {
        this.f24271t.setCustomView(view);
        this.f24273v = view != null ? new WeakReference(view) : null;
    }

    @Override // k.b
    public void n(int i7) {
        o(this.f24270s.getString(i7));
    }

    @Override // k.b
    public void o(CharSequence charSequence) {
        this.f24271t.setSubtitle(charSequence);
    }

    @Override // k.b
    public void q(int i7) {
        r(this.f24270s.getString(i7));
    }

    @Override // k.b
    public void r(CharSequence charSequence) {
        this.f24271t.setTitle(charSequence);
    }

    @Override // k.b
    public void s(boolean z7) {
        super.s(z7);
        this.f24271t.setTitleOptional(z7);
    }
}
