package c4;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
public final class o implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: q, reason: collision with root package name */
    private s f3497q;

    /* renamed from: r, reason: collision with root package name */
    private p f3498r;

    /* renamed from: s, reason: collision with root package name */
    private WeakReference f3499s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f3500t = false;

    private o(s sVar, int i7) {
        this.f3497q = sVar;
        this.f3498r = new p(i7);
    }

    public static o a(s sVar, int i7) {
        return new o(sVar, i7);
    }

    private final void c(View view) {
        Display display;
        int i7 = -1;
        if (com.google.android.gms.common.util.n.c() && (display = view.getDisplay()) != null) {
            i7 = display.getDisplayId();
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        p pVar = this.f3498r;
        pVar.f3503c = i7;
        pVar.f3501a = windowToken;
        int i8 = iArr[0];
        pVar.f3504d = i8;
        int i9 = iArr[1];
        pVar.f3505e = i9;
        pVar.f3506f = i8 + width;
        pVar.f3507g = i9 + height;
        if (this.f3500t) {
            g();
        }
    }

    public final void b(View view) {
        this.f3497q.A0();
        WeakReference weakReference = this.f3499s;
        if (weakReference != null) {
            View view2 = (View) weakReference.get();
            Context D = this.f3497q.D();
            if (view2 == null && (D instanceof Activity)) {
                view2 = ((Activity) D).getWindow().getDecorView();
            }
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (com.google.android.gms.common.util.n.b()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        this.f3499s = null;
        Context D2 = this.f3497q.D();
        if (view == null && (D2 instanceof Activity)) {
            Activity activity = (Activity) D2;
            view = activity.findViewById(R.id.content);
            if (view == null) {
                view = activity.getWindow().getDecorView();
            }
            d.b("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
        }
        if (view == null) {
            d.a("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
            return;
        }
        c(view);
        this.f3499s = new WeakReference(view);
        view.addOnAttachStateChangeListener(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public final Bundle d() {
        return this.f3498r.a();
    }

    public final IBinder e() {
        return this.f3498r.f3501a;
    }

    public final p f() {
        return this.f3498r;
    }

    public final void g() {
        p pVar = this.f3498r;
        IBinder iBinder = pVar.f3501a;
        if (iBinder == null) {
            this.f3500t = true;
        } else {
            this.f3497q.s0(iBinder, pVar.a());
            this.f3500t = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        WeakReference weakReference = this.f3499s;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3497q.A0();
        view.removeOnAttachStateChangeListener(this);
    }
}
