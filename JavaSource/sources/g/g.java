package g;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.p;
import k.b;

/* compiled from: MyApplication */
public abstract class g extends Dialog implements g.a {

    /* renamed from: q, reason: collision with root package name */
    private androidx.appcompat.app.d f23808q;

    /* renamed from: r, reason: collision with root package name */
    private final p.a f23809r;

    /* compiled from: MyApplication */
    class a implements p.a {
        a() {
        }

        @Override // androidx.core.view.p.a
        public boolean n(KeyEvent keyEvent) {
            return g.this.c(keyEvent);
        }
    }

    public g(Context context, int i7) {
        super(context, b(context, i7));
        this.f23809r = new a();
        androidx.appcompat.app.d a8 = a();
        a8.D(b(context, i7));
        a8.q(null);
    }

    private static int b(Context context, int i7) {
        if (i7 != 0) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f23330w, typedValue, true);
        return typedValue.resourceId;
    }

    public androidx.appcompat.app.d a() {
        if (this.f23808q == null) {
            this.f23808q = androidx.appcompat.app.d.h(this, this);
        }
        return this.f23808q;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return p.e(this.f23809r, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean e(int i7) {
        return a().z(i7);
    }

    @Override // android.app.Dialog
    public View findViewById(int i7) {
        return a().i(i7);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().o();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().n();
        super.onCreate(bundle);
        a().q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().w();
    }

    @Override // g.a
    public k.b p(b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        a().A(i7);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().E(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i7) {
        super.setTitle(i7);
        a().E(getContext().getString(i7));
    }

    @Override // g.a
    public void d(k.b bVar) {
    }

    @Override // g.a
    public void r(k.b bVar) {
    }
}
