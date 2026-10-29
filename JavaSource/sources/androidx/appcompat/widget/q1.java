package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
class q1 extends h1 {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f849b;

    public q1(Context context, Resources resources) {
        super(resources);
        this.f849b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i7) {
        Drawable a8 = a(i7);
        Context context = (Context) this.f849b.get();
        if (a8 != null && context != null) {
            g1.h().x(context, i7, a8);
        }
        return a8;
    }
}
