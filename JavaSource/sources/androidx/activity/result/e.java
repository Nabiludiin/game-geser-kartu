package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    private final IntentSender f165q;

    /* renamed from: r, reason: collision with root package name */
    private final Intent f166r;

    /* renamed from: s, reason: collision with root package name */
    private final int f167s;

    /* renamed from: t, reason: collision with root package name */
    private final int f168t;

    /* compiled from: MyApplication */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i7) {
            return new e[i7];
        }
    }

    e(IntentSender intentSender, Intent intent, int i7, int i8) {
        this.f165q = intentSender;
        this.f166r = intent;
        this.f167s = i7;
        this.f168t = i8;
    }

    public Intent a() {
        return this.f166r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int f() {
        return this.f167s;
    }

    public int i() {
        return this.f168t;
    }

    public IntentSender v() {
        return this.f165q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f165q, i7);
        parcel.writeParcelable(this.f166r, i7);
        parcel.writeInt(this.f167s);
        parcel.writeInt(this.f168t);
    }

    /* compiled from: MyApplication */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private IntentSender f169a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f170b;

        /* renamed from: c, reason: collision with root package name */
        private int f171c;

        /* renamed from: d, reason: collision with root package name */
        private int f172d;

        public b(IntentSender intentSender) {
            this.f169a = intentSender;
        }

        public e a() {
            return new e(this.f169a, this.f170b, this.f171c, this.f172d);
        }

        public b b(Intent intent) {
            this.f170b = intent;
            return this;
        }

        public b c(int i7, int i8) {
            this.f172d = i7;
            this.f171c = i8;
            return this;
        }

        public b(PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }
    }

    e(Parcel parcel) {
        this.f165q = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f166r = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f167s = parcel.readInt();
        this.f168t = parcel.readInt();
    }
}
