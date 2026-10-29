package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: MyApplication */
public abstract class an implements zm {
    protected static volatile ko K;
    private double A;
    private double B;
    protected float C;
    protected float D;
    protected float E;
    protected float F;
    protected DisplayMetrics I;
    protected ao J;

    /* renamed from: q, reason: collision with root package name */
    protected MotionEvent f5048q;

    /* renamed from: z, reason: collision with root package name */
    protected double f5057z;

    /* renamed from: r, reason: collision with root package name */
    protected final LinkedList f5049r = new LinkedList();

    /* renamed from: s, reason: collision with root package name */
    protected long f5050s = 0;

    /* renamed from: t, reason: collision with root package name */
    protected long f5051t = 0;

    /* renamed from: u, reason: collision with root package name */
    protected long f5052u = 0;

    /* renamed from: v, reason: collision with root package name */
    protected long f5053v = 0;

    /* renamed from: w, reason: collision with root package name */
    protected long f5054w = 0;

    /* renamed from: x, reason: collision with root package name */
    protected long f5055x = 0;

    /* renamed from: y, reason: collision with root package name */
    protected long f5056y = 0;
    private boolean G = false;
    protected boolean H = false;

    protected an(Context context) {
        try {
            cm.a();
            this.I = context.getResources().getDisplayMetrics();
            if (((Boolean) s2.b0.c().d(uy.f17137k3)).booleanValue()) {
                this.J = new ao();
            }
        } catch (Throwable unused) {
        }
    }

    private final void o() {
        this.f5054w = 0L;
        this.f5050s = 0L;
        this.f5051t = 0L;
        this.f5052u = 0L;
        this.f5053v = 0L;
        this.f5055x = 0L;
        this.f5056y = 0L;
        LinkedList linkedList = this.f5049r;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f5048q;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f5048q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String p(android.content.Context r19, java.lang.String r20, int r21, android.view.View r22, android.app.Activity r23, byte[] r24) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.an.p(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    protected abstract ak a(Context context, lj ljVar);

    protected abstract ak b(Context context, View view, Activity activity);

    protected abstract ak c(Context context, View view, Activity activity);

    protected abstract mo d(MotionEvent motionEvent);

    @Override // com.google.android.gms.internal.ads.zm
    public final synchronized void e(int i7, int i8, int i9) {
        try {
            if (this.f5048q != null) {
                if (((Boolean) s2.b0.c().d(uy.T2)).booleanValue()) {
                    o();
                } else {
                    this.f5048q.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.I;
            if (displayMetrics != null) {
                float f8 = displayMetrics.density;
                this.f5048q = MotionEvent.obtain(0L, i9, 1, i7 * f8, i8 * f8, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f5048q = null;
            }
            this.H = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final synchronized void f(MotionEvent motionEvent) {
        Long l7;
        try {
            if (this.G) {
                o();
                this.G = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f5057z = 0.0d;
                this.A = motionEvent.getRawX();
                this.B = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d8 = rawX - this.A;
                double d9 = rawY - this.B;
                this.f5057z += Math.sqrt((d8 * d8) + (d9 * d9));
                this.A = rawX;
                this.B = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.f5048q = obtain;
                        LinkedList linkedList = this.f5049r;
                        linkedList.add(obtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.f5052u++;
                        this.f5054w = n(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f5051t += motionEvent.getHistorySize() + 1;
                        mo d10 = d(motionEvent);
                        Long l8 = d10.f12322e;
                        if (l8 != null && d10.f12325h != null) {
                            this.f5055x += l8.longValue() + d10.f12325h.longValue();
                        }
                        if (this.I != null && (l7 = d10.f12323f) != null && d10.f12326i != null) {
                            this.f5056y += l7.longValue() + d10.f12326i.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f5053v++;
                    }
                } catch (yn unused) {
                }
            } else {
                this.C = motionEvent.getX();
                this.D = motionEvent.getY();
                this.E = motionEvent.getRawX();
                this.F = motionEvent.getRawY();
                this.f5050s++;
            }
            this.H = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String g(Context context, String str, View view, Activity activity) {
        return p(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String h(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final void i(StackTraceElement[] stackTraceElementArr) {
        ao aoVar;
        if (!((Boolean) s2.b0.c().d(uy.f17137k3)).booleanValue() || (aoVar = this.J) == null) {
            return;
        }
        aoVar.a(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String j(Context context) {
        if (no.d()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return p(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String l(Context context, String str, View view) {
        return p(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zm
    public final String m(Context context, View view, Activity activity) {
        return p(context, null, 2, view, activity, null);
    }

    protected abstract long n(StackTraceElement[] stackTraceElementArr);
}
