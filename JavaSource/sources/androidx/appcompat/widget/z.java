package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;

/* compiled from: MyApplication */
public class z extends Spinner {

    /* renamed from: y, reason: collision with root package name */
    private static final int[] f957y = {R.attr.spinnerMode};

    /* renamed from: q, reason: collision with root package name */
    private final androidx.appcompat.widget.e f958q;

    /* renamed from: r, reason: collision with root package name */
    private final Context f959r;

    /* renamed from: s, reason: collision with root package name */
    private x0 f960s;

    /* renamed from: t, reason: collision with root package name */
    private SpinnerAdapter f961t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f962u;

    /* renamed from: v, reason: collision with root package name */
    private g f963v;

    /* renamed from: w, reason: collision with root package name */
    int f964w;

    /* renamed from: x, reason: collision with root package name */
    final Rect f965x;

    /* compiled from: MyApplication */
    class a extends x0 {

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ e f966z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f966z = eVar;
        }

        @Override // androidx.appcompat.widget.x0
        public l.e b() {
            return this.f966z;
        }

        @Override // androidx.appcompat.widget.x0
        public boolean c() {
            if (z.this.getInternalPopup().a()) {
                return true;
            }
            z.this.b();
            return true;
        }
    }

    /* compiled from: MyApplication */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!z.this.getInternalPopup().a()) {
                z.this.b();
            }
            ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* compiled from: MyApplication */
    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: q, reason: collision with root package name */
        androidx.appcompat.app.b f968q;

        /* renamed from: r, reason: collision with root package name */
        private ListAdapter f969r;

        /* renamed from: s, reason: collision with root package name */
        private CharSequence f970s;

        c() {
        }

        @Override // androidx.appcompat.widget.z.g
        public boolean a() {
            androidx.appcompat.app.b bVar = this.f968q;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.z.g
        public int b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.z.g
        public void d(int i7) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.z.g
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f968q;
            if (bVar != null) {
                bVar.dismiss();
                this.f968q = null;
            }
        }

        @Override // androidx.appcompat.widget.z.g
        public CharSequence e() {
            return this.f970s;
        }

        @Override // androidx.appcompat.widget.z.g
        public Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.z.g
        public void i(CharSequence charSequence) {
            this.f970s = charSequence;
        }

        @Override // androidx.appcompat.widget.z.g
        public void k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.z.g
        public void l(int i7) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.z.g
        public void m(int i7) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.z.g
        public void n(int i7, int i8) {
            if (this.f969r == null) {
                return;
            }
            b.a aVar = new b.a(z.this.getPopupContext());
            CharSequence charSequence = this.f970s;
            if (charSequence != null) {
                aVar.h(charSequence);
            }
            androidx.appcompat.app.b a8 = aVar.g(this.f969r, z.this.getSelectedItemPosition(), this).a();
            this.f968q = a8;
            ListView f8 = a8.f();
            f8.setTextDirection(i7);
            f8.setTextAlignment(i8);
            this.f968q.show();
        }

        @Override // androidx.appcompat.widget.z.g
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i7) {
            z.this.setSelection(i7);
            if (z.this.getOnItemClickListener() != null) {
                z.this.performItemClick(null, i7, this.f969r.getItemId(i7));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.z.g
        public void p(ListAdapter listAdapter) {
            this.f969r = listAdapter;
        }
    }

    /* compiled from: MyApplication */
    private static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: q, reason: collision with root package name */
        private SpinnerAdapter f972q;

        /* renamed from: r, reason: collision with root package name */
        private ListAdapter f973r;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f972q = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f973r = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f973r;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f972q;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f972q;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i7, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i7) {
            SpinnerAdapter spinnerAdapter = this.f972q;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i7);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i7) {
            SpinnerAdapter spinnerAdapter = this.f972q;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i7);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i7) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            return getDropDownView(i7, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f972q;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i7) {
            ListAdapter listAdapter = this.f973r;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i7);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f972q;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f972q;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: MyApplication */
    class e extends c1 implements g {
        private CharSequence Z;

        /* renamed from: a0, reason: collision with root package name */
        ListAdapter f974a0;

        /* renamed from: b0, reason: collision with root package name */
        private final Rect f975b0;

        /* renamed from: c0, reason: collision with root package name */
        private int f976c0;

        /* compiled from: MyApplication */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ z f978q;

            a(z zVar) {
                this.f978q = zVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
                z.this.setSelection(i7);
                if (z.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    z.this.performItemClick(view, i7, eVar.f974a0.getItemId(i7));
                }
                e.this.dismiss();
            }
        }

        /* compiled from: MyApplication */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.Q(z.this)) {
                    e.this.dismiss();
                } else {
                    e.this.O();
                    e.super.h();
                }
            }
        }

        /* compiled from: MyApplication */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f981q;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f981q = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f981q);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.f975b0 = new Rect();
            z(z.this);
            F(true);
            K(0);
            H(new a(z.this));
        }

        void O() {
            int i7;
            Drawable g8 = g();
            if (g8 != null) {
                g8.getPadding(z.this.f965x);
                i7 = z1.b(z.this) ? z.this.f965x.right : -z.this.f965x.left;
            } else {
                Rect rect = z.this.f965x;
                rect.right = 0;
                rect.left = 0;
                i7 = 0;
            }
            int paddingLeft = z.this.getPaddingLeft();
            int paddingRight = z.this.getPaddingRight();
            int width = z.this.getWidth();
            z zVar = z.this;
            int i8 = zVar.f964w;
            if (i8 == -2) {
                int a8 = zVar.a((SpinnerAdapter) this.f974a0, g());
                int i9 = z.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = z.this.f965x;
                int i10 = (i9 - rect2.left) - rect2.right;
                if (a8 > i10) {
                    a8 = i10;
                }
                B(Math.max(a8, (width - paddingLeft) - paddingRight));
            } else if (i8 == -1) {
                B((width - paddingLeft) - paddingRight);
            } else {
                B(i8);
            }
            d(z1.b(z.this) ? i7 + (((width - paddingRight) - v()) - P()) : i7 + paddingLeft + P());
        }

        public int P() {
            return this.f976c0;
        }

        boolean Q(View view) {
            return androidx.core.view.e0.A(view) && view.getGlobalVisibleRect(this.f975b0);
        }

        @Override // androidx.appcompat.widget.z.g
        public CharSequence e() {
            return this.Z;
        }

        @Override // androidx.appcompat.widget.z.g
        public void i(CharSequence charSequence) {
            this.Z = charSequence;
        }

        @Override // androidx.appcompat.widget.z.g
        public void m(int i7) {
            this.f976c0 = i7;
        }

        @Override // androidx.appcompat.widget.z.g
        public void n(int i7, int i8) {
            ViewTreeObserver viewTreeObserver;
            boolean a8 = a();
            O();
            E(2);
            super.h();
            ListView j7 = j();
            j7.setChoiceMode(1);
            j7.setTextDirection(i7);
            j7.setTextAlignment(i8);
            L(z.this.getSelectedItemPosition());
            if (a8 || (viewTreeObserver = z.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            G(new c(bVar));
        }

        @Override // androidx.appcompat.widget.c1, androidx.appcompat.widget.z.g
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f974a0 = listAdapter;
        }
    }

    /* compiled from: MyApplication */
    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        boolean f983q;

        /* compiled from: MyApplication */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i7) {
                return new f[i7];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f983q ? (byte) 1 : (byte) 0);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f983q = parcel.readByte() != 0;
        }
    }

    /* compiled from: MyApplication */
    interface g {
        boolean a();

        int b();

        void d(int i7);

        void dismiss();

        CharSequence e();

        Drawable g();

        void i(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i7);

        void m(int i7);

        void n(int i7, int i8);

        int o();

        void p(ListAdapter listAdapter);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.G);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i8 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i8 = Math.max(i8, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i8;
        }
        drawable.getPadding(this.f965x);
        Rect rect = this.f965x;
        return i8 + rect.left + rect.right;
    }

    void b() {
        this.f963v.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f958q;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f963v;
        return gVar != null ? gVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f963v;
        return gVar != null ? gVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f963v != null ? this.f964w : super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.f963v;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f963v;
        return gVar != null ? gVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f959r;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f963v;
        return gVar != null ? gVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f958q;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f958q;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f963v;
        if (gVar == null || !gVar.a()) {
            return;
        }
        this.f963v.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f963v == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f983q || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f963v;
        fVar.f983q = gVar != null && gVar.a();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        x0 x0Var = this.f960s;
        if (x0Var == null || !x0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f963v;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f958q;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        androidx.appcompat.widget.e eVar = this.f958q;
        if (eVar != null) {
            eVar.g(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i7) {
        g gVar = this.f963v;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i7);
        } else {
            gVar.m(i7);
            this.f963v.d(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i7) {
        g gVar = this.f963v;
        if (gVar != null) {
            gVar.l(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i7) {
        if (this.f963v != null) {
            this.f964w = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f963v;
        if (gVar != null) {
            gVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i7) {
        setPopupBackgroundDrawable(h.a.b(getPopupContext(), i7));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f963v;
        if (gVar != null) {
            gVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f958q;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f958q;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public z(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f962u) {
            this.f961t = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f963v != null) {
            Context context = this.f959r;
            if (context == null) {
                context = getContext();
            }
            this.f963v.p(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public z(Context context, AttributeSet attributeSet, int i7, int i8) {
        this(context, attributeSet, i7, i8, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.z.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
