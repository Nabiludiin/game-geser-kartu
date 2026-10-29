package s2;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class i5 extends q3.a {
    public static final Parcelable.Creator<i5> CREATOR = new j5();

    /* renamed from: q, reason: collision with root package name */
    public final int f26141q;

    /* renamed from: r, reason: collision with root package name */
    public final int f26142r;

    /* renamed from: s, reason: collision with root package name */
    public final String f26143s;

    /* renamed from: t, reason: collision with root package name */
    public final long f26144t;

    public i5(int i7, int i8, String str, long j7) {
        this.f26141q = i7;
        this.f26142r = i8;
        this.f26143s = str;
        this.f26144t = j7;
    }

    public static i5 M0(JSONObject jSONObject) {
        return new i5(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f26141q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.l(parcel, 2, this.f26142r);
        q3.c.r(parcel, 3, this.f26143s, false);
        q3.c.o(parcel, 4, this.f26144t);
        q3.c.b(parcel, a8);
    }
}
