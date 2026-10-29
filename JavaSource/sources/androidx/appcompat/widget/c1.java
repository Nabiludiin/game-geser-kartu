package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
public abstract class c1 implements l.e {
    private static Method W;
    private static Method X;
    private static Method Y;
    private boolean A;
    private int B;
    private boolean C;
    private boolean D;
    int E;
    private View F;
    private int G;
    private DataSetObserver H;
    private View I;
    private Drawable J;
    private AdapterView.OnItemClickListener K;
    private AdapterView.OnItemSelectedListener L;
    final g M;
    private final f N;
    private final e O;
    private final c P;
    private Runnable Q;
    final Handler R;
    private final Rect S;
    private Rect T;
    private boolean U;
    PopupWindow V;

    /* renamed from: q, reason: collision with root package name */
    private Context f687q;

    /* renamed from: r, reason: collision with root package name */
    private ListAdapter f688r;

    /* renamed from: s, reason: collision with root package name */
    v0 f689s;

    /* renamed from: t, reason: collision with root package name */
    private int f690t;

    /* renamed from: u, reason: collision with root package name */
    private int f691u;

    /* renamed from: v, reason: collision with root package name */
    private int f692v;

    /* renamed from: w, reason: collision with root package name */
    private int f693w;

    /* renamed from: x, reason: collision with root package name */
    private int f694x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f695y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f696z;

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t7 = c1.this.t();
            if (t7 == null || t7.getWindowToken() == null) {
                return;
            }
            c1.this.h();
        }
    }

    /* compiled from: MyApplication */
    private class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c1.this.r();
        }
    }

    /* compiled from: MyApplication */
    private class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (c1.this.a()) {
                c1.this.h();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            c1.this.dismiss();
        }
    }

    /* compiled from: MyApplication */
    private class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = c1.this.V) != null && popupWindow.isShowing() && x7 >= 0 && x7 < c1.this.V.getWidth() && y7 >= 0 && y7 < c1.this.V.getHeight()) {
                c1 c1Var = c1.this;
                c1Var.R.postDelayed(c1Var.M, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            c1 c1Var2 = c1.this;
            c1Var2.R.removeCallbacks(c1Var2.M);
            return false;
        }
    }

    /* compiled from: MyApplication */
    private class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v0 v0Var = c1.this.f689s;
            if (v0Var == null || !androidx.core.view.e0.A(v0Var) || c1.this.f689s.getCount() <= c1.this.f689s.getChildCount()) {
                return;
            }
            int childCount = c1.this.f689s.getChildCount();
            c1 c1Var = c1.this;
            if (childCount <= c1Var.E) {
                c1Var.V.setInputMethodMode(2);
                c1.this.h();
            }
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i7 <= 28) {
            try {
                W = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                Y = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                X = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public c1(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    private void J(boolean z7) {
        if (Build.VERSION.SDK_INT > 28) {
            this.V.setIsClippedToScreen(z7);
            return;
        }
        Method method = W;
        if (method != null) {
            try {
                method.invoke(this.V, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int q() {
        int i7;
        int i8;
        int makeMeasureSpec;
        int i9;
        if (this.f689s == null) {
            Context context = this.f687q;
            this.Q = new a();
            v0 s7 = s(context, !this.U);
            this.f689s = s7;
            Drawable drawable = this.J;
            if (drawable != null) {
                s7.setSelector(drawable);
            }
            this.f689s.setAdapter(this.f688r);
            this.f689s.setOnItemClickListener(this.K);
            this.f689s.setFocusable(true);
            this.f689s.setFocusableInTouchMode(true);
            this.f689s.setOnItemSelectedListener(new b());
            this.f689s.setOnScrollListener(this.O);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.L;
            if (onItemSelectedListener != null) {
                this.f689s.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f689s;
            View view2 = this.F;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i10 = this.G;
                if (i10 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i10 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.G);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i11 = this.f691u;
                if (i11 >= 0) {
                    i9 = Integer.MIN_VALUE;
                } else {
                    i11 = 0;
                    i9 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i11, i9), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i7 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i7 = 0;
            }
            this.V.setContentView(view);
        } else {
            View view3 = this.F;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i7 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i7 = 0;
            }
        }
        Drawable background = this.V.getBackground();
        if (background != null) {
            background.getPadding(this.S);
            Rect rect = this.S;
            int i12 = rect.top;
            i8 = rect.bottom + i12;
            if (!this.f695y) {
                this.f693w = -i12;
            }
        } else {
            this.S.setEmpty();
            i8 = 0;
        }
        int u7 = u(t(), this.f693w, this.V.getInputMethodMode() == 2);
        if (this.C || this.f690t == -1) {
            return u7 + i8;
        }
        int i13 = this.f691u;
        if (i13 == -2) {
            int i14 = this.f687q.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.S;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i13 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else {
            int i15 = this.f687q.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.S;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - (rect3.left + rect3.right), 1073741824);
        }
        int d8 = this.f689s.d(makeMeasureSpec, 0, -1, u7 - i7, -1);
        if (d8 > 0) {
            i7 += i8 + this.f689s.getPaddingTop() + this.f689s.getPaddingBottom();
        }
        return d8 + i7;
    }

    private int u(View view, int i7, boolean z7) {
        int maxAvailableHeight;
        if (Build.VERSION.SDK_INT > 23) {
            maxAvailableHeight = this.V.getMaxAvailableHeight(view, i7, z7);
            return maxAvailableHeight;
        }
        Method method = X;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.V, view, Integer.valueOf(i7), Boolean.valueOf(z7))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.V.getMaxAvailableHeight(view, i7);
    }

    private void y() {
        View view = this.F;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.F);
            }
        }
    }

    public void A(int i7) {
        this.V.setAnimationStyle(i7);
    }

    public void B(int i7) {
        Drawable background = this.V.getBackground();
        if (background == null) {
            M(i7);
            return;
        }
        background.getPadding(this.S);
        Rect rect = this.S;
        this.f691u = rect.left + rect.right + i7;
    }

    public void C(int i7) {
        this.B = i7;
    }

    public void D(Rect rect) {
        this.T = rect != null ? new Rect(rect) : null;
    }

    public void E(int i7) {
        this.V.setInputMethodMode(i7);
    }

    public void F(boolean z7) {
        this.U = z7;
        this.V.setFocusable(z7);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.V.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.K = onItemClickListener;
    }

    public void I(boolean z7) {
        this.A = true;
        this.f696z = z7;
    }

    public void K(int i7) {
        this.G = i7;
    }

    public void L(int i7) {
        v0 v0Var = this.f689s;
        if (!a() || v0Var == null) {
            return;
        }
        v0Var.setListSelectionHidden(false);
        v0Var.setSelection(i7);
        if (v0Var.getChoiceMode() != 0) {
            v0Var.setItemChecked(i7, true);
        }
    }

    public void M(int i7) {
        this.f691u = i7;
    }

    @Override // l.e
    public boolean a() {
        return this.V.isShowing();
    }

    public int b() {
        return this.f692v;
    }

    public void d(int i7) {
        this.f692v = i7;
    }

    @Override // l.e
    public void dismiss() {
        this.V.dismiss();
        y();
        this.V.setContentView(null);
        this.f689s = null;
        this.R.removeCallbacks(this.M);
    }

    public Drawable g() {
        return this.V.getBackground();
    }

    @Override // l.e
    public void h() {
        int q7 = q();
        boolean w7 = w();
        androidx.core.widget.i.b(this.V, this.f694x);
        if (this.V.isShowing()) {
            if (androidx.core.view.e0.A(t())) {
                int i7 = this.f691u;
                if (i7 == -1) {
                    i7 = -1;
                } else if (i7 == -2) {
                    i7 = t().getWidth();
                }
                int i8 = this.f690t;
                if (i8 == -1) {
                    if (!w7) {
                        q7 = -1;
                    }
                    if (w7) {
                        this.V.setWidth(this.f691u == -1 ? -1 : 0);
                        this.V.setHeight(0);
                    } else {
                        this.V.setWidth(this.f691u == -1 ? -1 : 0);
                        this.V.setHeight(-1);
                    }
                } else if (i8 != -2) {
                    q7 = i8;
                }
                this.V.setOutsideTouchable((this.D || this.C) ? false : true);
                this.V.update(t(), this.f692v, this.f693w, i7 < 0 ? -1 : i7, q7 < 0 ? -1 : q7);
                return;
            }
            return;
        }
        int i9 = this.f691u;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = t().getWidth();
        }
        int i10 = this.f690t;
        if (i10 == -1) {
            q7 = -1;
        } else if (i10 != -2) {
            q7 = i10;
        }
        this.V.setWidth(i9);
        this.V.setHeight(q7);
        J(true);
        this.V.setOutsideTouchable((this.D || this.C) ? false : true);
        this.V.setTouchInterceptor(this.N);
        if (this.A) {
            androidx.core.widget.i.a(this.V, this.f696z);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = Y;
            if (method != null) {
                try {
                    method.invoke(this.V, this.T);
                } catch (Exception e8) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e8);
                }
            }
        } else {
            this.V.setEpicenterBounds(this.T);
        }
        androidx.core.widget.i.c(this.V, t(), this.f692v, this.f693w, this.B);
        this.f689s.setSelection(-1);
        if (!this.U || this.f689s.isInTouchMode()) {
            r();
        }
        if (this.U) {
            return;
        }
        this.R.post(this.P);
    }

    @Override // l.e
    public ListView j() {
        return this.f689s;
    }

    public void k(Drawable drawable) {
        this.V.setBackgroundDrawable(drawable);
    }

    public void l(int i7) {
        this.f693w = i7;
        this.f695y = true;
    }

    public int o() {
        if (this.f695y) {
            return this.f693w;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.H;
        if (dataSetObserver == null) {
            this.H = new d();
        } else {
            ListAdapter listAdapter2 = this.f688r;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f688r = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.H);
        }
        v0 v0Var = this.f689s;
        if (v0Var != null) {
            v0Var.setAdapter(this.f688r);
        }
    }

    public void r() {
        v0 v0Var = this.f689s;
        if (v0Var != null) {
            v0Var.setListSelectionHidden(true);
            v0Var.requestLayout();
        }
    }

    v0 s(Context context, boolean z7) {
        return new v0(context, z7);
    }

    public View t() {
        return this.I;
    }

    public int v() {
        return this.f691u;
    }

    public boolean w() {
        return this.V.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.U;
    }

    public void z(View view) {
        this.I = view;
    }

    public c1(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f690t = -2;
        this.f691u = -2;
        this.f694x = 1002;
        this.B = 0;
        this.C = false;
        this.D = false;
        this.E = Integer.MAX_VALUE;
        this.G = 0;
        this.M = new g();
        this.N = new f();
        this.O = new e();
        this.P = new c();
        this.S = new Rect();
        this.f687q = context;
        this.R = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f23501l1, i7, i8);
        this.f692v = obtainStyledAttributes.getDimensionPixelOffset(f.j.f23506m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(f.j.f23511n1, 0);
        this.f693w = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f695y = true;
        }
        obtainStyledAttributes.recycle();
        s sVar = new s(context, attributeSet, i7, i8);
        this.V = sVar;
        sVar.setInputMethodMode(1);
    }

    /* compiled from: MyApplication */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            v0 v0Var;
            if (i7 == -1 || (v0Var = c1.this.f689s) == null) {
                return;
            }
            v0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* compiled from: MyApplication */
    private class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i7) {
            if (i7 != 1 || c1.this.w() || c1.this.V.getContentView() == null) {
                return;
            }
            c1 c1Var = c1.this;
            c1Var.R.removeCallbacks(c1Var.M);
            c1.this.M.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i7, int i8, int i9) {
        }
    }
}
