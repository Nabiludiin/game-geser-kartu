package j0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f24218a;

    /* renamed from: b, reason: collision with root package name */
    private d.e f24219b;

    /* compiled from: MyApplication */
    private static class a extends d.e {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f24220a;

        /* renamed from: b, reason: collision with root package name */
        private final Reference f24221b;

        a(TextView textView, d dVar) {
            this.f24220a = new WeakReference(textView);
            this.f24221b = new WeakReference(dVar);
        }

        private boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.d.e
        public void b() {
            super.b();
            TextView textView = (TextView) this.f24220a.get();
            if (c(textView, (InputFilter) this.f24221b.get()) && textView.isAttachedToWindow()) {
                CharSequence o7 = androidx.emoji2.text.d.b().o(textView.getText());
                int selectionStart = Selection.getSelectionStart(o7);
                int selectionEnd = Selection.getSelectionEnd(o7);
                textView.setText(o7);
                if (o7 instanceof Spannable) {
                    d.b((Spannable) o7, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f24218a = textView;
    }

    private d.e a() {
        if (this.f24219b == null) {
            this.f24219b = new a(this.f24218a, this);
        }
        return this.f24219b;
    }

    static void b(Spannable spannable, int i7, int i8) {
        if (i7 >= 0 && i8 >= 0) {
            Selection.setSelection(spannable, i7, i8);
        } else if (i7 >= 0) {
            Selection.setSelection(spannable, i7);
        } else if (i8 >= 0) {
            Selection.setSelection(spannable, i8);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        if (this.f24218a.isInEditMode()) {
            return charSequence;
        }
        int d8 = androidx.emoji2.text.d.b().d();
        if (d8 != 0) {
            if (d8 == 1) {
                if (i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == this.f24218a.getText()) {
                    return charSequence;
                }
                if (charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i8);
                }
                return androidx.emoji2.text.d.b().p(charSequence, 0, charSequence.length());
            }
            if (d8 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d.b().s(a());
        return charSequence;
    }
}
