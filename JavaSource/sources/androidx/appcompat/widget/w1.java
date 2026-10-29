package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* compiled from: MyApplication */
class w1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static w1 A;

    /* renamed from: z, reason: collision with root package name */
    private static w1 f908z;

    /* renamed from: q, reason: collision with root package name */
    private final View f909q;

    /* renamed from: r, reason: collision with root package name */
    private final CharSequence f910r;

    /* renamed from: s, reason: collision with root package name */
    private final int f911s;

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f912t = new a();

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f913u = new b();

    /* renamed from: v, reason: collision with root package name */
    private int f914v;

    /* renamed from: w, reason: collision with root package name */
    private int f915w;

    /* renamed from: x, reason: collision with root package name */
    private x1 f916x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f917y;

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w1.this.g(false);
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w1.this.c();
        }
    }

    private w1(View view, CharSequence charSequence) {
        this.f909q = view;
        this.f910r = charSequence;
        this.f911s = androidx.core.view.g0.a(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f909q.removeCallbacks(this.f912t);
    }

    private void b() {
        this.f914v = Integer.MAX_VALUE;
        this.f915w = Integer.MAX_VALUE;
    }

    private void d() {
        this.f909q.postDelayed(this.f912t, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(w1 w1Var) {
        w1 w1Var2 = f908z;
        if (w1Var2 != null) {
            w1Var2.a();
        }
        f908z = w1Var;
        if (w1Var != null) {
            w1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        w1 w1Var = f908z;
        if (w1Var != null && w1Var.f909q == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new w1(view, charSequence);
            return;
        }
        w1 w1Var2 = A;
        if (w1Var2 != null && w1Var2.f909q == view) {
            w1Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        if (Math.abs(x7 - this.f914v) <= this.f911s && Math.abs(y7 - this.f915w) <= this.f911s) {
            return false;
        }
        this.f914v = x7;
        this.f915w = y7;
        return true;
    }

    void c() {
        if (A == this) {
            A = null;
            x1 x1Var = this.f916x;
            if (x1Var != null) {
                x1Var.c();
                this.f916x = null;
                b();
                this.f909q.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f908z == this) {
            e(null);
        }
        this.f909q.removeCallbacks(this.f913u);
    }

    void g(boolean z7) {
        long longPressTimeout;
        long j7;
        long j8;
        if (androidx.core.view.e0.A(this.f909q)) {
            e(null);
            w1 w1Var = A;
            if (w1Var != null) {
                w1Var.c();
            }
            A = this;
            this.f917y = z7;
            x1 x1Var = new x1(this.f909q.getContext());
            this.f916x = x1Var;
            x1Var.e(this.f909q, this.f914v, this.f915w, this.f917y, this.f910r);
            this.f909q.addOnAttachStateChangeListener(this);
            if (this.f917y) {
                j8 = 2500;
            } else {
                if ((androidx.core.view.e0.x(this.f909q) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 15000;
                }
                j8 = j7 - longPressTimeout;
            }
            this.f909q.removeCallbacks(this.f913u);
            this.f909q.postDelayed(this.f913u, j8);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f916x != null && this.f917y) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f909q.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f909q.isEnabled() && this.f916x == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f914v = view.getWidth() / 2;
        this.f915w = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
