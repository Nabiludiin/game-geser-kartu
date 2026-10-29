package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: MyApplication */
public class GridLayoutManager extends LinearLayoutManager {
    b A;
    final Rect B;

    /* renamed from: w, reason: collision with root package name */
    boolean f2594w;

    /* renamed from: x, reason: collision with root package name */
    int f2595x;

    /* renamed from: y, reason: collision with root package name */
    final SparseIntArray f2596y;

    /* renamed from: z, reason: collision with root package name */
    final SparseIntArray f2597z;

    /* compiled from: MyApplication */
    public static final class a extends b {
    }

    /* compiled from: MyApplication */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f2598a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f2599b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f2600c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2601d = false;

        public void a() {
            this.f2598a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f2594w = false;
        this.f2595x = -1;
        this.f2596y = new SparseIntArray();
        this.f2597z = new SparseIntArray();
        this.A = new a();
        this.B = new Rect();
        m(androidx.recyclerview.widget.b.f(context, attributeSet, i7, i8).f2689b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void l(boolean z7) {
        if (z7) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.l(false);
    }

    public void m(int i7) {
        if (i7 == this.f2595x) {
            return;
        }
        this.f2594w = true;
        if (i7 >= 1) {
            this.f2595x = i7;
            this.A.a();
            h();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i7);
        }
    }
}
