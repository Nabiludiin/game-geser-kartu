package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* compiled from: MyApplication */
public class u extends RadioButton {

    /* renamed from: q, reason: collision with root package name */
    private final j f888q;

    /* renamed from: r, reason: collision with root package name */
    private final e f889r;

    /* renamed from: s, reason: collision with root package name */
    private final m0 f890s;

    /* renamed from: t, reason: collision with root package name */
    private n f891t;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.C);
    }

    private n getEmojiTextViewHelper() {
        if (this.f891t == null) {
            this.f891t = new n(this);
        }
        return this.f891t;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f889r;
        if (eVar != null) {
            eVar.b();
        }
        m0 m0Var = this.f890s;
        if (m0Var != null) {
            m0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        j jVar = this.f888q;
        return jVar != null ? jVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f889r;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f889r;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f888q;
        if (jVar != null) {
            return jVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f888q;
        if (jVar != null) {
            return jVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().c(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f889r;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        e eVar = this.f889r;
        if (eVar != null) {
            eVar.g(i7);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f888q;
        if (jVar != null) {
            jVar.f();
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
        e eVar = this.f889r;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f889r;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f888q;
        if (jVar != null) {
            jVar.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f888q;
        if (jVar != null) {
            jVar.h(mode);
        }
    }

    public u(Context context, AttributeSet attributeSet, int i7) {
        super(o1.b(context), attributeSet, i7);
        n1.a(this, getContext());
        j jVar = new j(this);
        this.f888q = jVar;
        jVar.e(attributeSet, i7);
        e eVar = new e(this);
        this.f889r = eVar;
        eVar.e(attributeSet, i7);
        m0 m0Var = new m0(this);
        this.f890s = m0Var;
        m0Var.m(attributeSet, i7);
        getEmojiTextViewHelper().b(attributeSet, i7);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(h.a.b(getContext(), i7));
    }
}
