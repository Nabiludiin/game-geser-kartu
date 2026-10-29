package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* compiled from: MyApplication */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    private TypedValue f574q;

    /* renamed from: r, reason: collision with root package name */
    private TypedValue f575r;

    /* renamed from: s, reason: collision with root package name */
    private TypedValue f576s;

    /* renamed from: t, reason: collision with root package name */
    private TypedValue f577t;

    /* renamed from: u, reason: collision with root package name */
    private TypedValue f578u;

    /* renamed from: v, reason: collision with root package name */
    private TypedValue f579v;

    /* renamed from: w, reason: collision with root package name */
    private final Rect f580w;

    /* renamed from: x, reason: collision with root package name */
    private a f581x;

    /* compiled from: MyApplication */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i7, int i8, int i9, int i10) {
        this.f580w.set(i7, i8, i9, i10);
        if (androidx.core.view.e0.B(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f578u == null) {
            this.f578u = new TypedValue();
        }
        return this.f578u;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f579v == null) {
            this.f579v = new TypedValue();
        }
        return this.f579v;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f576s == null) {
            this.f576s = new TypedValue();
        }
        return this.f576s;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f577t == null) {
            this.f577t = new TypedValue();
        }
        return this.f577t;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f574q == null) {
            this.f574q = new TypedValue();
        }
        return this.f574q;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f575r == null) {
            this.f575r = new TypedValue();
        }
        return this.f575r;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f581x;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f581x;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f581x = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f580w = new Rect();
    }
}
