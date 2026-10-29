package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.p;
import androidx.lifecycle.g;
import androidx.lifecycle.u;

/* compiled from: MyApplication */
public abstract class f extends Activity implements androidx.lifecycle.k, p.a {

    /* renamed from: q, reason: collision with root package name */
    private r.h f1572q = new r.h();

    /* renamed from: r, reason: collision with root package name */
    private androidx.lifecycle.l f1573r = new androidx.lifecycle.l(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.p.d(decorView, keyEvent)) {
            return androidx.core.view.p.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.p.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.core.view.p.a
    public boolean n(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u.g(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f1573r.j(g.c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
