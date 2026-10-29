package c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.a;

/* compiled from: MyApplication */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: q, reason: collision with root package name */
    final boolean f3463q = false;

    /* renamed from: r, reason: collision with root package name */
    final Handler f3464r = null;

    /* renamed from: s, reason: collision with root package name */
    c.a f3465s;

    /* compiled from: MyApplication */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i7) {
            return new b[i7];
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: c.b$b, reason: collision with other inner class name */
    class BinderC0066b extends a.AbstractBinderC0064a {
        BinderC0066b() {
        }

        @Override // c.a
        public void e8(int i7, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f3464r;
            if (handler != null) {
                handler.post(bVar.new c(i7, bundle));
            } else {
                bVar.a(i7, bundle);
            }
        }
    }

    /* compiled from: MyApplication */
    class c implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final int f3467q;

        /* renamed from: r, reason: collision with root package name */
        final Bundle f3468r;

        c(int i7, Bundle bundle) {
            this.f3467q = i7;
            this.f3468r = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f3467q, this.f3468r);
        }
    }

    b(Parcel parcel) {
        this.f3465s = a.AbstractBinderC0064a.a(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f3465s == null) {
                    this.f3465s = new BinderC0066b();
                }
                parcel.writeStrongBinder(this.f3465s.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void a(int i7, Bundle bundle) {
    }
}
