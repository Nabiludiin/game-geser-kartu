package b0;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: MyApplication */
public abstract class l implements Spannable {

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f3138a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f3139b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3140c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3141d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f3142e;

        /* compiled from: MyApplication */
        /* renamed from: b0.l$a$a, reason: collision with other inner class name */
        public static class C0061a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f3143a;

            /* renamed from: c, reason: collision with root package name */
            private int f3145c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f3146d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f3144b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0061a(TextPaint textPaint) {
                this.f3143a = textPaint;
            }

            public a a() {
                return new a(this.f3143a, this.f3144b, this.f3145c, this.f3146d);
            }

            public C0061a b(int i7) {
                this.f3145c = i7;
                return this;
            }

            public C0061a c(int i7) {
                this.f3146d = i7;
                return this;
            }

            public C0061a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3144b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i8) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = b.a(textPaint).setBreakStrategy(i7);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i8);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f3142e = build;
            } else {
                this.f3142e = null;
            }
            this.f3138a = textPaint;
            this.f3139b = textDirectionHeuristic;
            this.f3140c = i7;
            this.f3141d = i8;
        }

        public boolean a(a aVar) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i7 = Build.VERSION.SDK_INT;
            if (this.f3140c != aVar.b() || this.f3141d != aVar.c() || this.f3138a.getTextSize() != aVar.e().getTextSize() || this.f3138a.getTextScaleX() != aVar.e().getTextScaleX() || this.f3138a.getTextSkewX() != aVar.e().getTextSkewX() || this.f3138a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f3138a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f3138a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i7 >= 24) {
                textLocales = this.f3138a.getTextLocales();
                textLocales2 = aVar.e().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.f3138a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f3138a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f3138a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f3140c;
        }

        public int c() {
            return this.f3141d;
        }

        public TextDirectionHeuristic d() {
            return this.f3139b;
        }

        public TextPaint e() {
            return this.f3138a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f3139b == aVar.d();
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT < 24) {
                return androidx.core.util.c.b(Float.valueOf(this.f3138a.getTextSize()), Float.valueOf(this.f3138a.getTextScaleX()), Float.valueOf(this.f3138a.getTextSkewX()), Float.valueOf(this.f3138a.getLetterSpacing()), Integer.valueOf(this.f3138a.getFlags()), this.f3138a.getTextLocale(), this.f3138a.getTypeface(), Boolean.valueOf(this.f3138a.isElegantTextHeight()), this.f3139b, Integer.valueOf(this.f3140c), Integer.valueOf(this.f3141d));
            }
            Float valueOf = Float.valueOf(this.f3138a.getTextSize());
            Float valueOf2 = Float.valueOf(this.f3138a.getTextScaleX());
            Float valueOf3 = Float.valueOf(this.f3138a.getTextSkewX());
            Float valueOf4 = Float.valueOf(this.f3138a.getLetterSpacing());
            Integer valueOf5 = Integer.valueOf(this.f3138a.getFlags());
            textLocales = this.f3138a.getTextLocales();
            return androidx.core.util.c.b(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, this.f3138a.getTypeface(), Boolean.valueOf(this.f3138a.isElegantTextHeight()), this.f3139b, Integer.valueOf(this.f3140c), Integer.valueOf(this.f3141d));
        }

        public String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f3138a.getTextSize());
            sb.append(", textScaleX=" + this.f3138a.getTextScaleX());
            sb.append(", textSkewX=" + this.f3138a.getTextSkewX());
            int i7 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f3138a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f3138a.isElegantTextHeight());
            if (i7 >= 24) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocales = this.f3138a.getTextLocales();
                sb2.append(textLocales);
                sb.append(sb2.toString());
            } else {
                sb.append(", textLocale=" + this.f3138a.getTextLocale());
            }
            sb.append(", typeface=" + this.f3138a.getTypeface());
            if (i7 >= 26) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", variationSettings=");
                fontVariationSettings = this.f3138a.getFontVariationSettings();
                sb3.append(fontVariationSettings);
                sb.append(sb3.toString());
            }
            sb.append(", textDir=" + this.f3139b);
            sb.append(", breakStrategy=" + this.f3140c);
            sb.append(", hyphenationFrequency=" + this.f3141d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f3138a = textPaint;
            textDirection = params.getTextDirection();
            this.f3139b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f3140c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f3141d = hyphenationFrequency;
            this.f3142e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
