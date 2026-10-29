package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.a0;

/* compiled from: MyApplication */
public final class k implements a0 {

    /* compiled from: MyApplication */
    private static final class a {
        static CharSequence a(Context context, ClipData.Item item, int i7) {
            if ((i7 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    private static CharSequence b(Context context, ClipData.Item item, int i7) {
        return a.a(context, item, i7);
    }

    private static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.a0
    public androidx.core.view.d a(View view, androidx.core.view.d dVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + dVar);
        }
        if (dVar.d() == 2) {
            return dVar;
        }
        ClipData b8 = dVar.b();
        int c8 = dVar.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z7 = false;
        for (int i7 = 0; i7 < b8.getItemCount(); i7++) {
            CharSequence b9 = b(context, b8.getItemAt(i7), c8);
            if (b9 != null) {
                if (z7) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b9);
                } else {
                    c(editable, b9);
                    z7 = true;
                }
            }
        }
        return null;
    }
}
