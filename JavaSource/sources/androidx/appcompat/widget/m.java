package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: MyApplication */
class m {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f773a;

    /* renamed from: b, reason: collision with root package name */
    private final j0.a f774b;

    m(EditText editText) {
        this.f773a = editText;
        this.f774b = new j0.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f774b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f773a.getContext().obtainStyledAttributes(attributeSet, f.j.f23475g0, i7, 0);
        try {
            int i8 = f.j.f23545u0;
            boolean z7 = obtainStyledAttributes.hasValue(i8) ? obtainStyledAttributes.getBoolean(i8, true) : true;
            obtainStyledAttributes.recycle();
            e(z7);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f774b.b(inputConnection, editorInfo);
    }

    void e(boolean z7) {
        this.f774b.c(z7);
    }
}
