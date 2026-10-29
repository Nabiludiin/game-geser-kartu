package c6;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
class h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: q, reason: collision with root package name */
    final x f3607q;

    /* renamed from: r, reason: collision with root package name */
    final WeakReference f3608r;

    h(x xVar, ImageView imageView, e eVar) {
        this.f3607q = xVar;
        this.f3608r = new WeakReference(imageView);
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    void a() {
        ImageView imageView = (ImageView) this.f3608r.get();
        if (imageView == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f3608r.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f3607q.h().g(width, height).f(imageView, null);
        }
        return true;
    }
}
