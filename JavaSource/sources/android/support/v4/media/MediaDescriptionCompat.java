package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.b;

/* compiled from: MyApplication */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    private final String f51q;

    /* renamed from: r, reason: collision with root package name */
    private final CharSequence f52r;

    /* renamed from: s, reason: collision with root package name */
    private final CharSequence f53s;

    /* renamed from: t, reason: collision with root package name */
    private final CharSequence f54t;

    /* renamed from: u, reason: collision with root package name */
    private final Bitmap f55u;

    /* renamed from: v, reason: collision with root package name */
    private final Uri f56v;

    /* renamed from: w, reason: collision with root package name */
    private final Bundle f57w;

    /* renamed from: x, reason: collision with root package name */
    private final Uri f58x;

    /* renamed from: y, reason: collision with root package name */
    private Object f59y;

    /* compiled from: MyApplication */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(android.support.v4.media.a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i7) {
            return new MediaDescriptionCompat[i7];
        }
    }

    /* compiled from: MyApplication */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f60a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f61b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f62c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f63d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f64e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f65f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f66g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f67h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f60a, this.f61b, this.f62c, this.f63d, this.f64e, this.f65f, this.f66g, this.f67h);
        }

        public b b(CharSequence charSequence) {
            this.f63d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f66g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f64e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f65f = uri;
            return this;
        }

        public b f(String str) {
            this.f60a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f67h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f62c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f61b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f51q = str;
        this.f52r = charSequence;
        this.f53s = charSequence2;
        this.f54t = charSequence3;
        this.f55u = bitmap;
        this.f56v = uri;
        this.f57w = bundle;
        this.f58x = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L74
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.v4.media.a.f(r8)
            r1.f(r2)
            java.lang.CharSequence r2 = android.support.v4.media.a.h(r8)
            r1.i(r2)
            java.lang.CharSequence r2 = android.support.v4.media.a.g(r8)
            r1.h(r2)
            java.lang.CharSequence r2 = android.support.v4.media.a.b(r8)
            r1.b(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.a.d(r8)
            r1.d(r2)
            android.net.Uri r2 = android.support.v4.media.a.e(r8)
            r1.e(r2)
            android.os.Bundle r2 = android.support.v4.media.a.c(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L44
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L45
        L44:
            r4 = r0
        L45:
            if (r4 == 0) goto L5d
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L57
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L57
            goto L5e
        L57:
            r2.remove(r3)
            r2.remove(r5)
        L5d:
            r0 = r2
        L5e:
            r1.c(r0)
            if (r4 == 0) goto L67
            r1.g(r4)
            goto L6e
        L67:
            android.net.Uri r0 = android.support.v4.media.b.a(r8)
            r1.g(r0)
        L6e:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.f59y = r8
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Object f() {
        Object obj = this.f59y;
        if (obj != null) {
            return obj;
        }
        Object b8 = a.C0001a.b();
        a.C0001a.g(b8, this.f51q);
        a.C0001a.i(b8, this.f52r);
        a.C0001a.h(b8, this.f53s);
        a.C0001a.c(b8, this.f54t);
        a.C0001a.e(b8, this.f55u);
        a.C0001a.f(b8, this.f56v);
        a.C0001a.d(b8, this.f57w);
        b.a.a(b8, this.f58x);
        Object a8 = a.C0001a.a(b8);
        this.f59y = a8;
        return a8;
    }

    public String toString() {
        return ((Object) this.f52r) + ", " + ((Object) this.f53s) + ", " + ((Object) this.f54t);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        android.support.v4.media.a.i(f(), parcel, i7);
    }
}
