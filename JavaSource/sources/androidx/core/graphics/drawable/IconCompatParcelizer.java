package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* compiled from: MyApplication */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1700a = aVar.p(iconCompat.f1700a, 1);
        iconCompat.f1702c = aVar.j(iconCompat.f1702c, 2);
        iconCompat.f1703d = aVar.r(iconCompat.f1703d, 3);
        iconCompat.f1704e = aVar.p(iconCompat.f1704e, 4);
        iconCompat.f1705f = aVar.p(iconCompat.f1705f, 5);
        iconCompat.f1706g = (ColorStateList) aVar.r(iconCompat.f1706g, 6);
        iconCompat.f1708i = aVar.t(iconCompat.f1708i, 7);
        iconCompat.f1709j = aVar.t(iconCompat.f1709j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.k(aVar.f());
        int i7 = iconCompat.f1700a;
        if (-1 != i7) {
            aVar.F(i7, 1);
        }
        byte[] bArr = iconCompat.f1702c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1703d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i8 = iconCompat.f1704e;
        if (i8 != 0) {
            aVar.F(i8, 4);
        }
        int i9 = iconCompat.f1705f;
        if (i9 != 0) {
            aVar.F(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f1706g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f1708i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f1709j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
