package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* compiled from: MyApplication */
public class f extends Button implements androidx.core.widget.b, androidx.core.widget.l {

    /* renamed from: q, reason: collision with root package name */
    private final e f716q;

    /* renamed from: r, reason: collision with root package name */
    private final m0 f717r;

    /* renamed from: s, reason: collision with root package name */
    private n f718s;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.f23321n);
    }

    private n getEmojiTextViewHelper() {
        if (this.f718s == null) {
            this.f718s = new n(this);
        }
        return this.f718s;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f716q;
        if (eVar != null) {
            eVar.b();
        }
        m0 m0Var = this.f717r;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f1986a) {
            return super.getAutoSizeMaxTextSize();
        }
        m0 m0Var = this.f717r;
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
        m0 m0Var = this.f717r;
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
        m0 m0Var = this.f717r;
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
        m0 m0Var = this.f717r;
        return m0Var != null ? m0Var.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f1986a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        m0 m0Var = this.f717r;
        if (m0Var != null) {
            return m0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f716q;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f716q;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f717r.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f717r.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        m0 m0Var = this.f717r;
        if (m0Var != null) {
            m0Var.o(z7, i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        m0 m0Var = this.f717r;
        if (m0Var == null || androidx.core.widget.b.f1986a || !m0Var.l()) {
            return;
        }
        this.f717r.c();
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
        m0 m0Var = this.f717r;
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
        m0 m0Var = this.f717r;
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
        m0 m0Var = this.f717r;
        if (m0Var != null) {
            m0Var.v(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f716q;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        e eVar = this.f716q;
        if (eVar != null) {
            eVar.g(i7);
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

    public void setSupportAllCaps(boolean z7) {
        m0 m0Var = this.f717r;
        if (m0Var != null) {
            m0Var.s(z7);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f716q;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f716q;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f717r.w(colorStateList);
        this.f717r.b();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f717r.x(mode);
        this.f717r.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        m0 m0Var = this.f717r;
        if (m0Var != null) {
            m0Var.q(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f8) {
        if (androidx.core.widget.b.f1986a) {
            super.setTextSize(i7, f8);
            return;
        }
        m0 m0Var = this.f717r;
        if (m0Var != null) {
            m0Var.A(i7, f8);
        }
    }

    public f(Context context, AttributeSet attributeSet, int i7) {
        super(o1.b(context), attributeSet, i7);
        n1.a(this, getContext());
        e eVar = new e(this);
        this.f716q = eVar;
        eVar.e(attributeSet, i7);
        m0 m0Var = new m0(this);
        this.f717r = m0Var;
        m0Var.m(attributeSet, i7);
        m0Var.b();
        getEmojiTextViewHelper().b(attributeSet, i7);
    }
}
