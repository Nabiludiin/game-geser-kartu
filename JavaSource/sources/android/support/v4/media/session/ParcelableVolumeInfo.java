package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    public int f82q;

    /* renamed from: r, reason: collision with root package name */
    public int f83r;

    /* renamed from: s, reason: collision with root package name */
    public int f84s;

    /* renamed from: t, reason: collision with root package name */
    public int f85t;

    /* renamed from: u, reason: collision with root package name */
    public int f86u;

    /* compiled from: MyApplication */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i7) {
            return new ParcelableVolumeInfo[i7];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f82q = parcel.readInt();
        this.f84s = parcel.readInt();
        this.f85t = parcel.readInt();
        this.f86u = parcel.readInt();
        this.f83r = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f82q);
        parcel.writeInt(this.f84s);
        parcel.writeInt(this.f85t);
        parcel.writeInt(this.f86u);
        parcel.writeInt(this.f83r);
    }
}
