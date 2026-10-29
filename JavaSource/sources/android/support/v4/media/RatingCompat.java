package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    private final int f73q;

    /* renamed from: r, reason: collision with root package name */
    private final float f74r;

    /* compiled from: MyApplication */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i7) {
            return new RatingCompat[i7];
        }
    }

    RatingCompat(int i7, float f8) {
        this.f73q = i7;
        this.f74r = f8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f73q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f73q);
        sb.append(" rating=");
        float f8 = this.f74r;
        sb.append(f8 < 0.0f ? "unrated" : String.valueOf(f8));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f73q);
        parcel.writeFloat(this.f74r);
    }
}
