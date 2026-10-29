package j0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
final class g implements TextWatcher {

    /* renamed from: q, reason: collision with root package name */
    private final EditText f24229q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f24230r;

    /* renamed from: s, reason: collision with root package name */
    private d.e f24231s;

    /* renamed from: t, reason: collision with root package name */
    private int f24232t = Integer.MAX_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private int f24233u = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f24234v = true;

    /* compiled from: MyApplication */
    private static class a extends d.e {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f24235a;

        a(EditText editText) {
            this.f24235a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.d.e
        public void b() {
            super.b();
            g.b((EditText) this.f24235a.get(), 1);
        }
    }

    g(EditText editText, boolean z7) {
        this.f24229q = editText;
        this.f24230r = z7;
    }

    private d.e a() {
        if (this.f24231s == null) {
            this.f24231s = new a(this.f24229q);
        }
        return this.f24231s;
    }

    static void b(EditText editText, int i7) {
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.d.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean d() {
        if (this.f24234v) {
            return (this.f24230r || androidx.emoji2.text.d.h()) ? false : true;
        }
        return true;
    }

    public void c(boolean z7) {
        if (this.f24234v != z7) {
            if (this.f24231s != null) {
                androidx.emoji2.text.d.b().t(this.f24231s);
            }
            this.f24234v = z7;
            if (z7) {
                b(this.f24229q, androidx.emoji2.text.d.b().d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        if (this.f24229q.isInEditMode() || d() || i8 > i9 || !(charSequence instanceof Spannable)) {
            return;
        }
        int d8 = androidx.emoji2.text.d.b().d();
        if (d8 != 0) {
            if (d8 == 1) {
                androidx.emoji2.text.d.b().r((Spannable) charSequence, i7, i7 + i9, this.f24232t, this.f24233u);
                return;
            } else if (d8 != 3) {
                return;
            }
        }
        androidx.emoji2.text.d.b().s(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
