package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f987a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f988b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f989c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f990d;

    /* compiled from: MyApplication */
    /* renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0010a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f991a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f992b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f993c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f994d;

        public a a() {
            return new a(this.f991a, this.f992b, this.f993c, this.f994d);
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f987a = num;
        this.f988b = num2;
        this.f989c = num3;
        this.f990d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f987a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f988b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f989c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f990d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
