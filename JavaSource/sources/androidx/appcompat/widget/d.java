package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: MyApplication */
public class d extends AutoCompleteTextView {

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f704t = {R.attr.popupBackground};

    /* renamed from: q, reason: collision with root package name */
    private final e f705q;

    /* renamed from: r, reason: collision with root package name */
    private final m0 f706r;

    /* renamed from: s, reason: collision with root package name */
    private final m f707s;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.f23320m);
    }

    void a(m mVar) {
        KeyListener keyListener = getKeyListener();
        if (mVar.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a8 = mVar.a(keyListener);
            if (a8 == keyListener) {
                return;
            }
            super.setKeyListener(a8);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f705q;
        if (eVar != null) {
            eVar.b();
        }
        m0 m0Var = this.f706r;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f705q;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f705q;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f707s.d(o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f705q;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        e eVar = this.f705q;
        if (eVar != null) {
            eVar.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.n(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(h.a.b(getContext(), i7));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f707s.e(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f707s.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f705q;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f705q;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        m0 m0Var = this.f706r;
        if (m0Var != null) {
            m0Var.q(context, i7);
        }
    }

    public d(Context context, AttributeSet attributeSet, int i7) {
        super(o1.b(context), attributeSet, i7);
        n1.a(this, getContext());
        r1 u7 = r1.u(getContext(), attributeSet, f704t, i7, 0);
        if (u7.r(0)) {
            setDropDownBackgroundDrawable(u7.f(0));
        }
        u7.v();
        e eVar = new e(this);
        this.f705q = eVar;
        eVar.e(attributeSet, i7);
        m0 m0Var = new m0(this);
        this.f706r = m0Var;
        m0Var.m(attributeSet, i7);
        m0Var.b();
        m mVar = new m(this);
        this.f707s = mVar;
        mVar.c(attributeSet, i7);
        a(mVar);
    }
}
