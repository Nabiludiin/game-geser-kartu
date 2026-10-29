package j0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: MyApplication */
final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    private final KeyListener f24222a;

    /* renamed from: b, reason: collision with root package name */
    private final a f24223b;

    /* compiled from: MyApplication */
    public static class a {
        public boolean a(Editable editable, int i7, KeyEvent keyEvent) {
            return androidx.emoji2.text.d.f(editable, i7, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i7) {
        this.f24222a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f24222a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f24223b.a(editable, i7, keyEvent) || this.f24222a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f24222a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.f24222a.onKeyUp(view, editable, i7, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f24222a = keyListener;
        this.f24223b = aVar;
    }
}
