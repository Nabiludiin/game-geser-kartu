package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.v1;
import androidx.appcompat.widget.x0;

/* compiled from: MyApplication */
public class ActionMenuItemView extends n0 implements k.a, View.OnClickListener, ActionMenuView.a {
    private x0 A;
    b B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private int G;

    /* renamed from: w, reason: collision with root package name */
    g f387w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f388x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f389y;

    /* renamed from: z, reason: collision with root package name */
    e.b f390z;

    /* compiled from: MyApplication */
    private class a extends x0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.x0
        public l.e b() {
            b bVar = ActionMenuItemView.this.B;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.x0
        protected boolean c() {
            l.e b8;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f390z;
            return bVar != null && bVar.a(actionMenuItemView.f387w) && (b8 = b()) != null && b8.a();
        }
    }

    /* compiled from: MyApplication */
    public static abstract class b {
        public abstract l.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (i7 < 480) {
            return (i7 >= 640 && i8 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void j() {
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f388x);
        if (this.f389y != null && (!this.f387w.B() || (!this.C && !this.D))) {
            z7 = false;
        }
        boolean z9 = z8 & z7;
        setText(z9 ? this.f388x : null);
        CharSequence contentDescription = this.f387w.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z9 ? null : this.f387w.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f387w.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            v1.a(this, z9 ? null : this.f387w.getTitle());
        } else {
            v1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.f387w.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i7) {
        this.f387w = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.A == null) {
            this.A = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f387w;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f390z;
        if (bVar != null) {
            bVar.a(this.f387w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.C = h();
        j();
    }

    @Override // androidx.appcompat.widget.n0, android.widget.TextView, android.view.View
    protected void onMeasure(int i7, int i8) {
        int i9;
        boolean f8 = f();
        if (f8 && (i9 = this.F) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.E) : this.E;
        if (mode != 1073741824 && this.E > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i8);
        }
        if (f8 || this.f389y == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f389y.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        x0 x0Var;
        if (this.f387w.hasSubMenu() && (x0Var = this.A) != null && x0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z7) {
        if (this.D != z7) {
            this.D = z7;
            g gVar = this.f387w;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f389y = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.G;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        j();
    }

    public void setItemInvoker(e.b bVar) {
        this.f390z = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
        this.F = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(b bVar) {
        this.B = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f388x = charSequence;
        j();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Resources resources = context.getResources();
        this.C = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f23549v, i7, 0);
        this.E = obtainStyledAttributes.getDimensionPixelSize(f.j.f23554w, 0);
        obtainStyledAttributes.recycle();
        this.G = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.F = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z7) {
    }

    public void setChecked(boolean z7) {
    }
}
