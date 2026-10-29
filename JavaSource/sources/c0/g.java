package c0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: MyApplication */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final c f3474a;

    /* compiled from: MyApplication */
    private interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f3474a = new a(uri, clipDescription, uri2);
        } else {
            this.f3474a = new b(uri, clipDescription, uri2);
        }
    }

    public static g f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new g(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f3474a.a();
    }

    public ClipDescription b() {
        return this.f3474a.getDescription();
    }

    public Uri c() {
        return this.f3474a.c();
    }

    public void d() {
        this.f3474a.b();
    }

    public Object e() {
        return this.f3474a.d();
    }

    /* compiled from: MyApplication */
    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f3475a;

        a(Object obj) {
            this.f3475a = (InputContentInfo) obj;
        }

        @Override // c0.g.c
        public Uri a() {
            return this.f3475a.getContentUri();
        }

        @Override // c0.g.c
        public void b() {
            this.f3475a.requestPermission();
        }

        @Override // c0.g.c
        public Uri c() {
            return this.f3475a.getLinkUri();
        }

        @Override // c0.g.c
        public Object d() {
            return this.f3475a;
        }

        @Override // c0.g.c
        public ClipDescription getDescription() {
            return this.f3475a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f3475a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private g(c cVar) {
        this.f3474a = cVar;
    }

    /* compiled from: MyApplication */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f3476a;

        /* renamed from: b, reason: collision with root package name */
        private final ClipDescription f3477b;

        /* renamed from: c, reason: collision with root package name */
        private final Uri f3478c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f3476a = uri;
            this.f3477b = clipDescription;
            this.f3478c = uri2;
        }

        @Override // c0.g.c
        public Uri a() {
            return this.f3476a;
        }

        @Override // c0.g.c
        public Uri c() {
            return this.f3478c;
        }

        @Override // c0.g.c
        public Object d() {
            return null;
        }

        @Override // c0.g.c
        public ClipDescription getDescription() {
            return this.f3477b;
        }

        @Override // c0.g.c
        public void b() {
        }
    }
}
