package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* compiled from: MyApplication */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final f f1861a;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f1862a;

        public a(ClipData clipData, int i7) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f1862a = new b(clipData, i7);
            } else {
                this.f1862a = new C0032d(clipData, i7);
            }
        }

        public d a() {
            return this.f1862a.build();
        }

        public a b(Bundle bundle) {
            this.f1862a.setExtras(bundle);
            return this;
        }

        public a c(int i7) {
            this.f1862a.b(i7);
            return this;
        }

        public a d(Uri uri) {
            this.f1862a.a(uri);
            return this;
        }
    }

    /* compiled from: MyApplication */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f1863a;

        b(ClipData clipData, int i7) {
            this.f1863a = androidx.core.view.g.a(clipData, i7);
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f1863a.setLinkUri(uri);
        }

        @Override // androidx.core.view.d.c
        public void b(int i7) {
            this.f1863a.setFlags(i7);
        }

        @Override // androidx.core.view.d.c
        public d build() {
            ContentInfo build;
            build = this.f1863a.build();
            return new d(new e(build));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f1863a.setExtras(bundle);
        }
    }

    /* compiled from: MyApplication */
    private interface c {
        void a(Uri uri);

        void b(int i7);

        d build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    private static final class C0032d implements c {

        /* renamed from: a, reason: collision with root package name */
        ClipData f1864a;

        /* renamed from: b, reason: collision with root package name */
        int f1865b;

        /* renamed from: c, reason: collision with root package name */
        int f1866c;

        /* renamed from: d, reason: collision with root package name */
        Uri f1867d;

        /* renamed from: e, reason: collision with root package name */
        Bundle f1868e;

        C0032d(ClipData clipData, int i7) {
            this.f1864a = clipData;
            this.f1865b = i7;
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f1867d = uri;
        }

        @Override // androidx.core.view.d.c
        public void b(int i7) {
            this.f1866c = i7;
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new g(this));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f1868e = bundle;
        }
    }

    /* compiled from: MyApplication */
    private static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ContentInfo f1869a;

        e(ContentInfo contentInfo) {
            this.f1869a = androidx.core.view.c.a(androidx.core.util.e.f(contentInfo));
        }

        @Override // androidx.core.view.d.f
        public ClipData a() {
            ClipData clip;
            clip = this.f1869a.getClip();
            return clip;
        }

        @Override // androidx.core.view.d.f
        public int b() {
            int flags;
            flags = this.f1869a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.d.f
        public ContentInfo c() {
            return this.f1869a;
        }

        @Override // androidx.core.view.d.f
        public int d() {
            int source;
            source = this.f1869a.getSource();
            return source;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f1869a + "}";
        }
    }

    /* compiled from: MyApplication */
    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* compiled from: MyApplication */
    private static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        private final ClipData f1870a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1871b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1872c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f1873d;

        /* renamed from: e, reason: collision with root package name */
        private final Bundle f1874e;

        g(C0032d c0032d) {
            this.f1870a = (ClipData) androidx.core.util.e.f(c0032d.f1864a);
            this.f1871b = androidx.core.util.e.b(c0032d.f1865b, 0, 5, "source");
            this.f1872c = androidx.core.util.e.e(c0032d.f1866c, 1);
            this.f1873d = c0032d.f1867d;
            this.f1874e = c0032d.f1868e;
        }

        @Override // androidx.core.view.d.f
        public ClipData a() {
            return this.f1870a;
        }

        @Override // androidx.core.view.d.f
        public int b() {
            return this.f1872c;
        }

        @Override // androidx.core.view.d.f
        public ContentInfo c() {
            return null;
        }

        @Override // androidx.core.view.d.f
        public int d() {
            return this.f1871b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f1870a.getDescription());
            sb.append(", source=");
            sb.append(d.e(this.f1871b));
            sb.append(", flags=");
            sb.append(d.a(this.f1872c));
            if (this.f1873d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f1873d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f1874e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    d(f fVar) {
        this.f1861a = fVar;
    }

    static String a(int i7) {
        return (i7 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i7);
    }

    static String e(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f1861a.a();
    }

    public int c() {
        return this.f1861a.b();
    }

    public int d() {
        return this.f1861a.d();
    }

    public ContentInfo f() {
        ContentInfo c8 = this.f1861a.c();
        Objects.requireNonNull(c8);
        return androidx.core.view.c.a(c8);
    }

    public String toString() {
        return this.f1861a.toString();
    }
}
