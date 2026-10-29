package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* compiled from: MyApplication */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f1946a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f1947b;

    /* renamed from: c, reason: collision with root package name */
    private final View f1948c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1949d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f1950e;

    public v(View view) {
        this.f1948c = view;
    }

    private boolean f(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent g8;
        int i12;
        int i13;
        int[] iArr3;
        if (!j() || (g8 = g(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1948c.getLocationInWindow(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr2 == null) {
            int[] h8 = h();
            h8[0] = 0;
            h8[1] = 0;
            iArr3 = h8;
        } else {
            iArr3 = iArr2;
        }
        i0.d(g8, this.f1948c, i7, i8, i9, i10, i11, iArr3);
        if (iArr != null) {
            this.f1948c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i12;
            iArr[1] = iArr[1] - i13;
        }
        return true;
    }

    private ViewParent g(int i7) {
        if (i7 == 0) {
            return this.f1946a;
        }
        if (i7 != 1) {
            return null;
        }
        return this.f1947b;
    }

    private int[] h() {
        if (this.f1950e == null) {
            this.f1950e = new int[2];
        }
        return this.f1950e;
    }

    private void l(int i7, ViewParent viewParent) {
        if (i7 == 0) {
            this.f1946a = viewParent;
        } else {
            if (i7 != 1) {
                return;
            }
            this.f1947b = viewParent;
        }
    }

    public boolean a(float f8, float f9, boolean z7) {
        ViewParent g8;
        if (!j() || (g8 = g(0)) == null) {
            return false;
        }
        return i0.a(g8, this.f1948c, f8, f9, z7);
    }

    public boolean b(float f8, float f9) {
        ViewParent g8;
        if (!j() || (g8 = g(0)) == null) {
            return false;
        }
        return i0.b(g8, this.f1948c, f8, f9);
    }

    public boolean c(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        ViewParent g8;
        int i10;
        int i11;
        if (!j() || (g8 = g(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1948c.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            iArr = h();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        i0.c(g8, this.f1948c, i7, i8, iArr3, i9);
        if (iArr2 != null) {
            this.f1948c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void d(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        f(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    public boolean e(int i7, int i8, int i9, int i10, int[] iArr) {
        return f(i7, i8, i9, i10, iArr, 0, null);
    }

    public boolean i(int i7) {
        return g(i7) != null;
    }

    public boolean j() {
        return this.f1949d;
    }

    public void k(boolean z7) {
        if (this.f1949d) {
            e0.c0(this.f1948c);
        }
        this.f1949d = z7;
    }

    public boolean m(int i7, int i8) {
        if (i(i8)) {
            return true;
        }
        if (!j()) {
            return false;
        }
        View view = this.f1948c;
        for (ViewParent parent = this.f1948c.getParent(); parent != null; parent = parent.getParent()) {
            if (i0.f(parent, view, this.f1948c, i7, i8)) {
                l(i8, parent);
                i0.e(parent, view, this.f1948c, i7, i8);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void n(int i7) {
        ViewParent g8 = g(i7);
        if (g8 != null) {
            i0.g(g8, this.f1948c, i7);
            l(i7, null);
        }
    }
}
