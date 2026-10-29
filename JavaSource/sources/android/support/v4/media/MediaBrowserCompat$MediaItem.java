package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    private final int f49q;

    /* renamed from: r, reason: collision with root package name */
    private final MediaDescriptionCompat f50r;

    /* compiled from: MyApplication */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaBrowserCompat$MediaItem[] newArray(int i7) {
            return new MediaBrowserCompat$MediaItem[i7];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f49q = parcel.readInt();
        this.f50r = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{mFlags=" + this.f49q + ", mDescription=" + this.f50r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f49q);
        this.f50r.writeToParcel(parcel, i7);
    }
}
