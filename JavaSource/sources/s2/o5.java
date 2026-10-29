package s2;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* compiled from: MyApplication */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    private final k2.h[] f26203a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26204b;

    public o5(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, k2.s.f24424a);
        String string = obtainAttributes.getString(k2.s.f24425b);
        String string2 = obtainAttributes.getString(k2.s.f24426c);
        boolean isEmpty = TextUtils.isEmpty(string);
        boolean isEmpty2 = TextUtils.isEmpty(string2);
        if (!isEmpty && isEmpty2) {
            this.f26203a = c(string);
        } else {
            if (!isEmpty || isEmpty2) {
                if (isEmpty) {
                    obtainAttributes.recycle();
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                obtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f26203a = c(string2);
        }
        String string3 = obtainAttributes.getString(k2.s.f24427d);
        this.f26204b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static k2.h[] c(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        k2.h[] hVarArr = new k2.h[length];
        for (int i7 = 0; i7 < split.length; i7++) {
            String trim = split[i7].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    hVarArr[i7] = new k2.h("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if ("BANNER".equals(trim)) {
                hVarArr[i7] = k2.h.f24400i;
            } else if ("LARGE_BANNER".equals(trim)) {
                hVarArr[i7] = k2.h.f24402k;
            } else if ("FULL_BANNER".equals(trim)) {
                hVarArr[i7] = k2.h.f24401j;
            } else if ("LEADERBOARD".equals(trim)) {
                hVarArr[i7] = k2.h.f24403l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                hVarArr[i7] = k2.h.f24404m;
            } else if ("SMART_BANNER".equals(trim)) {
                hVarArr[i7] = k2.h.f24406o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                hVarArr[i7] = k2.h.f24405n;
            } else if ("FLUID".equals(trim)) {
                hVarArr[i7] = k2.h.f24407p;
            } else {
                if (!"ICON".equals(trim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
                hVarArr[i7] = k2.h.f24409r;
            }
        }
        if (length != 0) {
            return hVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final k2.h[] a(boolean z7) {
        if (z7 || this.f26203a.length == 1) {
            return this.f26203a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public final String b() {
        return this.f26204b;
    }
}
