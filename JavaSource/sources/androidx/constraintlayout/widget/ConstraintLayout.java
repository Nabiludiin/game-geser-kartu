package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import v.d;
import v.e;
import v.j;
import w.b;

/* compiled from: MyApplication */
public class ConstraintLayout extends ViewGroup {
    private static i N;
    protected d A;
    private int B;
    private HashMap C;
    private int D;
    private int E;
    int F;
    int G;
    int H;
    int I;
    private SparseArray J;
    c K;
    private int L;
    private int M;

    /* renamed from: q, reason: collision with root package name */
    SparseArray f1108q;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList f1109r;

    /* renamed from: s, reason: collision with root package name */
    protected v.f f1110s;

    /* renamed from: t, reason: collision with root package name */
    private int f1111t;

    /* renamed from: u, reason: collision with root package name */
    private int f1112u;

    /* renamed from: v, reason: collision with root package name */
    private int f1113v;

    /* renamed from: w, reason: collision with root package name */
    private int f1114w;

    /* renamed from: x, reason: collision with root package name */
    protected boolean f1115x;

    /* renamed from: y, reason: collision with root package name */
    private int f1116y;

    /* renamed from: z, reason: collision with root package name */
    private e f1117z;

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1118a;

        static {
            int[] iArr = new int[e.b.values().length];
            f1118a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1118a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1118a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1118a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: MyApplication */
    class c implements b.InterfaceC0139b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f1169a;

        /* renamed from: b, reason: collision with root package name */
        int f1170b;

        /* renamed from: c, reason: collision with root package name */
        int f1171c;

        /* renamed from: d, reason: collision with root package name */
        int f1172d;

        /* renamed from: e, reason: collision with root package name */
        int f1173e;

        /* renamed from: f, reason: collision with root package name */
        int f1174f;

        /* renamed from: g, reason: collision with root package name */
        int f1175g;

        public c(ConstraintLayout constraintLayout) {
            this.f1169a = constraintLayout;
        }

        private boolean d(int i7, int i8, int i9) {
            if (i7 == i8) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i7);
            View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i9 == size;
            }
            return false;
        }

        @Override // w.b.InterfaceC0139b
        public final void a() {
            int childCount = this.f1169a.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.f1169a.getChildAt(i7);
            }
            int size = this.f1169a.f1109r.size();
            if (size > 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    ((androidx.constraintlayout.widget.c) this.f1169a.f1109r.get(i8)).j(this.f1169a);
                }
            }
        }

        @Override // w.b.InterfaceC0139b
        public final void b(v.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int max2;
            int i7;
            if (eVar == null) {
                return;
            }
            if (eVar.T() == 8 && !eVar.h0()) {
                aVar.f26928e = 0;
                aVar.f26929f = 0;
                aVar.f26930g = 0;
                return;
            }
            if (eVar.I() == null) {
                return;
            }
            e.b bVar = aVar.f26924a;
            e.b bVar2 = aVar.f26925b;
            int i8 = aVar.f26926c;
            int i9 = aVar.f26927d;
            int i10 = this.f1170b + this.f1171c;
            int i11 = this.f1172d;
            View view = (View) eVar.q();
            int[] iArr = a.f1118a;
            int i12 = iArr[bVar.ordinal()];
            if (i12 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else if (i12 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1174f, i11, -2);
            } else if (i12 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1174f, i11 + eVar.z(), -1);
            } else if (i12 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1174f, i11, -2);
                boolean z7 = eVar.f26665w == 1;
                int i13 = aVar.f26933j;
                if (i13 == b.a.f26922l || i13 == b.a.f26923m) {
                    boolean z8 = view.getMeasuredHeight() == eVar.v();
                    if (aVar.f26933j == b.a.f26923m || !z7 || ((z7 && z8) || eVar.l0())) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.U(), 1073741824);
                    }
                }
            }
            int i14 = iArr[bVar2.ordinal()];
            if (i14 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            } else if (i14 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1175g, i10, -2);
            } else if (i14 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1175g, i10 + eVar.S(), -1);
            } else if (i14 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1175g, i10, -2);
                boolean z9 = eVar.f26667x == 1;
                int i15 = aVar.f26933j;
                if (i15 == b.a.f26922l || i15 == b.a.f26923m) {
                    boolean z10 = view.getMeasuredWidth() == eVar.U();
                    if (aVar.f26933j == b.a.f26923m || !z9 || ((z9 && z10) || eVar.m0())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                    }
                }
            }
            v.f fVar = (v.f) eVar.I();
            if (fVar != null && j.b(ConstraintLayout.this.f1116y, 256) && view.getMeasuredWidth() == eVar.U() && view.getMeasuredWidth() < fVar.U() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.k0() && d(eVar.A(), makeMeasureSpec, eVar.U()) && d(eVar.B(), makeMeasureSpec2, eVar.v())) {
                aVar.f26928e = eVar.U();
                aVar.f26929f = eVar.v();
                aVar.f26930g = eVar.n();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z11 = bVar == bVar3;
            boolean z12 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z13 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z14 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z15 = z11 && eVar.f26628d0 > 0.0f;
            boolean z16 = z12 && eVar.f26628d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i16 = aVar.f26933j;
            if (i16 != b.a.f26922l && i16 != b.a.f26923m && z11 && eVar.f26665w == 0 && z12 && eVar.f26667x == 0) {
                i7 = -1;
                max2 = 0;
                baseline = 0;
                max = 0;
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                eVar.R0(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i17 = eVar.f26671z;
                max = i17 > 0 ? Math.max(i17, measuredWidth) : measuredWidth;
                int i18 = eVar.A;
                if (i18 > 0) {
                    max = Math.min(i18, max);
                }
                int i19 = eVar.C;
                max2 = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
                boolean z17 = z14;
                int i20 = eVar.D;
                if (i20 > 0) {
                    max2 = Math.min(i20, max2);
                }
                if (!j.b(ConstraintLayout.this.f1116y, 1)) {
                    if (z15 && z13) {
                        max = (int) ((max2 * eVar.f26628d0) + 0.5f);
                    } else if (z16 && z17) {
                        max2 = (int) ((max / eVar.f26628d0) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != max2) {
                    if (measuredWidth != max) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                    }
                    if (measuredHeight != max2) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    eVar.R0(makeMeasureSpec, makeMeasureSpec2);
                    max = view.getMeasuredWidth();
                    max2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i7 = -1;
            }
            boolean z18 = baseline != i7;
            aVar.f26932i = (max == aVar.f26926c && max2 == aVar.f26927d) ? false : true;
            if (bVar5.f1132g0) {
                z18 = true;
            }
            if (z18 && baseline != -1 && eVar.n() != baseline) {
                aVar.f26932i = true;
            }
            aVar.f26928e = max;
            aVar.f26929f = max2;
            aVar.f26931h = z18;
            aVar.f26930g = baseline;
        }

        public void c(int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f1170b = i9;
            this.f1171c = i10;
            this.f1172d = i11;
            this.f1173e = i12;
            this.f1174f = i7;
            this.f1175g = i8;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1108q = new SparseArray();
        this.f1109r = new ArrayList(4);
        this.f1110s = new v.f();
        this.f1111t = 0;
        this.f1112u = 0;
        this.f1113v = Integer.MAX_VALUE;
        this.f1114w = Integer.MAX_VALUE;
        this.f1115x = true;
        this.f1116y = 257;
        this.f1117z = null;
        this.A = null;
        this.B = -1;
        this.C = new HashMap();
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = 0;
        this.I = 0;
        this.J = new SparseArray();
        this.K = new c(this);
        this.L = 0;
        this.M = 0;
        p(attributeSet, 0, 0);
    }

    private final v.e g(int i7) {
        if (i7 == 0) {
            return this.f1110s;
        }
        View view = (View) this.f1108q.get(i7);
        if (view == null && (view = findViewById(i7)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1110s;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f1162v0;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static i getSharedValues() {
        if (N == null) {
            N = new i();
        }
        return N;
    }

    private void p(AttributeSet attributeSet, int i7, int i8) {
        this.f1110s.y0(this);
        this.f1110s.Q1(this.K);
        this.f1108q.put(getId(), this);
        this.f1117z = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f1442n1, i7, i8);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = obtainStyledAttributes.getIndex(i9);
                if (index == h.f1474r1) {
                    this.f1111t = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1111t);
                } else if (index == h.f1482s1) {
                    this.f1112u = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1112u);
                } else if (index == h.f1458p1) {
                    this.f1113v = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1113v);
                } else if (index == h.f1466q1) {
                    this.f1114w = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1114w);
                } else if (index == h.F2) {
                    this.f1116y = obtainStyledAttributes.getInt(index, this.f1116y);
                } else if (index == h.A1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            s(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.A = null;
                        }
                    }
                } else if (index == h.f1514w1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f1117z = eVar;
                        eVar.h(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1117z = null;
                    }
                    this.B = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1110s.R1(this.f1116y);
    }

    private void r() {
        this.f1115x = true;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.H = 0;
        this.I = 0;
    }

    private void v() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            v.e i8 = i(getChildAt(i7));
            if (i8 != null) {
                i8.r0();
            }
        }
        if (isInEditMode) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    w(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.B != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).getId();
            }
        }
        e eVar = this.f1117z;
        if (eVar != null) {
            eVar.c(this, true);
        }
        this.f1110s.q1();
        int size = this.f1109r.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((androidx.constraintlayout.widget.c) this.f1109r.get(i11)).l(this);
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12);
        }
        this.J.clear();
        this.J.put(0, this.f1110s);
        this.J.put(getId(), this.f1110s);
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            this.J.put(childAt2.getId(), i(childAt2));
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            v.e i15 = i(childAt3);
            if (i15 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f1110s.b(i15);
                c(isInEditMode, childAt3, i15, bVar, this.J);
            }
        }
    }

    private void y(v.e eVar, b bVar, SparseArray sparseArray, int i7, d.b bVar2) {
        View view = (View) this.f1108q.get(i7);
        v.e eVar2 = (v.e) sparseArray.get(i7);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f1132g0 = true;
        d.b bVar3 = d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f1132g0 = true;
            bVar4.f1162v0.H0(true);
        }
        eVar.m(bVar3).a(eVar2.m(bVar2), bVar.D, bVar.C, true);
        eVar.H0(true);
        eVar.m(d.b.TOP).p();
        eVar.m(d.b.BOTTOM).p();
    }

    private boolean z() {
        int childCount = getChildCount();
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            if (getChildAt(i7).isLayoutRequested()) {
                z7 = true;
                break;
            }
            i7++;
        }
        if (z7) {
            v();
        }
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void c(boolean r15, android.view.View r16, v.e r17, androidx.constraintlayout.widget.ConstraintLayout.b r18, android.util.SparseArray r19) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, v.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1109r;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((androidx.constraintlayout.widget.c) this.f1109r.get(i7)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i9 = (int) ((parseInt / 1080.0f) * width);
                        int i10 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f8 = i9;
                        float f9 = i10;
                        float f10 = i9 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f8, f9, f10, f9, paint);
                        float parseInt4 = i10 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f10, f9, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f8, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f8, f9, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f8, f9, f10, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f10, f9, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i7, Object obj) {
        if (i7 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.C;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.C.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        r();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f1114w;
    }

    public int getMaxWidth() {
        return this.f1113v;
    }

    public int getMinHeight() {
        return this.f1112u;
    }

    public int getMinWidth() {
        return this.f1111t;
    }

    public int getOptimizationLevel() {
        return this.f1110s.F1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f1110s.f26649o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f1110s.f26649o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f1110s.f26649o = "parent";
            }
        }
        if (this.f1110s.r() == null) {
            v.f fVar = this.f1110s;
            fVar.z0(fVar.f26649o);
            Log.v("ConstraintLayout", " setDebugName " + this.f1110s.r());
        }
        ArrayList n12 = this.f1110s.n1();
        int size = n12.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = n12.get(i7);
            i7++;
            v.e eVar = (v.e) obj;
            View view = (View) eVar.q();
            if (view != null) {
                if (eVar.f26649o == null && (id = view.getId()) != -1) {
                    eVar.f26649o = getContext().getResources().getResourceEntryName(id);
                }
                if (eVar.r() == null) {
                    eVar.z0(eVar.f26649o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar.r());
                }
            }
        }
        this.f1110s.M(sb);
        return sb.toString();
    }

    public View h(int i7) {
        return (View) this.f1108q.get(i7);
    }

    public final v.e i(View view) {
        if (view == this) {
            return this.f1110s;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1162v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1162v0;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            b bVar = (b) childAt.getLayoutParams();
            v.e eVar = bVar.f1162v0;
            if ((childAt.getVisibility() != 8 || bVar.f1134h0 || bVar.f1136i0 || bVar.f1140k0 || isInEditMode) && !bVar.f1138j0) {
                int V = eVar.V();
                int W = eVar.W();
                childAt.layout(V, W, eVar.U() + V, eVar.v() + W);
            }
        }
        int size = this.f1109r.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((androidx.constraintlayout.widget.c) this.f1109r.get(i12)).i(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        if (this.L == i7) {
            int i9 = this.M;
        }
        if (!this.f1115x) {
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                if (getChildAt(i10).isLayoutRequested()) {
                    this.f1115x = true;
                    break;
                }
                i10++;
            }
        }
        this.L = i7;
        this.M = i8;
        this.f1110s.T1(q());
        if (this.f1115x) {
            this.f1115x = false;
            if (z()) {
                this.f1110s.V1();
            }
        }
        u(this.f1110s, this.f1116y, i7, i8);
        t(i7, i8, this.f1110s.U(), this.f1110s.v(), this.f1110s.L1(), this.f1110s.J1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        v.e i7 = i(view);
        if ((view instanceof Guideline) && !(i7 instanceof v.g)) {
            b bVar = (b) view.getLayoutParams();
            v.g gVar = new v.g();
            bVar.f1162v0 = gVar;
            bVar.f1134h0 = true;
            gVar.w1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.m();
            ((b) view.getLayoutParams()).f1136i0 = true;
            if (!this.f1109r.contains(cVar)) {
                this.f1109r.add(cVar);
            }
        }
        this.f1108q.put(view.getId(), view);
        this.f1115x = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1108q.remove(view.getId());
        this.f1110s.p1(i(view));
        this.f1109r.remove(view);
        this.f1115x = true;
    }

    protected boolean q() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        r();
        super.requestLayout();
    }

    protected void s(int i7) {
        this.A = new d(getContext(), this, i7);
    }

    public void setConstraintSet(e eVar) {
        this.f1117z = eVar;
    }

    @Override // android.view.View
    public void setId(int i7) {
        this.f1108q.remove(getId());
        super.setId(i7);
        this.f1108q.put(getId(), this);
    }

    public void setMaxHeight(int i7) {
        if (i7 == this.f1114w) {
            return;
        }
        this.f1114w = i7;
        requestLayout();
    }

    public void setMaxWidth(int i7) {
        if (i7 == this.f1113v) {
            return;
        }
        this.f1113v = i7;
        requestLayout();
    }

    public void setMinHeight(int i7) {
        if (i7 == this.f1112u) {
            return;
        }
        this.f1112u = i7;
        requestLayout();
    }

    public void setMinWidth(int i7) {
        if (i7 == this.f1111t) {
            return;
        }
        this.f1111t = i7;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        d dVar = this.A;
        if (dVar != null) {
            dVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i7) {
        this.f1116y = i7;
        this.f1110s.R1(i7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void t(int i7, int i8, int i9, int i10, boolean z7, boolean z8) {
        c cVar = this.K;
        int i11 = cVar.f1173e;
        int resolveSizeAndState = View.resolveSizeAndState(i9 + cVar.f1172d, i7, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i10 + i11, i8, 0) & 16777215;
        int min = Math.min(this.f1113v, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1114w, resolveSizeAndState2);
        if (z7) {
            min |= 16777216;
        }
        if (z8) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.D = min;
        this.E = min2;
    }

    protected void u(v.f fVar, int i7, int i8, int i9) {
        int i10;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i11 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.K.c(i8, i9, max, max2, paddingWidth, i11);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (q()) {
            i10 = max4;
            int i12 = size - paddingWidth;
            int i13 = size2 - i11;
            x(fVar, mode, i12, mode2, i13);
            fVar.M1(i7, mode, i12, mode2, i13, this.D, this.E, i10, max);
        }
        i10 = max3;
        int i122 = size - paddingWidth;
        int i132 = size2 - i11;
        x(fVar, mode, i122, mode2, i132);
        fVar.M1(i7, mode, i122, mode2, i132, this.D, this.E, i10, max);
    }

    public void w(int i7, Object obj, Object obj2) {
        if (i7 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.C == null) {
                this.C = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.C.put(str, (Integer) obj2);
        }
    }

    protected void x(v.f fVar, int i7, int i8, int i9, int i10) {
        e.b bVar;
        c cVar = this.K;
        int i11 = cVar.f1173e;
        int i12 = cVar.f1172d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i7 == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i8 = Math.max(0, this.f1111t);
            }
        } else if (i7 == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i8 = Math.max(0, this.f1111t);
            }
            i8 = 0;
        } else if (i7 != 1073741824) {
            bVar = bVar2;
            i8 = 0;
        } else {
            i8 = Math.min(this.f1113v - i12, i8);
            bVar = bVar2;
        }
        if (i9 == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i10 = Math.max(0, this.f1112u);
            }
        } else if (i9 != 0) {
            if (i9 == 1073741824) {
                i10 = Math.min(this.f1114w - i11, i10);
            }
            i10 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i10 = Math.max(0, this.f1112u);
            }
            i10 = 0;
        }
        if (i8 != fVar.U() || i10 != fVar.v()) {
            fVar.I1();
        }
        fVar.i1(0);
        fVar.j1(0);
        fVar.T0(this.f1113v - i12);
        fVar.S0(this.f1114w - i11);
        fVar.W0(0);
        fVar.V0(0);
        fVar.M0(bVar);
        fVar.g1(i8);
        fVar.c1(bVar2);
        fVar.I0(i10);
        fVar.W0(this.f1111t - i12);
        fVar.V0(this.f1112u - i11);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    /* compiled from: MyApplication */
    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* renamed from: a, reason: collision with root package name */
        public int f1119a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f1120a0;

        /* renamed from: b, reason: collision with root package name */
        public int f1121b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f1122b0;

        /* renamed from: c, reason: collision with root package name */
        public float f1123c;

        /* renamed from: c0, reason: collision with root package name */
        public String f1124c0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1125d;

        /* renamed from: d0, reason: collision with root package name */
        public int f1126d0;

        /* renamed from: e, reason: collision with root package name */
        public int f1127e;

        /* renamed from: e0, reason: collision with root package name */
        boolean f1128e0;

        /* renamed from: f, reason: collision with root package name */
        public int f1129f;

        /* renamed from: f0, reason: collision with root package name */
        boolean f1130f0;

        /* renamed from: g, reason: collision with root package name */
        public int f1131g;

        /* renamed from: g0, reason: collision with root package name */
        boolean f1132g0;

        /* renamed from: h, reason: collision with root package name */
        public int f1133h;

        /* renamed from: h0, reason: collision with root package name */
        boolean f1134h0;

        /* renamed from: i, reason: collision with root package name */
        public int f1135i;

        /* renamed from: i0, reason: collision with root package name */
        boolean f1136i0;

        /* renamed from: j, reason: collision with root package name */
        public int f1137j;

        /* renamed from: j0, reason: collision with root package name */
        boolean f1138j0;

        /* renamed from: k, reason: collision with root package name */
        public int f1139k;

        /* renamed from: k0, reason: collision with root package name */
        boolean f1140k0;

        /* renamed from: l, reason: collision with root package name */
        public int f1141l;

        /* renamed from: l0, reason: collision with root package name */
        int f1142l0;

        /* renamed from: m, reason: collision with root package name */
        public int f1143m;

        /* renamed from: m0, reason: collision with root package name */
        int f1144m0;

        /* renamed from: n, reason: collision with root package name */
        public int f1145n;

        /* renamed from: n0, reason: collision with root package name */
        int f1146n0;

        /* renamed from: o, reason: collision with root package name */
        public int f1147o;

        /* renamed from: o0, reason: collision with root package name */
        int f1148o0;

        /* renamed from: p, reason: collision with root package name */
        public int f1149p;

        /* renamed from: p0, reason: collision with root package name */
        int f1150p0;

        /* renamed from: q, reason: collision with root package name */
        public int f1151q;

        /* renamed from: q0, reason: collision with root package name */
        int f1152q0;

        /* renamed from: r, reason: collision with root package name */
        public float f1153r;

        /* renamed from: r0, reason: collision with root package name */
        float f1154r0;

        /* renamed from: s, reason: collision with root package name */
        public int f1155s;

        /* renamed from: s0, reason: collision with root package name */
        int f1156s0;

        /* renamed from: t, reason: collision with root package name */
        public int f1157t;

        /* renamed from: t0, reason: collision with root package name */
        int f1158t0;

        /* renamed from: u, reason: collision with root package name */
        public int f1159u;

        /* renamed from: u0, reason: collision with root package name */
        float f1160u0;

        /* renamed from: v, reason: collision with root package name */
        public int f1161v;

        /* renamed from: v0, reason: collision with root package name */
        v.e f1162v0;

        /* renamed from: w, reason: collision with root package name */
        public int f1163w;

        /* renamed from: w0, reason: collision with root package name */
        public boolean f1164w0;

        /* renamed from: x, reason: collision with root package name */
        public int f1165x;

        /* renamed from: y, reason: collision with root package name */
        public int f1166y;

        /* renamed from: z, reason: collision with root package name */
        public int f1167z;

        /* compiled from: MyApplication */
        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1168a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1168a = sparseIntArray;
                sparseIntArray.append(h.f1467q2, 64);
                sparseIntArray.append(h.T1, 65);
                sparseIntArray.append(h.f1349c2, 8);
                sparseIntArray.append(h.f1358d2, 9);
                sparseIntArray.append(h.f1376f2, 10);
                sparseIntArray.append(h.f1385g2, 11);
                sparseIntArray.append(h.f1435m2, 12);
                sparseIntArray.append(h.f1427l2, 13);
                sparseIntArray.append(h.J1, 14);
                sparseIntArray.append(h.I1, 15);
                sparseIntArray.append(h.E1, 16);
                sparseIntArray.append(h.G1, 52);
                sparseIntArray.append(h.F1, 53);
                sparseIntArray.append(h.K1, 2);
                sparseIntArray.append(h.M1, 3);
                sparseIntArray.append(h.L1, 4);
                sparseIntArray.append(h.f1507v2, 49);
                sparseIntArray.append(h.f1515w2, 50);
                sparseIntArray.append(h.Q1, 5);
                sparseIntArray.append(h.R1, 6);
                sparseIntArray.append(h.S1, 7);
                sparseIntArray.append(h.f1538z1, 67);
                sparseIntArray.append(h.f1450o1, 1);
                sparseIntArray.append(h.f1394h2, 17);
                sparseIntArray.append(h.f1403i2, 18);
                sparseIntArray.append(h.P1, 19);
                sparseIntArray.append(h.O1, 20);
                sparseIntArray.append(h.A2, 21);
                sparseIntArray.append(h.D2, 22);
                sparseIntArray.append(h.B2, 23);
                sparseIntArray.append(h.f1531y2, 24);
                sparseIntArray.append(h.C2, 25);
                sparseIntArray.append(h.f1539z2, 26);
                sparseIntArray.append(h.f1523x2, 55);
                sparseIntArray.append(h.E2, 54);
                sparseIntArray.append(h.Y1, 29);
                sparseIntArray.append(h.f1443n2, 30);
                sparseIntArray.append(h.N1, 44);
                sparseIntArray.append(h.f1331a2, 45);
                sparseIntArray.append(h.f1459p2, 46);
                sparseIntArray.append(h.Z1, 47);
                sparseIntArray.append(h.f1451o2, 48);
                sparseIntArray.append(h.C1, 27);
                sparseIntArray.append(h.B1, 28);
                sparseIntArray.append(h.f1475r2, 31);
                sparseIntArray.append(h.U1, 32);
                sparseIntArray.append(h.f1491t2, 33);
                sparseIntArray.append(h.f1483s2, 34);
                sparseIntArray.append(h.f1499u2, 35);
                sparseIntArray.append(h.W1, 36);
                sparseIntArray.append(h.V1, 37);
                sparseIntArray.append(h.X1, 38);
                sparseIntArray.append(h.f1340b2, 39);
                sparseIntArray.append(h.f1419k2, 40);
                sparseIntArray.append(h.f1367e2, 41);
                sparseIntArray.append(h.H1, 42);
                sparseIntArray.append(h.D1, 43);
                sparseIntArray.append(h.f1411j2, 51);
                sparseIntArray.append(h.G2, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1119a = -1;
            this.f1121b = -1;
            this.f1123c = -1.0f;
            this.f1125d = true;
            this.f1127e = -1;
            this.f1129f = -1;
            this.f1131g = -1;
            this.f1133h = -1;
            this.f1135i = -1;
            this.f1137j = -1;
            this.f1139k = -1;
            this.f1141l = -1;
            this.f1143m = -1;
            this.f1145n = -1;
            this.f1147o = -1;
            this.f1149p = -1;
            this.f1151q = 0;
            this.f1153r = 0.0f;
            this.f1155s = -1;
            this.f1157t = -1;
            this.f1159u = -1;
            this.f1161v = -1;
            this.f1163w = Integer.MIN_VALUE;
            this.f1165x = Integer.MIN_VALUE;
            this.f1166y = Integer.MIN_VALUE;
            this.f1167z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1120a0 = false;
            this.f1122b0 = false;
            this.f1124c0 = null;
            this.f1126d0 = 0;
            this.f1128e0 = true;
            this.f1130f0 = true;
            this.f1132g0 = false;
            this.f1134h0 = false;
            this.f1136i0 = false;
            this.f1138j0 = false;
            this.f1140k0 = false;
            this.f1142l0 = -1;
            this.f1144m0 = -1;
            this.f1146n0 = -1;
            this.f1148o0 = -1;
            this.f1150p0 = Integer.MIN_VALUE;
            this.f1152q0 = Integer.MIN_VALUE;
            this.f1154r0 = 0.5f;
            this.f1162v0 = new v.e();
            this.f1164w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f1442n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                int i8 = a.f1168a.get(index);
                switch (i8) {
                    case 1:
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1149p);
                        this.f1149p = resourceId;
                        if (resourceId == -1) {
                            this.f1149p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f1151q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1151q);
                        break;
                    case 4:
                        float f8 = obtainStyledAttributes.getFloat(index, this.f1153r) % 360.0f;
                        this.f1153r = f8;
                        if (f8 < 0.0f) {
                            this.f1153r = (360.0f - f8) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f1119a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1119a);
                        break;
                    case 6:
                        this.f1121b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1121b);
                        break;
                    case 7:
                        this.f1123c = obtainStyledAttributes.getFloat(index, this.f1123c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1127e);
                        this.f1127e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1127e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1129f);
                        this.f1129f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1129f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1131g);
                        this.f1131g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1131g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1133h);
                        this.f1133h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1133h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1135i);
                        this.f1135i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1135i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1137j);
                        this.f1137j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1137j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1139k);
                        this.f1139k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1139k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1141l);
                        this.f1141l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1141l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1143m);
                        this.f1143m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1143m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1155s);
                        this.f1155s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1155s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1157t);
                        this.f1157t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1157t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1159u);
                        this.f1159u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1159u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1161v);
                        this.f1161v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1161v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f1163w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1163w);
                        break;
                    case 22:
                        this.f1165x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1165x);
                        break;
                    case 23:
                        this.f1166y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1166y);
                        break;
                    case 24:
                        this.f1167z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1167z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f1120a0 = obtainStyledAttributes.getBoolean(index, this.f1120a0);
                        break;
                    case 28:
                        this.f1122b0 = obtainStyledAttributes.getBoolean(index, this.f1122b0);
                        break;
                    case 29:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i9 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i9;
                        if (i9 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i10 = obtainStyledAttributes.getInt(index, 0);
                        this.Q = i10;
                        if (i10 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case h.f1530y1 /* 36 */:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case h.f1478r5 /* 38 */:
                        this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i8) {
                            case h.f1526x5 /* 44 */:
                                e.m(this, obtainStyledAttributes.getString(index));
                                break;
                            case h.f1534y5 /* 45 */:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case h.f1542z5 /* 46 */:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case h.A5 /* 47 */:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case h.B5 /* 48 */:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case h.C5 /* 49 */:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case h.D5 /* 50 */:
                                this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case h.E5 /* 51 */:
                                this.f1124c0 = obtainStyledAttributes.getString(index);
                                break;
                            case h.F5 /* 52 */:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1145n);
                                this.f1145n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1145n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case h.G5 /* 53 */:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1147o);
                                this.f1147o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1147o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i8) {
                                    case 64:
                                        e.k(this, obtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        e.k(this, obtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f1126d0 = obtainStyledAttributes.getInt(index, this.f1126d0);
                                        break;
                                    case 67:
                                        this.f1125d = obtainStyledAttributes.getBoolean(index, this.f1125d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f1134h0 = false;
            this.f1128e0 = true;
            this.f1130f0 = true;
            int i7 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i7 == -2 && this.f1120a0) {
                this.f1128e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i8 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i8 == -2 && this.f1122b0) {
                this.f1130f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i7 == 0 || i7 == -1) {
                this.f1128e0 = false;
                if (i7 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1120a0 = true;
                }
            }
            if (i8 == 0 || i8 == -1) {
                this.f1130f0 = false;
                if (i8 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1122b0 = true;
                }
            }
            if (this.f1123c == -1.0f && this.f1119a == -1 && this.f1121b == -1) {
                return;
            }
            this.f1134h0 = true;
            this.f1128e0 = true;
            this.f1130f0 = true;
            if (!(this.f1162v0 instanceof v.g)) {
                this.f1162v0 = new v.g();
            }
            ((v.g) this.f1162v0).w1(this.Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i7, int i8) {
            super(i7, i8);
            this.f1119a = -1;
            this.f1121b = -1;
            this.f1123c = -1.0f;
            this.f1125d = true;
            this.f1127e = -1;
            this.f1129f = -1;
            this.f1131g = -1;
            this.f1133h = -1;
            this.f1135i = -1;
            this.f1137j = -1;
            this.f1139k = -1;
            this.f1141l = -1;
            this.f1143m = -1;
            this.f1145n = -1;
            this.f1147o = -1;
            this.f1149p = -1;
            this.f1151q = 0;
            this.f1153r = 0.0f;
            this.f1155s = -1;
            this.f1157t = -1;
            this.f1159u = -1;
            this.f1161v = -1;
            this.f1163w = Integer.MIN_VALUE;
            this.f1165x = Integer.MIN_VALUE;
            this.f1166y = Integer.MIN_VALUE;
            this.f1167z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1120a0 = false;
            this.f1122b0 = false;
            this.f1124c0 = null;
            this.f1126d0 = 0;
            this.f1128e0 = true;
            this.f1130f0 = true;
            this.f1132g0 = false;
            this.f1134h0 = false;
            this.f1136i0 = false;
            this.f1138j0 = false;
            this.f1140k0 = false;
            this.f1142l0 = -1;
            this.f1144m0 = -1;
            this.f1146n0 = -1;
            this.f1148o0 = -1;
            this.f1150p0 = Integer.MIN_VALUE;
            this.f1152q0 = Integer.MIN_VALUE;
            this.f1154r0 = 0.5f;
            this.f1162v0 = new v.e();
            this.f1164w0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1119a = -1;
            this.f1121b = -1;
            this.f1123c = -1.0f;
            this.f1125d = true;
            this.f1127e = -1;
            this.f1129f = -1;
            this.f1131g = -1;
            this.f1133h = -1;
            this.f1135i = -1;
            this.f1137j = -1;
            this.f1139k = -1;
            this.f1141l = -1;
            this.f1143m = -1;
            this.f1145n = -1;
            this.f1147o = -1;
            this.f1149p = -1;
            this.f1151q = 0;
            this.f1153r = 0.0f;
            this.f1155s = -1;
            this.f1157t = -1;
            this.f1159u = -1;
            this.f1161v = -1;
            this.f1163w = Integer.MIN_VALUE;
            this.f1165x = Integer.MIN_VALUE;
            this.f1166y = Integer.MIN_VALUE;
            this.f1167z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1120a0 = false;
            this.f1122b0 = false;
            this.f1124c0 = null;
            this.f1126d0 = 0;
            this.f1128e0 = true;
            this.f1130f0 = true;
            this.f1132g0 = false;
            this.f1134h0 = false;
            this.f1136i0 = false;
            this.f1138j0 = false;
            this.f1140k0 = false;
            this.f1142l0 = -1;
            this.f1144m0 = -1;
            this.f1146n0 = -1;
            this.f1148o0 = -1;
            this.f1150p0 = Integer.MIN_VALUE;
            this.f1152q0 = Integer.MIN_VALUE;
            this.f1154r0 = 0.5f;
            this.f1162v0 = new v.e();
            this.f1164w0 = false;
        }
    }
}
