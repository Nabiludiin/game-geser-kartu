package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: MyApplication */
public abstract class c extends View {

    /* renamed from: q, reason: collision with root package name */
    protected int[] f1197q;

    /* renamed from: r, reason: collision with root package name */
    protected int f1198r;

    /* renamed from: s, reason: collision with root package name */
    protected Context f1199s;

    /* renamed from: t, reason: collision with root package name */
    protected v.h f1200t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f1201u;

    /* renamed from: v, reason: collision with root package name */
    protected String f1202v;

    /* renamed from: w, reason: collision with root package name */
    protected String f1203w;

    /* renamed from: x, reason: collision with root package name */
    private View[] f1204x;

    /* renamed from: y, reason: collision with root package name */
    protected HashMap f1205y;

    public c(Context context) {
        super(context);
        this.f1197q = new int[32];
        this.f1201u = false;
        this.f1204x = null;
        this.f1205y = new HashMap();
        this.f1199s = context;
        g(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f1199s == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int f8 = f(trim);
        if (f8 != 0) {
            this.f1205y.put(Integer.valueOf(f8), trim);
            b(f8);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void b(int i7) {
        if (i7 == getId()) {
            return;
        }
        int i8 = this.f1198r + 1;
        int[] iArr = this.f1197q;
        if (i8 > iArr.length) {
            this.f1197q = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1197q;
        int i9 = this.f1198r;
        iArr2[i9] = i7;
        this.f1198r = i9 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f1199s == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f1124c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1199s.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i7 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f8 = constraintLayout.f(0, str);
            if (f8 instanceof Integer) {
                i7 = ((Integer) f8).intValue();
            }
        }
        if (i7 == 0 && constraintLayout != null) {
            i7 = e(constraintLayout, str);
        }
        if (i7 == 0) {
            try {
                i7 = g.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i7 == 0 ? this.f1199s.getResources().getIdentifier(str, "id", this.f1199s.getPackageName()) : i7;
    }

    protected void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f1442n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == h.f1522x1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1202v = string;
                    setIds(string);
                } else if (index == h.f1530y1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1203w = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1197q, this.f1198r);
    }

    public abstract void h(v.e eVar, boolean z7);

    public void l(ConstraintLayout constraintLayout) {
        String str;
        int e8;
        if (isInEditMode()) {
            setIds(this.f1202v);
        }
        v.h hVar = this.f1200t;
        if (hVar == null) {
            return;
        }
        hVar.a();
        for (int i7 = 0; i7 < this.f1198r; i7++) {
            int i8 = this.f1197q[i7];
            View h8 = constraintLayout.h(i8);
            if (h8 == null && (e8 = e(constraintLayout, (str = (String) this.f1205y.get(Integer.valueOf(i8))))) != 0) {
                this.f1197q[i7] = e8;
                this.f1205y.put(Integer.valueOf(e8), str);
                h8 = constraintLayout.h(e8);
            }
            if (h8 != null) {
                this.f1200t.b(constraintLayout.i(h8));
            }
        }
        this.f1200t.c(constraintLayout.f1110s);
    }

    public void m() {
        if (this.f1200t == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f1162v0 = (v.e) this.f1200t;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1202v;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1203w;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        if (this.f1201u) {
            super.onMeasure(i7, i8);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f1202v = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f1198r = 0;
        while (true) {
            int indexOf = str.indexOf(44, i7);
            if (indexOf == -1) {
                a(str.substring(i7));
                return;
            } else {
                a(str.substring(i7, indexOf));
                i7 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f1203w = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f1198r = 0;
        while (true) {
            int indexOf = str.indexOf(44, i7);
            if (indexOf == -1) {
                c(str.substring(i7));
                return;
            } else {
                c(str.substring(i7, indexOf));
                i7 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1202v = null;
        this.f1198r = 0;
        for (int i7 : iArr) {
            b(i7);
        }
    }

    @Override // android.view.View
    public void setTag(int i7, Object obj) {
        super.setTag(i7, obj);
        if (obj == null && this.f1202v == null) {
            b(i7);
        }
    }

    protected void d(ConstraintLayout constraintLayout) {
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }
}
