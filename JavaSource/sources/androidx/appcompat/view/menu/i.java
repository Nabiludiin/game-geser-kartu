package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.e0;
import androidx.core.view.o;

/* compiled from: MyApplication */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f509a;

    /* renamed from: b, reason: collision with root package name */
    private final e f510b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f511c;

    /* renamed from: d, reason: collision with root package name */
    private final int f512d;

    /* renamed from: e, reason: collision with root package name */
    private final int f513e;

    /* renamed from: f, reason: collision with root package name */
    private View f514f;

    /* renamed from: g, reason: collision with root package name */
    private int f515g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f516h;

    /* renamed from: i, reason: collision with root package name */
    private j.a f517i;

    /* renamed from: j, reason: collision with root package name */
    private h f518j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f519k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f520l;

    /* compiled from: MyApplication */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z7, int i7) {
        this(context, eVar, view, z7, i7, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f509a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f509a.getResources().getDimensionPixelSize(f.d.f23343a) ? new b(this.f509a, this.f514f, this.f512d, this.f513e, this.f511c) : new l(this.f509a, this.f510b, this.f514f, this.f512d, this.f513e, this.f511c);
        bVar.l(this.f510b);
        bVar.u(this.f520l);
        bVar.p(this.f514f);
        bVar.g(this.f517i);
        bVar.r(this.f516h);
        bVar.s(this.f515g);
        return bVar;
    }

    private void l(int i7, int i8, boolean z7, boolean z8) {
        h c8 = c();
        c8.v(z8);
        if (z7) {
            if ((o.a(this.f515g, e0.r(this.f514f)) & 7) == 5) {
                i7 -= this.f514f.getWidth();
            }
            c8.t(i7);
            c8.w(i8);
            int i9 = (int) ((this.f509a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c8.q(new Rect(i7 - i9, i8 - i9, i7 + i9, i8 + i9));
        }
        c8.h();
    }

    public void b() {
        if (d()) {
            this.f518j.dismiss();
        }
    }

    public h c() {
        if (this.f518j == null) {
            this.f518j = a();
        }
        return this.f518j;
    }

    public boolean d() {
        h hVar = this.f518j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f518j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f519k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f514f = view;
    }

    public void g(boolean z7) {
        this.f516h = z7;
        h hVar = this.f518j;
        if (hVar != null) {
            hVar.r(z7);
        }
    }

    public void h(int i7) {
        this.f515g = i7;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f519k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f517i = aVar;
        h hVar = this.f518j;
        if (hVar != null) {
            hVar.g(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f514f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i7, int i8) {
        if (d()) {
            return true;
        }
        if (this.f514f == null) {
            return false;
        }
        l(i7, i8, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z7, int i7, int i8) {
        this.f515g = 8388611;
        this.f520l = new a();
        this.f509a = context;
        this.f510b = eVar;
        this.f514f = view;
        this.f511c = z7;
        this.f512d = i7;
        this.f513e = i8;
    }
}
