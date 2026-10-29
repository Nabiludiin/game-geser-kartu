package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* compiled from: MyApplication */
public abstract class b31 {
    public static void a(Spannable spannable, Object obj, int i7, int i8, int i9) {
        for (Object obj2 : spannable.getSpans(i7, i8, obj.getClass())) {
            c(spannable, obj2, i7, i8, 33);
        }
        spannable.setSpan(obj, i7, i8, 33);
    }

    public static void b(Spannable spannable, float f8, int i7, int i8, int i9) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i7, i8, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i7 && spannable.getSpanEnd(relativeSizeSpan) >= i8) {
                f8 *= relativeSizeSpan.getSizeChange();
            }
            c(spannable, relativeSizeSpan, i7, i8, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f8), i7, i8, 33);
    }

    private static void c(Spannable spannable, Object obj, int i7, int i8, int i9) {
        if (spannable.getSpanStart(obj) == i7 && spannable.getSpanEnd(obj) == i8 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
