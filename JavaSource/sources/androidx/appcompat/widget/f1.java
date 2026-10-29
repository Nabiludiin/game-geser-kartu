package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* compiled from: MyApplication */
public class f1 extends c1 implements d1 {

    /* renamed from: a0, reason: collision with root package name */
    private static Method f719a0;
    private d1 Z;

    /* compiled from: MyApplication */
    public static class a extends v0 {
        final int E;
        final int F;
        private d1 G;
        private MenuItem H;

        public a(Context context, boolean z7) {
            super(context, z7);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.E = 21;
                this.F = 22;
            } else {
                this.E = 22;
                this.F = 21;
            }
        }

        @Override // androidx.appcompat.widget.v0
        public /* bridge */ /* synthetic */ int d(int i7, int i8, int i9, int i10, int i11) {
            return super.d(i7, i8, i9, i10, i11);
        }

        @Override // androidx.appcompat.widget.v0
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i7) {
            return super.e(motionEvent, i7);
        }

        @Override // androidx.appcompat.widget.v0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.v0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.v0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.v0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.v0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int i7;
            int pointToPosition;
            int i8;
            if (this.G != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i7 = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    i7 = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i8 = pointToPosition - i7) < 0 || i8 >= dVar.getCount()) ? null : dVar.getItem(i8);
                MenuItem menuItem = this.H;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e b8 = dVar.b();
                    if (menuItem != null) {
                        this.G.f(b8, menuItem);
                    }
                    this.H = item;
                    if (item != null) {
                        this.G.c(b8, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i7, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i7 == this.E) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i7 != this.F) {
                return super.onKeyDown(i7, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.v0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(d1 d1Var) {
            this.G = d1Var;
        }

        @Override // androidx.appcompat.widget.v0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f719a0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public f1(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    public void N(Object obj) {
        this.V.setEnterTransition((Transition) obj);
    }

    public void O(Object obj) {
        this.V.setExitTransition((Transition) obj);
    }

    public void P(d1 d1Var) {
        this.Z = d1Var;
    }

    public void Q(boolean z7) {
        if (Build.VERSION.SDK_INT > 28) {
            this.V.setTouchModal(z7);
            return;
        }
        Method method = f719a0;
        if (method != null) {
            try {
                method.invoke(this.V, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.d1
    public void c(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        d1 d1Var = this.Z;
        if (d1Var != null) {
            d1Var.c(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.d1
    public void f(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        d1 d1Var = this.Z;
        if (d1Var != null) {
            d1Var.f(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.c1
    v0 s(Context context, boolean z7) {
        a aVar = new a(context, z7);
        aVar.setHoverListener(this);
        return aVar;
    }
}
