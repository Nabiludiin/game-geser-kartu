package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* compiled from: MyApplication */
public class l extends EditText implements androidx.core.view.b0 {

    /* renamed from: q, reason: collision with root package name */
    private final e f768q;

    /* renamed from: r, reason: collision with root package name */
    private final m0 f769r;

    /* renamed from: s, reason: collision with root package name */
    private final e0 f770s;

    /* renamed from: t, reason: collision with root package name */
    private final androidx.core.widget.k f771t;

    /* renamed from: u, reason: collision with root package name */
    private final m f772u;

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.f23332y);
    }

    @Override // androidx.core.view.b0
    public androidx.core.view.d a(androidx.core.view.d dVar) {
        return this.f771t.a(this, dVar);
    }

    void b(m mVar) {
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
        e eVar = this.f768q;
        if (eVar != null) {
            eVar.b();
        }
        m0 m0Var = this.f769r;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f768q;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f768q;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        e0 e0Var;
        return (Build.VERSION.SDK_INT >= 28 || (e0Var = this.f770s) == null) ? super.getTextClassifier() : e0Var.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] t7;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f769r.r(this, onCreateInputConnection, editorInfo);
        InputConnection a8 = o.a(onCreateInputConnection, editorInfo, this);
        if (a8 != null && Build.VERSION.SDK_INT <= 30 && (t7 = androidx.core.view.e0.t(this)) != null) {
            c0.c.d(editorInfo, t7);
            a8 = c0.f.c(this, a8, editorInfo);
        }
        return this.f772u.d(a8, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (w.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        if (w.b(this, i7)) {
            return true;
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f768q;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        e eVar = this.f768q;
        if (eVar != null) {
            eVar.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f772u.e(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f772u.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f768q;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f768q;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        m0 m0Var = this.f769r;
        if (m0Var != null) {
            m0Var.q(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        e0 e0Var;
        if (Build.VERSION.SDK_INT >= 28 || (e0Var = this.f770s) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            e0Var.b(textClassifier);
        }
    }

    public l(Context context, AttributeSet attributeSet, int i7) {
        super(o1.b(context), attributeSet, i7);
        n1.a(this, getContext());
        e eVar = new e(this);
        this.f768q = eVar;
        eVar.e(attributeSet, i7);
        m0 m0Var = new m0(this);
        this.f769r = m0Var;
        m0Var.m(attributeSet, i7);
        m0Var.b();
        this.f770s = new e0(this);
        this.f771t = new androidx.core.widget.k();
        m mVar = new m(this);
        this.f772u = mVar;
        mVar.c(attributeSet, i7);
        b(mVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
