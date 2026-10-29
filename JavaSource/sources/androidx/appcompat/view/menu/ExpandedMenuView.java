package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.r1;

/* compiled from: MyApplication */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f392s = {R.attr.background, R.attr.divider};

    /* renamed from: q, reason: collision with root package name */
    private e f393q;

    /* renamed from: r, reason: collision with root package name */
    private int f394r;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(g gVar) {
        return this.f393q.L(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(e eVar) {
        this.f393q = eVar;
    }

    public int getWindowAnimations() {
        return this.f394r;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        a((g) getAdapter().getItem(i7));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        r1 u7 = r1.u(context, attributeSet, f392s, i7, 0);
        if (u7.r(0)) {
            setBackgroundDrawable(u7.f(0));
        }
        if (u7.r(1)) {
            setDivider(u7.f(1));
        }
        u7.v();
    }
}
