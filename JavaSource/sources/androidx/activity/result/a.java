package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0003a();

    /* renamed from: q, reason: collision with root package name */
    private final int f163q;

    /* renamed from: r, reason: collision with root package name */
    private final Intent f164r;

    /* compiled from: MyApplication */
    /* renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    class C0003a implements Parcelable.Creator {
        C0003a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(int i7, Intent intent) {
        this.f163q = i7;
        this.f164r = intent;
    }

    public static String i(int i7) {
        return i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f164r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int f() {
        return this.f163q;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + i(this.f163q) + ", data=" + this.f164r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f163q);
        parcel.writeInt(this.f164r == null ? 0 : 1);
        Intent intent = this.f164r;
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }

    a(Parcel parcel) {
        this.f163q = parcel.readInt();
        this.f164r = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
