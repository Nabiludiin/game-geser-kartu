package c6;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import c6.t;
import c6.y;

/* compiled from: MyApplication */
class k extends g {
    k(Context context) {
        super(context);
    }

    static int k(Uri uri) {
        int attributeInt = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    @Override // c6.g, c6.y
    public boolean c(w wVar) {
        return "file".equals(wVar.f3719d.getScheme());
    }

    @Override // c6.g, c6.y
    public y.a f(w wVar, int i7) {
        return new y.a(null, j(wVar), t.e.DISK, k(wVar.f3719d));
    }
}
