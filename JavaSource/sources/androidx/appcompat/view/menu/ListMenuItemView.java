package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.r1;
import androidx.core.view.e0;

/* compiled from: MyApplication */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    private int A;
    private Context B;
    private boolean C;
    private Drawable D;
    private boolean E;
    private LayoutInflater F;
    private boolean G;

    /* renamed from: q, reason: collision with root package name */
    private g f395q;

    /* renamed from: r, reason: collision with root package name */
    private ImageView f396r;

    /* renamed from: s, reason: collision with root package name */
    private RadioButton f397s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f398t;

    /* renamed from: u, reason: collision with root package name */
    private CheckBox f399u;

    /* renamed from: v, reason: collision with root package name */
    private TextView f400v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f401w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f402x;

    /* renamed from: y, reason: collision with root package name */
    private LinearLayout f403y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f404z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.A);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i7) {
        LinearLayout linearLayout = this.f403y;
        if (linearLayout != null) {
            linearLayout.addView(view, i7);
        } else {
            addView(view, i7);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(f.g.f23415h, (ViewGroup) this, false);
        this.f399u = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(f.g.f23416i, (ViewGroup) this, false);
        this.f396r = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(f.g.f23418k, (ViewGroup) this, false);
        this.f397s = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.F == null) {
            this.F = LayoutInflater.from(getContext());
        }
        return this.F;
    }

    private void setSubMenuArrowVisible(boolean z7) {
        ImageView imageView = this.f401w;
        if (imageView != null) {
            imageView.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f402x;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f402x.getLayoutParams();
        rect.top += this.f402x.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i7) {
        this.f395q = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f395q;
    }

    public void h(boolean z7, char c8) {
        int i7 = (z7 && this.f395q.A()) ? 0 : 8;
        if (i7 == 0) {
            this.f400v.setText(this.f395q.h());
        }
        if (this.f400v.getVisibility() != i7) {
            this.f400v.setVisibility(i7);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        e0.Q(this, this.f404z);
        TextView textView = (TextView) findViewById(f.f.M);
        this.f398t = textView;
        int i7 = this.A;
        if (i7 != -1) {
            textView.setTextAppearance(this.B, i7);
        }
        this.f400v = (TextView) findViewById(f.f.F);
        ImageView imageView = (ImageView) findViewById(f.f.I);
        this.f401w = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.D);
        }
        this.f402x = (ImageView) findViewById(f.f.f23399r);
        this.f403y = (LinearLayout) findViewById(f.f.f23393l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        if (this.f396r != null && this.C) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f396r.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z7) {
        CompoundButton compoundButton;
        View view;
        if (!z7 && this.f397s == null && this.f399u == null) {
            return;
        }
        if (this.f395q.m()) {
            if (this.f397s == null) {
                g();
            }
            compoundButton = this.f397s;
            view = this.f399u;
        } else {
            if (this.f399u == null) {
                e();
            }
            compoundButton = this.f399u;
            view = this.f397s;
        }
        if (z7) {
            compoundButton.setChecked(this.f395q.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f399u;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f397s;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z7) {
        CompoundButton compoundButton;
        if (this.f395q.m()) {
            if (this.f397s == null) {
                g();
            }
            compoundButton = this.f397s;
        } else {
            if (this.f399u == null) {
                e();
            }
            compoundButton = this.f399u;
        }
        compoundButton.setChecked(z7);
    }

    public void setForceShowIcon(boolean z7) {
        this.G = z7;
        this.C = z7;
    }

    public void setGroupDividerEnabled(boolean z7) {
        ImageView imageView = this.f402x;
        if (imageView != null) {
            imageView.setVisibility((this.E || !z7) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z7 = this.f395q.z() || this.G;
        if (z7 || this.C) {
            ImageView imageView = this.f396r;
            if (imageView == null && drawable == null && !this.C) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.C) {
                this.f396r.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f396r;
            if (!z7) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f396r.getVisibility() != 0) {
                this.f396r.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f398t.getVisibility() != 8) {
                this.f398t.setVisibility(8);
            }
        } else {
            this.f398t.setText(charSequence);
            if (this.f398t.getVisibility() != 0) {
                this.f398t.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        r1 u7 = r1.u(getContext(), attributeSet, f.j.T1, i7, 0);
        this.f404z = u7.f(f.j.V1);
        this.A = u7.m(f.j.U1, -1);
        this.C = u7.a(f.j.W1, false);
        this.B = context;
        this.D = u7.f(f.j.X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, f.a.f23331x, 0);
        this.E = obtainStyledAttributes.hasValue(0);
        u7.v();
        obtainStyledAttributes.recycle();
    }
}
