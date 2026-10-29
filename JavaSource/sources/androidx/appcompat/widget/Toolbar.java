package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private int C;
    int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private i1 J;
    private int K;
    private int L;
    private int M;
    private CharSequence N;
    private CharSequence O;
    private ColorStateList P;
    private ColorStateList Q;
    private boolean R;
    private boolean S;
    private final ArrayList T;
    private final ArrayList U;
    private final int[] V;
    final androidx.core.view.s W;

    /* renamed from: a0, reason: collision with root package name */
    private ArrayList f635a0;

    /* renamed from: b0, reason: collision with root package name */
    private final ActionMenuView.e f636b0;

    /* renamed from: c0, reason: collision with root package name */
    private t1 f637c0;

    /* renamed from: d0, reason: collision with root package name */
    private androidx.appcompat.widget.c f638d0;

    /* renamed from: e0, reason: collision with root package name */
    private d f639e0;

    /* renamed from: f0, reason: collision with root package name */
    private j.a f640f0;

    /* renamed from: g0, reason: collision with root package name */
    private e.a f641g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f642h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Runnable f643i0;

    /* renamed from: q, reason: collision with root package name */
    private ActionMenuView f644q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f645r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f646s;

    /* renamed from: t, reason: collision with root package name */
    private ImageButton f647t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f648u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f649v;

    /* renamed from: w, reason: collision with root package name */
    private CharSequence f650w;

    /* renamed from: x, reason: collision with root package name */
    ImageButton f651x;

    /* renamed from: y, reason: collision with root package name */
    View f652y;

    /* renamed from: z, reason: collision with root package name */
    private Context f653z;

    /* compiled from: MyApplication */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.W.b(menuItem)) {
                return true;
            }
            Toolbar.this.getClass();
            return false;
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.P();
        }
    }

    /* compiled from: MyApplication */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* compiled from: MyApplication */
    public interface f {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.J);
    }

    private int C(View view, int i7, int[] iArr, int i8) {
        e eVar = (e) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i7 + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        int q7 = q(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q7, max + measuredWidth, view.getMeasuredHeight() + q7);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int D(View view, int i7, int[] iArr, int i8) {
        e eVar = (e) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int q7 = q(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q7, max, view.getMeasuredHeight() + q7);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int E(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i11) + Math.max(0, i12);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i7, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i11 >= 0) {
            if (mode != 0) {
                i11 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i11);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.W.a(getMenu(), getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f635a0 = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f643i0);
        post(this.f643i0);
    }

    private boolean N() {
        if (!this.f642h0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (O(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean O(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i7) {
        boolean z7 = androidx.core.view.e0.r(this) == 1;
        int childCount = getChildCount();
        int a8 = androidx.core.view.o.a(i7, androidx.core.view.e0.r(this));
        list.clear();
        if (!z7) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f660b == 0 && O(childAt) && p(eVar.f241a) == a8) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f660b == 0 && O(childAt2) && p(eVar2.f241a) == a8) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f660b = 1;
        if (!z7 || this.f652y == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.U.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new k.g(getContext());
    }

    private void h() {
        if (this.J == null) {
            this.J = new i1();
        }
    }

    private void i() {
        if (this.f648u == null) {
            this.f648u = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f644q.J() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f644q.getMenu();
            if (this.f639e0 == null) {
                this.f639e0 = new d();
            }
            this.f644q.setExpandedActionViewsExclusive(true);
            eVar.c(this.f639e0, this.f653z);
        }
    }

    private void k() {
        if (this.f644q == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f644q = actionMenuView;
            actionMenuView.setPopupTheme(this.A);
            this.f644q.setOnMenuItemClickListener(this.f636b0);
            this.f644q.K(this.f640f0, this.f641g0);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f241a = (this.D & 112) | 8388613;
            this.f644q.setLayoutParams(generateDefaultLayoutParams);
            c(this.f644q, false);
        }
    }

    private void l() {
        if (this.f647t == null) {
            this.f647t = new p(getContext(), null, f.a.I);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f241a = (this.D & 112) | 8388611;
            this.f647t.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i7) {
        int r7 = androidx.core.view.e0.r(this);
        int a8 = androidx.core.view.o.a(i7, r7) & 7;
        return (a8 == 1 || a8 == 3 || a8 == 5) ? a8 : r7 == 1 ? 5 : 3;
    }

    private int q(View view, int i7) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int r7 = r(eVar.f241a);
        if (r7 == 48) {
            return getPaddingTop() - i8;
        }
        if (r7 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i9 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (i9 < i10) {
            i9 = i10;
        } else {
            int i11 = (((height - paddingBottom) - measuredHeight) - i9) - paddingTop;
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i11 < i12) {
                i9 = Math.max(0, i9 - (i12 - i11));
            }
        }
        return paddingTop + i9;
    }

    private int r(int i7) {
        int i8 = i7 & 112;
        return (i8 == 16 || i8 == 48 || i8 == 80) ? i8 : this.M & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.r.b(marginLayoutParams) + androidx.core.view.r.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List list, int[] iArr) {
        int i7 = iArr[0];
        int i8 = iArr[1];
        int size = list.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            View view = (View) list.get(i9);
            e eVar = (e) view.getLayoutParams();
            int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i7;
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i8;
            int max = Math.max(0, i11);
            int max2 = Math.max(0, i12);
            int max3 = Math.max(0, -i11);
            int max4 = Math.max(0, -i12);
            i10 += max + view.getMeasuredWidth() + max2;
            i9++;
            i8 = max4;
            i7 = max3;
        }
        return i10;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.U.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f644q;
        return actionMenuView != null && actionMenuView.E();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f644q;
        return actionMenuView != null && actionMenuView.F();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f660b != 2 && childAt != this.f644q) {
                removeViewAt(childCount);
                this.U.add(childAt);
            }
        }
    }

    public void J(int i7, int i8) {
        h();
        this.J.g(i7, i8);
    }

    public void K(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f644q == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e J = this.f644q.J();
        if (J == eVar) {
            return;
        }
        if (J != null) {
            J.O(this.f638d0);
            J.O(this.f639e0);
        }
        if (this.f639e0 == null) {
            this.f639e0 = new d();
        }
        cVar.G(true);
        if (eVar != null) {
            eVar.c(cVar, this.f653z);
            eVar.c(this.f639e0, this.f653z);
        } else {
            cVar.i(this.f653z, null);
            this.f639e0.i(this.f653z, null);
            cVar.c(true);
            this.f639e0.c(true);
        }
        this.f644q.setPopupTheme(this.A);
        this.f644q.setPresenter(cVar);
        this.f638d0 = cVar;
    }

    public void L(Context context, int i7) {
        this.C = i7;
        TextView textView = this.f646s;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public void M(Context context, int i7) {
        this.B = i7;
        TextView textView = this.f645r;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public boolean P() {
        ActionMenuView actionMenuView = this.f644q;
        return actionMenuView != null && actionMenuView.L();
    }

    void a() {
        for (int size = this.U.size() - 1; size >= 0; size--) {
            addView((View) this.U.get(size));
        }
        this.U.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f644q) != null && actionMenuView.G();
    }

    public void e() {
        d dVar = this.f639e0;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f658r;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f644q;
        if (actionMenuView != null) {
            actionMenuView.x();
        }
    }

    void g() {
        if (this.f651x == null) {
            p pVar = new p(getContext(), null, f.a.I);
            this.f651x = pVar;
            pVar.setImageDrawable(this.f649v);
            this.f651x.setContentDescription(this.f650w);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f241a = (this.D & 112) | 8388611;
            generateDefaultLayoutParams.f660b = 2;
            this.f651x.setLayoutParams(generateDefaultLayoutParams);
            this.f651x.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f651x;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f651x;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        i1 i1Var = this.J;
        if (i1Var != null) {
            return i1Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.L;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        i1 i1Var = this.J;
        if (i1Var != null) {
            return i1Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        i1 i1Var = this.J;
        if (i1Var != null) {
            return i1Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        i1 i1Var = this.J;
        if (i1Var != null) {
            return i1Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.K;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e J;
        ActionMenuView actionMenuView = this.f644q;
        return (actionMenuView == null || (J = actionMenuView.J()) == null || !J.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.L, 0));
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.e0.r(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.e0.r(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.K, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f648u;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f648u;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f644q.getMenu();
    }

    View getNavButtonView() {
        return this.f647t;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f647t;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f647t;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.f638d0;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f644q.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f653z;
    }

    public int getPopupTheme() {
        return this.A;
    }

    public CharSequence getSubtitle() {
        return this.O;
    }

    final TextView getSubtitleTextView() {
        return this.f646s;
    }

    public CharSequence getTitle() {
        return this.N;
    }

    public int getTitleMarginBottom() {
        return this.I;
    }

    public int getTitleMarginEnd() {
        return this.G;
    }

    public int getTitleMarginStart() {
        return this.F;
    }

    public int getTitleMarginTop() {
        return this.H;
    }

    final TextView getTitleTextView() {
        return this.f645r;
    }

    public t0 getWrapper() {
        if (this.f637c0 == null) {
            this.f637c0 = new t1(this, true);
        }
        return this.f637c0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0005a ? new e((a.C0005a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f643i0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.S = false;
        }
        if (!this.S) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.S = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.S = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0297 A[LOOP:0: B:40:0x0295->B:41:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b5 A[LOOP:1: B:44:0x02b3->B:45:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ec A[LOOP:2: B:53:0x02ea->B:54:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int[] iArr2 = this.V;
        boolean b8 = z1.b(this);
        int i16 = !b8 ? 1 : 0;
        if (O(this.f647t)) {
            F(this.f647t, i7, 0, i8, 0, this.E);
            i9 = this.f647t.getMeasuredWidth() + s(this.f647t);
            i10 = Math.max(0, this.f647t.getMeasuredHeight() + t(this.f647t));
            i11 = View.combineMeasuredStates(0, this.f647t.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (O(this.f651x)) {
            F(this.f651x, i7, 0, i8, 0, this.E);
            i9 = this.f651x.getMeasuredWidth() + s(this.f651x);
            i10 = Math.max(i10, this.f651x.getMeasuredHeight() + t(this.f651x));
            i11 = View.combineMeasuredStates(i11, this.f651x.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9);
        iArr2[b8 ? 1 : 0] = Math.max(0, currentContentInsetStart - i9);
        if (O(this.f644q)) {
            F(this.f644q, i7, max, i8, 0, this.E);
            i12 = this.f644q.getMeasuredWidth() + s(this.f644q);
            i10 = Math.max(i10, this.f644q.getMeasuredHeight() + t(this.f644q));
            i11 = View.combineMeasuredStates(i11, this.f644q.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i12);
        iArr2[i16] = Math.max(0, currentContentInsetEnd - i12);
        if (O(this.f652y)) {
            iArr = iArr2;
            max2 += E(this.f652y, i7, max2, i8, 0, iArr);
            i10 = Math.max(i10, this.f652y.getMeasuredHeight() + t(this.f652y));
            i11 = View.combineMeasuredStates(i11, this.f652y.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (O(this.f648u)) {
            max2 += E(this.f648u, i7, max2, i8, 0, iArr);
            i10 = Math.max(i10, this.f648u.getMeasuredHeight() + t(this.f648u));
            i11 = View.combineMeasuredStates(i11, this.f648u.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (((e) childAt.getLayoutParams()).f660b == 0 && O(childAt)) {
                max2 += E(childAt, i7, max2, i8, 0, iArr);
                int max3 = Math.max(i10, childAt.getMeasuredHeight() + t(childAt));
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
                i10 = max3;
            } else {
                max2 = max2;
            }
        }
        int i18 = max2;
        int i19 = this.H + this.I;
        int i20 = this.F + this.G;
        if (O(this.f645r)) {
            E(this.f645r, i7, i18 + i20, i8, i19, iArr);
            int measuredWidth = this.f645r.getMeasuredWidth() + s(this.f645r);
            int measuredHeight = this.f645r.getMeasuredHeight() + t(this.f645r);
            i13 = measuredWidth;
            i14 = View.combineMeasuredStates(i11, this.f645r.getMeasuredState());
            i15 = measuredHeight;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (O(this.f646s)) {
            i13 = Math.max(i13, E(this.f646s, i7, i18 + i20, i8, i19 + i15, iArr));
            i15 += this.f646s.getMeasuredHeight() + t(this.f646s);
            i14 = View.combineMeasuredStates(i14, this.f646s.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i18 + i13 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, (-16777216) & i14), N() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i10, i15) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, i14 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f644q;
        androidx.appcompat.view.menu.e J = actionMenuView != null ? actionMenuView.J() : null;
        int i7 = gVar.f661s;
        if (i7 != 0 && this.f639e0 != null && J != null && (findItem = J.findItem(i7)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f662t) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        h();
        this.J.f(i7 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.f639e0;
        if (dVar != null && (gVar = dVar.f658r) != null) {
            gVar2.f661s = gVar.getItemId();
        }
        gVar2.f662t = B();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.R = false;
        }
        if (!this.R) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.R = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.R = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(h.a.b(getContext(), i7));
    }

    public void setCollapsible(boolean z7) {
        this.f642h0 = z7;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.L) {
            this.L = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.K) {
            this.K = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(h.a.b(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(h.a.b(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f647t.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f644q.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.A != i7) {
            this.A = i7;
            if (i7 == 0) {
                this.f653z = getContext();
            } else {
                this.f653z = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.I = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.G = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.F = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.H = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public boolean v() {
        d dVar = this.f639e0;
        return (dVar == null || dVar.f658r == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f644q;
        return actionMenuView != null && actionMenuView.D();
    }

    public void x(int i7) {
        getMenuInflater().inflate(i7, getMenu());
    }

    public void y() {
        ArrayList arrayList = this.f635a0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        G();
    }

    /* compiled from: MyApplication */
    public static class e extends a.C0005a {

        /* renamed from: b, reason: collision with root package name */
        int f660b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f660b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i7, int i8) {
            super(i7, i8);
            this.f660b = 0;
            this.f241a = 8388627;
        }

        public e(e eVar) {
            super((a.C0005a) eVar);
            this.f660b = 0;
            this.f660b = eVar.f660b;
        }

        public e(a.C0005a c0005a) {
            super(c0005a);
            this.f660b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f660b = 0;
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f660b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.M = 8388627;
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new int[2];
        this.W = new androidx.core.view.s(new Runnable() { // from class: androidx.appcompat.widget.s1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.y();
            }
        });
        this.f635a0 = new ArrayList();
        this.f636b0 = new a();
        this.f643i0 = new b();
        Context context2 = getContext();
        int[] iArr = f.j.O2;
        r1 u7 = r1.u(context2, attributeSet, iArr, i7, 0);
        androidx.core.view.e0.L(this, context, iArr, attributeSet, u7.q(), i7, 0);
        this.B = u7.m(f.j.f23528q3, 0);
        this.C = u7.m(f.j.f23483h3, 0);
        this.M = u7.k(f.j.P2, this.M);
        this.D = u7.k(f.j.Q2, 48);
        int d8 = u7.d(f.j.f23498k3, 0);
        int i8 = f.j.f23523p3;
        d8 = u7.r(i8) ? u7.d(i8, d8) : d8;
        this.I = d8;
        this.H = d8;
        this.G = d8;
        this.F = d8;
        int d9 = u7.d(f.j.f23513n3, -1);
        if (d9 >= 0) {
            this.F = d9;
        }
        int d10 = u7.d(f.j.f23508m3, -1);
        if (d10 >= 0) {
            this.G = d10;
        }
        int d11 = u7.d(f.j.f23518o3, -1);
        if (d11 >= 0) {
            this.H = d11;
        }
        int d12 = u7.d(f.j.f23503l3, -1);
        if (d12 >= 0) {
            this.I = d12;
        }
        this.E = u7.e(f.j.f23453b3, -1);
        int d13 = u7.d(f.j.X2, Integer.MIN_VALUE);
        int d14 = u7.d(f.j.T2, Integer.MIN_VALUE);
        int e8 = u7.e(f.j.V2, 0);
        int e9 = u7.e(f.j.W2, 0);
        h();
        this.J.e(e8, e9);
        if (d13 != Integer.MIN_VALUE || d14 != Integer.MIN_VALUE) {
            this.J.g(d13, d14);
        }
        this.K = u7.d(f.j.Y2, Integer.MIN_VALUE);
        this.L = u7.d(f.j.U2, Integer.MIN_VALUE);
        this.f649v = u7.f(f.j.S2);
        this.f650w = u7.o(f.j.R2);
        CharSequence o7 = u7.o(f.j.f23493j3);
        if (!TextUtils.isEmpty(o7)) {
            setTitle(o7);
        }
        CharSequence o8 = u7.o(f.j.f23478g3);
        if (!TextUtils.isEmpty(o8)) {
            setSubtitle(o8);
        }
        this.f653z = getContext();
        setPopupTheme(u7.m(f.j.f23473f3, 0));
        Drawable f8 = u7.f(f.j.f23468e3);
        if (f8 != null) {
            setNavigationIcon(f8);
        }
        CharSequence o9 = u7.o(f.j.f23463d3);
        if (!TextUtils.isEmpty(o9)) {
            setNavigationContentDescription(o9);
        }
        Drawable f9 = u7.f(f.j.Z2);
        if (f9 != null) {
            setLogo(f9);
        }
        CharSequence o10 = u7.o(f.j.f23448a3);
        if (!TextUtils.isEmpty(o10)) {
            setLogoDescription(o10);
        }
        int i9 = f.j.f23533r3;
        if (u7.r(i9)) {
            setTitleTextColor(u7.c(i9));
        }
        int i10 = f.j.f23488i3;
        if (u7.r(i10)) {
            setSubtitleTextColor(u7.c(i10));
        }
        int i11 = f.j.f23458c3;
        if (u7.r(i11)) {
            x(u7.m(i11, 0));
        }
        u7.v();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f651x;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f651x.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f651x;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f649v);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f648u)) {
                c(this.f648u, true);
            }
        } else {
            ImageView imageView = this.f648u;
            if (imageView != null && z(imageView)) {
                removeView(this.f648u);
                this.U.remove(this.f648u);
            }
        }
        ImageView imageView2 = this.f648u;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f648u;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f647t;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            v1.a(this.f647t, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f647t)) {
                c(this.f647t, true);
            }
        } else {
            ImageButton imageButton = this.f647t;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f647t);
                this.U.remove(this.f647t);
            }
        }
        ImageButton imageButton2 = this.f647t;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f646s;
            if (textView != null && z(textView)) {
                removeView(this.f646s);
                this.U.remove(this.f646s);
            }
        } else {
            if (this.f646s == null) {
                Context context = getContext();
                n0 n0Var = new n0(context);
                this.f646s = n0Var;
                n0Var.setSingleLine();
                this.f646s.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.C;
                if (i7 != 0) {
                    this.f646s.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.Q;
                if (colorStateList != null) {
                    this.f646s.setTextColor(colorStateList);
                }
            }
            if (!z(this.f646s)) {
                c(this.f646s, true);
            }
        }
        TextView textView2 = this.f646s;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.O = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.Q = colorStateList;
        TextView textView = this.f646s;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f645r;
            if (textView != null && z(textView)) {
                removeView(this.f645r);
                this.U.remove(this.f645r);
            }
        } else {
            if (this.f645r == null) {
                Context context = getContext();
                n0 n0Var = new n0(context);
                this.f645r = n0Var;
                n0Var.setSingleLine();
                this.f645r.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.B;
                if (i7 != 0) {
                    this.f645r.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.P;
                if (colorStateList != null) {
                    this.f645r.setTextColor(colorStateList);
                }
            }
            if (!z(this.f645r)) {
                c(this.f645r, true);
            }
        }
        TextView textView2 = this.f645r;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.N = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        TextView textView = this.f645r;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* compiled from: MyApplication */
    public static class g extends e0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: s, reason: collision with root package name */
        int f661s;

        /* renamed from: t, reason: collision with root package name */
        boolean f662t;

        /* compiled from: MyApplication */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i7) {
                return new g[i7];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f661s = parcel.readInt();
            this.f662t = parcel.readInt() != 0;
        }

        @Override // e0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f661s);
            parcel.writeInt(this.f662t ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setOnMenuItemClickListener(f fVar) {
    }

    /* compiled from: MyApplication */
    private class d implements androidx.appcompat.view.menu.j {

        /* renamed from: q, reason: collision with root package name */
        androidx.appcompat.view.menu.e f657q;

        /* renamed from: r, reason: collision with root package name */
        androidx.appcompat.view.menu.g f658r;

        d() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void c(boolean z7) {
            if (this.f658r != null) {
                androidx.appcompat.view.menu.e eVar = this.f657q;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.f657q.getItem(i7) == this.f658r) {
                            return;
                        }
                    }
                }
                e(this.f657q, this.f658r);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f652y;
            if (callback instanceof k.c) {
                ((k.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f652y);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f651x);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f652y = null;
            toolbar3.a();
            this.f658r = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f651x.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f651x);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f651x);
            }
            Toolbar.this.f652y = gVar.getActionView();
            this.f658r = gVar;
            ViewParent parent2 = Toolbar.this.f652y.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f652y);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f241a = (toolbar4.D & 112) | 8388611;
                generateDefaultLayoutParams.f660b = 2;
                toolbar4.f652y.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f652y);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f652y;
            if (callback instanceof k.c) {
                ((k.c) callback).onActionViewExpanded();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f657q;
            if (eVar2 != null && (gVar = this.f658r) != null) {
                eVar2.f(gVar);
            }
            this.f657q = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z7) {
        }
    }
}
