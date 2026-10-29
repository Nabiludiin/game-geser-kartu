package j0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: MyApplication */
class h implements TransformationMethod {

    /* renamed from: q, reason: collision with root package name */
    private final TransformationMethod f24236q;

    h(TransformationMethod transformationMethod) {
        this.f24236q = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f24236q;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f24236q;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.d.b().d() != 1) ? charSequence : androidx.emoji2.text.d.b().o(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z7, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f24236q;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z7, i7, rect);
        }
    }
}
