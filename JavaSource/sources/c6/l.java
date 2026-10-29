package c6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import c6.t;

/* compiled from: MyApplication */
class l extends a {
    l(t tVar, ImageView imageView, w wVar, int i7, int i8, int i9, Drawable drawable, String str, Object obj, e eVar, boolean z7) {
        super(tVar, imageView, wVar, i7, i8, i9, drawable, str, obj, z7);
    }

    @Override // c6.a
    void a() {
        super.a();
    }

    @Override // c6.a
    public void b(Bitmap bitmap, t.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f3544c.get();
        if (imageView == null) {
            return;
        }
        t tVar = this.f3542a;
        u.c(imageView, tVar.f3672d, bitmap, eVar, this.f3545d, tVar.f3680l);
    }

    @Override // c6.a
    public void c() {
        ImageView imageView = (ImageView) this.f3544c.get();
        if (imageView == null) {
            return;
        }
        int i7 = this.f3548g;
        if (i7 != 0) {
            imageView.setImageResource(i7);
            return;
        }
        Drawable drawable = this.f3549h;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }
}
