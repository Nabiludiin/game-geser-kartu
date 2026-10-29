package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: MyApplication */
class s extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f860b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f861a;

    public s(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        a(context, attributeSet, i7, i8);
    }

    private void a(Context context, AttributeSet attributeSet, int i7, int i8) {
        r1 u7 = r1.u(context, attributeSet, f.j.Y1, i7, i8);
        int i9 = f.j.f23447a2;
        if (u7.r(i9)) {
            b(u7.a(i9, false));
        }
        setBackgroundDrawable(u7.f(f.j.Z1));
        u7.v();
    }

    private void b(boolean z7) {
        if (f860b) {
            this.f861a = z7;
        } else {
            androidx.core.widget.i.a(this, z7);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8) {
        if (f860b && this.f861a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i7, int i8, int i9, int i10) {
        if (f860b && this.f861a) {
            i8 -= view.getHeight();
        }
        super.update(view, i7, i8, i9, i10);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8, int i9) {
        if (f860b && this.f861a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8, i9);
    }
}
