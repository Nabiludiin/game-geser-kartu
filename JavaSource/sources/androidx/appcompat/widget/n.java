package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: MyApplication */
class n {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f801a;

    /* renamed from: b, reason: collision with root package name */
    private final j0.f f802b;

    n(TextView textView) {
        this.f801a = textView;
        this.f802b = new j0.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f802b.a(inputFilterArr);
    }

    void b(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f801a.getContext().obtainStyledAttributes(attributeSet, f.j.f23475g0, i7, 0);
        try {
            int i8 = f.j.f23545u0;
            boolean z7 = obtainStyledAttributes.hasValue(i8) ? obtainStyledAttributes.getBoolean(i8, true) : true;
            obtainStyledAttributes.recycle();
            d(z7);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    void c(boolean z7) {
        this.f802b.b(z7);
    }

    void d(boolean z7) {
        this.f802b.c(z7);
    }
}
