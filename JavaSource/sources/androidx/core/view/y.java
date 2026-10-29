package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: MyApplication */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private int f1951a;

    /* renamed from: b, reason: collision with root package name */
    private int f1952b;

    public y(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f1951a | this.f1952b;
    }

    public void b(View view, View view2, int i7) {
        c(view, view2, i7, 0);
    }

    public void c(View view, View view2, int i7, int i8) {
        if (i8 == 1) {
            this.f1952b = i7;
        } else {
            this.f1951a = i7;
        }
    }

    public void d(View view, int i7) {
        if (i7 == 1) {
            this.f1952b = 0;
        } else {
            this.f1951a = 0;
        }
    }
}
