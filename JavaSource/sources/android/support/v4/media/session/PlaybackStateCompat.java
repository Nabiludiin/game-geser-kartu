package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* compiled from: MyApplication */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    final Bundle A;

    /* renamed from: q, reason: collision with root package name */
    final int f87q;

    /* renamed from: r, reason: collision with root package name */
    final long f88r;

    /* renamed from: s, reason: collision with root package name */
    final long f89s;

    /* renamed from: t, reason: collision with root package name */
    final float f90t;

    /* renamed from: u, reason: collision with root package name */
    final long f91u;

    /* renamed from: v, reason: collision with root package name */
    final int f92v;

    /* renamed from: w, reason: collision with root package name */
    final CharSequence f93w;

    /* renamed from: x, reason: collision with root package name */
    final long f94x;

    /* renamed from: y, reason: collision with root package name */
    List f95y;

    /* renamed from: z, reason: collision with root package name */
    final long f96z;

    /* compiled from: MyApplication */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        private final String f97q;

        /* renamed from: r, reason: collision with root package name */
        private final CharSequence f98r;

        /* renamed from: s, reason: collision with root package name */
        private final int f99s;

        /* renamed from: t, reason: collision with root package name */
        private final Bundle f100t;

        /* compiled from: MyApplication */
        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i7) {
                return new CustomAction[i7];
            }
        }

        CustomAction(Parcel parcel) {
            this.f97q = parcel.readString();
            this.f98r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f99s = parcel.readInt();
            this.f100t = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f98r) + ", mIcon=" + this.f99s + ", mExtras=" + this.f100t;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f97q);
            TextUtils.writeToParcel(this.f98r, parcel, i7);
            parcel.writeInt(this.f99s);
            parcel.writeBundle(this.f100t);
        }
    }

    /* compiled from: MyApplication */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i7) {
            return new PlaybackStateCompat[i7];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f87q = parcel.readInt();
        this.f88r = parcel.readLong();
        this.f90t = parcel.readFloat();
        this.f94x = parcel.readLong();
        this.f89s = parcel.readLong();
        this.f91u = parcel.readLong();
        this.f93w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f95y = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f96z = parcel.readLong();
        this.A = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f92v = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f87q + ", position=" + this.f88r + ", buffered position=" + this.f89s + ", speed=" + this.f90t + ", updated=" + this.f94x + ", actions=" + this.f91u + ", error code=" + this.f92v + ", error message=" + this.f93w + ", custom actions=" + this.f95y + ", active item id=" + this.f96z + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f87q);
        parcel.writeLong(this.f88r);
        parcel.writeFloat(this.f90t);
        parcel.writeLong(this.f94x);
        parcel.writeLong(this.f89s);
        parcel.writeLong(this.f91u);
        TextUtils.writeToParcel(this.f93w, parcel, i7);
        parcel.writeTypedList(this.f95y);
        parcel.writeLong(this.f96z);
        parcel.writeBundle(this.A);
        parcel.writeInt(this.f92v);
    }
}
