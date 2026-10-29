package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import k.b;

/* compiled from: MyApplication */
public abstract class a {
    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z7);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public abstract void l(Configuration configuration);

    public abstract boolean n(int i7, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z7);

    public abstract void r(boolean z7);

    public abstract void s(CharSequence charSequence);

    public abstract k.b t(b.a aVar);

    /* compiled from: MyApplication */
    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0005a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f241a;

        public C0005a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f241a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f23539t);
            this.f241a = obtainStyledAttributes.getInt(f.j.f23544u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0005a(int i7, int i8) {
            super(i7, i8);
            this.f241a = 8388627;
        }

        public C0005a(C0005a c0005a) {
            super((ViewGroup.MarginLayoutParams) c0005a);
            this.f241a = 0;
            this.f241a = c0005a.f241a;
        }

        public C0005a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f241a = 0;
        }
    }

    void m() {
    }
}
