package j0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* compiled from: MyApplication */
final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f24216a;

    /* renamed from: b, reason: collision with root package name */
    private final a f24217b;

    /* compiled from: MyApplication */
    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z7) {
            return androidx.emoji2.text.d.e(inputConnection, editable, i7, i8, z7);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.d.h()) {
                androidx.emoji2.text.d.b().u(editorInfo);
            }
        }
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.f24216a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i7, int i8) {
        return this.f24217b.a(this, a(), i7, i8, false) || super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        return this.f24217b.a(this, a(), i7, i8, true) || super.deleteSurroundingTextInCodePoints(i7, i8);
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f24216a = textView;
        this.f24217b = aVar;
        aVar.b(editorInfo);
    }
}
