package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b0.l;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: MyApplication */
public class n0 extends TextView implements androidx.core.widget.l, androidx.core.widget.b {

    /* renamed from: q, reason: collision with root package name */
    private final e f803q;

    /* renamed from: r, reason: collision with root package name */
    private final m0 f804r;

    /* renamed from: s, reason: collision with root package name */
    private final e0 f805s;

    /* renamed from: t, reason: collision with root package name */
    private n f806t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f807u;

    /* renamed from: v, reason: collision with root package name */
    private Future f808v;

    public n0(Context context) {
        this(context, null);
    }

    private void e() {
        Future future = this.f808v;
        if (future != null) {
            try {
                this.f808v = null;
                android.support.v4.media.session.b.a(future.get());
                androidx.core.widget.j.k(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private n getEmojiTextViewHelper() {
        if (this.f806t == null) {
            this.f806t = new n(this);
        }
        return this.f806t;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f803q;
        if (eVar != null) {
            eVar.b();
        }
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f1986a) {
            return super.getAutoSizeMaxTextSize();
        }
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            return m0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f1986a) {
            return super.getAutoSizeMinTextSize();
        }
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            return m0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f1986a) {
            return super.getAutoSizeStepGranularity();
        }
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            return m0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f1986a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        m0 m0Var = this.f804r;
        return m0Var != null ? m0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f1986a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            return m0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.m(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.j.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.j.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f803q;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f803q;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f804r.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f804r.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        e0 e0Var;
        return (Build.VERSION.SDK_INT >= 28 || (e0Var = this.f805s) == null) ? super.getTextClassifier() : e0Var.a();
    }

    public l.a getTextMetricsParamsCompat() {
        return androidx.core.widget.j.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f804r.r(this, onCreateInputConnection, editorInfo);
        return o.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.o(z7, i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i7, int i8) {
        e();
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        m0 m0Var = this.f804r;
        if (m0Var == null || androidx.core.widget.b.f1986a || !m0Var.l()) {
            return;
        }
        this.f804r.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().c(z7);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (androidx.core.widget.b.f1986a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.t(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (androidx.core.widget.b.f1986a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.u(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (androidx.core.widget.b.f1986a) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.v(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f803q;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        e eVar = this.f803q;
        if (eVar != null) {
            eVar.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i7);
        } else {
            androidx.core.widget.j.h(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i7);
        } else {
            androidx.core.widget.j.i(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        androidx.core.widget.j.j(this, i7);
    }

    public void setPrecomputedText(b0.l lVar) {
        androidx.core.widget.j.k(this, lVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f803q;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f803q;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f804r.w(colorStateList);
        this.f804r.b();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f804r.x(mode);
        this.f804r.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.q(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        e0 e0Var;
        if (Build.VERSION.SDK_INT >= 28 || (e0Var = this.f805s) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            e0Var.b(textClassifier);
        }
    }

    public void setTextFuture(Future<b0.l> future) {
        this.f808v = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(l.a aVar) {
        androidx.core.widget.j.l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f8) {
        if (androidx.core.widget.b.f1986a) {
            super.setTextSize(i7, f8);
            return;
        }
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.A(i7, f8);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i7) {
        if (this.f807u) {
            return;
        }
        Typeface a8 = (typeface == null || i7 <= 0) ? null : androidx.core.graphics.i.a(getContext(), typeface, i7);
        this.f807u = true;
        if (a8 != null) {
            typeface = a8;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f807u = false;
        }
    }

    public n0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public n0(Context context, AttributeSet attributeSet, int i7) {
        super(o1.b(context), attributeSet, i7);
        this.f807u = false;
        n1.a(this, getContext());
        e eVar = new e(this);
        this.f803q = eVar;
        eVar.e(attributeSet, i7);
        m0 m0Var = new m0(this);
        this.f804r = m0Var;
        m0Var.m(attributeSet, i7);
        m0Var.b();
        this.f805s = new e0(this);
        getEmojiTextViewHelper().b(attributeSet, i7);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? h.a.b(context, i7) : null, i8 != 0 ? h.a.b(context, i8) : null, i9 != 0 ? h.a.b(context, i9) : null, i10 != 0 ? h.a.b(context, i10) : null);
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? h.a.b(context, i7) : null, i8 != 0 ? h.a.b(context, i8) : null, i9 != 0 ? h.a.b(context, i9) : null, i10 != 0 ? h.a.b(context, i10) : null);
        m0 m0Var = this.f804r;
        if (m0Var != null) {
            m0Var.p();
        }
    }
}
