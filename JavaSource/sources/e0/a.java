package e0;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public abstract class a implements Parcelable {

    /* renamed from: q, reason: collision with root package name */
    private final Parcelable f23134q;

    /* renamed from: r, reason: collision with root package name */
    public static final a f23133r = new C0084a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* compiled from: MyApplication */
    /* renamed from: e0.a$a, reason: collision with other inner class name */
    static class C0084a extends a {
        C0084a() {
            super((C0084a) null);
        }
    }

    /* compiled from: MyApplication */
    static class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f23133r;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    /* synthetic */ a(C0084a c0084a) {
        this();
    }

    public final Parcelable a() {
        return this.f23134q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f23134q, i7);
    }

    private a() {
        this.f23134q = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f23134q = parcelable == f23133r ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f23134q = readParcelable == null ? f23133r : readParcelable;
    }
}
