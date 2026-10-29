package g4;

import android.os.Parcel;
import android.os.Parcelable;
import p3.o;

/* compiled from: MyApplication */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: q, reason: collision with root package name */
    private final String f24036q;

    /* renamed from: r, reason: collision with root package name */
    private final byte[] f24037r;

    /* renamed from: s, reason: collision with root package name */
    private final int f24038s;

    private a(String str, byte[] bArr, int i7) {
        this.f24036q = (String) o.m(str);
        this.f24037r = (byte[]) ((byte[]) o.m(bArr)).clone();
        this.f24038s = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f24036q);
        parcel.writeByteArray(this.f24037r);
        parcel.writeInt(this.f24038s);
    }

    private a(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    /* synthetic */ a(Parcel parcel, c cVar) {
        this(parcel);
    }
}
