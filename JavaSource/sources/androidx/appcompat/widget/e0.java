package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: MyApplication */
final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private TextView f714a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f715b;

    e0(TextView textView) {
        this.f714a = (TextView) androidx.core.util.e.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier;
        TextClassifier textClassifier2;
        TextClassifier textClassifier3 = this.f715b;
        if (textClassifier3 != null) {
            return textClassifier3;
        }
        TextClassificationManager a8 = b0.a(this.f714a.getContext().getSystemService(a0.a()));
        if (a8 != null) {
            textClassifier2 = a8.getTextClassifier();
            return textClassifier2;
        }
        textClassifier = TextClassifier.NO_OP;
        return textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f715b = textClassifier;
    }
}
