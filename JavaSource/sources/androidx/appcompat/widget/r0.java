package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: MyApplication */
public class r0 extends ToggleButton {

    /* renamed from: q, reason: collision with root package name */
    private final e f854q;

    /* renamed from: r, reason: collision with root package name */
    private final m0 f855r;

    /* renamed from: s, reason: collision with root package name */
    private n f856s;

    public r0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private n getEmojiTextViewHelper() {
        if (this.f856s == null) {
            this.f856s = new n(this);
        }
        return this.f856s;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f854q;
        if (eVar != null) {
            eVar.b();
        }
        m0 m0Var = this.f855r;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f854q;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f854q;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().c(z7);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f854q;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        e eVar = this.f854q;
        if (eVar != null) {
            eVar.g(i7);
        }
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().d(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f854q;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f854q;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public r0(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        n1.a(this, getContext());
        e eVar = new e(this);
        this.f854q = eVar;
        eVar.e(attributeSet, i7);
        m0 m0Var = new m0(this);
        this.f855r = m0Var;
        m0Var.m(attributeSet, i7);
        getEmojiTextViewHelper().b(attributeSet, i7);
    }
}
