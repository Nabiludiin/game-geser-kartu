package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: MyApplication */
public abstract class x0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: q, reason: collision with root package name */
    private final float f921q;

    /* renamed from: r, reason: collision with root package name */
    private final int f922r;

    /* renamed from: s, reason: collision with root package name */
    private final int f923s;

    /* renamed from: t, reason: collision with root package name */
    final View f924t;

    /* renamed from: u, reason: collision with root package name */
    private Runnable f925u;

    /* renamed from: v, reason: collision with root package name */
    private Runnable f926v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f927w;

    /* renamed from: x, reason: collision with root package name */
    private int f928x;

    /* renamed from: y, reason: collision with root package name */
    private final int[] f929y = new int[2];

    /* compiled from: MyApplication */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = x0.this.f924t.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: MyApplication */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.e();
        }
    }

    public x0(View view) {
        this.f924t = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f921q = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f922r = tapTimeout;
        this.f923s = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f926v;
        if (runnable != null) {
            this.f924t.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f925u;
        if (runnable2 != null) {
            this.f924t.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        v0 v0Var;
        View view = this.f924t;
        l.e b8 = b();
        if (b8 != null && b8.a() && (v0Var = (v0) b8.j()) != null && v0Var.isShown()) {
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            n(view, obtainNoHistory);
            p(v0Var, obtainNoHistory);
            boolean e8 = v0Var.e(obtainNoHistory, this.f928x);
            obtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z7 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (e8 && z7) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean h(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f924t
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f928x
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f921q
            boolean r6 = j(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f928x = r6
            java.lang.Runnable r6 = r5.f925u
            if (r6 != 0) goto L52
            androidx.appcompat.widget.x0$a r6 = new androidx.appcompat.widget.x0$a
            r6.<init>()
            r5.f925u = r6
        L52:
            java.lang.Runnable r6 = r5.f925u
            int r1 = r5.f922r
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f926v
            if (r6 != 0) goto L65
            androidx.appcompat.widget.x0$b r6 = new androidx.appcompat.widget.x0$b
            r6.<init>()
            r5.f926v = r6
        L65:
            java.lang.Runnable r6 = r5.f926v
            int r1 = r5.f923s
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x0.h(android.view.MotionEvent):boolean");
    }

    private static boolean j(View view, float f8, float f9, float f10) {
        float f11 = -f10;
        return f8 >= f11 && f9 >= f11 && f8 < ((float) (view.getRight() - view.getLeft())) + f10 && f9 < ((float) (view.getBottom() - view.getTop())) + f10;
    }

    private boolean n(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f929y);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean p(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f929y);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract l.e b();

    protected abstract boolean c();

    protected boolean d() {
        l.e b8 = b();
        if (b8 == null || !b8.a()) {
            return true;
        }
        b8.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f924t;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f927w = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z7;
        boolean z8 = this.f927w;
        if (z8) {
            z7 = f(motionEvent) || !d();
        } else {
            z7 = h(motionEvent) && c();
            if (z7) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f924t.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f927w = z7;
        return z7 || z8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f927w = false;
        this.f928x = -1;
        Runnable runnable = this.f925u;
        if (runnable != null) {
            this.f924t.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
