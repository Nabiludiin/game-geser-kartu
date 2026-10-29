package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p.a;

/* compiled from: MyApplication */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    private final int f985q;

    /* renamed from: r, reason: collision with root package name */
    private final int f986r;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f985q = getResources().getDimensionPixelOffset(a.f25067b);
        this.f986r = getResources().getDimensionPixelOffset(a.f25066a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f985q * 2), this.f986r), 1073741824), i8);
    }
}
