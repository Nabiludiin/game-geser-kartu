package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.y1;
import androidx.core.app.p;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.savedstate.SavedStateRegistry;
import k.b;

/* compiled from: MyApplication */
public abstract class c extends androidx.fragment.app.e implements g.a, p.a {
    private d F;
    private Resources G;

    /* compiled from: MyApplication */
    class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.L().u(bundle);
            return bundle;
        }
    }

    /* compiled from: MyApplication */
    class b implements d.b {
        b() {
        }

        @Override // d.b
        public void a(Context context) {
            d L = c.this.L();
            L.n();
            L.q(c.this.j().a("androidx:appcompat"));
        }
    }

    public c() {
        N();
    }

    private void N() {
        j().d("androidx:appcompat", new a());
        w(new b());
    }

    private boolean U(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    private void y() {
        a0.a(getWindow().getDecorView(), this);
        b0.a(getWindow().getDecorView(), this);
        androidx.savedstate.d.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.fragment.app.e
    public void K() {
        L().o();
    }

    public d L() {
        if (this.F == null) {
            this.F = d.g(this, this);
        }
        return this.F;
    }

    public androidx.appcompat.app.a M() {
        return L().m();
    }

    public void P(p pVar) {
        pVar.e(this);
    }

    public boolean T() {
        Intent f8 = f();
        if (f8 == null) {
            return false;
        }
        if (!W(f8)) {
            V(f8);
            return true;
        }
        p h8 = p.h(this);
        P(h8);
        R(h8);
        h8.i();
        try {
            androidx.core.app.b.m(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void V(Intent intent) {
        androidx.core.app.g.e(this, intent);
    }

    public boolean W(Intent intent) {
        return androidx.core.app.g.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        L().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(L().f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a M = M();
        if (getWindow().hasFeature(0)) {
            if (M == null || !M.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a M = M();
        if (keyCode == 82 && M != null && M.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.core.app.p.a
    public Intent f() {
        return androidx.core.app.g.a(this);
    }

    @Override // android.app.Activity
    public View findViewById(int i7) {
        return L().i(i7);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return L().l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.G == null && y1.c()) {
            this.G = new y1(this, super.getResources());
        }
        Resources resources = this.G;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        L().o();
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.G != null) {
            this.G.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        L().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        S();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        L().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (U(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a M = M();
        if (menuItem.getItemId() != 16908332 || M == null || (M.i() & 4) == 0) {
            return false;
        }
        return T();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i7, Menu menu) {
        return super.onMenuOpened(i7, menu);
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        L().s(bundle);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        L().t();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStart() {
        super.onStart();
        L().v();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStop() {
        super.onStop();
        L().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        L().E(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a M = M();
        if (getWindow().hasFeature(0)) {
            if (M == null || !M.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // g.a
    public k.b p(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i7) {
        y();
        L().A(i7);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        super.setTheme(i7);
        L().D(i7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        y();
        L().B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        L().C(view, layoutParams);
    }

    public void S() {
    }

    protected void Q(int i7) {
    }

    public void R(p pVar) {
    }

    @Override // g.a
    public void d(k.b bVar) {
    }

    @Override // g.a
    public void r(k.b bVar) {
    }
}
