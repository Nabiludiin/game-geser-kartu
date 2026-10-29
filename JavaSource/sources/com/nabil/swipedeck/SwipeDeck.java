package com.nabil.swipedeck;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.FrameLayout;
import androidx.core.view.e0;
import com.nabil.R;
import java.util.ArrayList;
import v1.a;

/* compiled from: MyApplication */
public class SwipeDeck extends FrameLayout {
    public static int L = 400;
    private v1.a A;
    private d B;
    private ArrayList C;
    private int D;
    private int E;
    private int F;
    private int G;
    private View H;
    private View I;
    Context J;
    private int K;

    /* renamed from: q, reason: collision with root package name */
    private final int f4225q;

    /* renamed from: r, reason: collision with root package name */
    private int f4226r;

    /* renamed from: s, reason: collision with root package name */
    public float f4227s;

    /* renamed from: t, reason: collision with root package name */
    public float f4228t;

    /* renamed from: u, reason: collision with root package name */
    private float f4229u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4230v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4231w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f4232x;

    /* renamed from: y, reason: collision with root package name */
    private Adapter f4233y;

    /* renamed from: z, reason: collision with root package name */
    private DataSetObserver f4234z;

    /* compiled from: MyApplication */
    class a implements a.InterfaceC0137a {
        a() {
        }

        @Override // v1.a.InterfaceC0137a
        public void a(Object obj) {
            SwipeDeck.this.A.f().m(true);
            SwipeDeck.this.m();
        }

        @Override // v1.a.InterfaceC0137a
        public void b(Object obj) {
            com.nabil.swipedeck.a aVar = (com.nabil.swipedeck.a) obj;
            SwipeDeck.this.C.add(aVar);
            if (SwipeDeck.this.A.i() > 0) {
                SwipeDeck.this.A.f().m(true);
            }
            aVar.b();
            SwipeDeck.this.h();
            SwipeDeck.this.m();
        }
    }

    /* compiled from: MyApplication */
    class b extends DataSetObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Adapter f4236a;

        b(Adapter adapter) {
            this.f4236a = adapter;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            int i7 = SwipeDeck.this.A.i();
            if (i7 < SwipeDeck.this.f4226r) {
                while (i7 < SwipeDeck.this.f4226r) {
                    SwipeDeck.this.h();
                    i7++;
                }
            }
            if (this.f4236a.getCount() == 0) {
                SwipeDeck.this.A.c();
                SwipeDeck.this.K = 0;
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            SwipeDeck.this.A.c();
            SwipeDeck.this.removeAllViews();
            SwipeDeck.this.requestLayout();
        }
    }

    /* compiled from: MyApplication */
    public interface d {
        void a(long j7);

        boolean b(long j7);

        void c(long j7);
    }

    public SwipeDeck(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = new ArrayList();
        this.K = 0;
        Activity activity = (Activity) context;
        this.H = activity.findViewById(R.id.circle_menu_left);
        this.I = activity.findViewById(R.id.circle_menu_right);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, q1.a.B0, 0, 0);
        this.f4226r = obtainStyledAttributes.getInt(1, 1);
        this.f4227s = obtainStyledAttributes.getFloat(2, 0.33f);
        this.f4228t = obtainStyledAttributes.getFloat(5, 15.0f);
        this.f4229u = obtainStyledAttributes.getDimension(0, 15.0f);
        this.f4230v = obtainStyledAttributes.getBoolean(4, true);
        this.f4231w = obtainStyledAttributes.getBoolean(6, true);
        this.f4225q = obtainStyledAttributes.getResourceId(3, -1);
        this.A = new v1.a(new a());
        setClipToPadding(false);
        setClipChildren(false);
        setWillNotDraw(false);
        if (this.f4230v) {
            e0.Z(this, Float.MAX_VALUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.K < this.f4233y.getCount()) {
            View view = this.f4233y.getView(this.K, null, this);
            view.setLayerType(2, null);
            view.setAlpha(0.0f);
            view.setY(getPaddingTop());
            long itemId = this.f4233y.getItemId(this.K);
            com.nabil.swipedeck.a aVar = new com.nabil.swipedeck.a(this.J, view, this, new c(itemId));
            aVar.j(this.K);
            int i7 = this.D;
            if (i7 != 0) {
                aVar.i(i7, this.E);
            }
            int i8 = this.F;
            if (i8 != 0) {
                aVar.l(i8, this.G);
            }
            aVar.g(this.H, this.I);
            aVar.h(itemId);
            this.A.a(aVar);
            this.K++;
        }
    }

    private void k() {
        q();
        for (int i7 = 0; i7 < this.A.i(); i7++) {
            i(this.A.d(i7).d(), this.A.d(i7).f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        removeAllViews();
        for (int i7 = this.A.i() - 1; i7 >= 0; i7--) {
            View d8 = this.A.d(i7).d();
            ViewGroup.LayoutParams layoutParams = d8.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            addViewInLayout(d8, -1, layoutParams, true);
            d8.measure((getWidth() - (getPaddingLeft() + getPaddingRight())) | 1073741824, 1073741824 | (getHeight() - (getPaddingTop() + getPaddingBottom())));
        }
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                View d9 = ((com.nabil.swipedeck.a) this.C.get(size)).d();
                ViewGroup.LayoutParams layoutParams2 = d9.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                addViewInLayout(d9, -1, layoutParams2, true);
                d9.measure((getWidth() - (getPaddingLeft() + getPaddingRight())) | 1073741824, (getHeight() - (getPaddingTop() + getPaddingBottom())) | 1073741824);
            }
        }
        k();
    }

    private void q() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setTranslationZ(i7 * 10);
        }
    }

    public int getAdapterIndex() {
        return this.K;
    }

    public long getTopCardItemId() {
        if (this.A.i() > 0) {
            return this.A.f().e();
        }
        return -1L;
    }

    protected void i(View view, int i7) {
        view.animate().setDuration(L).y(getPaddingTop() + ((int) (i7 * this.f4229u))).alpha(1.0f);
    }

    public void j() {
        this.A.c();
        this.K = 0;
    }

    public void l(com.nabil.swipedeck.a aVar) {
        this.C.remove(aVar);
    }

    public void n(View view, View view2) {
        this.H = view;
        this.I = view2;
    }

    public void o(int i7, int i8) {
        this.D = i7;
        this.E = i8;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() || this.f4225q == -1) {
            return;
        }
        for (int i7 = this.f4226r - 1; i7 >= 0; i7--) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f4225q, (ViewGroup) this, false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
            int i8 = (int) (i7 * this.f4229u);
            layoutParams.gravity = 0;
            layoutParams.topMargin = i8;
            inflate.setLayoutParams(layoutParams);
            addViewInLayout(inflate, -1, layoutParams, true);
        }
        q();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        if (isInEditMode()) {
            return;
        }
        Adapter adapter = this.f4233y;
        if (adapter == null || adapter.getCount() == 0) {
            removeAllViewsInLayout();
            return;
        }
        for (int i11 = this.A.i(); i11 < this.f4226r; i11++) {
            h();
        }
    }

    public void p(int i7, int i8) {
        this.F = i7;
        this.G = i8;
    }

    public void setAdapter(Adapter adapter) {
        Adapter adapter2 = this.f4233y;
        if (adapter2 != null) {
            adapter2.unregisterDataSetObserver(this.f4234z);
        }
        this.f4232x = adapter.hasStableIds();
        this.f4233y = adapter;
        b bVar = new b(adapter);
        this.f4234z = bVar;
        adapter.registerDataSetObserver(bVar);
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setAdapterIndex(int i7) {
        this.K = i7;
    }

    public void setCallback(d dVar) {
        this.B = dVar;
    }

    public void setContext(Context context) {
        this.J = context;
    }

    /* compiled from: MyApplication */
    private class c implements v1.b {

        /* renamed from: a, reason: collision with root package name */
        private final long f4238a;

        public c(long j7) {
            this.f4238a = j7;
        }

        @Override // v1.b
        public void b(View view) {
            Log.d("SwipeDeck", "card swiped left");
            if (SwipeDeck.this.A.f().d() != view) {
                Log.e("SWIPE ERROR: ", "card on top of deck not equal to card swiped");
            }
            SwipeDeck.this.A.h();
            if (SwipeDeck.this.B != null) {
                SwipeDeck.this.B.a(this.f4238a);
            }
        }

        @Override // v1.b
        public boolean c() {
            if (SwipeDeck.this.B != null) {
                return SwipeDeck.this.B.b(this.f4238a);
            }
            return true;
        }

        @Override // v1.b
        public void f(View view) {
            Log.d("SwipeDeck", "card swiped right");
            if (SwipeDeck.this.A.f().d() != view) {
                Log.e("SWIPE ERROR: ", "card on top of deck not equal to card swiped");
            }
            SwipeDeck.this.A.h();
            if (SwipeDeck.this.B != null) {
                SwipeDeck.this.B.c(this.f4238a);
            }
        }

        @Override // v1.b
        public void d() {
        }

        @Override // v1.b
        public void e() {
        }

        @Override // v1.b
        public void a(View view) {
        }
    }
}
