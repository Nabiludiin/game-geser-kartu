package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* compiled from: MyApplication */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f2936d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f2937e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2938f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2939g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2940h;

    /* renamed from: i, reason: collision with root package name */
    private int f2941i;

    /* renamed from: j, reason: collision with root package name */
    private int f2942j;

    /* renamed from: k, reason: collision with root package name */
    private int f2943k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new r.a(), new r.a(), new r.a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f2937e.writeInt(-1);
        } else {
            this.f2937e.writeInt(bArr.length);
            this.f2937e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2937e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i7) {
        this.f2937e.writeInt(i7);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f2937e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f2937e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i7 = this.f2941i;
        if (i7 >= 0) {
            int i8 = this.f2936d.get(i7);
            int dataPosition = this.f2937e.dataPosition();
            this.f2937e.setDataPosition(i8);
            this.f2937e.writeInt(dataPosition - i8);
            this.f2937e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f2937e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f2942j;
        if (i7 == this.f2938f) {
            i7 = this.f2939g;
        }
        return new b(parcel, dataPosition, i7, this.f2940h + "  ", this.f2933a, this.f2934b, this.f2935c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f2937e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f2937e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2937e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2937e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i7) {
        while (this.f2942j < this.f2939g) {
            int i8 = this.f2943k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            this.f2937e.setDataPosition(this.f2942j);
            int readInt = this.f2937e.readInt();
            this.f2943k = this.f2937e.readInt();
            this.f2942j += readInt;
        }
        return this.f2943k == i7;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f2937e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable q() {
        return this.f2937e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f2937e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i7) {
        a();
        this.f2941i = i7;
        this.f2936d.put(i7, this.f2937e.dataPosition());
        E(0);
        E(i7);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z7) {
        this.f2937e.writeInt(z7 ? 1 : 0);
    }

    private b(Parcel parcel, int i7, int i8, String str, r.a aVar, r.a aVar2, r.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2936d = new SparseIntArray();
        this.f2941i = -1;
        this.f2943k = -1;
        this.f2937e = parcel;
        this.f2938f = i7;
        this.f2939g = i8;
        this.f2942j = i7;
        this.f2940h = str;
    }
}
