package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* compiled from: MyApplication */
class v0 extends ListView {
    private boolean A;
    private androidx.core.view.k0 B;
    private androidx.core.widget.g C;
    b D;

    /* renamed from: q, reason: collision with root package name */
    private final Rect f896q;

    /* renamed from: r, reason: collision with root package name */
    private int f897r;

    /* renamed from: s, reason: collision with root package name */
    private int f898s;

    /* renamed from: t, reason: collision with root package name */
    private int f899t;

    /* renamed from: u, reason: collision with root package name */
    private int f900u;

    /* renamed from: v, reason: collision with root package name */
    private int f901v;

    /* renamed from: w, reason: collision with root package name */
    private Field f902w;

    /* renamed from: x, reason: collision with root package name */
    private a f903x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f904y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f905z;

    /* compiled from: MyApplication */
    private static class a extends i.c {

        /* renamed from: r, reason: collision with root package name */
        private boolean f906r;

        a(Drawable drawable) {
            super(drawable);
            this.f906r = true;
        }

        void c(boolean z7) {
            this.f906r = z7;
        }

        @Override // i.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f906r) {
                super.draw(canvas);
            }
        }

        @Override // i.c, android.graphics.drawable.Drawable
        public void setHotspot(float f8, float f9) {
            if (this.f906r) {
                super.setHotspot(f8, f9);
            }
        }

        @Override // i.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i7, int i8, int i9, int i10) {
            if (this.f906r) {
                super.setHotspotBounds(i7, i8, i9, i10);
            }
        }

        @Override // i.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f906r) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // i.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z7, boolean z8) {
            if (this.f906r) {
                return super.setVisible(z7, z8);
            }
            return false;
        }
    }

    /* compiled from: MyApplication */
    private class b implements Runnable {
        b() {
        }

        public void a() {
            v0 v0Var = v0.this;
            v0Var.D = null;
            v0Var.removeCallbacks(this);
        }

        public void b() {
            v0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            v0 v0Var = v0.this;
            v0Var.D = null;
            v0Var.drawableStateChanged();
        }
    }

    v0(Context context, boolean z7) {
        super(context, null, f.a.f23331x);
        this.f896q = new Rect();
        this.f897r = 0;
        this.f898s = 0;
        this.f899t = 0;
        this.f900u = 0;
        this.f905z = z7;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f902w = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e8) {
            e8.printStackTrace();
        }
    }

    private void a() {
        this.A = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f901v - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.k0 k0Var = this.B;
        if (k0Var != null) {
            k0Var.c();
            this.B = null;
        }
    }

    private void b(View view, int i7) {
        performItemClick(view, i7, getItemIdAtPosition(i7));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f896q.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f896q);
        selector.draw(canvas);
    }

    private void f(int i7, View view) {
        Rect rect = this.f896q;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f897r;
        rect.top -= this.f898s;
        rect.right += this.f899t;
        rect.bottom += this.f900u;
        try {
            boolean z7 = this.f902w.getBoolean(this);
            if (view.isEnabled() != z7) {
                this.f902w.set(this, Boolean.valueOf(!z7));
                if (i7 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
        }
    }

    private void g(int i7, View view) {
        Drawable selector = getSelector();
        boolean z7 = (selector == null || i7 == -1) ? false : true;
        if (z7) {
            selector.setVisible(false, false);
        }
        f(i7, view);
        if (z7) {
            Rect rect = this.f896q;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.j(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i7, View view, float f8, float f9) {
        g(i7, view);
        Drawable selector = getSelector();
        if (selector == null || i7 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.j(selector, f8, f9);
    }

    private void i(View view, int i7, float f8, float f9) {
        View childAt;
        this.A = true;
        drawableHotspotChanged(f8, f9);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i8 = this.f901v;
        if (i8 != -1 && (childAt = getChildAt(i8 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f901v = i7;
        view.drawableHotspotChanged(f8 - view.getLeft(), f9 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i7, view, f8, f9);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z7) {
        a aVar = this.f903x;
        if (aVar != null) {
            aVar.c(z7);
        }
    }

    private boolean k() {
        return this.A;
    }

    private void l() {
        Drawable selector = getSelector();
        if (selector != null && k() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i7, int i8, int i9, int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i12 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        View view = null;
        while (i13 < count) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i14) {
                view = null;
                i14 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i16 = layoutParams.height;
            view.measure(i7, i16 > 0 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i10) {
                return (i11 < 0 || i13 <= i11 || i15 <= 0 || i12 == i10) ? i10 : i15;
            }
            if (i11 >= 0 && i13 >= i11) {
                i15 = i12;
            }
            i13++;
        }
        return i12;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.D != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.g r9 = r7.C
            if (r9 != 0) goto L5a
            androidx.core.widget.g r9 = new androidx.core.widget.g
            r9.<init>(r7)
            r7.C = r9
        L5a:
            androidx.core.widget.g r9 = r7.C
            r9.u(r1)
            androidx.core.widget.g r9 = r7.C
            r9.onTouch(r7, r8)
            return r3
        L65:
            androidx.core.widget.g r8 = r7.C
            if (r8 == 0) goto L6c
            r8.u(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v0.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f905z || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f905z || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f905z || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f905z && this.f904y) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.D = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.D == null) {
            b bVar = new b();
            this.D = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            l();
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f901v = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.D;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z7) {
        this.f904y = z7;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f903x = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f897r = rect.left;
        this.f898s = rect.top;
        this.f899t = rect.right;
        this.f900u = rect.bottom;
    }
}
